/**
 * <copyright>
 * </copyright>
 *
 */
package org.yakindu.sct.model.stext.stext;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Event Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yakindu.sct.model.stext.stext.TimeEventSpec#getValue <em>Value</em>}</li>
 *   <li>{@link org.yakindu.sct.model.stext.stext.TimeEventSpec#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yakindu.sct.model.stext.stext.StextPackage#getTimeEventSpec()
 * @model
 * @generated
 */
public interface TimeEventSpec extends EventSpec
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see org.yakindu.sct.model.stext.stext.StextPackage#getTimeEventSpec_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link org.yakindu.sct.model.stext.stext.TimeEventSpec#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Unit</b></em>' attribute.
   * The literals are from the enumeration {@link org.yakindu.sct.model.stext.stext.TimeUnit}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unit</em>' attribute.
   * @see org.yakindu.sct.model.stext.stext.TimeUnit
   * @see #setUnit(TimeUnit)
   * @see org.yakindu.sct.model.stext.stext.StextPackage#getTimeEventSpec_Unit()
   * @model
   * @generated
   */
  TimeUnit getUnit();

  /**
   * Sets the value of the '{@link org.yakindu.sct.model.stext.stext.TimeEventSpec#getUnit <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unit</em>' attribute.
   * @see org.yakindu.sct.model.stext.stext.TimeUnit
   * @see #getUnit()
   * @generated
   */
  void setUnit(TimeUnit value);

} // TimeEventSpec
