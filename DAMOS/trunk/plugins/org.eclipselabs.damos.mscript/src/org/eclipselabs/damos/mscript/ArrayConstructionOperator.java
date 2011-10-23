/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipselabs.damos.mscript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Construction Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.damos.mscript.ArrayConstructionOperator#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link org.eclipselabs.damos.mscript.ArrayConstructionOperator#getIterationClauses <em>Iteration Clauses</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.damos.mscript.MscriptPackage#getArrayConstructionOperator()
 * @model
 * @generated
 */
public interface ArrayConstructionOperator extends Expression {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.damos.mscript.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see org.eclipselabs.damos.mscript.MscriptPackage#getArrayConstructionOperator_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpressions();

	/**
	 * Returns the value of the '<em><b>Iteration Clauses</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.damos.mscript.ArrayConstructionIterationClause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iteration Clauses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iteration Clauses</em>' containment reference list.
	 * @see org.eclipselabs.damos.mscript.MscriptPackage#getArrayConstructionOperator_IterationClauses()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArrayConstructionIterationClause> getIterationClauses();

} // ArrayConstructionOperator
