/**
 * Copyright (c) 2013 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.simulation.core.sruntime;

import org.yakindu.base.base.NamedElement;

import org.yakindu.base.types.ITypeSystem.InferredType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yakindu.sct.simulation.core.sruntime.RuntimeSlot#getType <em>Type</em>}</li>
 *   <li>{@link org.yakindu.sct.simulation.core.sruntime.RuntimeSlot#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yakindu.sct.simulation.core.sruntime.SRuntimePackage#getRuntimeSlot()
 * @model abstract="true"
 * @generated
 */
public interface RuntimeSlot extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(InferredType)
	 * @see org.yakindu.sct.simulation.core.sruntime.SRuntimePackage#getRuntimeSlot_Type()
	 * @model dataType="org.yakindu.sct.simulation.core.sruntime.InferredType"
	 * @generated
	 */
	InferredType getType();

	/**
	 * Sets the value of the '{@link org.yakindu.sct.simulation.core.sruntime.RuntimeSlot#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(InferredType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see org.yakindu.sct.simulation.core.sruntime.SRuntimePackage#getRuntimeSlot_Value()
	 * @model
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link org.yakindu.sct.simulation.core.sruntime.RuntimeSlot#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

} // RuntimeSlot
