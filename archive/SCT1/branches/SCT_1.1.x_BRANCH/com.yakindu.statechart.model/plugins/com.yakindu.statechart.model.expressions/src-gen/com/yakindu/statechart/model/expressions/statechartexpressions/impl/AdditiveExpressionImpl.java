/**
 * Copyright (c) 2010 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of YAKINDU - initial API and implementation
 */
package com.yakindu.statechart.model.expressions.statechartexpressions.impl;

import com.yakindu.statechart.model.expressions.statechartexpressions.AdditiveExpression;
import com.yakindu.statechart.model.expressions.statechartexpressions.AdditiveOperator;
import com.yakindu.statechart.model.expressions.statechartexpressions.MultiplicativeExpression;
import com.yakindu.statechart.model.expressions.statechartexpressions.StatechartexpressionsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additive Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.yakindu.statechart.model.expressions.statechartexpressions.impl.AdditiveExpressionImpl#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link com.yakindu.statechart.model.expressions.statechartexpressions.impl.AdditiveExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.yakindu.statechart.model.expressions.statechartexpressions.impl.AdditiveExpressionImpl#getOperand2 <em>Operand2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdditiveExpressionImpl extends MinimalEObjectImpl.Container implements AdditiveExpression
{
  /**
   * The cached value of the '{@link #getOperand1() <em>Operand1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperand1()
   * @generated
   * @ordered
   */
  protected MultiplicativeExpression operand1;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final AdditiveOperator OPERATOR_EDEFAULT = AdditiveOperator.PLUS;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected AdditiveOperator operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getOperand2() <em>Operand2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperand2()
   * @generated
   * @ordered
   */
  protected MultiplicativeExpression operand2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdditiveExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return StatechartexpressionsPackage.Literals.ADDITIVE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicativeExpression getOperand1()
  {
    return operand1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperand1(MultiplicativeExpression newOperand1, NotificationChain msgs)
  {
    MultiplicativeExpression oldOperand1 = operand1;
    operand1 = newOperand1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERAND1, oldOperand1, newOperand1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperand1(MultiplicativeExpression newOperand1)
  {
    if (newOperand1 != operand1)
    {
      NotificationChain msgs = null;
      if (operand1 != null)
        msgs = ((InternalEObject)operand1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERAND1, null, msgs);
      if (newOperand1 != null)
        msgs = ((InternalEObject)newOperand1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERAND1, null, msgs);
      msgs = basicSetOperand1(newOperand1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERAND1, newOperand1, newOperand1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveOperator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(AdditiveOperator newOperator)
  {
    AdditiveOperator oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicativeExpression getOperand2()
  {
    return operand2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperand2(MultiplicativeExpression newOperand2, NotificationChain msgs)
  {
    MultiplicativeExpression oldOperand2 = operand2;
    operand2 = newOperand2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERAND2, oldOperand2, newOperand2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperand2(MultiplicativeExpression newOperand2)
  {
    if (newOperand2 != operand2)
    {
      NotificationChain msgs = null;
      if (operand2 != null)
        msgs = ((InternalEObject)operand2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERAND2, null, msgs);
      if (newOperand2 != null)
        msgs = ((InternalEObject)newOperand2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERAND2, null, msgs);
      msgs = basicSetOperand2(newOperand2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERAND2, newOperand2, newOperand2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERAND1:
        return basicSetOperand1(null, msgs);
      case StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERAND2:
        return basicSetOperand2(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERAND1:
        return getOperand1();
      case StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERATOR:
        return getOperator();
      case StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERAND2:
        return getOperand2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERAND1:
        setOperand1((MultiplicativeExpression)newValue);
        return;
      case StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERATOR:
        setOperator((AdditiveOperator)newValue);
        return;
      case StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERAND2:
        setOperand2((MultiplicativeExpression)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERAND1:
        setOperand1((MultiplicativeExpression)null);
        return;
      case StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERAND2:
        setOperand2((MultiplicativeExpression)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERAND1:
        return operand1 != null;
      case StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case StatechartexpressionsPackage.ADDITIVE_EXPRESSION__OPERAND2:
        return operand2 != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //AdditiveExpressionImpl
