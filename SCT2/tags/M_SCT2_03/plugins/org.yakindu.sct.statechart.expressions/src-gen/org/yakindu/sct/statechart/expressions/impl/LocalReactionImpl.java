/**
 * <copyright>
 * </copyright>
 *
 */
package org.yakindu.sct.statechart.expressions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yakindu.model.sct.statechart.Effect;
import org.yakindu.model.sct.statechart.Trigger;

import org.yakindu.model.sct.statechart.impl.DeclarationImpl;

import org.yakindu.sct.statechart.expressions.ExpressionsPackage;
import org.yakindu.sct.statechart.expressions.LocalReaction;
import org.yakindu.sct.statechart.expressions.Reaction;
import org.yakindu.sct.statechart.expressions.ReactionProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Reaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yakindu.sct.statechart.expressions.impl.LocalReactionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link org.yakindu.sct.statechart.expressions.impl.LocalReactionImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link org.yakindu.sct.statechart.expressions.impl.LocalReactionImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalReactionImpl extends DeclarationImpl implements LocalReaction
{
  /**
   * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrigger()
   * @generated
   * @ordered
   */
  protected Trigger trigger;

  /**
   * The cached value of the '{@link #getEffect() <em>Effect</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffect()
   * @generated
   * @ordered
   */
  protected Effect effect;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected ReactionProperties properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalReactionImpl()
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
    return ExpressionsPackage.Literals.LOCAL_REACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trigger getTrigger()
  {
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrigger(Trigger newTrigger, NotificationChain msgs)
  {
    Trigger oldTrigger = trigger;
    trigger = newTrigger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.LOCAL_REACTION__TRIGGER, oldTrigger, newTrigger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrigger(Trigger newTrigger)
  {
    if (newTrigger != trigger)
    {
      NotificationChain msgs = null;
      if (trigger != null)
        msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.LOCAL_REACTION__TRIGGER, null, msgs);
      if (newTrigger != null)
        msgs = ((InternalEObject)newTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.LOCAL_REACTION__TRIGGER, null, msgs);
      msgs = basicSetTrigger(newTrigger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.LOCAL_REACTION__TRIGGER, newTrigger, newTrigger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Effect getEffect()
  {
    return effect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEffect(Effect newEffect, NotificationChain msgs)
  {
    Effect oldEffect = effect;
    effect = newEffect;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.LOCAL_REACTION__EFFECT, oldEffect, newEffect);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEffect(Effect newEffect)
  {
    if (newEffect != effect)
    {
      NotificationChain msgs = null;
      if (effect != null)
        msgs = ((InternalEObject)effect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.LOCAL_REACTION__EFFECT, null, msgs);
      if (newEffect != null)
        msgs = ((InternalEObject)newEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.LOCAL_REACTION__EFFECT, null, msgs);
      msgs = basicSetEffect(newEffect, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.LOCAL_REACTION__EFFECT, newEffect, newEffect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReactionProperties getProperties()
  {
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperties(ReactionProperties newProperties, NotificationChain msgs)
  {
    ReactionProperties oldProperties = properties;
    properties = newProperties;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.LOCAL_REACTION__PROPERTIES, oldProperties, newProperties);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperties(ReactionProperties newProperties)
  {
    if (newProperties != properties)
    {
      NotificationChain msgs = null;
      if (properties != null)
        msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.LOCAL_REACTION__PROPERTIES, null, msgs);
      if (newProperties != null)
        msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.LOCAL_REACTION__PROPERTIES, null, msgs);
      msgs = basicSetProperties(newProperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.LOCAL_REACTION__PROPERTIES, newProperties, newProperties));
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
      case ExpressionsPackage.LOCAL_REACTION__TRIGGER:
        return basicSetTrigger(null, msgs);
      case ExpressionsPackage.LOCAL_REACTION__EFFECT:
        return basicSetEffect(null, msgs);
      case ExpressionsPackage.LOCAL_REACTION__PROPERTIES:
        return basicSetProperties(null, msgs);
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
      case ExpressionsPackage.LOCAL_REACTION__TRIGGER:
        return getTrigger();
      case ExpressionsPackage.LOCAL_REACTION__EFFECT:
        return getEffect();
      case ExpressionsPackage.LOCAL_REACTION__PROPERTIES:
        return getProperties();
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
      case ExpressionsPackage.LOCAL_REACTION__TRIGGER:
        setTrigger((Trigger)newValue);
        return;
      case ExpressionsPackage.LOCAL_REACTION__EFFECT:
        setEffect((Effect)newValue);
        return;
      case ExpressionsPackage.LOCAL_REACTION__PROPERTIES:
        setProperties((ReactionProperties)newValue);
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
      case ExpressionsPackage.LOCAL_REACTION__TRIGGER:
        setTrigger((Trigger)null);
        return;
      case ExpressionsPackage.LOCAL_REACTION__EFFECT:
        setEffect((Effect)null);
        return;
      case ExpressionsPackage.LOCAL_REACTION__PROPERTIES:
        setProperties((ReactionProperties)null);
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
      case ExpressionsPackage.LOCAL_REACTION__TRIGGER:
        return trigger != null;
      case ExpressionsPackage.LOCAL_REACTION__EFFECT:
        return effect != null;
      case ExpressionsPackage.LOCAL_REACTION__PROPERTIES:
        return properties != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Reaction.class)
    {
      switch (derivedFeatureID)
      {
        case ExpressionsPackage.LOCAL_REACTION__TRIGGER: return ExpressionsPackage.REACTION__TRIGGER;
        case ExpressionsPackage.LOCAL_REACTION__EFFECT: return ExpressionsPackage.REACTION__EFFECT;
        case ExpressionsPackage.LOCAL_REACTION__PROPERTIES: return ExpressionsPackage.REACTION__PROPERTIES;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Reaction.class)
    {
      switch (baseFeatureID)
      {
        case ExpressionsPackage.REACTION__TRIGGER: return ExpressionsPackage.LOCAL_REACTION__TRIGGER;
        case ExpressionsPackage.REACTION__EFFECT: return ExpressionsPackage.LOCAL_REACTION__EFFECT;
        case ExpressionsPackage.REACTION__PROPERTIES: return ExpressionsPackage.LOCAL_REACTION__PROPERTIES;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //LocalReactionImpl
