/**
 * <copyright>
 * </copyright>
 *
 */
package org.yakindu.sct.model.stext.stext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.yakindu.sct.model.sgraph.Scope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statechart Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yakindu.sct.model.stext.stext.StatechartDefinition#getDefinitionScopes <em>Definition Scopes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yakindu.sct.model.stext.stext.StextPackage#getStatechartDefinition()
 * @model
 * @generated
 */
public interface StatechartDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Definition Scopes</b></em>' containment reference list.
   * The list contents are of type {@link org.yakindu.sct.model.sgraph.Scope}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition Scopes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition Scopes</em>' containment reference list.
   * @see org.yakindu.sct.model.stext.stext.StextPackage#getStatechartDefinition_DefinitionScopes()
   * @model containment="true"
   * @generated
   */
  EList<Scope> getDefinitionScopes();

} // StatechartDefinition
