/**
 * <copyright>
 * </copyright>
 *
 */
package org.yakindu.sct.statechart.expressions.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.yakindu.model.sct.statechart.StatechartPackage;

import org.yakindu.sct.statechart.expressions.AdditiveOperator;
import org.yakindu.sct.statechart.expressions.AlwaysEvent;
import org.yakindu.sct.statechart.expressions.Assignment;
import org.yakindu.sct.statechart.expressions.BuiltinEventSpec;
import org.yakindu.sct.statechart.expressions.DefRoot;
import org.yakindu.sct.statechart.expressions.Direction;
import org.yakindu.sct.statechart.expressions.ElementReferenceExpression;
import org.yakindu.sct.statechart.expressions.EnterEvent;
import org.yakindu.sct.statechart.expressions.EntryEvent;
import org.yakindu.sct.statechart.expressions.EntryPointSpec;
import org.yakindu.sct.statechart.expressions.Entrypoint;
import org.yakindu.sct.statechart.expressions.EventDefinition;
import org.yakindu.sct.statechart.expressions.EventDerivation;
import org.yakindu.sct.statechart.expressions.EventRaising;
import org.yakindu.sct.statechart.expressions.EventSpec;
import org.yakindu.sct.statechart.expressions.ExitEvent;
import org.yakindu.sct.statechart.expressions.ExitPointSpec;
import org.yakindu.sct.statechart.expressions.Exitpoint;
import org.yakindu.sct.statechart.expressions.Expression;
import org.yakindu.sct.statechart.expressions.ExpressionsFactory;
import org.yakindu.sct.statechart.expressions.ExpressionsPackage;
import org.yakindu.sct.statechart.expressions.InterfaceScope;
import org.yakindu.sct.statechart.expressions.InternalScope;
import org.yakindu.sct.statechart.expressions.LocalReaction;
import org.yakindu.sct.statechart.expressions.LogicalAndExpression;
import org.yakindu.sct.statechart.expressions.LogicalNotExpression;
import org.yakindu.sct.statechart.expressions.LogicalOrExpression;
import org.yakindu.sct.statechart.expressions.LogicalRelationExpression;
import org.yakindu.sct.statechart.expressions.MultiplicativeOperator;
import org.yakindu.sct.statechart.expressions.NumericalAddSubtractExpression;
import org.yakindu.sct.statechart.expressions.NumericalMultiplyDivideExpression;
import org.yakindu.sct.statechart.expressions.NumericalUnaryExpression;
import org.yakindu.sct.statechart.expressions.OnCycleEvent;
import org.yakindu.sct.statechart.expressions.Operation;
import org.yakindu.sct.statechart.expressions.OperationCall;
import org.yakindu.sct.statechart.expressions.OperationCallStatement;
import org.yakindu.sct.statechart.expressions.PrimitiveValueExpression;
import org.yakindu.sct.statechart.expressions.Reaction;
import org.yakindu.sct.statechart.expressions.ReactionEffect;
import org.yakindu.sct.statechart.expressions.ReactionPriority;
import org.yakindu.sct.statechart.expressions.ReactionProperties;
import org.yakindu.sct.statechart.expressions.ReactionProperty;
import org.yakindu.sct.statechart.expressions.ReactionTrigger;
import org.yakindu.sct.statechart.expressions.RegularEventSpec;
import org.yakindu.sct.statechart.expressions.RelationalOperator;
import org.yakindu.sct.statechart.expressions.Root;
import org.yakindu.sct.statechart.expressions.SimpleScope;
import org.yakindu.sct.statechart.expressions.StateDeclaration;
import org.yakindu.sct.statechart.expressions.StateRoot;
import org.yakindu.sct.statechart.expressions.StatechartDefinition;
import org.yakindu.sct.statechart.expressions.StatechartRoot;
import org.yakindu.sct.statechart.expressions.Statement;
import org.yakindu.sct.statechart.expressions.TimeEventSpec;
import org.yakindu.sct.statechart.expressions.TimeUnit;
import org.yakindu.sct.statechart.expressions.TransitionReaction;
import org.yakindu.sct.statechart.expressions.TransitionRoot;
import org.yakindu.sct.statechart.expressions.TransitionStatement;
import org.yakindu.sct.statechart.expressions.Type;
import org.yakindu.sct.statechart.expressions.UnaryOperator;
import org.yakindu.sct.statechart.expressions.VariableDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionsPackageImpl extends EPackageImpl implements ExpressionsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statechartRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statechartDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventDerivationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localReactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionReactionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reactionPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reactionPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reactionPriorityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entryPointSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exitPointSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regularEventSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeEventSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass builtinEventSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entryEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exitEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass onCycleEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alwaysEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventRaisingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationCallStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleScopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceScopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass internalScopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entrypointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exitpointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reactionTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reactionEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enterEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalOrExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalAndExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalNotExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalRelationExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericalAddSubtractExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericalMultiplyDivideExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericalUnaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveValueExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementReferenceExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum directionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum additiveOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum multiplicativeOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum unaryOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum relationalOperatorEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum timeUnitEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.yakindu.sct.statechart.expressions.ExpressionsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ExpressionsPackageImpl()
  {
    super(eNS_URI, ExpressionsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ExpressionsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ExpressionsPackage init()
  {
    if (isInited) return (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

    // Obtain or create and register package
    ExpressionsPackageImpl theExpressionsPackage = (ExpressionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpressionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpressionsPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    StatechartPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theExpressionsPackage.createPackageContents();

    // Initialize created meta-data
    theExpressionsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theExpressionsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ExpressionsPackage.eNS_URI, theExpressionsPackage);
    return theExpressionsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoot()
  {
    return rootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoot_Roots()
  {
    return (EReference)rootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefRoot()
  {
    return defRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatechartRoot()
  {
    return statechartRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatechartRoot_Def()
  {
    return (EReference)statechartRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateRoot()
  {
    return stateRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateRoot_Def()
  {
    return (EReference)stateRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionRoot()
  {
    return transitionRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionRoot_Def()
  {
    return (EReference)transitionRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatechartDefinition()
  {
    return statechartDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatechartDefinition_DefinitionScopes()
  {
    return (EReference)statechartDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateDeclaration()
  {
    return stateDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateDeclaration_Scope()
  {
    return (EReference)stateDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionStatement()
  {
    return transitionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventDerivation()
  {
    return eventDerivationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventDerivation_Condition()
  {
    return (EReference)eventDerivationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventDerivation_Value()
  {
    return (EReference)eventDerivationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReaction()
  {
    return reactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReaction_Trigger()
  {
    return (EReference)reactionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReaction_Effect()
  {
    return (EReference)reactionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReaction_Properties()
  {
    return (EReference)reactionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalReaction()
  {
    return localReactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionReaction()
  {
    return transitionReactionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReactionProperties()
  {
    return reactionPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReactionProperties_Properties()
  {
    return (EReference)reactionPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReactionProperty()
  {
    return reactionPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReactionPriority()
  {
    return reactionPriorityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReactionPriority_Priority()
  {
    return (EAttribute)reactionPriorityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntryPointSpec()
  {
    return entryPointSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntryPointSpec_Entrypoint()
  {
    return (EReference)entryPointSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExitPointSpec()
  {
    return exitPointSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExitPointSpec_Exitpoint()
  {
    return (EReference)exitPointSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventSpec()
  {
    return eventSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegularEventSpec()
  {
    return regularEventSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegularEventSpec_Event()
  {
    return (EReference)regularEventSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeEventSpec()
  {
    return timeEventSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeEventSpec_Value()
  {
    return (EAttribute)timeEventSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeEventSpec_Unit()
  {
    return (EAttribute)timeEventSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuiltinEventSpec()
  {
    return builtinEventSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntryEvent()
  {
    return entryEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExitEvent()
  {
    return exitEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOnCycleEvent()
  {
    return onCycleEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlwaysEvent()
  {
    return alwaysEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignment()
  {
    return assignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_VarRef()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Expression()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventRaising()
  {
    return eventRaisingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventRaising_Event()
  {
    return (EReference)eventRaisingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventRaising_Value()
  {
    return (EReference)eventRaisingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationCallStatement()
  {
    return operationCallStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationCallStatement_Call()
  {
    return (EReference)operationCallStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleScope()
  {
    return simpleScopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceScope()
  {
    return interfaceScopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceScope_Name()
  {
    return (EAttribute)interfaceScopeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInternalScope()
  {
    return internalScopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventDefinition()
  {
    return eventDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventDefinition_Direction()
  {
    return (EAttribute)eventDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventDefinition_Type()
  {
    return (EAttribute)eventDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventDefinition_Derivation()
  {
    return (EReference)eventDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDefinition()
  {
    return variableDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinition_Readonly()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinition_External()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinition_Type()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDefinition_InitialValue()
  {
    return (EAttribute)variableDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_ParamTypes()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Type()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntrypoint()
  {
    return entrypointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExitpoint()
  {
    return exitpointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReactionTrigger()
  {
    return reactionTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReactionTrigger_Triggers()
  {
    return (EReference)reactionTriggerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReactionTrigger_GuardExpression()
  {
    return (EReference)reactionTriggerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReactionEffect()
  {
    return reactionEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReactionEffect_Actions()
  {
    return (EReference)reactionEffectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnterEvent()
  {
    return enterEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicalOrExpression()
  {
    return logicalOrExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalOrExpression_LeftOperand()
  {
    return (EReference)logicalOrExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalOrExpression_RightOperand()
  {
    return (EReference)logicalOrExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicalAndExpression()
  {
    return logicalAndExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalAndExpression_LeftOperand()
  {
    return (EReference)logicalAndExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalAndExpression_RightOperand()
  {
    return (EReference)logicalAndExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicalNotExpression()
  {
    return logicalNotExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalNotExpression_Operand()
  {
    return (EReference)logicalNotExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicalRelationExpression()
  {
    return logicalRelationExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalRelationExpression_LeftOperand()
  {
    return (EReference)logicalRelationExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogicalRelationExpression_Operator()
  {
    return (EAttribute)logicalRelationExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalRelationExpression_RightOperand()
  {
    return (EReference)logicalRelationExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericalAddSubtractExpression()
  {
    return numericalAddSubtractExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumericalAddSubtractExpression_LeftOperand()
  {
    return (EReference)numericalAddSubtractExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumericalAddSubtractExpression_Operator()
  {
    return (EAttribute)numericalAddSubtractExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumericalAddSubtractExpression_RightOperand()
  {
    return (EReference)numericalAddSubtractExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericalMultiplyDivideExpression()
  {
    return numericalMultiplyDivideExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumericalMultiplyDivideExpression_LeftOperand()
  {
    return (EReference)numericalMultiplyDivideExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumericalMultiplyDivideExpression_Operator()
  {
    return (EAttribute)numericalMultiplyDivideExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumericalMultiplyDivideExpression_RightOperand()
  {
    return (EReference)numericalMultiplyDivideExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericalUnaryExpression()
  {
    return numericalUnaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumericalUnaryExpression_Operator()
  {
    return (EAttribute)numericalUnaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumericalUnaryExpression_Operand()
  {
    return (EReference)numericalUnaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitiveValueExpression()
  {
    return primitiveValueExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimitiveValueExpression_Value()
  {
    return (EAttribute)primitiveValueExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementReferenceExpression()
  {
    return elementReferenceExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementReferenceExpression_Value()
  {
    return (EReference)elementReferenceExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperationCall()
  {
    return operationCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationCall_Operation()
  {
    return (EReference)operationCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperationCall_Args()
  {
    return (EReference)operationCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDirection()
  {
    return directionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getAdditiveOperator()
  {
    return additiveOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMultiplicativeOperator()
  {
    return multiplicativeOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUnaryOperator()
  {
    return unaryOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRelationalOperator()
  {
    return relationalOperatorEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTimeUnit()
  {
    return timeUnitEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getType()
  {
    return typeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionsFactory getExpressionsFactory()
  {
    return (ExpressionsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    rootEClass = createEClass(ROOT);
    createEReference(rootEClass, ROOT__ROOTS);

    defRootEClass = createEClass(DEF_ROOT);

    statechartRootEClass = createEClass(STATECHART_ROOT);
    createEReference(statechartRootEClass, STATECHART_ROOT__DEF);

    stateRootEClass = createEClass(STATE_ROOT);
    createEReference(stateRootEClass, STATE_ROOT__DEF);

    transitionRootEClass = createEClass(TRANSITION_ROOT);
    createEReference(transitionRootEClass, TRANSITION_ROOT__DEF);

    statechartDefinitionEClass = createEClass(STATECHART_DEFINITION);
    createEReference(statechartDefinitionEClass, STATECHART_DEFINITION__DEFINITION_SCOPES);

    stateDeclarationEClass = createEClass(STATE_DECLARATION);
    createEReference(stateDeclarationEClass, STATE_DECLARATION__SCOPE);

    transitionStatementEClass = createEClass(TRANSITION_STATEMENT);

    eventDerivationEClass = createEClass(EVENT_DERIVATION);
    createEReference(eventDerivationEClass, EVENT_DERIVATION__CONDITION);
    createEReference(eventDerivationEClass, EVENT_DERIVATION__VALUE);

    reactionEClass = createEClass(REACTION);
    createEReference(reactionEClass, REACTION__TRIGGER);
    createEReference(reactionEClass, REACTION__EFFECT);
    createEReference(reactionEClass, REACTION__PROPERTIES);

    localReactionEClass = createEClass(LOCAL_REACTION);

    transitionReactionEClass = createEClass(TRANSITION_REACTION);

    reactionPropertiesEClass = createEClass(REACTION_PROPERTIES);
    createEReference(reactionPropertiesEClass, REACTION_PROPERTIES__PROPERTIES);

    reactionPropertyEClass = createEClass(REACTION_PROPERTY);

    reactionPriorityEClass = createEClass(REACTION_PRIORITY);
    createEAttribute(reactionPriorityEClass, REACTION_PRIORITY__PRIORITY);

    entryPointSpecEClass = createEClass(ENTRY_POINT_SPEC);
    createEReference(entryPointSpecEClass, ENTRY_POINT_SPEC__ENTRYPOINT);

    exitPointSpecEClass = createEClass(EXIT_POINT_SPEC);
    createEReference(exitPointSpecEClass, EXIT_POINT_SPEC__EXITPOINT);

    eventSpecEClass = createEClass(EVENT_SPEC);

    regularEventSpecEClass = createEClass(REGULAR_EVENT_SPEC);
    createEReference(regularEventSpecEClass, REGULAR_EVENT_SPEC__EVENT);

    timeEventSpecEClass = createEClass(TIME_EVENT_SPEC);
    createEAttribute(timeEventSpecEClass, TIME_EVENT_SPEC__VALUE);
    createEAttribute(timeEventSpecEClass, TIME_EVENT_SPEC__UNIT);

    builtinEventSpecEClass = createEClass(BUILTIN_EVENT_SPEC);

    entryEventEClass = createEClass(ENTRY_EVENT);

    exitEventEClass = createEClass(EXIT_EVENT);

    onCycleEventEClass = createEClass(ON_CYCLE_EVENT);

    alwaysEventEClass = createEClass(ALWAYS_EVENT);

    statementEClass = createEClass(STATEMENT);

    assignmentEClass = createEClass(ASSIGNMENT);
    createEReference(assignmentEClass, ASSIGNMENT__VAR_REF);
    createEReference(assignmentEClass, ASSIGNMENT__EXPRESSION);

    eventRaisingEClass = createEClass(EVENT_RAISING);
    createEReference(eventRaisingEClass, EVENT_RAISING__EVENT);
    createEReference(eventRaisingEClass, EVENT_RAISING__VALUE);

    operationCallStatementEClass = createEClass(OPERATION_CALL_STATEMENT);
    createEReference(operationCallStatementEClass, OPERATION_CALL_STATEMENT__CALL);

    expressionEClass = createEClass(EXPRESSION);

    simpleScopeEClass = createEClass(SIMPLE_SCOPE);

    interfaceScopeEClass = createEClass(INTERFACE_SCOPE);
    createEAttribute(interfaceScopeEClass, INTERFACE_SCOPE__NAME);

    internalScopeEClass = createEClass(INTERNAL_SCOPE);

    eventDefinitionEClass = createEClass(EVENT_DEFINITION);
    createEAttribute(eventDefinitionEClass, EVENT_DEFINITION__DIRECTION);
    createEAttribute(eventDefinitionEClass, EVENT_DEFINITION__TYPE);
    createEReference(eventDefinitionEClass, EVENT_DEFINITION__DERIVATION);

    variableDefinitionEClass = createEClass(VARIABLE_DEFINITION);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__READONLY);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__EXTERNAL);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__TYPE);
    createEAttribute(variableDefinitionEClass, VARIABLE_DEFINITION__INITIAL_VALUE);

    operationEClass = createEClass(OPERATION);
    createEAttribute(operationEClass, OPERATION__PARAM_TYPES);
    createEAttribute(operationEClass, OPERATION__TYPE);

    entrypointEClass = createEClass(ENTRYPOINT);

    exitpointEClass = createEClass(EXITPOINT);

    reactionTriggerEClass = createEClass(REACTION_TRIGGER);
    createEReference(reactionTriggerEClass, REACTION_TRIGGER__TRIGGERS);
    createEReference(reactionTriggerEClass, REACTION_TRIGGER__GUARD_EXPRESSION);

    reactionEffectEClass = createEClass(REACTION_EFFECT);
    createEReference(reactionEffectEClass, REACTION_EFFECT__ACTIONS);

    enterEventEClass = createEClass(ENTER_EVENT);

    logicalOrExpressionEClass = createEClass(LOGICAL_OR_EXPRESSION);
    createEReference(logicalOrExpressionEClass, LOGICAL_OR_EXPRESSION__LEFT_OPERAND);
    createEReference(logicalOrExpressionEClass, LOGICAL_OR_EXPRESSION__RIGHT_OPERAND);

    logicalAndExpressionEClass = createEClass(LOGICAL_AND_EXPRESSION);
    createEReference(logicalAndExpressionEClass, LOGICAL_AND_EXPRESSION__LEFT_OPERAND);
    createEReference(logicalAndExpressionEClass, LOGICAL_AND_EXPRESSION__RIGHT_OPERAND);

    logicalNotExpressionEClass = createEClass(LOGICAL_NOT_EXPRESSION);
    createEReference(logicalNotExpressionEClass, LOGICAL_NOT_EXPRESSION__OPERAND);

    logicalRelationExpressionEClass = createEClass(LOGICAL_RELATION_EXPRESSION);
    createEReference(logicalRelationExpressionEClass, LOGICAL_RELATION_EXPRESSION__LEFT_OPERAND);
    createEAttribute(logicalRelationExpressionEClass, LOGICAL_RELATION_EXPRESSION__OPERATOR);
    createEReference(logicalRelationExpressionEClass, LOGICAL_RELATION_EXPRESSION__RIGHT_OPERAND);

    numericalAddSubtractExpressionEClass = createEClass(NUMERICAL_ADD_SUBTRACT_EXPRESSION);
    createEReference(numericalAddSubtractExpressionEClass, NUMERICAL_ADD_SUBTRACT_EXPRESSION__LEFT_OPERAND);
    createEAttribute(numericalAddSubtractExpressionEClass, NUMERICAL_ADD_SUBTRACT_EXPRESSION__OPERATOR);
    createEReference(numericalAddSubtractExpressionEClass, NUMERICAL_ADD_SUBTRACT_EXPRESSION__RIGHT_OPERAND);

    numericalMultiplyDivideExpressionEClass = createEClass(NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION);
    createEReference(numericalMultiplyDivideExpressionEClass, NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__LEFT_OPERAND);
    createEAttribute(numericalMultiplyDivideExpressionEClass, NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__OPERATOR);
    createEReference(numericalMultiplyDivideExpressionEClass, NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__RIGHT_OPERAND);

    numericalUnaryExpressionEClass = createEClass(NUMERICAL_UNARY_EXPRESSION);
    createEAttribute(numericalUnaryExpressionEClass, NUMERICAL_UNARY_EXPRESSION__OPERATOR);
    createEReference(numericalUnaryExpressionEClass, NUMERICAL_UNARY_EXPRESSION__OPERAND);

    primitiveValueExpressionEClass = createEClass(PRIMITIVE_VALUE_EXPRESSION);
    createEAttribute(primitiveValueExpressionEClass, PRIMITIVE_VALUE_EXPRESSION__VALUE);

    elementReferenceExpressionEClass = createEClass(ELEMENT_REFERENCE_EXPRESSION);
    createEReference(elementReferenceExpressionEClass, ELEMENT_REFERENCE_EXPRESSION__VALUE);

    operationCallEClass = createEClass(OPERATION_CALL);
    createEReference(operationCallEClass, OPERATION_CALL__OPERATION);
    createEReference(operationCallEClass, OPERATION_CALL__ARGS);

    // Create enums
    directionEEnum = createEEnum(DIRECTION);
    additiveOperatorEEnum = createEEnum(ADDITIVE_OPERATOR);
    multiplicativeOperatorEEnum = createEEnum(MULTIPLICATIVE_OPERATOR);
    unaryOperatorEEnum = createEEnum(UNARY_OPERATOR);
    relationalOperatorEEnum = createEEnum(RELATIONAL_OPERATOR);
    timeUnitEEnum = createEEnum(TIME_UNIT);
    typeEEnum = createEEnum(TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    StatechartPackage theStatechartPackage = (StatechartPackage)EPackage.Registry.INSTANCE.getEPackage(StatechartPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    statechartRootEClass.getESuperTypes().add(this.getDefRoot());
    stateRootEClass.getESuperTypes().add(this.getDefRoot());
    transitionRootEClass.getESuperTypes().add(this.getDefRoot());
    localReactionEClass.getESuperTypes().add(theStatechartPackage.getDeclaration());
    localReactionEClass.getESuperTypes().add(this.getReaction());
    transitionReactionEClass.getESuperTypes().add(this.getTransitionStatement());
    transitionReactionEClass.getESuperTypes().add(this.getReaction());
    reactionPriorityEClass.getESuperTypes().add(this.getReactionProperty());
    entryPointSpecEClass.getESuperTypes().add(this.getReactionProperty());
    exitPointSpecEClass.getESuperTypes().add(this.getReactionProperty());
    regularEventSpecEClass.getESuperTypes().add(this.getEventSpec());
    timeEventSpecEClass.getESuperTypes().add(this.getEventSpec());
    builtinEventSpecEClass.getESuperTypes().add(this.getEventSpec());
    entryEventEClass.getESuperTypes().add(this.getBuiltinEventSpec());
    exitEventEClass.getESuperTypes().add(this.getBuiltinEventSpec());
    onCycleEventEClass.getESuperTypes().add(this.getBuiltinEventSpec());
    alwaysEventEClass.getESuperTypes().add(this.getBuiltinEventSpec());
    assignmentEClass.getESuperTypes().add(this.getStatement());
    eventRaisingEClass.getESuperTypes().add(this.getStatement());
    operationCallStatementEClass.getESuperTypes().add(this.getStatement());
    simpleScopeEClass.getESuperTypes().add(theStatechartPackage.getScope());
    interfaceScopeEClass.getESuperTypes().add(theStatechartPackage.getScope());
    internalScopeEClass.getESuperTypes().add(theStatechartPackage.getScope());
    eventDefinitionEClass.getESuperTypes().add(theStatechartPackage.getEvent());
    variableDefinitionEClass.getESuperTypes().add(theStatechartPackage.getVariable());
    operationEClass.getESuperTypes().add(theStatechartPackage.getDeclaration());
    entrypointEClass.getESuperTypes().add(theStatechartPackage.getDeclaration());
    exitpointEClass.getESuperTypes().add(theStatechartPackage.getDeclaration());
    reactionTriggerEClass.getESuperTypes().add(theStatechartPackage.getTrigger());
    reactionEffectEClass.getESuperTypes().add(theStatechartPackage.getEffect());
    enterEventEClass.getESuperTypes().add(this.getEntryEvent());
    logicalOrExpressionEClass.getESuperTypes().add(this.getExpression());
    logicalAndExpressionEClass.getESuperTypes().add(this.getExpression());
    logicalNotExpressionEClass.getESuperTypes().add(this.getExpression());
    logicalRelationExpressionEClass.getESuperTypes().add(this.getExpression());
    numericalAddSubtractExpressionEClass.getESuperTypes().add(this.getExpression());
    numericalMultiplyDivideExpressionEClass.getESuperTypes().add(this.getExpression());
    numericalUnaryExpressionEClass.getESuperTypes().add(this.getExpression());
    primitiveValueExpressionEClass.getESuperTypes().add(this.getExpression());
    elementReferenceExpressionEClass.getESuperTypes().add(this.getExpression());
    operationCallEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRoot_Roots(), this.getDefRoot(), null, "roots", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defRootEClass, DefRoot.class, "DefRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(statechartRootEClass, StatechartRoot.class, "StatechartRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatechartRoot_Def(), this.getStatechartDefinition(), null, "def", null, 0, 1, StatechartRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateRootEClass, StateRoot.class, "StateRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateRoot_Def(), this.getStateDeclaration(), null, "def", null, 0, 1, StateRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionRootEClass, TransitionRoot.class, "TransitionRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionRoot_Def(), this.getTransitionStatement(), null, "def", null, 0, 1, TransitionRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statechartDefinitionEClass, StatechartDefinition.class, "StatechartDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatechartDefinition_DefinitionScopes(), theStatechartPackage.getScope(), null, "definitionScopes", null, 0, -1, StatechartDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateDeclarationEClass, StateDeclaration.class, "StateDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateDeclaration_Scope(), theStatechartPackage.getScope(), null, "scope", null, 0, 1, StateDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionStatementEClass, TransitionStatement.class, "TransitionStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eventDerivationEClass, EventDerivation.class, "EventDerivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEventDerivation_Condition(), this.getExpression(), null, "condition", null, 0, 1, EventDerivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventDerivation_Value(), this.getExpression(), null, "value", null, 0, 1, EventDerivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reactionEClass, Reaction.class, "Reaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReaction_Trigger(), theStatechartPackage.getTrigger(), null, "trigger", null, 0, 1, Reaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReaction_Effect(), theStatechartPackage.getEffect(), null, "effect", null, 0, 1, Reaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReaction_Properties(), this.getReactionProperties(), null, "properties", null, 0, 1, Reaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localReactionEClass, LocalReaction.class, "LocalReaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transitionReactionEClass, TransitionReaction.class, "TransitionReaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(reactionPropertiesEClass, ReactionProperties.class, "ReactionProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReactionProperties_Properties(), this.getReactionProperty(), null, "properties", null, 0, -1, ReactionProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reactionPropertyEClass, ReactionProperty.class, "ReactionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(reactionPriorityEClass, ReactionPriority.class, "ReactionPriority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReactionPriority_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, ReactionPriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entryPointSpecEClass, EntryPointSpec.class, "EntryPointSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntryPointSpec_Entrypoint(), this.getEntrypoint(), null, "entrypoint", null, 0, 1, EntryPointSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exitPointSpecEClass, ExitPointSpec.class, "ExitPointSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExitPointSpec_Exitpoint(), this.getExitpoint(), null, "exitpoint", null, 0, 1, ExitPointSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventSpecEClass, EventSpec.class, "EventSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(regularEventSpecEClass, RegularEventSpec.class, "RegularEventSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRegularEventSpec_Event(), theStatechartPackage.getEvent(), null, "event", null, 0, 1, RegularEventSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeEventSpecEClass, TimeEventSpec.class, "TimeEventSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTimeEventSpec_Value(), ecorePackage.getEInt(), "value", null, 0, 1, TimeEventSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeEventSpec_Unit(), this.getTimeUnit(), "unit", null, 0, 1, TimeEventSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(builtinEventSpecEClass, BuiltinEventSpec.class, "BuiltinEventSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(entryEventEClass, EntryEvent.class, "EntryEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exitEventEClass, ExitEvent.class, "ExitEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(onCycleEventEClass, OnCycleEvent.class, "OnCycleEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alwaysEventEClass, AlwaysEvent.class, "AlwaysEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignment_VarRef(), theStatechartPackage.getVariable(), null, "varRef", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignment_Expression(), this.getExpression(), null, "expression", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventRaisingEClass, EventRaising.class, "EventRaising", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEventRaising_Event(), theStatechartPackage.getEvent(), null, "event", null, 0, 1, EventRaising.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventRaising_Value(), this.getExpression(), null, "value", null, 0, 1, EventRaising.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationCallStatementEClass, OperationCallStatement.class, "OperationCallStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperationCallStatement_Call(), this.getExpression(), null, "call", null, 0, 1, OperationCallStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(simpleScopeEClass, SimpleScope.class, "SimpleScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interfaceScopeEClass, InterfaceScope.class, "InterfaceScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterfaceScope_Name(), ecorePackage.getEString(), "name", null, 0, 1, InterfaceScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(internalScopeEClass, InternalScope.class, "InternalScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eventDefinitionEClass, EventDefinition.class, "EventDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEventDefinition_Direction(), this.getDirection(), "direction", null, 0, 1, EventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEventDefinition_Type(), this.getType(), "type", null, 0, 1, EventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventDefinition_Derivation(), this.getEventDerivation(), null, "derivation", null, 0, 1, EventDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDefinitionEClass, VariableDefinition.class, "VariableDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDefinition_Readonly(), ecorePackage.getEBoolean(), "readonly", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinition_External(), ecorePackage.getEBoolean(), "external", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinition_Type(), this.getType(), "type", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariableDefinition_InitialValue(), ecorePackage.getEString(), "initialValue", null, 0, 1, VariableDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperation_ParamTypes(), this.getType(), "paramTypes", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Type(), this.getType(), "type", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entrypointEClass, Entrypoint.class, "Entrypoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exitpointEClass, Exitpoint.class, "Exitpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(reactionTriggerEClass, ReactionTrigger.class, "ReactionTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReactionTrigger_Triggers(), this.getEventSpec(), null, "triggers", null, 0, -1, ReactionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReactionTrigger_GuardExpression(), this.getExpression(), null, "guardExpression", null, 0, 1, ReactionTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reactionEffectEClass, ReactionEffect.class, "ReactionEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReactionEffect_Actions(), this.getStatement(), null, "actions", null, 0, -1, ReactionEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enterEventEClass, EnterEvent.class, "EnterEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(logicalOrExpressionEClass, LogicalOrExpression.class, "LogicalOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLogicalOrExpression_LeftOperand(), this.getExpression(), null, "leftOperand", null, 0, 1, LogicalOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicalOrExpression_RightOperand(), this.getExpression(), null, "rightOperand", null, 0, 1, LogicalOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicalAndExpressionEClass, LogicalAndExpression.class, "LogicalAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLogicalAndExpression_LeftOperand(), this.getExpression(), null, "leftOperand", null, 0, 1, LogicalAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicalAndExpression_RightOperand(), this.getExpression(), null, "rightOperand", null, 0, 1, LogicalAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicalNotExpressionEClass, LogicalNotExpression.class, "LogicalNotExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLogicalNotExpression_Operand(), this.getExpression(), null, "operand", null, 0, 1, LogicalNotExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicalRelationExpressionEClass, LogicalRelationExpression.class, "LogicalRelationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLogicalRelationExpression_LeftOperand(), this.getExpression(), null, "leftOperand", null, 0, 1, LogicalRelationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogicalRelationExpression_Operator(), this.getRelationalOperator(), "operator", null, 0, 1, LogicalRelationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicalRelationExpression_RightOperand(), this.getExpression(), null, "rightOperand", null, 0, 1, LogicalRelationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numericalAddSubtractExpressionEClass, NumericalAddSubtractExpression.class, "NumericalAddSubtractExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumericalAddSubtractExpression_LeftOperand(), this.getExpression(), null, "leftOperand", null, 0, 1, NumericalAddSubtractExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumericalAddSubtractExpression_Operator(), this.getAdditiveOperator(), "operator", null, 0, 1, NumericalAddSubtractExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumericalAddSubtractExpression_RightOperand(), this.getExpression(), null, "rightOperand", null, 0, 1, NumericalAddSubtractExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numericalMultiplyDivideExpressionEClass, NumericalMultiplyDivideExpression.class, "NumericalMultiplyDivideExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumericalMultiplyDivideExpression_LeftOperand(), this.getExpression(), null, "leftOperand", null, 0, 1, NumericalMultiplyDivideExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumericalMultiplyDivideExpression_Operator(), this.getMultiplicativeOperator(), "operator", null, 0, 1, NumericalMultiplyDivideExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumericalMultiplyDivideExpression_RightOperand(), this.getExpression(), null, "rightOperand", null, 0, 1, NumericalMultiplyDivideExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numericalUnaryExpressionEClass, NumericalUnaryExpression.class, "NumericalUnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumericalUnaryExpression_Operator(), this.getUnaryOperator(), "operator", null, 0, 1, NumericalUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumericalUnaryExpression_Operand(), this.getExpression(), null, "operand", null, 0, 1, NumericalUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitiveValueExpressionEClass, PrimitiveValueExpression.class, "PrimitiveValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimitiveValueExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, PrimitiveValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementReferenceExpressionEClass, ElementReferenceExpression.class, "ElementReferenceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElementReferenceExpression_Value(), theStatechartPackage.getDeclaration(), null, "value", null, 0, 1, ElementReferenceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationCallEClass, OperationCall.class, "OperationCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperationCall_Operation(), this.getOperation(), null, "operation", null, 0, 1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperationCall_Args(), this.getExpression(), null, "args", null, 0, -1, OperationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(directionEEnum, Direction.class, "Direction");
    addEEnumLiteral(directionEEnum, Direction.IN);
    addEEnumLiteral(directionEEnum, Direction.OUT);

    initEEnum(additiveOperatorEEnum, AdditiveOperator.class, "AdditiveOperator");
    addEEnumLiteral(additiveOperatorEEnum, AdditiveOperator.PLUS);
    addEEnumLiteral(additiveOperatorEEnum, AdditiveOperator.MINUS);

    initEEnum(multiplicativeOperatorEEnum, MultiplicativeOperator.class, "MultiplicativeOperator");
    addEEnumLiteral(multiplicativeOperatorEEnum, MultiplicativeOperator.MUL);
    addEEnumLiteral(multiplicativeOperatorEEnum, MultiplicativeOperator.DIV);
    addEEnumLiteral(multiplicativeOperatorEEnum, MultiplicativeOperator.MOD);

    initEEnum(unaryOperatorEEnum, UnaryOperator.class, "UnaryOperator");
    addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.POSITIVE);
    addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.NEGATIVE);
    addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.COMPLEMENT);

    initEEnum(relationalOperatorEEnum, RelationalOperator.class, "RelationalOperator");
    addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.SMALLER);
    addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.SMALLER_EQUAL);
    addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.GREATER);
    addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.GREATER_EQUAL);
    addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.EQUALS);
    addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.NOT_EQUALS);

    initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit");
    addEEnumLiteral(timeUnitEEnum, TimeUnit.SECOND);
    addEEnumLiteral(timeUnitEEnum, TimeUnit.MILLISECOND);
    addEEnumLiteral(timeUnitEEnum, TimeUnit.NANOSECOND);

    initEEnum(typeEEnum, Type.class, "Type");
    addEEnumLiteral(typeEEnum, Type.VOID);
    addEEnumLiteral(typeEEnum, Type.INTEGER);
    addEEnumLiteral(typeEEnum, Type.REAL);
    addEEnumLiteral(typeEEnum, Type.BOOLEAN);
    addEEnumLiteral(typeEEnum, Type.STRING);

    // Create resource
    createResource(eNS_URI);
  }

} //ExpressionsPackageImpl
