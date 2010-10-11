/*
* generated by Xtext
*/
package org.eclipselabs.mscript.language.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipselabs.mscript.language.services.MscriptGrammarAccess;

public class MscriptParser extends AbstractContentAssistParser {
	
	@Inject
	private MscriptGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipselabs.mscript.language.ui.contentassist.antlr.internal.InternalMscriptParser createParser() {
		org.eclipselabs.mscript.language.ui.contentassist.antlr.internal.InternalMscriptParser result = new org.eclipselabs.mscript.language.ui.contentassist.antlr.internal.InternalMscriptParser(null);
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
					put(grammarAccess.getTypeDefinitionAccess().getAlternatives(), "rule__TypeDefinition__Alternatives");
					put(grammarAccess.getDataTypeDefinitionAccess().getAlternatives(), "rule__DataTypeDefinition__Alternatives");
					put(grammarAccess.getVariableDeclarationAccess().getAlternatives_0(), "rule__VariableDeclaration__Alternatives_0");
					put(grammarAccess.getSubroutineDefinitionAccess().getAlternatives(), "rule__SubroutineDefinition__Alternatives");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getTypeSpecifierAccess().getAlternatives(), "rule__TypeSpecifier__Alternatives");
					put(grammarAccess.getDataTypeSpecifierAccess().getAlternatives(), "rule__DataTypeSpecifier__Alternatives");
					put(grammarAccess.getPrimitiveTypeSpecifierAccess().getAlternatives(), "rule__PrimitiveTypeSpecifier__Alternatives");
					put(grammarAccess.getNumericalTypeSpecifierAccess().getAlternatives(), "rule__NumericalTypeSpecifier__Alternatives");
					put(grammarAccess.getArrayDimensionSpecificationAccess().getAlternatives(), "rule__ArrayDimensionSpecification__Alternatives");
					put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
					put(grammarAccess.getLogicalNotExpressionAccess().getAlternatives(), "rule__LogicalNotExpression__Alternatives");
					put(grammarAccess.getRelationalExpressionAccess().getAlternatives_1_1(), "rule__RelationalExpression__Alternatives_1_1");
					put(grammarAccess.getUnaryMinusExpressionAccess().getAlternatives(), "rule__UnaryMinusExpression__Alternatives");
					put(grammarAccess.getFeatureCallAccess().getAlternatives(), "rule__FeatureCall__Alternatives");
					put(grammarAccess.getFeatureCallPartAccess().getAlternatives(), "rule__FeatureCallPart__Alternatives");
					put(grammarAccess.getFeatureReferenceAccess().getFeatureNameAlternatives_1_0(), "rule__FeatureReference__FeatureNameAlternatives_1_0");
					put(grammarAccess.getCallablePrimaryExpressionAccess().getAlternatives(), "rule__CallablePrimaryExpression__Alternatives");
					put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getNumericalLiteralAccess().getAlternatives(), "rule__NumericalLiteral__Alternatives");
					put(grammarAccess.getSubscriptAccess().getAlternatives(), "rule__Subscript__Alternatives");
					put(grammarAccess.getUnitExpressionAccess().getAlternatives(), "rule__UnitExpression__Alternatives");
					put(grammarAccess.getUnitExpressionNumeratorAccess().getAlternatives(), "rule__UnitExpressionNumerator__Alternatives");
					put(grammarAccess.getUnitExpressionDenominatorAccess().getAlternatives(), "rule__UnitExpressionDenominator__Alternatives");
					put(grammarAccess.getKeywordIDAccess().getAlternatives(), "rule__KeywordID__Alternatives");
					put(grammarAccess.getCheckStatusKindAccess().getAlternatives(), "rule__CheckStatusKind__Alternatives");
					put(grammarAccess.getRelationalOperatorAccess().getAlternatives(), "rule__RelationalOperator__Alternatives");
					put(grammarAccess.getAddSubtractOperatorAccess().getAlternatives(), "rule__AddSubtractOperator__Alternatives");
					put(grammarAccess.getMultiplyDivideOperatorAccess().getAlternatives(), "rule__MultiplyDivideOperator__Alternatives");
					put(grammarAccess.getPowerOperatorAccess().getAlternatives(), "rule__PowerOperator__Alternatives");
					put(grammarAccess.getBooleanKindAccess().getAlternatives(), "rule__BooleanKind__Alternatives");
					put(grammarAccess.getPackageDefinitionAccess().getGroup(), "rule__PackageDefinition__Group__0");
					put(grammarAccess.getEnumerationDefinitionAccess().getGroup(), "rule__EnumerationDefinition__Group__0");
					put(grammarAccess.getEnumerationDefinitionAccess().getGroup_3(), "rule__EnumerationDefinition__Group_3__0");
					put(grammarAccess.getEnumerationDefinitionAccess().getGroup_3_1(), "rule__EnumerationDefinition__Group_3_1__0");
					put(grammarAccess.getTypeAliasDefinitionAccess().getGroup(), "rule__TypeAliasDefinition__Group__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup_2(), "rule__VariableDeclaration__Group_2__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup_3(), "rule__VariableDeclaration__Group_3__0");
					put(grammarAccess.getRecordDefinitionAccess().getGroup(), "rule__RecordDefinition__Group__0");
					put(grammarAccess.getRecordFieldDeclarationAccess().getGroup(), "rule__RecordFieldDeclaration__Group__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup(), "rule__FunctionDefinition__Group__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_3(), "rule__FunctionDefinition__Group_3__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_3_1(), "rule__FunctionDefinition__Group_3_1__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_5(), "rule__FunctionDefinition__Group_5__0");
					put(grammarAccess.getCheckDefinitionAccess().getGroup(), "rule__CheckDefinition__Group__0");
					put(grammarAccess.getCheckDefinitionAccess().getGroup_3(), "rule__CheckDefinition__Group_3__0");
					put(grammarAccess.getCheckDefinitionAccess().getGroup_3_1(), "rule__CheckDefinition__Group_3_1__0");
					put(grammarAccess.getCheckDefinitionAccess().getGroup_5(), "rule__CheckDefinition__Group_5__0");
					put(grammarAccess.getParameterDeclarationAccess().getGroup(), "rule__ParameterDeclaration__Group__0");
					put(grammarAccess.getPreconditionChainAccess().getGroup(), "rule__PreconditionChain__Group__0");
					put(grammarAccess.getPreconditionChainAccess().getGroup_1(), "rule__PreconditionChain__Group_1__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getExpressionStatementAccess().getGroup(), "rule__ExpressionStatement__Group__0");
					put(grammarAccess.getExpressionStatementAccess().getGroup_1(), "rule__ExpressionStatement__Group_1__0");
					put(grammarAccess.getIfStatementAccess().getGroup(), "rule__IfStatement__Group__0");
					put(grammarAccess.getIfStatementAccess().getGroup_2(), "rule__IfStatement__Group_2__0");
					put(grammarAccess.getIfStatementAccess().getGroup_3(), "rule__IfStatement__Group_3__0");
					put(grammarAccess.getIfCaseAccess().getGroup(), "rule__IfCase__Group__0");
					put(grammarAccess.getWhileStatementAccess().getGroup(), "rule__WhileStatement__Group__0");
					put(grammarAccess.getDoWhileStatementAccess().getGroup(), "rule__DoWhileStatement__Group__0");
					put(grammarAccess.getForeachStatementAccess().getGroup(), "rule__ForeachStatement__Group__0");
					put(grammarAccess.getReturnStatementAccess().getGroup(), "rule__ReturnStatement__Group__0");
					put(grammarAccess.getCheckStatusStatementAccess().getGroup(), "rule__CheckStatusStatement__Group__0");
					put(grammarAccess.getRealTypeSpecifierAccess().getGroup(), "rule__RealTypeSpecifier__Group__0");
					put(grammarAccess.getRealTypeSpecifierAccess().getGroup_2(), "rule__RealTypeSpecifier__Group_2__0");
					put(grammarAccess.getRealTypeSpecifierAccess().getGroup_3(), "rule__RealTypeSpecifier__Group_3__0");
					put(grammarAccess.getRealTypeSpecifierAccess().getGroup_3_2(), "rule__RealTypeSpecifier__Group_3_2__0");
					put(grammarAccess.getIntegerTypeSpecifierAccess().getGroup(), "rule__IntegerTypeSpecifier__Group__0");
					put(grammarAccess.getIntegerTypeSpecifierAccess().getGroup_2(), "rule__IntegerTypeSpecifier__Group_2__0");
					put(grammarAccess.getIntegerTypeSpecifierAccess().getGroup_3(), "rule__IntegerTypeSpecifier__Group_3__0");
					put(grammarAccess.getIntegerTypeSpecifierAccess().getGroup_3_2(), "rule__IntegerTypeSpecifier__Group_3_2__0");
					put(grammarAccess.getComplexTypeSpecifierAccess().getGroup(), "rule__ComplexTypeSpecifier__Group__0");
					put(grammarAccess.getComplexTypeSpecifierAccess().getGroup_2(), "rule__ComplexTypeSpecifier__Group_2__0");
					put(grammarAccess.getComplexTypeSpecifierAccess().getGroup_3(), "rule__ComplexTypeSpecifier__Group_3__0");
					put(grammarAccess.getComplexTypeSpecifierAccess().getGroup_3_2(), "rule__ComplexTypeSpecifier__Group_3_2__0");
					put(grammarAccess.getGaussianTypeSpecifierAccess().getGroup(), "rule__GaussianTypeSpecifier__Group__0");
					put(grammarAccess.getGaussianTypeSpecifierAccess().getGroup_2(), "rule__GaussianTypeSpecifier__Group_2__0");
					put(grammarAccess.getGaussianTypeSpecifierAccess().getGroup_3(), "rule__GaussianTypeSpecifier__Group_3__0");
					put(grammarAccess.getGaussianTypeSpecifierAccess().getGroup_3_2(), "rule__GaussianTypeSpecifier__Group_3_2__0");
					put(grammarAccess.getBooleanTypeSpecifierAccess().getGroup(), "rule__BooleanTypeSpecifier__Group__0");
					put(grammarAccess.getBooleanTypeSpecifierAccess().getGroup_2(), "rule__BooleanTypeSpecifier__Group_2__0");
					put(grammarAccess.getBooleanTypeSpecifierAccess().getGroup_2_2(), "rule__BooleanTypeSpecifier__Group_2_2__0");
					put(grammarAccess.getStringTypeSpecifierAccess().getGroup(), "rule__StringTypeSpecifier__Group__0");
					put(grammarAccess.getStringTypeSpecifierAccess().getGroup_2(), "rule__StringTypeSpecifier__Group_2__0");
					put(grammarAccess.getStringTypeSpecifierAccess().getGroup_2_2(), "rule__StringTypeSpecifier__Group_2_2__0");
					put(grammarAccess.getNamedTypeSpecifierAccess().getGroup(), "rule__NamedTypeSpecifier__Group__0");
					put(grammarAccess.getNamedTypeSpecifierAccess().getGroup_1(), "rule__NamedTypeSpecifier__Group_1__0");
					put(grammarAccess.getNamedTypeSpecifierAccess().getGroup_1_2(), "rule__NamedTypeSpecifier__Group_1_2__0");
					put(grammarAccess.getArrayDimensionSpecificationAccess().getGroup_1(), "rule__ArrayDimensionSpecification__Group_1__0");
					put(grammarAccess.getArrayDimensionSpecificationAccess().getGroup_1_1(), "rule__ArrayDimensionSpecification__Group_1_1__0");
					put(grammarAccess.getUnitTypeSpecifierAccess().getGroup(), "rule__UnitTypeSpecifier__Group__0");
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
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1_1_0(), "rule__RelationalExpression__Group_1_1_0__0");
					put(grammarAccess.getRelationalExpressionAccess().getGroup_1_1_1(), "rule__RelationalExpression__Group_1_1_1__0");
					put(grammarAccess.getAddSubtractExpressionAccess().getGroup(), "rule__AddSubtractExpression__Group__0");
					put(grammarAccess.getAddSubtractExpressionAccess().getGroup_1(), "rule__AddSubtractExpression__Group_1__0");
					put(grammarAccess.getAddSubtractExpressionPartAccess().getGroup(), "rule__AddSubtractExpressionPart__Group__0");
					put(grammarAccess.getMultiplyDivideExpressionAccess().getGroup(), "rule__MultiplyDivideExpression__Group__0");
					put(grammarAccess.getMultiplyDivideExpressionAccess().getGroup_1(), "rule__MultiplyDivideExpression__Group_1__0");
					put(grammarAccess.getMultiplyDivideExpressionPartAccess().getGroup(), "rule__MultiplyDivideExpressionPart__Group__0");
					put(grammarAccess.getPowerExpressionAccess().getGroup(), "rule__PowerExpression__Group__0");
					put(grammarAccess.getPowerExpressionAccess().getGroup_1(), "rule__PowerExpression__Group_1__0");
					put(grammarAccess.getUnaryMinusExpressionAccess().getGroup_1(), "rule__UnaryMinusExpression__Group_1__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1(), "rule__FeatureCall__Group_1__0");
					put(grammarAccess.getFeatureCallAccess().getGroup_1_1(), "rule__FeatureCall__Group_1_1__0");
					put(grammarAccess.getFeatureReferenceAccess().getGroup(), "rule__FeatureReference__Group__0");
					put(grammarAccess.getArrayElementReferenceAccess().getGroup(), "rule__ArrayElementReference__Group__0");
					put(grammarAccess.getArrayElementReferenceAccess().getGroup_2(), "rule__ArrayElementReference__Group_2__0");
					put(grammarAccess.getOperationCallAccess().getGroup(), "rule__OperationCall__Group__0");
					put(grammarAccess.getOperationCallAccess().getGroup_2(), "rule__OperationCall__Group_2__0");
					put(grammarAccess.getOperationCallAccess().getGroup_2_1(), "rule__OperationCall__Group_2_1__0");
					put(grammarAccess.getRealLiteralAccess().getGroup(), "rule__RealLiteral__Group__0");
					put(grammarAccess.getRealLiteralAccess().getGroup_2(), "rule__RealLiteral__Group_2__0");
					put(grammarAccess.getIntegerLiteralAccess().getGroup(), "rule__IntegerLiteral__Group__0");
					put(grammarAccess.getIntegerLiteralAccess().getGroup_2(), "rule__IntegerLiteral__Group_2__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getSymbolReferenceAccess().getGroup(), "rule__SymbolReference__Group__0");
					put(grammarAccess.getMatrixConstructionOperatorAccess().getGroup(), "rule__MatrixConstructionOperator__Group__0");
					put(grammarAccess.getMatrixConstructionOperatorAccess().getGroup_2(), "rule__MatrixConstructionOperator__Group_2__0");
					put(grammarAccess.getExpressionListAccess().getGroup(), "rule__ExpressionList__Group__0");
					put(grammarAccess.getExpressionListAccess().getGroup_1(), "rule__ExpressionList__Group_1__0");
					put(grammarAccess.getUnitConstructionOperatorAccess().getGroup(), "rule__UnitConstructionOperator__Group__0");
					put(grammarAccess.getParenthesizedExpressionAccess().getGroup(), "rule__ParenthesizedExpression__Group__0");
					put(grammarAccess.getBeginExpressionAccess().getGroup(), "rule__BeginExpression__Group__0");
					put(grammarAccess.getEndExpressionAccess().getGroup(), "rule__EndExpression__Group__0");
					put(grammarAccess.getUnitExpressionAccess().getGroup_1(), "rule__UnitExpression__Group_1__0");
					put(grammarAccess.getUnitExpressionAccess().getGroup_2(), "rule__UnitExpression__Group_2__0");
					put(grammarAccess.getUnitExpressionAccess().getGroup_2_1(), "rule__UnitExpression__Group_2_1__0");
					put(grammarAccess.getUnitExpressionNumeratorAccess().getGroup_1(), "rule__UnitExpressionNumerator__Group_1__0");
					put(grammarAccess.getUnitExpressionNumeratorAccess().getGroup_1_1(), "rule__UnitExpressionNumerator__Group_1_1__0");
					put(grammarAccess.getUnitExpressionDenominatorAccess().getGroup_1(), "rule__UnitExpressionDenominator__Group_1__0");
					put(grammarAccess.getUnitExpressionDenominatorAccess().getGroup_1_2(), "rule__UnitExpressionDenominator__Group_1_2__0");
					put(grammarAccess.getUnitExpressionFactorAccess().getGroup(), "rule__UnitExpressionFactor__Group__0");
					put(grammarAccess.getUnitExpressionFactorAccess().getGroup_1(), "rule__UnitExpressionFactor__Group_1__0");
					put(grammarAccess.getUnitExpressionExponentAccess().getGroup(), "rule__UnitExpressionExponent__Group__0");
					put(grammarAccess.getMscriptAccess().getPackagesAssignment(), "rule__Mscript__PackagesAssignment");
					put(grammarAccess.getPackageDefinitionAccess().getNameAssignment_1(), "rule__PackageDefinition__NameAssignment_1");
					put(grammarAccess.getPackageDefinitionAccess().getElementsAssignment_3(), "rule__PackageDefinition__ElementsAssignment_3");
					put(grammarAccess.getEnumerationDefinitionAccess().getNameAssignment_1(), "rule__EnumerationDefinition__NameAssignment_1");
					put(grammarAccess.getEnumerationDefinitionAccess().getLiteralsAssignment_3_0(), "rule__EnumerationDefinition__LiteralsAssignment_3_0");
					put(grammarAccess.getEnumerationDefinitionAccess().getLiteralsAssignment_3_1_1(), "rule__EnumerationDefinition__LiteralsAssignment_3_1_1");
					put(grammarAccess.getEnumerationLiteralDeclarationAccess().getNameAssignment(), "rule__EnumerationLiteralDeclaration__NameAssignment");
					put(grammarAccess.getTypeAliasDefinitionAccess().getNameAssignment_1(), "rule__TypeAliasDefinition__NameAssignment_1");
					put(grammarAccess.getTypeAliasDefinitionAccess().getTypeAssignment_3(), "rule__TypeAliasDefinition__TypeAssignment_3");
					put(grammarAccess.getVariableDeclarationAccess().getConstantAssignment_0_1(), "rule__VariableDeclaration__ConstantAssignment_0_1");
					put(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1(), "rule__VariableDeclaration__NameAssignment_1");
					put(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2_1(), "rule__VariableDeclaration__TypeAssignment_2_1");
					put(grammarAccess.getVariableDeclarationAccess().getInitialValueAssignment_3_1(), "rule__VariableDeclaration__InitialValueAssignment_3_1");
					put(grammarAccess.getRecordDefinitionAccess().getNameAssignment_1(), "rule__RecordDefinition__NameAssignment_1");
					put(grammarAccess.getRecordDefinitionAccess().getFieldsAssignment_3(), "rule__RecordDefinition__FieldsAssignment_3");
					put(grammarAccess.getRecordFieldDeclarationAccess().getNameAssignment_0(), "rule__RecordFieldDeclaration__NameAssignment_0");
					put(grammarAccess.getRecordFieldDeclarationAccess().getTypeAssignment_2(), "rule__RecordFieldDeclaration__TypeAssignment_2");
					put(grammarAccess.getFunctionDefinitionAccess().getNameAssignment_1(), "rule__FunctionDefinition__NameAssignment_1");
					put(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_3_0(), "rule__FunctionDefinition__ParametersAssignment_3_0");
					put(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_3_1_1(), "rule__FunctionDefinition__ParametersAssignment_3_1_1");
					put(grammarAccess.getFunctionDefinitionAccess().getPreconditionChainAssignment_5_1(), "rule__FunctionDefinition__PreconditionChainAssignment_5_1");
					put(grammarAccess.getFunctionDefinitionAccess().getBodyAssignment_6(), "rule__FunctionDefinition__BodyAssignment_6");
					put(grammarAccess.getCheckDefinitionAccess().getNameAssignment_1(), "rule__CheckDefinition__NameAssignment_1");
					put(grammarAccess.getCheckDefinitionAccess().getParametersAssignment_3_0(), "rule__CheckDefinition__ParametersAssignment_3_0");
					put(grammarAccess.getCheckDefinitionAccess().getParametersAssignment_3_1_1(), "rule__CheckDefinition__ParametersAssignment_3_1_1");
					put(grammarAccess.getCheckDefinitionAccess().getPreconditionChainAssignment_5_1(), "rule__CheckDefinition__PreconditionChainAssignment_5_1");
					put(grammarAccess.getCheckDefinitionAccess().getBodyAssignment_6(), "rule__CheckDefinition__BodyAssignment_6");
					put(grammarAccess.getParameterDeclarationAccess().getReferenceAssignment_0(), "rule__ParameterDeclaration__ReferenceAssignment_0");
					put(grammarAccess.getParameterDeclarationAccess().getNameAssignment_1(), "rule__ParameterDeclaration__NameAssignment_1");
					put(grammarAccess.getParameterDeclarationAccess().getTypeAssignment_3(), "rule__ParameterDeclaration__TypeAssignment_3");
					put(grammarAccess.getPreconditionChainAccess().getPreconditionsAssignment_0(), "rule__PreconditionChain__PreconditionsAssignment_0");
					put(grammarAccess.getPreconditionChainAccess().getPreconditionsAssignment_1_1(), "rule__PreconditionChain__PreconditionsAssignment_1_1");
					put(grammarAccess.getBlockAccess().getStatementsAssignment_2(), "rule__Block__StatementsAssignment_2");
					put(grammarAccess.getExpressionStatementAccess().getExpressionAssignment_0(), "rule__ExpressionStatement__ExpressionAssignment_0");
					put(grammarAccess.getExpressionStatementAccess().getAssignedValueAssignment_1_1(), "rule__ExpressionStatement__AssignedValueAssignment_1_1");
					put(grammarAccess.getIfStatementAccess().getCasesAssignment_1(), "rule__IfStatement__CasesAssignment_1");
					put(grammarAccess.getIfStatementAccess().getCasesAssignment_2_1(), "rule__IfStatement__CasesAssignment_2_1");
					put(grammarAccess.getIfStatementAccess().getElseBodyAssignment_3_1(), "rule__IfStatement__ElseBodyAssignment_3_1");
					put(grammarAccess.getIfCaseAccess().getConditionAssignment_0(), "rule__IfCase__ConditionAssignment_0");
					put(grammarAccess.getIfCaseAccess().getBodyAssignment_1(), "rule__IfCase__BodyAssignment_1");
					put(grammarAccess.getWhileStatementAccess().getPredicateAssignment_1(), "rule__WhileStatement__PredicateAssignment_1");
					put(grammarAccess.getWhileStatementAccess().getBodyAssignment_2(), "rule__WhileStatement__BodyAssignment_2");
					put(grammarAccess.getDoWhileStatementAccess().getBodyAssignment_1(), "rule__DoWhileStatement__BodyAssignment_1");
					put(grammarAccess.getDoWhileStatementAccess().getPredicateAssignment_3(), "rule__DoWhileStatement__PredicateAssignment_3");
					put(grammarAccess.getForeachStatementAccess().getElementNameAssignment_1(), "rule__ForeachStatement__ElementNameAssignment_1");
					put(grammarAccess.getForeachStatementAccess().getCollectionExpressionAssignment_3(), "rule__ForeachStatement__CollectionExpressionAssignment_3");
					put(grammarAccess.getForeachStatementAccess().getBodyAssignment_4(), "rule__ForeachStatement__BodyAssignment_4");
					put(grammarAccess.getReturnStatementAccess().getValueAssignment_2(), "rule__ReturnStatement__ValueAssignment_2");
					put(grammarAccess.getCheckStatusStatementAccess().getKindAssignment_0(), "rule__CheckStatusStatement__KindAssignment_0");
					put(grammarAccess.getCheckStatusStatementAccess().getMessageAssignment_1(), "rule__CheckStatusStatement__MessageAssignment_1");
					put(grammarAccess.getRealTypeSpecifierAccess().getUnitAssignment_2_1(), "rule__RealTypeSpecifier__UnitAssignment_2_1");
					put(grammarAccess.getRealTypeSpecifierAccess().getDimensionsAssignment_3_1(), "rule__RealTypeSpecifier__DimensionsAssignment_3_1");
					put(grammarAccess.getRealTypeSpecifierAccess().getDimensionsAssignment_3_2_1(), "rule__RealTypeSpecifier__DimensionsAssignment_3_2_1");
					put(grammarAccess.getIntegerTypeSpecifierAccess().getUnitAssignment_2_1(), "rule__IntegerTypeSpecifier__UnitAssignment_2_1");
					put(grammarAccess.getIntegerTypeSpecifierAccess().getDimensionsAssignment_3_1(), "rule__IntegerTypeSpecifier__DimensionsAssignment_3_1");
					put(grammarAccess.getIntegerTypeSpecifierAccess().getDimensionsAssignment_3_2_1(), "rule__IntegerTypeSpecifier__DimensionsAssignment_3_2_1");
					put(grammarAccess.getComplexTypeSpecifierAccess().getUnitAssignment_2_1(), "rule__ComplexTypeSpecifier__UnitAssignment_2_1");
					put(grammarAccess.getComplexTypeSpecifierAccess().getDimensionsAssignment_3_1(), "rule__ComplexTypeSpecifier__DimensionsAssignment_3_1");
					put(grammarAccess.getComplexTypeSpecifierAccess().getDimensionsAssignment_3_2_1(), "rule__ComplexTypeSpecifier__DimensionsAssignment_3_2_1");
					put(grammarAccess.getGaussianTypeSpecifierAccess().getUnitAssignment_2_1(), "rule__GaussianTypeSpecifier__UnitAssignment_2_1");
					put(grammarAccess.getGaussianTypeSpecifierAccess().getDimensionsAssignment_3_1(), "rule__GaussianTypeSpecifier__DimensionsAssignment_3_1");
					put(grammarAccess.getGaussianTypeSpecifierAccess().getDimensionsAssignment_3_2_1(), "rule__GaussianTypeSpecifier__DimensionsAssignment_3_2_1");
					put(grammarAccess.getBooleanTypeSpecifierAccess().getDimensionsAssignment_2_1(), "rule__BooleanTypeSpecifier__DimensionsAssignment_2_1");
					put(grammarAccess.getBooleanTypeSpecifierAccess().getDimensionsAssignment_2_2_1(), "rule__BooleanTypeSpecifier__DimensionsAssignment_2_2_1");
					put(grammarAccess.getStringTypeSpecifierAccess().getDimensionsAssignment_2_1(), "rule__StringTypeSpecifier__DimensionsAssignment_2_1");
					put(grammarAccess.getStringTypeSpecifierAccess().getDimensionsAssignment_2_2_1(), "rule__StringTypeSpecifier__DimensionsAssignment_2_2_1");
					put(grammarAccess.getNamedTypeSpecifierAccess().getTypeReferenceAssignment_0(), "rule__NamedTypeSpecifier__TypeReferenceAssignment_0");
					put(grammarAccess.getNamedTypeSpecifierAccess().getDimensionsAssignment_1_1(), "rule__NamedTypeSpecifier__DimensionsAssignment_1_1");
					put(grammarAccess.getNamedTypeSpecifierAccess().getDimensionsAssignment_1_2_1(), "rule__NamedTypeSpecifier__DimensionsAssignment_1_2_1");
					put(grammarAccess.getArrayDimensionSpecificationAccess().getUnspecifiedAssignment_0(), "rule__ArrayDimensionSpecification__UnspecifiedAssignment_0");
					put(grammarAccess.getArrayDimensionSpecificationAccess().getSizeAssignment_1_0(), "rule__ArrayDimensionSpecification__SizeAssignment_1_0");
					put(grammarAccess.getArrayDimensionSpecificationAccess().getEndIndexAssignment_1_1_2(), "rule__ArrayDimensionSpecification__EndIndexAssignment_1_1_2");
					put(grammarAccess.getConditionalExpressionAccess().getCasesAssignment_1(), "rule__ConditionalExpression__CasesAssignment_1");
					put(grammarAccess.getConditionalExpressionAccess().getCasesAssignment_2_1(), "rule__ConditionalExpression__CasesAssignment_2_1");
					put(grammarAccess.getConditionalExpressionAccess().getElseExpressionAssignment_4(), "rule__ConditionalExpression__ElseExpressionAssignment_4");
					put(grammarAccess.getConditionalExpressionCaseAccess().getConditionExpressionAssignment_0(), "rule__ConditionalExpressionCase__ConditionExpressionAssignment_0");
					put(grammarAccess.getConditionalExpressionCaseAccess().getThenExpressionAssignment_2(), "rule__ConditionalExpressionCase__ThenExpressionAssignment_2");
					put(grammarAccess.getRangeExpressionAccess().getEndAssignment_1_2(), "rule__RangeExpression__EndAssignment_1_2");
					put(grammarAccess.getRangeExpressionAccess().getEndAssignment_1_3_2(), "rule__RangeExpression__EndAssignment_1_3_2");
					put(grammarAccess.getLogicalOrExpressionAccess().getOperandsAssignment_1_1_1(), "rule__LogicalOrExpression__OperandsAssignment_1_1_1");
					put(grammarAccess.getLogicalAndExpressionAccess().getOperandsAssignment_1_1_1(), "rule__LogicalAndExpression__OperandsAssignment_1_1_1");
					put(grammarAccess.getLogicalNotExpressionAccess().getOperandAssignment_1_2(), "rule__LogicalNotExpression__OperandAssignment_1_2");
					put(grammarAccess.getRelationalExpressionAccess().getTypeTestAssignment_1_1_0_0(), "rule__RelationalExpression__TypeTestAssignment_1_1_0_0");
					put(grammarAccess.getRelationalExpressionAccess().getTypeAssignment_1_1_0_1(), "rule__RelationalExpression__TypeAssignment_1_1_0_1");
					put(grammarAccess.getRelationalExpressionAccess().getOperatorAssignment_1_1_1_0(), "rule__RelationalExpression__OperatorAssignment_1_1_1_0");
					put(grammarAccess.getRelationalExpressionAccess().getRightOperandAssignment_1_1_1_1(), "rule__RelationalExpression__RightOperandAssignment_1_1_1_1");
					put(grammarAccess.getAddSubtractExpressionAccess().getRightPartsAssignment_1_1(), "rule__AddSubtractExpression__RightPartsAssignment_1_1");
					put(grammarAccess.getAddSubtractExpressionPartAccess().getOperatorAssignment_0(), "rule__AddSubtractExpressionPart__OperatorAssignment_0");
					put(grammarAccess.getAddSubtractExpressionPartAccess().getOperandAssignment_1(), "rule__AddSubtractExpressionPart__OperandAssignment_1");
					put(grammarAccess.getMultiplyDivideExpressionAccess().getRightPartsAssignment_1_1(), "rule__MultiplyDivideExpression__RightPartsAssignment_1_1");
					put(grammarAccess.getMultiplyDivideExpressionPartAccess().getOperatorAssignment_0(), "rule__MultiplyDivideExpressionPart__OperatorAssignment_0");
					put(grammarAccess.getMultiplyDivideExpressionPartAccess().getOperandAssignment_1(), "rule__MultiplyDivideExpressionPart__OperandAssignment_1");
					put(grammarAccess.getPowerExpressionAccess().getOperatorAssignment_1_1(), "rule__PowerExpression__OperatorAssignment_1_1");
					put(grammarAccess.getPowerExpressionAccess().getExponentAssignment_1_2(), "rule__PowerExpression__ExponentAssignment_1_2");
					put(grammarAccess.getUnaryMinusExpressionAccess().getOperandAssignment_1_2(), "rule__UnaryMinusExpression__OperandAssignment_1_2");
					put(grammarAccess.getFeatureCallAccess().getPartsAssignment_1_1_1(), "rule__FeatureCall__PartsAssignment_1_1_1");
					put(grammarAccess.getFeatureReferenceAccess().getFeatureNameAssignment_1(), "rule__FeatureReference__FeatureNameAssignment_1");
					put(grammarAccess.getArrayElementReferenceAccess().getSubscriptsAssignment_1(), "rule__ArrayElementReference__SubscriptsAssignment_1");
					put(grammarAccess.getArrayElementReferenceAccess().getSubscriptsAssignment_2_1(), "rule__ArrayElementReference__SubscriptsAssignment_2_1");
					put(grammarAccess.getOperationCallAccess().getArgumentsAssignment_2_0(), "rule__OperationCall__ArgumentsAssignment_2_0");
					put(grammarAccess.getOperationCallAccess().getArgumentsAssignment_2_1_1(), "rule__OperationCall__ArgumentsAssignment_2_1_1");
					put(grammarAccess.getRealLiteralAccess().getValueAssignment_0(), "rule__RealLiteral__ValueAssignment_0");
					put(grammarAccess.getRealLiteralAccess().getImaginaryAssignment_1(), "rule__RealLiteral__ImaginaryAssignment_1");
					put(grammarAccess.getRealLiteralAccess().getUnitAssignment_2_1(), "rule__RealLiteral__UnitAssignment_2_1");
					put(grammarAccess.getIntegerLiteralAccess().getValueAssignment_0(), "rule__IntegerLiteral__ValueAssignment_0");
					put(grammarAccess.getIntegerLiteralAccess().getImaginaryAssignment_1(), "rule__IntegerLiteral__ImaginaryAssignment_1");
					put(grammarAccess.getIntegerLiteralAccess().getUnitAssignment_2_1(), "rule__IntegerLiteral__UnitAssignment_2_1");
					put(grammarAccess.getBooleanLiteralAccess().getValueAssignment(), "rule__BooleanLiteral__ValueAssignment");
					put(grammarAccess.getStringLiteralAccess().getValueAssignment(), "rule__StringLiteral__ValueAssignment");
					put(grammarAccess.getQualifiedNameAccess().getIdentifiersAssignment_0(), "rule__QualifiedName__IdentifiersAssignment_0");
					put(grammarAccess.getQualifiedNameAccess().getIdentifiersAssignment_1_1(), "rule__QualifiedName__IdentifiersAssignment_1_1");
					put(grammarAccess.getSymbolReferenceAccess().getGlobalAssignment_0(), "rule__SymbolReference__GlobalAssignment_0");
					put(grammarAccess.getSymbolReferenceAccess().getNameAssignment_1(), "rule__SymbolReference__NameAssignment_1");
					put(grammarAccess.getSubscriptAccess().getAllAssignment_0(), "rule__Subscript__AllAssignment_0");
					put(grammarAccess.getSubscriptAccess().getExpressionAssignment_1(), "rule__Subscript__ExpressionAssignment_1");
					put(grammarAccess.getMatrixConstructionOperatorAccess().getExpressionListsAssignment_1(), "rule__MatrixConstructionOperator__ExpressionListsAssignment_1");
					put(grammarAccess.getMatrixConstructionOperatorAccess().getExpressionListsAssignment_2_1(), "rule__MatrixConstructionOperator__ExpressionListsAssignment_2_1");
					put(grammarAccess.getExpressionListAccess().getExpressionsAssignment_0(), "rule__ExpressionList__ExpressionsAssignment_0");
					put(grammarAccess.getExpressionListAccess().getExpressionsAssignment_1_1(), "rule__ExpressionList__ExpressionsAssignment_1_1");
					put(grammarAccess.getUnitConstructionOperatorAccess().getUnitExpressionAssignment_2(), "rule__UnitConstructionOperator__UnitExpressionAssignment_2");
					put(grammarAccess.getParenthesizedExpressionAccess().getExpressionAssignment_1(), "rule__ParenthesizedExpression__ExpressionAssignment_1");
					put(grammarAccess.getUnitExpressionAccess().getUnspecifiedAssignment_0(), "rule__UnitExpression__UnspecifiedAssignment_0");
					put(grammarAccess.getUnitExpressionAccess().getExpressionAssignment_1_1(), "rule__UnitExpression__ExpressionAssignment_1_1");
					put(grammarAccess.getUnitExpressionAccess().getNumeratorAssignment_2_0(), "rule__UnitExpression__NumeratorAssignment_2_0");
					put(grammarAccess.getUnitExpressionAccess().getDenominatorAssignment_2_1_1(), "rule__UnitExpression__DenominatorAssignment_2_1_1");
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
			org.eclipselabs.mscript.language.ui.contentassist.antlr.internal.InternalMscriptParser typedParser = (org.eclipselabs.mscript.language.ui.contentassist.antlr.internal.InternalMscriptParser) parser;
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
