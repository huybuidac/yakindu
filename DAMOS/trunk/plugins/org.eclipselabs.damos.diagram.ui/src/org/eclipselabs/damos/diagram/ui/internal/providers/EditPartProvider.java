/****************************************************************************
 * Copyright (c) 2008, 2009 Andreas Unger and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andreas Unger - initial API and implementation 
 ****************************************************************************/

package org.eclipselabs.damos.diagram.ui.internal.providers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateRootEditPartOperation;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipselabs.damos.diagram.ui.editparts.BlockDiagramEditPart;
import org.eclipselabs.damos.diagram.ui.editparts.BlockInputPortEditPart;
import org.eclipselabs.damos.diagram.ui.editparts.BlockOutputPortEditPart;
import org.eclipselabs.damos.diagram.ui.editparts.ConnectionEditPart;
import org.eclipselabs.damos.diagram.ui.editparts.InoutportEditPart;
import org.eclipselabs.damos.diagram.ui.editparts.InportInputPortEditPart;
import org.eclipselabs.damos.diagram.ui.editparts.InputPortEditPart;
import org.eclipselabs.damos.diagram.ui.editparts.OutportOutputPortEditPart;
import org.eclipselabs.damos.diagram.ui.editparts.OutputPortEditPart;
import org.eclipselabs.damos.diagram.ui.editparts.SubsystemEditPart;
import org.eclipselabs.damos.diagram.ui.editparts.SubsystemInputPortEditPart;
import org.eclipselabs.damos.diagram.ui.editparts.SubsystemOutputPortEditPart;
import org.eclipselabs.damos.diagram.ui.internal.editparts.BlockDiagramRootEditPart;
import org.eclipselabs.damos.diagram.ui.internal.editparts.ComponentNameEditPart;
import org.eclipselabs.damos.diagram.ui.internal.editparts.CompoundCompartmentEditPart;
import org.eclipselabs.damos.diagram.ui.internal.editparts.ConditionalCompoundConditionEditPart;
import org.eclipselabs.damos.diagram.ui.internal.editparts.ConditionalCompoundEditPart;
import org.eclipselabs.damos.diagram.ui.internal.editparts.FallbackBlockEditPart;
import org.eclipselabs.damos.diagram.ui.internal.editparts.FallbackComponentEditPart;
import org.eclipselabs.damos.diagram.ui.internal.editparts.JoinEditPart;
import org.eclipselabs.damos.diagram.ui.view.ISemanticHints;
import org.eclipselabs.damos.dml.Block;
import org.eclipselabs.damos.dml.BlockInput;
import org.eclipselabs.damos.dml.BlockInputPort;
import org.eclipselabs.damos.dml.BlockOutput;
import org.eclipselabs.damos.dml.BlockOutputPort;
import org.eclipselabs.damos.dml.Component;
import org.eclipselabs.damos.dml.Compound;
import org.eclipselabs.damos.dml.ConditionalCompoundCondition;
import org.eclipselabs.damos.dml.Connection;
import org.eclipselabs.damos.dml.Inoutport;
import org.eclipselabs.damos.dml.Inport;
import org.eclipselabs.damos.dml.Input;
import org.eclipselabs.damos.dml.InputPort;
import org.eclipselabs.damos.dml.Join;
import org.eclipselabs.damos.dml.Outport;
import org.eclipselabs.damos.dml.Output;
import org.eclipselabs.damos.dml.OutputPort;
import org.eclipselabs.damos.dml.Subsystem;
import org.eclipselabs.damos.dml.SubsystemInput;
import org.eclipselabs.damos.dml.SubsystemOutput;
import org.eclipselabs.damos.dml.System;

public class EditPartProvider extends AbstractEditPartProvider {
	
	private EditPartProviderDelegate delegate = new EditPartProviderDelegate();

	public RootEditPart createRootEditPart(Diagram diagram) {
		if (diagram.getElement() instanceof System) {
			return new BlockDiagramRootEditPart(diagram.getMeasurementUnit());
		}
		return super.createRootEditPart(diagram);
	}
	
	protected Class<?> getDiagramEditPartClass(View view) {
		if (view.getElement() instanceof System) {
			return BlockDiagramEditPart.class;
		}
		return super.getDiagramEditPartClass(view);
	}
	
	protected Class<?> getNodeEditPartClass(View view) {
		EObject element = view.getElement();
		String semanticHint = view.getType();
		
		if (element instanceof InputPort) {
			InputPort inputPort = (InputPort) element;
			if (inputPort.getInput() instanceof SubsystemInput) {
				return SubsystemInputPortEditPart.class;
			}
			if (inputPort.getComponent() instanceof Inport) {
				return InportInputPortEditPart.class;
			}
			if (inputPort instanceof BlockInputPort) {
				Class<?> clazz = null;
				Input input = inputPort.getInput();
				if (input instanceof BlockInput) {
					BlockInput blockInput = (BlockInput) input;
					if (input.getComponent() instanceof Block) {
						Block block = (Block) input.getComponent();
						clazz = delegate.getInputClass(block.getType().getQualifiedName(), blockInput.getDefinition().getName());
					}
				}
				if (clazz != null) {
					return clazz;
				}
				return BlockInputPortEditPart.class;
			}
			return InputPortEditPart.class;
		}
	
		if (element instanceof OutputPort) {
			OutputPort outputPort = (OutputPort) element;
			if (outputPort.getOutput() instanceof SubsystemOutput) {
				return SubsystemOutputPortEditPart.class;
			}
			if (outputPort.getComponent() instanceof Outport) {
				return OutportOutputPortEditPart.class;
			}
			if (outputPort instanceof BlockOutputPort) {
				Class<?> clazz = null;
				Output output = outputPort.getOutput();
				if (output instanceof BlockOutput) {
					BlockOutput blockOutput = (BlockOutput) output;
					if (output.getComponent() instanceof Block) {
						Block block = (Block) output.getComponent();
						clazz = delegate.getOutputClass(block.getType().getQualifiedName(), blockOutput.getDefinition().getName());
					}
				}
				if (clazz != null) {
					return clazz;
				}
				return BlockOutputPortEditPart.class;
			}
			return OutputPortEditPart.class;
		}
		
		if (element instanceof Component) {
			if (ISemanticHints.COMPONENT_NAME.equals(view.getType())) {
				return ComponentNameEditPart.class;
			}
			if (element instanceof Inoutport) {
				return InoutportEditPart.class;
			}
			if (element instanceof Subsystem) {
				return SubsystemEditPart.class;
			}
			if (element instanceof Join) {
				return JoinEditPart.class;
			}
			if (element instanceof Block) {
				Block block = (Block) element;
				if (semanticHint != null && semanticHint.length() != 0) {
					Class<?> clazz = delegate.getContentClass(block.getType().getQualifiedName(), semanticHint);
					if (clazz != null) {
						return clazz;
					}
				} else {
					Class<?> clazz = delegate.getClazz(block.getType().getQualifiedName());
					if (clazz != null) {
						return clazz;
					}
				}
				return FallbackBlockEditPart.class;
			}
			return FallbackComponentEditPart.class;
		}
		
		if (element instanceof Compound) {
			if (ISemanticHints.COMPOUND_COMPARTMENT.equals(semanticHint)) {
				return CompoundCompartmentEditPart.class;
			}
			return ConditionalCompoundEditPart.class;
		}
		
		if (element instanceof ConditionalCompoundCondition) {
			return ConditionalCompoundConditionEditPart.class;
		}
		
		return super.getNodeEditPartClass(view);
	}
	
	protected Class<?> getEdgeEditPartClass(View view) {
		if (view.getElement() instanceof Connection) {
			return ConnectionEditPart.class;
		}
		return super.getEdgeEditPartClass(view);
	}

	public boolean provides(IOperation operation) {
		if (operation instanceof CreateRootEditPartOperation) {
			return true;
		}
		return super.provides(operation);
	}

}
