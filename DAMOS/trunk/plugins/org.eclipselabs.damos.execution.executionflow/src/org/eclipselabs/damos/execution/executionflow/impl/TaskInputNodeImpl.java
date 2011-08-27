/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.damos.execution.executionflow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.damos.execution.executionflow.ExecutionFlowPackage;
import org.eclipselabs.damos.execution.executionflow.TaskGraph;
import org.eclipselabs.damos.execution.executionflow.TaskInputNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Input Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.damos.execution.executionflow.impl.TaskInputNodeImpl#getTaskGraph <em>Task Graph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskInputNodeImpl extends NodeImpl implements TaskInputNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskInputNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionFlowPackage.Literals.TASK_INPUT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskGraph getTaskGraph() {
		if (eContainerFeatureID() != ExecutionFlowPackage.TASK_INPUT_NODE__TASK_GRAPH) return null;
		return (TaskGraph)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskGraph(TaskGraph newTaskGraph, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTaskGraph, ExecutionFlowPackage.TASK_INPUT_NODE__TASK_GRAPH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskGraph(TaskGraph newTaskGraph) {
		if (newTaskGraph != eInternalContainer() || (eContainerFeatureID() != ExecutionFlowPackage.TASK_INPUT_NODE__TASK_GRAPH && newTaskGraph != null)) {
			if (EcoreUtil.isAncestor(this, newTaskGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTaskGraph != null)
				msgs = ((InternalEObject)newTaskGraph).eInverseAdd(this, ExecutionFlowPackage.TASK_GRAPH__INPUT_NODES, TaskGraph.class, msgs);
			msgs = basicSetTaskGraph(newTaskGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionFlowPackage.TASK_INPUT_NODE__TASK_GRAPH, newTaskGraph, newTaskGraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutionFlowPackage.TASK_INPUT_NODE__TASK_GRAPH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTaskGraph((TaskGraph)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutionFlowPackage.TASK_INPUT_NODE__TASK_GRAPH:
				return basicSetTaskGraph(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ExecutionFlowPackage.TASK_INPUT_NODE__TASK_GRAPH:
				return eInternalContainer().eInverseRemove(this, ExecutionFlowPackage.TASK_GRAPH__INPUT_NODES, TaskGraph.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionFlowPackage.TASK_INPUT_NODE__TASK_GRAPH:
				return getTaskGraph();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExecutionFlowPackage.TASK_INPUT_NODE__TASK_GRAPH:
				setTaskGraph((TaskGraph)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExecutionFlowPackage.TASK_INPUT_NODE__TASK_GRAPH:
				setTaskGraph((TaskGraph)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExecutionFlowPackage.TASK_INPUT_NODE__TASK_GRAPH:
				return getTaskGraph() != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskInputNodeImpl
