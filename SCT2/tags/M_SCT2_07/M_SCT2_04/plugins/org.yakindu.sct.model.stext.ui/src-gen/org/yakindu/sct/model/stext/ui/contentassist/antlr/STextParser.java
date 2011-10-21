/*
* generated by Xtext
*/
package org.yakindu.sct.model.stext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.yakindu.sct.model.stext.services.STextGrammarAccess;

public class STextParser extends AbstractContentAssistParser {
	
	@Inject
	private STextGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.yakindu.sct.model.stext.ui.contentassist.antlr.internal.InternalSTextParser createParser() {
		org.yakindu.sct.model.stext.ui.contentassist.antlr.internal.InternalSTextParser result = new org.yakindu.sct.model.stext.ui.contentassist.antlr.internal.InternalSTextParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDefRootAccess().getAlternatives(), "rule__DefRoot__Alternatives");
					put(grammarAccess.getScopeAccess().getAlternatives(), "rule__Scope__Alternatives");
					put(grammarAccess.getStatechartScopeAccess().getAlternatives(), "rule__StatechartScope__Alternatives");
					put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
					put(grammarAccess.getReactionAccess().getAlternatives(), "rule__Reaction__Alternatives");
					put(grammarAccess.getReactionTriggerAccess().getAlternatives_1(), "rule__ReactionTrigger__Alternatives_1");
					put(grammarAccess.getReactionPropertyAccess().getAlternatives(), "rule__ReactionProperty__Alternatives");
					put(grammarAccess.getEventSpecAccess().getAlternatives(), "rule__EventSpec__Alternatives");
					put(grammarAccess.getBuiltinEventSpecAccess().getAlternatives(), "rule__BuiltinEventSpec__Alternatives");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getLogicalNotExpressionAccess().getAlternatives(), "rule__LogicalNotExpression__Alternatives");
					put(grammarAccess.getNumericalUnaryExpressionAccess().getAlternatives(), "rule__NumericalUnaryExpression__Alternatives");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getValueExpressionAccess().getAlternatives(), "rule__ValueExpression__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getDirectionAccess().getAlternatives(), "rule__Direction__Alternatives");
					put(grammarAccess.getAssignmentOperatorAccess().getAlternatives(), "rule__AssignmentOperator__Alternatives");
					put(grammarAccess.getShiftOperatorAccess().getAlternatives(), "rule__ShiftOperator__Alternatives");
					put(grammarAccess.getAdditiveOperatorAccess().getAlternatives(), "rule__AdditiveOperator__Alternatives");
					put(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives(), "rule__MultiplicativeOperator__Alternatives");
					put(grammarAccess.getUnaryOperatorAccess().getAlternatives(), "rule__UnaryOperator__Alternatives");
					put(grammarAccess.getRelationalOperatorAccess().getAlternatives(), "rule__RelationalOperator__Alternatives");
					put(grammarAccess.getTimeUnitAccess().getAlternatives(), "rule__TimeUnit__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getStatechartRootAccess().getGroup(), "rule__StatechartRoot__Group__0");
					put(grammarAccess.getStateRootAccess().getGroup(), "rule__StateRoot__Group__0");
					put(grammarAccess.getTransitionRootAccess().getGroup(), "rule__TransitionRoot__Group__0");
					put(grammarAccess.getStatechartDefinitionAccess().getGroup(), "rule__StatechartDefinition__Group__0");
					put(grammarAccess.getSimpleScopeAccess().getGroup(), "rule__SimpleScope__Group__0");
					put(grammarAccess.getInterfaceScopeAccess().getGroup(), "rule__InterfaceScope__Group__0");
					put(grammarAccess.getInternalScopeAccess().getGroup(), "rule__InternalScope__Group__0");
					put(grammarAccess.getEventDefinitionAccess().getGroup(), "rule__EventDefinition__Group__0");
					put(grammarAccess.getEventDefinitionAccess().getGroup_4(), "rule__EventDefinition__Group_4__0");
					put(grammarAccess.getEventDerivationAccess().getGroup(), "rule__EventDerivation__Group__0");
					put(grammarAccess.getEventDerivationAccess().getGroup_2(), "rule__EventDerivation__Group_2__0");
					put(grammarAccess.getVariableDefinitionAccess().getGroup(), "rule__VariableDefinition__Group__0");
					put(grammarAccess.getVariableDefinitionAccess().getGroup_6(), "rule__VariableDefinition__Group_6__0");
					put(grammarAccess.getClockAccess().getGroup(), "rule__Clock__Group__0");
					put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
					put(grammarAccess.getOperationAccess().getGroup_4(), "rule__Operation__Group_4__0");
					put(grammarAccess.getOperationAccess().getGroup_4_1(), "rule__Operation__Group_4_1__0");
					put(grammarAccess.getOperationAccess().getGroup_6(), "rule__Operation__Group_6__0");
					put(grammarAccess.getEntrypointAccess().getGroup(), "rule__Entrypoint__Group__0");
					put(grammarAccess.getExitpointAccess().getGroup(), "rule__Exitpoint__Group__0");
					put(grammarAccess.getLocalReactionAccess().getGroup(), "rule__LocalReaction__Group__0");
					put(grammarAccess.getLocalReactionAccess().getGroup_1(), "rule__LocalReaction__Group_1__0");
					put(grammarAccess.getLocalReactionAccess().getGroup_2(), "rule__LocalReaction__Group_2__0");
					put(grammarAccess.getTransitionReactionAccess().getGroup(), "rule__TransitionReaction__Group__0");
					put(grammarAccess.getTransitionReactionAccess().getGroup_2(), "rule__TransitionReaction__Group_2__0");
					put(grammarAccess.getTransitionReactionAccess().getGroup_3(), "rule__TransitionReaction__Group_3__0");
					put(grammarAccess.getReactionTriggerAccess().getGroup(), "rule__ReactionTrigger__Group__0");
					put(grammarAccess.getReactionTriggerAccess().getGroup_1_0(), "rule__ReactionTrigger__Group_1_0__0");
					put(grammarAccess.getReactionTriggerAccess().getGroup_1_0_1(), "rule__ReactionTrigger__Group_1_0_1__0");
					put(grammarAccess.getReactionTriggerAccess().getGroup_1_0_2(), "rule__ReactionTrigger__Group_1_0_2__0");
					put(grammarAccess.getReactionTriggerAccess().getGroup_1_1(), "rule__ReactionTrigger__Group_1_1__0");
					put(grammarAccess.getReactionEffectAccess().getGroup(), "rule__ReactionEffect__Group__0");
					put(grammarAccess.getReactionEffectAccess().getGroup_1(), "rule__ReactionEffect__Group_1__0");
					put(grammarAccess.getReactionPropertiesAccess().getGroup(), "rule__ReactionProperties__Group__0");
					put(grammarAccess.getEntryPointSpecAccess().getGroup(), "rule__EntryPointSpec__Group__0");
					put(grammarAccess.getExitPointSpecAccess().getGroup(), "rule__ExitPointSpec__Group__0");
					put(grammarAccess.getTimeEventSpecAccess().getGroup(), "rule__TimeEventSpec__Group__0");
					put(grammarAccess.getEntryEventAccess().getGroup(), "rule__EntryEvent__Group__0");
					put(grammarAccess.getExitEventAccess().getGroup(), "rule__ExitEvent__Group__0");
					put(grammarAccess.getOnCycleEventAccess().getGroup(), "rule__OnCycleEvent__Group__0");
					put(grammarAccess.getAlwaysEventAccess().getGroup(), "rule__AlwaysEvent__Group__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getEventRaisingAccess().getGroup(), "rule__EventRaising__Group__0");
					put(grammarAccess.getEventRaisingAccess().getGroup_2(), "rule__EventRaising__Group_2__0");
					put(grammarAccess.getConditionalExpressionAccess().getGroup(), "rule__ConditionalExpression__Group__0");
					put(grammarAccess.getConditionalExpressionAccess().getGroup_1(), "rule__ConditionalExpression__Group_1__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup(), "rule__LogicalOrExpression__Group__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup_1(), "rule__LogicalOrExpression__Group_1__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup(), "rule__LogicalAndExpression__Group__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup_1(), "rule__LogicalAndExpression__Group_1__0");
					put(grammarAccess.getLogicalNotExpressionAccess().getGroup_1(), "rule__LogicalNotExpression__Group_1__0");
					put(grammarAccess.getBitwiseXorExpressionAccess().getGroup(), "rule__BitwiseXorExpression__Group__0");
					put(grammarAccess.getBitwiseXorExpressionAccess().getGroup_1(), "rule__BitwiseXorExpression__Group_1__0");
					put(grammarAccess.getBitwiseOrExpressionAccess().getGroup(), "rule__BitwiseOrExpression__Group__0");
					put(grammarAccess.getBitwiseOrExpressionAccess().getGroup_1(), "rule__BitwiseOrExpression__Group_1__0");
					put(grammarAccess.getBitwiseAndExpressionAccess().getGroup(), "rule__BitwiseAndExpression__Group__0");
					put(grammarAccess.getBitwiseAndExpressionAccess().getGroup_1(), "rule__BitwiseAndExpression__Group_1__0");
					put(grammarAccess.getLogicalRelationExpressionAccess().getGroup(), "rule__LogicalRelationExpression__Group__0");
					put(grammarAccess.getLogicalRelationExpressionAccess().getGroup_1(), "rule__LogicalRelationExpression__Group_1__0");
					put(grammarAccess.getShiftExpressionAccess().getGroup(), "rule__ShiftExpression__Group__0");
					put(grammarAccess.getShiftExpressionAccess().getGroup_1(), "rule__ShiftExpression__Group_1__0");
					put(grammarAccess.getNumericalAddSubtractExpressionAccess().getGroup(), "rule__NumericalAddSubtractExpression__Group__0");
					put(grammarAccess.getNumericalAddSubtractExpressionAccess().getGroup_1(), "rule__NumericalAddSubtractExpression__Group_1__0");
					put(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getGroup(), "rule__NumericalMultiplyDivideExpression__Group__0");
					put(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getGroup_1(), "rule__NumericalMultiplyDivideExpression__Group_1__0");
					put(grammarAccess.getNumericalUnaryExpressionAccess().getGroup_1(), "rule__NumericalUnaryExpression__Group_1__0");
					put(grammarAccess.getPrimaryExpressionAccess().getGroup_1(), "rule__PrimaryExpression__Group_1__0");
					put(grammarAccess.getPrimitiveValueExpressionAccess().getGroup(), "rule__PrimitiveValueExpression__Group__0");
					put(grammarAccess.getElementReferenceExpressionAccess().getGroup(), "rule__ElementReferenceExpression__Group__0");
					put(grammarAccess.getOperationCallAccess().getGroup(), "rule__OperationCall__Group__0");
					put(grammarAccess.getOperationCallAccess().getGroup_3(), "rule__OperationCall__Group_3__0");
					put(grammarAccess.getOperationCallAccess().getGroup_3_1(), "rule__OperationCall__Group_3_1__0");
					put(grammarAccess.getRootAccess().getRootsAssignment(), "rule__Root__RootsAssignment");
					put(grammarAccess.getStatechartRootAccess().getDefAssignment_1(), "rule__StatechartRoot__DefAssignment_1");
					put(grammarAccess.getStateRootAccess().getDefAssignment_1(), "rule__StateRoot__DefAssignment_1");
					put(grammarAccess.getTransitionRootAccess().getDefAssignment_1(), "rule__TransitionRoot__DefAssignment_1");
					put(grammarAccess.getStatechartDefinitionAccess().getDefinitionScopesAssignment_1(), "rule__StatechartDefinition__DefinitionScopesAssignment_1");
					put(grammarAccess.getStateDeclarationAccess().getScopeAssignment(), "rule__StateDeclaration__ScopeAssignment");
					put(grammarAccess.getSimpleScopeAccess().getDeclarationsAssignment_1(), "rule__SimpleScope__DeclarationsAssignment_1");
					put(grammarAccess.getInterfaceScopeAccess().getNameAssignment_2(), "rule__InterfaceScope__NameAssignment_2");
					put(grammarAccess.getInterfaceScopeAccess().getDeclarationsAssignment_4(), "rule__InterfaceScope__DeclarationsAssignment_4");
					put(grammarAccess.getInternalScopeAccess().getDeclarationsAssignment_3(), "rule__InternalScope__DeclarationsAssignment_3");
					put(grammarAccess.getEventDefinitionAccess().getDirectionAssignment_1(), "rule__EventDefinition__DirectionAssignment_1");
					put(grammarAccess.getEventDefinitionAccess().getNameAssignment_3(), "rule__EventDefinition__NameAssignment_3");
					put(grammarAccess.getEventDefinitionAccess().getTypeAssignment_4_1(), "rule__EventDefinition__TypeAssignment_4_1");
					put(grammarAccess.getEventDefinitionAccess().getDerivationAssignment_5(), "rule__EventDefinition__DerivationAssignment_5");
					put(grammarAccess.getEventDerivationAccess().getConditionAssignment_1(), "rule__EventDerivation__ConditionAssignment_1");
					put(grammarAccess.getEventDerivationAccess().getValueAssignment_2_1(), "rule__EventDerivation__ValueAssignment_2_1");
					put(grammarAccess.getVariableDefinitionAccess().getReadonlyAssignment_2_0(), "rule__VariableDefinition__ReadonlyAssignment_2_0");
					put(grammarAccess.getVariableDefinitionAccess().getExternalAssignment_2_1(), "rule__VariableDefinition__ExternalAssignment_2_1");
					put(grammarAccess.getVariableDefinitionAccess().getNameAssignment_3(), "rule__VariableDefinition__NameAssignment_3");
					put(grammarAccess.getVariableDefinitionAccess().getTypeAssignment_5(), "rule__VariableDefinition__TypeAssignment_5");
					put(grammarAccess.getVariableDefinitionAccess().getInitialValueAssignment_6_1(), "rule__VariableDefinition__InitialValueAssignment_6_1");
					put(grammarAccess.getClockAccess().getNameAssignment_2(), "rule__Clock__NameAssignment_2");
					put(grammarAccess.getOperationAccess().getNameAssignment_2(), "rule__Operation__NameAssignment_2");
					put(grammarAccess.getOperationAccess().getParamTypesAssignment_4_0(), "rule__Operation__ParamTypesAssignment_4_0");
					put(grammarAccess.getOperationAccess().getParamTypesAssignment_4_1_1(), "rule__Operation__ParamTypesAssignment_4_1_1");
					put(grammarAccess.getOperationAccess().getTypeAssignment_6_1(), "rule__Operation__TypeAssignment_6_1");
					put(grammarAccess.getEntrypointAccess().getNameAssignment_2(), "rule__Entrypoint__NameAssignment_2");
					put(grammarAccess.getExitpointAccess().getNameAssignment_2(), "rule__Exitpoint__NameAssignment_2");
					put(grammarAccess.getLocalReactionAccess().getTriggerAssignment_0(), "rule__LocalReaction__TriggerAssignment_0");
					put(grammarAccess.getLocalReactionAccess().getEffectAssignment_1_1(), "rule__LocalReaction__EffectAssignment_1_1");
					put(grammarAccess.getLocalReactionAccess().getPropertiesAssignment_2_1(), "rule__LocalReaction__PropertiesAssignment_2_1");
					put(grammarAccess.getTransitionReactionAccess().getTriggerAssignment_1(), "rule__TransitionReaction__TriggerAssignment_1");
					put(grammarAccess.getTransitionReactionAccess().getEffectAssignment_2_1(), "rule__TransitionReaction__EffectAssignment_2_1");
					put(grammarAccess.getTransitionReactionAccess().getPropertiesAssignment_3_1(), "rule__TransitionReaction__PropertiesAssignment_3_1");
					put(grammarAccess.getReactionTriggerAccess().getTriggersAssignment_1_0_0(), "rule__ReactionTrigger__TriggersAssignment_1_0_0");
					put(grammarAccess.getReactionTriggerAccess().getTriggersAssignment_1_0_1_1(), "rule__ReactionTrigger__TriggersAssignment_1_0_1_1");
					put(grammarAccess.getReactionTriggerAccess().getGuardExpressionAssignment_1_0_2_1(), "rule__ReactionTrigger__GuardExpressionAssignment_1_0_2_1");
					put(grammarAccess.getReactionTriggerAccess().getGuardExpressionAssignment_1_1_1(), "rule__ReactionTrigger__GuardExpressionAssignment_1_1_1");
					put(grammarAccess.getReactionEffectAccess().getActionsAssignment_1_0(), "rule__ReactionEffect__ActionsAssignment_1_0");
					put(grammarAccess.getReactionPropertiesAccess().getPropertiesAssignment_1(), "rule__ReactionProperties__PropertiesAssignment_1");
					put(grammarAccess.getReactionPriorityAccess().getPriorityAssignment(), "rule__ReactionPriority__PriorityAssignment");
					put(grammarAccess.getEntryPointSpecAccess().getEntrypointAssignment_1(), "rule__EntryPointSpec__EntrypointAssignment_1");
					put(grammarAccess.getExitPointSpecAccess().getExitpointAssignment_0(), "rule__ExitPointSpec__ExitpointAssignment_0");
					put(grammarAccess.getRegularEventSpecAccess().getEventAssignment(), "rule__RegularEventSpec__EventAssignment");
					put(grammarAccess.getTimeEventSpecAccess().getValueAssignment_1(), "rule__TimeEventSpec__ValueAssignment_1");
					put(grammarAccess.getTimeEventSpecAccess().getUnitAssignment_2(), "rule__TimeEventSpec__UnitAssignment_2");
					put(grammarAccess.getAssignmentAccess().getVarRefAssignment_0(), "rule__Assignment__VarRefAssignment_0");
					put(grammarAccess.getAssignmentAccess().getOperatorAssignment_1(), "rule__Assignment__OperatorAssignment_1");
					put(grammarAccess.getAssignmentAccess().getExpressionAssignment_2(), "rule__Assignment__ExpressionAssignment_2");
					put(grammarAccess.getEventRaisingAccess().getEventAssignment_1(), "rule__EventRaising__EventAssignment_1");
					put(grammarAccess.getEventRaisingAccess().getValueAssignment_2_1(), "rule__EventRaising__ValueAssignment_2_1");
					put(grammarAccess.getConditionalExpressionAccess().getTrueCaseAssignment_1_2(), "rule__ConditionalExpression__TrueCaseAssignment_1_2");
					put(grammarAccess.getConditionalExpressionAccess().getFalseCaseAssignment_1_4(), "rule__ConditionalExpression__FalseCaseAssignment_1_4");
					put(grammarAccess.getLogicalOrExpressionAccess().getRightOperandAssignment_1_2(), "rule__LogicalOrExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getLogicalAndExpressionAccess().getRightOperandAssignment_1_2(), "rule__LogicalAndExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getLogicalNotExpressionAccess().getOperandAssignment_1_2(), "rule__LogicalNotExpression__OperandAssignment_1_2");
					put(grammarAccess.getBitwiseXorExpressionAccess().getRightOperandAssignment_1_2(), "rule__BitwiseXorExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getBitwiseOrExpressionAccess().getRightOperandAssignment_1_2(), "rule__BitwiseOrExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getBitwiseAndExpressionAccess().getRightOperandAssignment_1_2(), "rule__BitwiseAndExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getLogicalRelationExpressionAccess().getOperatorAssignment_1_1(), "rule__LogicalRelationExpression__OperatorAssignment_1_1");
					put(grammarAccess.getLogicalRelationExpressionAccess().getRightOperandAssignment_1_2(), "rule__LogicalRelationExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getShiftExpressionAccess().getOperatorAssignment_1_1(), "rule__ShiftExpression__OperatorAssignment_1_1");
					put(grammarAccess.getShiftExpressionAccess().getRightOperandAssignment_1_2(), "rule__ShiftExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getNumericalAddSubtractExpressionAccess().getOperatorAssignment_1_1(), "rule__NumericalAddSubtractExpression__OperatorAssignment_1_1");
					put(grammarAccess.getNumericalAddSubtractExpressionAccess().getRightOperandAssignment_1_2(), "rule__NumericalAddSubtractExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getOperatorAssignment_1_1(), "rule__NumericalMultiplyDivideExpression__OperatorAssignment_1_1");
					put(grammarAccess.getNumericalMultiplyDivideExpressionAccess().getRightOperandAssignment_1_2(), "rule__NumericalMultiplyDivideExpression__RightOperandAssignment_1_2");
					put(grammarAccess.getNumericalUnaryExpressionAccess().getOperatorAssignment_1_1(), "rule__NumericalUnaryExpression__OperatorAssignment_1_1");
					put(grammarAccess.getNumericalUnaryExpressionAccess().getOperandAssignment_1_2(), "rule__NumericalUnaryExpression__OperandAssignment_1_2");
					put(grammarAccess.getPrimitiveValueExpressionAccess().getValueAssignment_1(), "rule__PrimitiveValueExpression__ValueAssignment_1");
					put(grammarAccess.getElementReferenceExpressionAccess().getValueAssignment_1(), "rule__ElementReferenceExpression__ValueAssignment_1");
					put(grammarAccess.getOperationCallAccess().getOperationAssignment_1(), "rule__OperationCall__OperationAssignment_1");
					put(grammarAccess.getOperationCallAccess().getArgsAssignment_3_0(), "rule__OperationCall__ArgsAssignment_3_0");
					put(grammarAccess.getOperationCallAccess().getArgsAssignment_3_1_1(), "rule__OperationCall__ArgsAssignment_3_1_1");
					put(grammarAccess.getVariableDefinitionAccess().getUnorderedGroup_2(), "rule__VariableDefinition__UnorderedGroup_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.yakindu.sct.model.stext.ui.contentassist.antlr.internal.InternalSTextParser typedParser = (org.yakindu.sct.model.stext.ui.contentassist.antlr.internal.InternalSTextParser) parser;
			typedParser.entryRuleRoot();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public STextGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(STextGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
