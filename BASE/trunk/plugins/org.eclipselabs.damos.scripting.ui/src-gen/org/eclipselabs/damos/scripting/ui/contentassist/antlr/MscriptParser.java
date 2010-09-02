/*
* generated by Xtext
*/
package org.eclipselabs.damos.scripting.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipselabs.damos.scripting.services.MscriptGrammarAccess;

public class MscriptParser extends AbstractContentAssistParser {
	
	@Inject
	private MscriptGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipselabs.damos.scripting.ui.contentassist.antlr.internal.InternalMscriptParser createParser() {
		org.eclipselabs.damos.scripting.ui.contentassist.antlr.internal.InternalMscriptParser result = new org.eclipselabs.damos.scripting.ui.contentassist.antlr.internal.InternalMscriptParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPackageDefinitionElementAccess().getAlternatives(), "rule__PackageDefinitionElement__Alternatives");
					put(grammarAccess.getDataTypeSpecifierAccess().getAlternatives(), "rule__DataTypeSpecifier__Alternatives");
					put(grammarAccess.getPrimitiveTypeSpecifierAccess().getAlternatives(), "rule__PrimitiveTypeSpecifier__Alternatives");
					put(grammarAccess.getNumericalTypeSpecifierAccess().getAlternatives(), "rule__NumericalTypeSpecifier__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getLogicalNotExpressionAccess().getAlternatives(), "rule__LogicalNotExpression__Alternatives");
					put(grammarAccess.getUnaryMinusExpressionAccess().getAlternatives(), "rule__UnaryMinusExpression__Alternatives");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getNumericalLiteralAccess().getAlternatives(), "rule__NumericalLiteral__Alternatives");
					put(grammarAccess.getFunctionArgumentListAccess().getAlternatives(), "rule__FunctionArgumentList__Alternatives");
					put(grammarAccess.getComponentReferenceAccess().getAlternatives(), "rule__ComponentReference__Alternatives");
					put(grammarAccess.getSubscriptAccess().getAlternatives(), "rule__Subscript__Alternatives");
					put(grammarAccess.getUnitExpressionNumeratorAccess().getAlternatives(), "rule__UnitExpressionNumerator__Alternatives");
					put(grammarAccess.getUnitExpressionDenominatorAccess().getAlternatives(), "rule__UnitExpressionDenominator__Alternatives");
					put(grammarAccess.getRelationalOperatorAccess().getAlternatives(), "rule__RelationalOperator__Alternatives");
					put(grammarAccess.getAddSubtractOperatorAccess().getAlternatives(), "rule__AddSubtractOperator__Alternatives");
					put(grammarAccess.getMultiplyDivideOperatorAccess().getAlternatives(), "rule__MultiplyDivideOperator__Alternatives");
					put(grammarAccess.getPowerOperatorAccess().getAlternatives(), "rule__PowerOperator__Alternatives");
					put(grammarAccess.getBooleanKindAccess().getAlternatives(), "rule__BooleanKind__Alternatives");
					put(grammarAccess.getPackageDefinitionAccess().getGroup(), "rule__PackageDefinition__Group__0");
					put(grammarAccess.getEnumerationDefinitionAccess().getGroup(), "rule__EnumerationDefinition__Group__0");
					put(grammarAccess.getEnumerationDefinitionAccess().getGroup_3(), "rule__EnumerationDefinition__Group_3__0");
					put(grammarAccess.getEnumerationDefinitionAccess().getGroup_3_1(), "rule__EnumerationDefinition__Group_3_1__0");
					put(grammarAccess.getRealTypeSpecifierAccess().getGroup(), "rule__RealTypeSpecifier__Group__0");
					put(grammarAccess.getRealTypeSpecifierAccess().getGroup_2(), "rule__RealTypeSpecifier__Group_2__0");
					put(grammarAccess.getIntegerTypeSpecifierAccess().getGroup(), "rule__IntegerTypeSpecifier__Group__0");
					put(grammarAccess.getIntegerTypeSpecifierAccess().getGroup_2(), "rule__IntegerTypeSpecifier__Group_2__0");
					put(grammarAccess.getBooleanTypeSpecifierAccess().getGroup(), "rule__BooleanTypeSpecifier__Group__0");
					put(grammarAccess.getStringTypeSpecifierAccess().getGroup(), "rule__StringTypeSpecifier__Group__0");
					put(grammarAccess.getConditionalExpressionAccess().getGroup(), "rule__ConditionalExpression__Group__0");
					put(grammarAccess.getConditionalExpressionAccess().getGroup_2(), "rule__ConditionalExpression__Group_2__0");
					put(grammarAccess.getConditionalExpressionCaseAccess().getGroup(), "rule__ConditionalExpressionCase__Group__0");
					put(grammarAccess.getRangeExpressionAccess().getGroup(), "rule__RangeExpression__Group__0");
					put(grammarAccess.getRangeExpressionAccess().getGroup_1(), "rule__RangeExpression__Group_1__0");
					put(grammarAccess.getRangeExpressionAccess().getGroup_1_3(), "rule__RangeExpression__Group_1_3__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup(), "rule__LogicalOrExpression__Group__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup_1(), "rule__LogicalOrExpression__Group_1__0");
					put(grammarAccess.getLogicalOrExpressionAccess().getGroup_1_1(), "rule__LogicalOrExpression__Group_1_1__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup(), "rule__LogicalAndExpression__Group__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup_1(), "rule__LogicalAndExpression__Group_1__0");
					put(grammarAccess.getLogicalAndExpressionAccess().getGroup_1_1(), "rule__LogicalAndExpression__Group_1_1__0");
					put(grammarAccess.getLogicalNotExpressionAccess().getGroup_1(), "rule__LogicalNotExpression__Group_1__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup(), "rule__RelationalExpression__Group__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1(), "rule__RelationalExpression__Group_1__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1_1(), "rule__RelationalExpression__Group_1_1__0");
					put(grammarAccess.getAddSubtractExpressionAccess().getGroup(), "rule__AddSubtractExpression__Group__0");
					put(grammarAccess.getAddSubtractExpressionAccess().getGroup_1(), "rule__AddSubtractExpression__Group_1__0");
					put(grammarAccess.getAddSubtractExpressionAccess().getGroup_1_1(), "rule__AddSubtractExpression__Group_1_1__0");
					put(grammarAccess.getMultiplyDivideExpressionAccess().getGroup(), "rule__MultiplyDivideExpression__Group__0");
					put(grammarAccess.getMultiplyDivideExpressionAccess().getGroup_1(), "rule__MultiplyDivideExpression__Group_1__0");
					put(grammarAccess.getMultiplyDivideExpressionAccess().getGroup_1_1(), "rule__MultiplyDivideExpression__Group_1_1__0");
					put(grammarAccess.getPowerExpressionAccess().getGroup(), "rule__PowerExpression__Group__0");
					put(grammarAccess.getPowerExpressionAccess().getGroup_1(), "rule__PowerExpression__Group_1__0");
					put(grammarAccess.getUnaryMinusExpressionAccess().getGroup_1(), "rule__UnaryMinusExpression__Group_1__0");
					put(grammarAccess.getRealLiteralAccess().getGroup(), "rule__RealLiteral__Group__0");
					put(grammarAccess.getRealLiteralAccess().getGroup_1(), "rule__RealLiteral__Group_1__0");
					put(grammarAccess.getIntegerLiteralAccess().getGroup(), "rule__IntegerLiteral__Group__0");
					put(grammarAccess.getIntegerLiteralAccess().getGroup_1(), "rule__IntegerLiteral__Group_1__0");
					put(grammarAccess.getNameAccess().getGroup(), "rule__Name__Group__0");
					put(grammarAccess.getNameAccess().getGroup_1(), "rule__Name__Group_1__0");
					put(grammarAccess.getFunctionArgumentListAccess().getGroup_0(), "rule__FunctionArgumentList__Group_0__0");
					put(grammarAccess.getFunctionArgumentListAccess().getGroup_0_1(), "rule__FunctionArgumentList__Group_0_1__0");
					put(grammarAccess.getFunctionArgumentListAccess().getGroup_0_1_0(), "rule__FunctionArgumentList__Group_0_1_0__0");
					put(grammarAccess.getFunctionArgumentListAccess().getGroup_0_1_1(), "rule__FunctionArgumentList__Group_0_1_1__0");
					put(grammarAccess.getFunctionArgumentListAccess().getGroup_1(), "rule__FunctionArgumentList__Group_1__0");
					put(grammarAccess.getFunctionArgumentListAccess().getGroup_1_1(), "rule__FunctionArgumentList__Group_1_1__0");
					put(grammarAccess.getNamedArgumentAccess().getGroup(), "rule__NamedArgument__Group__0");
					put(grammarAccess.getSymbolReferenceAccess().getGroup(), "rule__SymbolReference__Group__0");
					put(grammarAccess.getSymbolReferenceAccess().getGroup_3(), "rule__SymbolReference__Group_3__0");
					put(grammarAccess.getArrayReferenceAccess().getGroup(), "rule__ArrayReference__Group__0");
					put(grammarAccess.getArrayReferenceAccess().getGroup_2(), "rule__ArrayReference__Group_2__0");
					put(grammarAccess.getMemberReferenceAccess().getGroup(), "rule__MemberReference__Group__0");
					put(grammarAccess.getColonSubscriptAccess().getGroup(), "rule__ColonSubscript__Group__0");
					put(grammarAccess.getMatrixConstructionOperatorAccess().getGroup(), "rule__MatrixConstructionOperator__Group__0");
					put(grammarAccess.getMatrixConstructionOperatorAccess().getGroup_2(), "rule__MatrixConstructionOperator__Group_2__0");
					put(grammarAccess.getExpressionListAccess().getGroup(), "rule__ExpressionList__Group__0");
					put(grammarAccess.getExpressionListAccess().getGroup_1(), "rule__ExpressionList__Group_1__0");
					put(grammarAccess.getParenthesizedExpressionAccess().getGroup(), "rule__ParenthesizedExpression__Group__0");
					put(grammarAccess.getBeginExpressionAccess().getGroup(), "rule__BeginExpression__Group__0");
					put(grammarAccess.getEndExpressionAccess().getGroup(), "rule__EndExpression__Group__0");
					put(grammarAccess.getUnitExpressionAccess().getGroup(), "rule__UnitExpression__Group__0");
					put(grammarAccess.getUnitExpressionAccess().getGroup_1(), "rule__UnitExpression__Group_1__0");
					put(grammarAccess.getUnitExpressionNumeratorAccess().getGroup_1(), "rule__UnitExpressionNumerator__Group_1__0");
					put(grammarAccess.getUnitExpressionNumeratorAccess().getGroup_1_1(), "rule__UnitExpressionNumerator__Group_1_1__0");
					put(grammarAccess.getUnitExpressionDenominatorAccess().getGroup_1(), "rule__UnitExpressionDenominator__Group_1__0");
					put(grammarAccess.getUnitExpressionDenominatorAccess().getGroup_1_2(), "rule__UnitExpressionDenominator__Group_1_2__0");
					put(grammarAccess.getUnitExpressionFactorAccess().getGroup(), "rule__UnitExpressionFactor__Group__0");
					put(grammarAccess.getUnitExpressionFactorAccess().getGroup_1(), "rule__UnitExpressionFactor__Group_1__0");
					put(grammarAccess.getUnitExpressionExponentAccess().getGroup(), "rule__UnitExpressionExponent__Group__0");
					put(grammarAccess.getPackageDefinitionAccess().getNameAssignment_1(), "rule__PackageDefinition__NameAssignment_1");
					put(grammarAccess.getPackageDefinitionAccess().getElementsAssignment_3(), "rule__PackageDefinition__ElementsAssignment_3");
					put(grammarAccess.getEnumerationDefinitionAccess().getNameAssignment_1(), "rule__EnumerationDefinition__NameAssignment_1");
					put(grammarAccess.getEnumerationDefinitionAccess().getLiteralsAssignment_3_0(), "rule__EnumerationDefinition__LiteralsAssignment_3_0");
					put(grammarAccess.getEnumerationDefinitionAccess().getLiteralsAssignment_3_1_1(), "rule__EnumerationDefinition__LiteralsAssignment_3_1_1");
					put(grammarAccess.getEnumerationLiteralDefinitionAccess().getNameAssignment(), "rule__EnumerationLiteralDefinition__NameAssignment");
					put(grammarAccess.getRealTypeSpecifierAccess().getUnitAssignment_2_1(), "rule__RealTypeSpecifier__UnitAssignment_2_1");
					put(grammarAccess.getIntegerTypeSpecifierAccess().getUnitAssignment_2_1(), "rule__IntegerTypeSpecifier__UnitAssignment_2_1");
					put(grammarAccess.getComplexTypeSpecifierAccess().getNameAssignment(), "rule__ComplexTypeSpecifier__NameAssignment");
					put(grammarAccess.getConditionalExpressionAccess().getCasesAssignment_1(), "rule__ConditionalExpression__CasesAssignment_1");
					put(grammarAccess.getConditionalExpressionAccess().getCasesAssignment_2_1(), "rule__ConditionalExpression__CasesAssignment_2_1");
					put(grammarAccess.getConditionalExpressionAccess().getElseExpressionAssignment_4(), "rule__ConditionalExpression__ElseExpressionAssignment_4");
					put(grammarAccess.getConditionalExpressionCaseAccess().getConditionExpressionAssignment_0(), "rule__ConditionalExpressionCase__ConditionExpressionAssignment_0");
					put(grammarAccess.getConditionalExpressionCaseAccess().getThenExpressionAssignment_2(), "rule__ConditionalExpressionCase__ThenExpressionAssignment_2");
					put(grammarAccess.getRangeExpressionAccess().getExpressionsAssignment_1_2(), "rule__RangeExpression__ExpressionsAssignment_1_2");
					put(grammarAccess.getRangeExpressionAccess().getExpressionsAssignment_1_3_1(), "rule__RangeExpression__ExpressionsAssignment_1_3_1");
					put(grammarAccess.getLogicalOrExpressionAccess().getOperandsAssignment_1_1_1(), "rule__LogicalOrExpression__OperandsAssignment_1_1_1");
					put(grammarAccess.getLogicalAndExpressionAccess().getOperandsAssignment_1_1_1(), "rule__LogicalAndExpression__OperandsAssignment_1_1_1");
					put(grammarAccess.getLogicalNotExpressionAccess().getOperandAssignment_1_2(), "rule__LogicalNotExpression__OperandAssignment_1_2");
					put(grammarAccess.getRelationalExpressionAccess().getOperatorsAssignment_1_1_0(), "rule__RelationalExpression__OperatorsAssignment_1_1_0");
					put(grammarAccess.getRelationalExpressionAccess().getOperandsAssignment_1_1_1(), "rule__RelationalExpression__OperandsAssignment_1_1_1");
					put(grammarAccess.getAddSubtractExpressionAccess().getOperatorsAssignment_1_1_0(), "rule__AddSubtractExpression__OperatorsAssignment_1_1_0");
					put(grammarAccess.getAddSubtractExpressionAccess().getOperandsAssignment_1_1_1(), "rule__AddSubtractExpression__OperandsAssignment_1_1_1");
					put(grammarAccess.getMultiplyDivideExpressionAccess().getOperatorsAssignment_1_1_0(), "rule__MultiplyDivideExpression__OperatorsAssignment_1_1_0");
					put(grammarAccess.getMultiplyDivideExpressionAccess().getOperandsAssignment_1_1_1(), "rule__MultiplyDivideExpression__OperandsAssignment_1_1_1");
					put(grammarAccess.getPowerExpressionAccess().getOperatorAssignment_1_1(), "rule__PowerExpression__OperatorAssignment_1_1");
					put(grammarAccess.getPowerExpressionAccess().getExponentAssignment_1_2(), "rule__PowerExpression__ExponentAssignment_1_2");
					put(grammarAccess.getUnaryMinusExpressionAccess().getOperandAssignment_1_2(), "rule__UnaryMinusExpression__OperandAssignment_1_2");
					put(grammarAccess.getRealLiteralAccess().getValueAssignment_0(), "rule__RealLiteral__ValueAssignment_0");
					put(grammarAccess.getRealLiteralAccess().getUnitAssignment_1_1(), "rule__RealLiteral__UnitAssignment_1_1");
					put(grammarAccess.getIntegerLiteralAccess().getValueAssignment_0(), "rule__IntegerLiteral__ValueAssignment_0");
					put(grammarAccess.getIntegerLiteralAccess().getUnitAssignment_1_1(), "rule__IntegerLiteral__UnitAssignment_1_1");
					put(grammarAccess.getBooleanLiteralAccess().getValueAssignment(), "rule__BooleanLiteral__ValueAssignment");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment(), "rule__StringLiteral__ValueAssignment");
					put(grammarAccess.getNameAccess().getIdentifiersAssignment_0(), "rule__Name__IdentifiersAssignment_0");
					put(grammarAccess.getNameAccess().getIdentifiersAssignment_1_1(), "rule__Name__IdentifiersAssignment_1_1");
					put(grammarAccess.getFunctionArgumentListAccess().getArgumentsAssignment_0_0(), "rule__FunctionArgumentList__ArgumentsAssignment_0_0");
					put(grammarAccess.getFunctionArgumentListAccess().getArgumentsAssignment_0_1_0_1(), "rule__FunctionArgumentList__ArgumentsAssignment_0_1_0_1");
					put(grammarAccess.getFunctionArgumentListAccess().getNamedArgumentsAssignment_0_1_1_1(), "rule__FunctionArgumentList__NamedArgumentsAssignment_0_1_1_1");
					put(grammarAccess.getFunctionArgumentListAccess().getNamedArgumentsAssignment_1_0(), "rule__FunctionArgumentList__NamedArgumentsAssignment_1_0");
					put(grammarAccess.getFunctionArgumentListAccess().getNamedArgumentsAssignment_1_1_1(), "rule__FunctionArgumentList__NamedArgumentsAssignment_1_1_1");
					put(grammarAccess.getNamedArgumentAccess().getIdentifierAssignment_0(), "rule__NamedArgument__IdentifierAssignment_0");
					put(grammarAccess.getNamedArgumentAccess().getExpressionAssignment_2(), "rule__NamedArgument__ExpressionAssignment_2");
					put(grammarAccess.getSymbolReferenceAccess().getGlobalAssignment_0(), "rule__SymbolReference__GlobalAssignment_0");
					put(grammarAccess.getSymbolReferenceAccess().getNameAssignment_1(), "rule__SymbolReference__NameAssignment_1");
					put(grammarAccess.getSymbolReferenceAccess().getComponentReferencesAssignment_2(), "rule__SymbolReference__ComponentReferencesAssignment_2");
					put(grammarAccess.getSymbolReferenceAccess().getFunctionCallAssignment_3_0(), "rule__SymbolReference__FunctionCallAssignment_3_0");
					put(grammarAccess.getSymbolReferenceAccess().getArgumentListAssignment_3_1(), "rule__SymbolReference__ArgumentListAssignment_3_1");
					put(grammarAccess.getArrayReferenceAccess().getSubscriptsAssignment_1(), "rule__ArrayReference__SubscriptsAssignment_1");
					put(grammarAccess.getArrayReferenceAccess().getSubscriptsAssignment_2_1(), "rule__ArrayReference__SubscriptsAssignment_2_1");
					put(grammarAccess.getMemberReferenceAccess().getIdentifierAssignment_1(), "rule__MemberReference__IdentifierAssignment_1");
					put(grammarAccess.getExpressionSubscriptAccess().getExpressionAssignment(), "rule__ExpressionSubscript__ExpressionAssignment");
					put(grammarAccess.getMatrixConstructionOperatorAccess().getExpressionListsAssignment_1(), "rule__MatrixConstructionOperator__ExpressionListsAssignment_1");
					put(grammarAccess.getMatrixConstructionOperatorAccess().getExpressionListsAssignment_2_1(), "rule__MatrixConstructionOperator__ExpressionListsAssignment_2_1");
					put(grammarAccess.getExpressionListAccess().getExpressionsAssignment_0(), "rule__ExpressionList__ExpressionsAssignment_0");
					put(grammarAccess.getExpressionListAccess().getExpressionsAssignment_1_1(), "rule__ExpressionList__ExpressionsAssignment_1_1");
					put(grammarAccess.getParenthesizedExpressionAccess().getExpressionAssignment_1(), "rule__ParenthesizedExpression__ExpressionAssignment_1");
					put(grammarAccess.getUnitExpressionAccess().getNumeratorAssignment_0(), "rule__UnitExpression__NumeratorAssignment_0");
					put(grammarAccess.getUnitExpressionAccess().getDenominatorAssignment_1_1(), "rule__UnitExpression__DenominatorAssignment_1_1");
					put(grammarAccess.getUnitExpressionNumeratorAccess().getOneAssignment_0(), "rule__UnitExpressionNumerator__OneAssignment_0");
					put(grammarAccess.getUnitExpressionNumeratorAccess().getFactorsAssignment_1_0(), "rule__UnitExpressionNumerator__FactorsAssignment_1_0");
					put(grammarAccess.getUnitExpressionNumeratorAccess().getFactorsAssignment_1_1_1(), "rule__UnitExpressionNumerator__FactorsAssignment_1_1_1");
					put(grammarAccess.getUnitExpressionDenominatorAccess().getFactorsAssignment_0(), "rule__UnitExpressionDenominator__FactorsAssignment_0");
					put(grammarAccess.getUnitExpressionDenominatorAccess().getFactorsAssignment_1_1(), "rule__UnitExpressionDenominator__FactorsAssignment_1_1");
					put(grammarAccess.getUnitExpressionDenominatorAccess().getFactorsAssignment_1_2_1(), "rule__UnitExpressionDenominator__FactorsAssignment_1_2_1");
					put(grammarAccess.getUnitExpressionFactorAccess().getOperandAssignment_0(), "rule__UnitExpressionFactor__OperandAssignment_0");
					put(grammarAccess.getUnitExpressionFactorAccess().getExponentAssignment_1_1(), "rule__UnitExpressionFactor__ExponentAssignment_1_1");
					put(grammarAccess.getUnitExpressionExponentAccess().getNegativeAssignment_0(), "rule__UnitExpressionExponent__NegativeAssignment_0");
					put(grammarAccess.getUnitExpressionExponentAccess().getValueAssignment_1(), "rule__UnitExpressionExponent__ValueAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipselabs.damos.scripting.ui.contentassist.antlr.internal.InternalMscriptParser typedParser = (org.eclipselabs.damos.scripting.ui.contentassist.antlr.internal.InternalMscriptParser) parser;
			typedParser.entryRuleMscript();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MscriptGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MscriptGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
