/**
 * Copyright (c) 2012 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *   committers of YAKINDU - initial API and implementation
 *  
 */
package execution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link execution.ExecutionContext#getRaisedEvents <em>Raised Events</em>}</li>
 *   <li>{@link execution.ExecutionContext#getScopes <em>Scopes</em>}</li>
 * </ul>
 * </p>
 *
 * @see execution.ExecutionPackage#getExecutionContext()
 * @model
 * @generated
 */
public interface ExecutionContext extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2012 committers of YAKINDU and others.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\nContributors:\r\n  committers of YAKINDU - initial API and implementation\r\n ";

	/**
	 * Returns the value of the '<em><b>Raised Events</b></em>' reference list.
	 * The list contents are of type {@link execution.ExecutionEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raised Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raised Events</em>' reference list.
	 * @see execution.ExecutionPackage#getExecutionContext_RaisedEvents()
	 * @model
	 * @generated
	 */
	EList<ExecutionEvent> getRaisedEvents();

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' containment reference list.
	 * The list contents are of type {@link execution.ExecutionScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scopes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' containment reference list.
	 * @see execution.ExecutionPackage#getExecutionContext_Scopes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutionScope> getScopes();

} // ExecutionContext
