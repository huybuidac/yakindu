/****************************************************************************
 * Copyright (c) 2008, 2010 Andreas Unger and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andreas Unger - initial API and implementation 
 ****************************************************************************/

package org.eclipselabs.damos.simulation.engine;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipselabs.damos.dml.ConditionalCompound;
import org.eclipselabs.damos.dml.Join;
import org.eclipselabs.damos.dml.util.DMLSwitch;
import org.eclipselabs.damos.execution.executionflow.ComponentNode;
import org.eclipselabs.damos.execution.executionflow.CompoundNode;
import org.eclipselabs.damos.execution.executionflow.DataFlowSourceEnd;
import org.eclipselabs.damos.execution.executionflow.DataFlowTargetEnd;
import org.eclipselabs.damos.execution.executionflow.Graph;
import org.eclipselabs.damos.execution.executionflow.Node;
import org.eclipselabs.damos.execution.executionflow.PortInfo;
import org.eclipselabs.damos.execution.executionflow.Subgraph;
import org.eclipselabs.damos.simulation.engine.util.SimulationUtil;
import org.eclipselabs.mscript.computation.engine.value.IBooleanValue;
import org.eclipselabs.mscript.computation.engine.value.IValue;

/**
 * @author Andreas Unger
 *
 */
public class SimulationEngine implements ISimulationEngine {

	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.simulation.engine.ISimulationEngine#simulate(org.eclipselabs.damos.simulation.engine.ISimulationContext, org.eclipselabs.damos.simulation.engine.ISimulationMonitor)
	 */
	public void run(ISimulationContext context, ISimulationMonitor monitor) throws CoreException {
		long stepCount = SimulationUtil.getStepCount(context.getSimulationModel());
		
		monitor.fireSimulationEvent(new SimulationEvent(this, context, SimulationEvent.START));
		
		Graph graph = context.getExecutionFlow().getGraph();
		
		initialize(graph, monitor);
		
		long n;
		for (n = 0; n < stepCount; ++n) {			
			if (monitor.isCanceled()) {
				break;
			}

			monitor.fireSimulationEvent(new SimulationEvent(this, context, SimulationEvent.STEP));

			computeOutputValues(graph, monitor);
			
			if (monitor.isCanceled()) {
				break;
			}

			update(graph, monitor);
		}
		
		int eventKind = monitor.isCanceled() ? SimulationEvent.CANCEL : SimulationEvent.FINISH;
		monitor.fireSimulationEvent(new SimulationEvent(this, context, eventKind));
	}

	/**
	 * @param graph
	 * @param monitor
	 * @throws CoreException
	 */
	private void initialize(Graph graph, ISimulationMonitor monitor) throws CoreException {
		for (Node node : graph.getNodes()) {
			if (monitor.isCanceled()) {
				break;
			}
			
			if (node instanceof CompoundNode) {
				CompoundNode compoundNode = (CompoundNode) node;
				initialize(compoundNode, monitor);
			} else {
				IComponentSimulationObject simulationObject = SimulationUtil.getComponentSimulationObject(node);
				if (simulationObject != null) {
					simulationObject.initialize();
				}
			}
		}
	}

	/**
	 * @param graph
	 * @param compoundSimulationEngine
	 * @param monitor
	 * @throws CoreException
	 */
	private void computeOutputValues(Graph graph, ISimulationMonitor monitor) throws CoreException {
		CompoundComputeOutputValuesSwitch compoundComputeOutputValuesSwitch = null;
		for (Node node : graph.getNodes()) {
			if (monitor.isCanceled()) {
				break;
			}
			
			if (node instanceof CompoundNode) {
				CompoundNode compoundNode = (CompoundNode) node;
				if (compoundComputeOutputValuesSwitch == null) {
					compoundComputeOutputValuesSwitch = new CompoundComputeOutputValuesSwitch();
				}
				compoundComputeOutputValuesSwitch.run(compoundNode, monitor);
			} else if (node instanceof ComponentNode) {
				ComponentNode componentNode = (ComponentNode) node;
				if (componentNode.getComponent() instanceof Join) {
					computeJoinOutputValues(componentNode);
				} else {
					computeComponentOutputValues(node);
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	/**
	 * @param node
	 * @throws CoreException
	 */
	private void computeComponentOutputValues(Node node) throws CoreException {
		IComponentSimulationObject simulationObject = SimulationUtil.getComponentSimulationObject(node);
		simulationObject.computeOutputValues();
		for (DataFlowSourceEnd sourceEnd : node.getOutgoingDataFlows()) {
			PortInfo sourcePortInfo = (PortInfo) sourceEnd.getConnectorInfo();
			IValue value = simulationObject.getOutputValue(sourcePortInfo.getInoutputIndex(), sourcePortInfo.getPortIndex());
			setInputValues(sourceEnd, value);
		}
	}

	/**
	 * @param sourceEnd
	 * @param value
	 * @throws CoreException
	 */
	private void setInputValues(DataFlowSourceEnd sourceEnd, IValue value) throws CoreException {
		for (DataFlowTargetEnd targetEnd : sourceEnd.getDataFlow().getTargetEnds()) {
			IComponentSimulationObject targetSimulationObject = SimulationUtil.getComponentSimulationObject(targetEnd.getNode());
			if (targetSimulationObject != null) {
				PortInfo targetPortInfo = (PortInfo) targetEnd.getConnectorInfo();
				targetSimulationObject.setInputValue(targetPortInfo.getInoutputIndex(), targetPortInfo.getPortIndex(), value);
			}
		}
	}

	/**
	 * @param joinNode
	 * @throws CoreException
	 */
	private void computeJoinOutputValues(ComponentNode joinNode) throws CoreException {
		DataFlowSourceEnd sourceEnd = getCompoundSourceEnd(joinNode);
		if (sourceEnd == null) {
			sourceEnd = getDefaultSourceEnd(joinNode);
		}
		if (sourceEnd == null) {
			throw new CoreException(new Status(IStatus.ERROR, SimulationEnginePlugin.PLUGIN_ID, "No Join input available"));
		}

		if (joinNode.getOutgoingDataFlows().isEmpty()) {
			throw new CoreException(new Status(IStatus.ERROR, SimulationEnginePlugin.PLUGIN_ID, "Join output not connected"));
		}
		DataFlowSourceEnd joinSourceEnd = joinNode.getOutgoingDataFlows().get(0);
		
		IComponentSimulationObject simulationObject = SimulationUtil.getComponentSimulationObject(sourceEnd.getNode());
		PortInfo sourcePortInfo = (PortInfo) sourceEnd.getConnectorInfo();
		IValue value = simulationObject.getOutputValue(sourcePortInfo.getInoutputIndex(), sourcePortInfo.getPortIndex());
		
		setInputValues(joinSourceEnd, value);
	}
	
	private DataFlowSourceEnd getCompoundSourceEnd(ComponentNode joinNode) throws CoreException {
		for (DataFlowTargetEnd targetEnd : joinNode.getIncomingDataFlows()) {
			DataFlowSourceEnd sourceEnd = targetEnd.getDataFlow().getSourceEnd();
			if (sourceEnd.getNode().getGraph() == joinNode.getGraph()) {
				continue;
			}
			if (sourceEnd.getNode() instanceof ComponentNode) {
				if (isComponentRun((ComponentNode) sourceEnd.getNode())) {
					return sourceEnd;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
		return null;
	}

	private DataFlowSourceEnd getDefaultSourceEnd(ComponentNode joinNode) throws CoreException {
		for (DataFlowTargetEnd targetEnd : joinNode.getIncomingDataFlows()) {
			DataFlowSourceEnd sourceEnd = targetEnd.getDataFlow().getSourceEnd();
			if (sourceEnd.getNode().getGraph() != joinNode.getGraph()) {
				continue;
			}
			if (sourceEnd.getNode() instanceof ComponentNode) {
				return sourceEnd;
			} else {
				throw new IllegalArgumentException();
			}
		}
		return null;
	}

	/**
	 * @param graph
	 * @param monitor
	 * @throws CoreException
	 */
	private void update(Graph graph, ISimulationMonitor monitor) throws CoreException {
		CompoundUpdateSwitch compoundUpdateSwitch = null;
		for (Node node : graph.getNodes()) {
			if (monitor.isCanceled()) {
				break;
			}
			
			if (node instanceof CompoundNode) {
				CompoundNode compoundNode = (CompoundNode) node;
				if (compoundUpdateSwitch == null) {
					compoundUpdateSwitch = new CompoundUpdateSwitch();
				}
				compoundUpdateSwitch.run(compoundNode, monitor);
			} else if (node instanceof ComponentNode) {
				IComponentSimulationObject simulationObject = SimulationUtil.getComponentSimulationObject(node);
				if (simulationObject != null) {
					simulationObject.update();
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}
	
	private boolean isCompoundRun(CompoundNode node) throws CoreException {
		if (node.getCompound() instanceof ConditionalCompound) {
			ConditionalCompound conditionalCompound = (ConditionalCompound) node.getCompound();
			DataFlowTargetEnd targetEnd = node.getIncomingDataFlow(conditionalCompound.getCondition());
			DataFlowSourceEnd sourceEnd = targetEnd.getDataFlow().getSourceEnd();
			PortInfo sourcePortInfo = (PortInfo) sourceEnd.getConnectorInfo();

			IComponentSimulationObject simulationObject = SimulationUtil.getComponentSimulationObject(sourceEnd.getNode());
			IValue value = simulationObject.getOutputValue(sourcePortInfo.getInoutputIndex(), sourcePortInfo.getPortIndex());
			
			if (value instanceof IBooleanValue) {
				return ((IBooleanValue) value).booleanValue();
			} else {
				throw new CoreException(new Status(IStatus.ERROR, SimulationEnginePlugin.PLUGIN_ID, "Input value of condition connector must be boolean value"));
			}
		}
		return false;
	}
	
	private boolean isComponentRun(ComponentNode node) throws CoreException {
		Graph graph = node.getGraph();
		while (graph instanceof Subgraph) {
			Subgraph subgraph = (Subgraph) graph;
			if (graph instanceof CompoundNode && !isCompoundRun((CompoundNode) graph)) {
				return false;
			}
			graph = subgraph.getGraph();
		}
		return true;
	}

	private class CompoundComputeOutputValuesSwitch extends CompoundSwitch {

		@Override
		protected void runConditionalCompound() throws CoreException {
			computeOutputValues(getNode(), getMonitor());
		}
		
	}
	
	private class CompoundUpdateSwitch extends CompoundSwitch {

		@Override
		protected void runConditionalCompound() throws CoreException {
			update(getNode(), getMonitor());
		}
		
	}

	private abstract class CompoundSwitch extends DMLSwitch<Boolean> {
		
		private CompoundNode node;
		private ISimulationMonitor monitor;
		
		public void run(CompoundNode node, ISimulationMonitor monitor) throws CoreException {
			this.node = node;
			this.monitor = monitor;
			try {
				doSwitch(node.getCompound());
			} catch (WrappedException e) {
				if (e.getCause() instanceof CoreException) {
					throw (CoreException) e.getCause();
				}
				throw e;
			}
		}
		
		protected CompoundNode getNode() {
			return node;
		}
		
		/**
		 * @return the monitor
		 */
		public ISimulationMonitor getMonitor() {
			return monitor;
		}
		
		@Override
		public Boolean caseConditionalCompound(ConditionalCompound conditionalCompound) {
			try {
				if (isCompoundRun(node)) {
					runConditionalCompound();
				}
			} catch (CoreException e) {
				throw new WrappedException(e);
			}
			return true;
		}
		
		protected abstract void runConditionalCompound() throws CoreException;

	}
	
}
