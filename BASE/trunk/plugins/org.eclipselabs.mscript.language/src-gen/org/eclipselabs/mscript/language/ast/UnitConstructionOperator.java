/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipselabs.mscript.language.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Construction Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.mscript.language.ast.UnitConstructionOperator#getUnitExpression <em>Unit Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.mscript.language.ast.AstPackage#getUnitConstructionOperator()
 * @model
 * @generated
 */
public interface UnitConstructionOperator extends Expression
{
  /**
   * Returns the value of the '<em><b>Unit Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit Expression</em>' containment reference.
   * @see #setUnitExpression(UnitExpression)
   * @see org.eclipselabs.mscript.language.ast.AstPackage#getUnitConstructionOperator_UnitExpression()
   * @model containment="true"
   * @generated
   */
  UnitExpression getUnitExpression();

  /**
   * Sets the value of the '{@link org.eclipselabs.mscript.language.ast.UnitConstructionOperator#getUnitExpression <em>Unit Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit Expression</em>' containment reference.
   * @see #getUnitExpression()
   * @generated
   */
  void setUnitExpression(UnitExpression value);

} // UnitConstructionOperator
