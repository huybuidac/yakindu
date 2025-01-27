/**
 * <copyright>
 * </copyright>
 *
 */
package org.yakindu.sct.statechart.expressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yakindu.sct.statechart.expressions.Reaction#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.yakindu.sct.statechart.expressions.Reaction#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.yakindu.sct.statechart.expressions.Reaction#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yakindu.sct.statechart.expressions.ExpressionsPackage#getReaction()
 * @model
 * @generated
 */
public interface Reaction extends EObject
{
  /**
   * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trigger</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' containment reference.
   * @see #setTrigger(ReactionTrigger)
   * @see org.yakindu.sct.statechart.expressions.ExpressionsPackage#getReaction_Trigger()
   * @model containment="true"
   * @generated
   */
  ReactionTrigger getTrigger();

  /**
   * Sets the value of the '{@link org.yakindu.sct.statechart.expressions.Reaction#getTrigger <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' containment reference.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(ReactionTrigger value);

  /**
   * Returns the value of the '<em><b>Effect</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Effect</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effect</em>' containment reference.
   * @see #setEffect(Effect)
   * @see org.yakindu.sct.statechart.expressions.ExpressionsPackage#getReaction_Effect()
   * @model containment="true"
   * @generated
   */
  Effect getEffect();

  /**
   * Sets the value of the '{@link org.yakindu.sct.statechart.expressions.Reaction#getEffect <em>Effect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Effect</em>' containment reference.
   * @see #getEffect()
   * @generated
   */
  void setEffect(Effect value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference.
   * @see #setProperties(ReactionProperties)
   * @see org.yakindu.sct.statechart.expressions.ExpressionsPackage#getReaction_Properties()
   * @model containment="true"
   * @generated
   */
  ReactionProperties getProperties();

  /**
   * Sets the value of the '{@link org.yakindu.sct.statechart.expressions.Reaction#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(ReactionProperties value);

} // Reaction
