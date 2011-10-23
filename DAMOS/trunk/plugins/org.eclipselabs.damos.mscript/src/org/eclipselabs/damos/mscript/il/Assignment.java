/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.damos.mscript.il;

import org.eclipselabs.damos.mscript.Expression;
import org.eclipselabs.damos.mscript.Statement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.damos.mscript.il.Assignment#getAssignedExpression <em>Assigned Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.damos.mscript.il.ILPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends VariableAccess, Statement {
	/**
	 * Returns the value of the '<em><b>Assigned Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Expression</em>' containment reference.
	 * @see #setAssignedExpression(Expression)
	 * @see org.eclipselabs.damos.mscript.il.ILPackage#getAssignment_AssignedExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getAssignedExpression();

	/**
	 * Sets the value of the '{@link org.eclipselabs.damos.mscript.il.Assignment#getAssignedExpression <em>Assigned Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Expression</em>' containment reference.
	 * @see #getAssignedExpression()
	 * @generated
	 */
	void setAssignedExpression(Expression value);

} // Assignment
