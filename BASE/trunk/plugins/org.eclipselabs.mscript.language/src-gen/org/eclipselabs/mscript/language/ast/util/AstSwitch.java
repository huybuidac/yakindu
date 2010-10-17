/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipselabs.mscript.language.ast.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipselabs.mscript.language.ast.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.mscript.language.ast.AstPackage
 * @generated
 */
public class AstSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AstPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AstPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AstPackage.MSCRIPT:
      {
        Mscript mscript = (Mscript)theEObject;
        T result = caseMscript(mscript);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.PACKAGE_DEFINITION:
      {
        PackageDefinition packageDefinition = (PackageDefinition)theEObject;
        T result = casePackageDefinition(packageDefinition);
        if (result == null) result = casePackageDefinitionElement(packageDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.PACKAGE_DEFINITION_ELEMENT:
      {
        PackageDefinitionElement packageDefinitionElement = (PackageDefinitionElement)theEObject;
        T result = casePackageDefinitionElement(packageDefinitionElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.TYPE_DEFINITION:
      {
        TypeDefinition typeDefinition = (TypeDefinition)theEObject;
        T result = caseTypeDefinition(typeDefinition);
        if (result == null) result = casePackageDefinitionElement(typeDefinition);
        if (result == null) result = caseStatement(typeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.DATA_TYPE_DEFINITION:
      {
        DataTypeDefinition dataTypeDefinition = (DataTypeDefinition)theEObject;
        T result = caseDataTypeDefinition(dataTypeDefinition);
        if (result == null) result = caseTypeDefinition(dataTypeDefinition);
        if (result == null) result = casePackageDefinitionElement(dataTypeDefinition);
        if (result == null) result = caseStatement(dataTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.ENUMERATION_DEFINITION:
      {
        EnumerationDefinition enumerationDefinition = (EnumerationDefinition)theEObject;
        T result = caseEnumerationDefinition(enumerationDefinition);
        if (result == null) result = caseDataTypeDefinition(enumerationDefinition);
        if (result == null) result = caseTypeDefinition(enumerationDefinition);
        if (result == null) result = casePackageDefinitionElement(enumerationDefinition);
        if (result == null) result = caseStatement(enumerationDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.ENUMERATION_LITERAL_DECLARATION:
      {
        EnumerationLiteralDeclaration enumerationLiteralDeclaration = (EnumerationLiteralDeclaration)theEObject;
        T result = caseEnumerationLiteralDeclaration(enumerationLiteralDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.TYPE_ALIAS_DEFINITION:
      {
        TypeAliasDefinition typeAliasDefinition = (TypeAliasDefinition)theEObject;
        T result = caseTypeAliasDefinition(typeAliasDefinition);
        if (result == null) result = caseDataTypeDefinition(typeAliasDefinition);
        if (result == null) result = caseTypeDefinition(typeAliasDefinition);
        if (result == null) result = casePackageDefinitionElement(typeAliasDefinition);
        if (result == null) result = caseStatement(typeAliasDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = casePackageDefinitionElement(variableDeclaration);
        if (result == null) result = caseStatement(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.RECORD_DEFINITION:
      {
        RecordDefinition recordDefinition = (RecordDefinition)theEObject;
        T result = caseRecordDefinition(recordDefinition);
        if (result == null) result = caseDataTypeDefinition(recordDefinition);
        if (result == null) result = caseTypeDefinition(recordDefinition);
        if (result == null) result = casePackageDefinitionElement(recordDefinition);
        if (result == null) result = caseStatement(recordDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.RECORD_FIELD_DECLARATION:
      {
        RecordFieldDeclaration recordFieldDeclaration = (RecordFieldDeclaration)theEObject;
        T result = caseRecordFieldDeclaration(recordFieldDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.SUBROUTINE_DEFINITION:
      {
        SubroutineDefinition subroutineDefinition = (SubroutineDefinition)theEObject;
        T result = caseSubroutineDefinition(subroutineDefinition);
        if (result == null) result = caseTypeDefinition(subroutineDefinition);
        if (result == null) result = casePackageDefinitionElement(subroutineDefinition);
        if (result == null) result = caseStatement(subroutineDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.FUNCTION_DEFINITION:
      {
        FunctionDefinition functionDefinition = (FunctionDefinition)theEObject;
        T result = caseFunctionDefinition(functionDefinition);
        if (result == null) result = caseSubroutineDefinition(functionDefinition);
        if (result == null) result = caseTypeDefinition(functionDefinition);
        if (result == null) result = casePackageDefinitionElement(functionDefinition);
        if (result == null) result = caseStatement(functionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.CHECK_DEFINITION:
      {
        CheckDefinition checkDefinition = (CheckDefinition)theEObject;
        T result = caseCheckDefinition(checkDefinition);
        if (result == null) result = caseSubroutineDefinition(checkDefinition);
        if (result == null) result = caseTypeDefinition(checkDefinition);
        if (result == null) result = casePackageDefinitionElement(checkDefinition);
        if (result == null) result = caseStatement(checkDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.PARAMETER_DECLARATION:
      {
        ParameterDeclaration parameterDeclaration = (ParameterDeclaration)theEObject;
        T result = caseParameterDeclaration(parameterDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.PRECONDITION_CHAIN:
      {
        PreconditionChain preconditionChain = (PreconditionChain)theEObject;
        T result = casePreconditionChain(preconditionChain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.BLOCK_STATEMENT:
      {
        BlockStatement blockStatement = (BlockStatement)theEObject;
        T result = caseBlockStatement(blockStatement);
        if (result == null) result = caseStatement(blockStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.EXPRESSION_STATEMENT:
      {
        ExpressionStatement expressionStatement = (ExpressionStatement)theEObject;
        T result = caseExpressionStatement(expressionStatement);
        if (result == null) result = caseStatement(expressionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.IF_STATEMENT:
      {
        IfStatement ifStatement = (IfStatement)theEObject;
        T result = caseIfStatement(ifStatement);
        if (result == null) result = caseStatement(ifStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.IF_CASE:
      {
        IfCase ifCase = (IfCase)theEObject;
        T result = caseIfCase(ifCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.WHILE_STATEMENT:
      {
        WhileStatement whileStatement = (WhileStatement)theEObject;
        T result = caseWhileStatement(whileStatement);
        if (result == null) result = caseStatement(whileStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.DO_WHILE_STATEMENT:
      {
        DoWhileStatement doWhileStatement = (DoWhileStatement)theEObject;
        T result = caseDoWhileStatement(doWhileStatement);
        if (result == null) result = caseStatement(doWhileStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.FOR_STATEMENT:
      {
        ForStatement forStatement = (ForStatement)theEObject;
        T result = caseForStatement(forStatement);
        if (result == null) result = caseStatement(forStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.FOR_STATEMENT_INITIALIZER:
      {
        ForStatementInitializer forStatementInitializer = (ForStatementInitializer)theEObject;
        T result = caseForStatementInitializer(forStatementInitializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.FOREACH_STATEMENT:
      {
        ForeachStatement foreachStatement = (ForeachStatement)theEObject;
        T result = caseForeachStatement(foreachStatement);
        if (result == null) result = caseStatement(foreachStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.SWITCH_STATEMENT:
      {
        SwitchStatement switchStatement = (SwitchStatement)theEObject;
        T result = caseSwitchStatement(switchStatement);
        if (result == null) result = caseStatement(switchStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.SWITCH_CASE:
      {
        SwitchCase switchCase = (SwitchCase)theEObject;
        T result = caseSwitchCase(switchCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.CONTINUE_STATEMENT:
      {
        ContinueStatement continueStatement = (ContinueStatement)theEObject;
        T result = caseContinueStatement(continueStatement);
        if (result == null) result = caseStatement(continueStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.BREAK_STATEMENT:
      {
        BreakStatement breakStatement = (BreakStatement)theEObject;
        T result = caseBreakStatement(breakStatement);
        if (result == null) result = caseStatement(breakStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.RETURN_STATEMENT:
      {
        ReturnStatement returnStatement = (ReturnStatement)theEObject;
        T result = caseReturnStatement(returnStatement);
        if (result == null) result = caseStatement(returnStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.CHECK_STATUS_STATEMENT:
      {
        CheckStatusStatement checkStatusStatement = (CheckStatusStatement)theEObject;
        T result = caseCheckStatusStatement(checkStatusStatement);
        if (result == null) result = caseStatement(checkStatusStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.TYPE_SPECIFIER:
      {
        TypeSpecifier typeSpecifier = (TypeSpecifier)theEObject;
        T result = caseTypeSpecifier(typeSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.DATA_TYPE_SPECIFIER:
      {
        DataTypeSpecifier dataTypeSpecifier = (DataTypeSpecifier)theEObject;
        T result = caseDataTypeSpecifier(dataTypeSpecifier);
        if (result == null) result = caseTypeSpecifier(dataTypeSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.PRIMITIVE_TYPE_SPECIFIER:
      {
        PrimitiveTypeSpecifier primitiveTypeSpecifier = (PrimitiveTypeSpecifier)theEObject;
        T result = casePrimitiveTypeSpecifier(primitiveTypeSpecifier);
        if (result == null) result = caseDataTypeSpecifier(primitiveTypeSpecifier);
        if (result == null) result = caseTypeSpecifier(primitiveTypeSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.NUMERIC_TYPE_SPECIFIER:
      {
        NumericTypeSpecifier numericTypeSpecifier = (NumericTypeSpecifier)theEObject;
        T result = caseNumericTypeSpecifier(numericTypeSpecifier);
        if (result == null) result = casePrimitiveTypeSpecifier(numericTypeSpecifier);
        if (result == null) result = caseDataTypeSpecifier(numericTypeSpecifier);
        if (result == null) result = caseTypeSpecifier(numericTypeSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.REAL_TYPE_SPECIFIER:
      {
        RealTypeSpecifier realTypeSpecifier = (RealTypeSpecifier)theEObject;
        T result = caseRealTypeSpecifier(realTypeSpecifier);
        if (result == null) result = caseNumericTypeSpecifier(realTypeSpecifier);
        if (result == null) result = casePrimitiveTypeSpecifier(realTypeSpecifier);
        if (result == null) result = caseDataTypeSpecifier(realTypeSpecifier);
        if (result == null) result = caseTypeSpecifier(realTypeSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.INTEGER_TYPE_SPECIFIER:
      {
        IntegerTypeSpecifier integerTypeSpecifier = (IntegerTypeSpecifier)theEObject;
        T result = caseIntegerTypeSpecifier(integerTypeSpecifier);
        if (result == null) result = caseNumericTypeSpecifier(integerTypeSpecifier);
        if (result == null) result = casePrimitiveTypeSpecifier(integerTypeSpecifier);
        if (result == null) result = caseDataTypeSpecifier(integerTypeSpecifier);
        if (result == null) result = caseTypeSpecifier(integerTypeSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.COMPLEX_TYPE_SPECIFIER:
      {
        ComplexTypeSpecifier complexTypeSpecifier = (ComplexTypeSpecifier)theEObject;
        T result = caseComplexTypeSpecifier(complexTypeSpecifier);
        if (result == null) result = caseNumericTypeSpecifier(complexTypeSpecifier);
        if (result == null) result = casePrimitiveTypeSpecifier(complexTypeSpecifier);
        if (result == null) result = caseDataTypeSpecifier(complexTypeSpecifier);
        if (result == null) result = caseTypeSpecifier(complexTypeSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.GAUSSIAN_TYPE_SPECIFIER:
      {
        GaussianTypeSpecifier gaussianTypeSpecifier = (GaussianTypeSpecifier)theEObject;
        T result = caseGaussianTypeSpecifier(gaussianTypeSpecifier);
        if (result == null) result = caseNumericTypeSpecifier(gaussianTypeSpecifier);
        if (result == null) result = casePrimitiveTypeSpecifier(gaussianTypeSpecifier);
        if (result == null) result = caseDataTypeSpecifier(gaussianTypeSpecifier);
        if (result == null) result = caseTypeSpecifier(gaussianTypeSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.BOOLEAN_TYPE_SPECIFIER:
      {
        BooleanTypeSpecifier booleanTypeSpecifier = (BooleanTypeSpecifier)theEObject;
        T result = caseBooleanTypeSpecifier(booleanTypeSpecifier);
        if (result == null) result = casePrimitiveTypeSpecifier(booleanTypeSpecifier);
        if (result == null) result = caseDataTypeSpecifier(booleanTypeSpecifier);
        if (result == null) result = caseTypeSpecifier(booleanTypeSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.STRING_TYPE_SPECIFIER:
      {
        StringTypeSpecifier stringTypeSpecifier = (StringTypeSpecifier)theEObject;
        T result = caseStringTypeSpecifier(stringTypeSpecifier);
        if (result == null) result = casePrimitiveTypeSpecifier(stringTypeSpecifier);
        if (result == null) result = caseDataTypeSpecifier(stringTypeSpecifier);
        if (result == null) result = caseTypeSpecifier(stringTypeSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.NAMED_TYPE_SPECIFIER:
      {
        NamedTypeSpecifier namedTypeSpecifier = (NamedTypeSpecifier)theEObject;
        T result = caseNamedTypeSpecifier(namedTypeSpecifier);
        if (result == null) result = caseDataTypeSpecifier(namedTypeSpecifier);
        if (result == null) result = caseTypeSpecifier(namedTypeSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.ARRAY_DIMENSION_SPECIFICATION:
      {
        ArrayDimensionSpecification arrayDimensionSpecification = (ArrayDimensionSpecification)theEObject;
        T result = caseArrayDimensionSpecification(arrayDimensionSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.UNIT_TYPE_SPECIFIER:
      {
        UnitTypeSpecifier unitTypeSpecifier = (UnitTypeSpecifier)theEObject;
        T result = caseUnitTypeSpecifier(unitTypeSpecifier);
        if (result == null) result = caseTypeSpecifier(unitTypeSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.ADDITIVE_EXPRESSION_PART:
      {
        AdditiveExpressionPart additiveExpressionPart = (AdditiveExpressionPart)theEObject;
        T result = caseAdditiveExpressionPart(additiveExpressionPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.MULTIPLICATIVE_EXPRESSION_PART:
      {
        MultiplicativeExpressionPart multiplicativeExpressionPart = (MultiplicativeExpressionPart)theEObject;
        T result = caseMultiplicativeExpressionPart(multiplicativeExpressionPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.FEATURE_CALL_PART:
      {
        FeatureCallPart featureCallPart = (FeatureCallPart)theEObject;
        T result = caseFeatureCallPart(featureCallPart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.FEATURE_REFERENCE:
      {
        FeatureReference featureReference = (FeatureReference)theEObject;
        T result = caseFeatureReference(featureReference);
        if (result == null) result = caseFeatureCallPart(featureReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.ARRAY_ELEMENT_REFERENCE:
      {
        ArrayElementReference arrayElementReference = (ArrayElementReference)theEObject;
        T result = caseArrayElementReference(arrayElementReference);
        if (result == null) result = caseFeatureCallPart(arrayElementReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.OPERATION_CALL:
      {
        OperationCall operationCall = (OperationCall)theEObject;
        T result = caseOperationCall(operationCall);
        if (result == null) result = caseFeatureCallPart(operationCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = caseExpression(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.NUMERIC_LITERAL:
      {
        NumericLiteral numericLiteral = (NumericLiteral)theEObject;
        T result = caseNumericLiteral(numericLiteral);
        if (result == null) result = caseLiteral(numericLiteral);
        if (result == null) result = caseExpression(numericLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.REAL_LITERAL:
      {
        RealLiteral realLiteral = (RealLiteral)theEObject;
        T result = caseRealLiteral(realLiteral);
        if (result == null) result = caseNumericLiteral(realLiteral);
        if (result == null) result = caseLiteral(realLiteral);
        if (result == null) result = caseExpression(realLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.INTEGER_LITERAL:
      {
        IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
        T result = caseIntegerLiteral(integerLiteral);
        if (result == null) result = caseNumericLiteral(integerLiteral);
        if (result == null) result = caseLiteral(integerLiteral);
        if (result == null) result = caseExpression(integerLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.BOOLEAN_LITERAL:
      {
        BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
        T result = caseBooleanLiteral(booleanLiteral);
        if (result == null) result = caseLiteral(booleanLiteral);
        if (result == null) result = caseExpression(booleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseLiteral(stringLiteral);
        if (result == null) result = caseExpression(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.QUALIFIED_NAME:
      {
        QualifiedName qualifiedName = (QualifiedName)theEObject;
        T result = caseQualifiedName(qualifiedName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.SYMBOL_REFERENCE:
      {
        SymbolReference symbolReference = (SymbolReference)theEObject;
        T result = caseSymbolReference(symbolReference);
        if (result == null) result = caseExpression(symbolReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.SUBSCRIPT:
      {
        Subscript subscript = (Subscript)theEObject;
        T result = caseSubscript(subscript);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.MATRIX_CONSTRUCTION_OPERATOR:
      {
        MatrixConstructionOperator matrixConstructionOperator = (MatrixConstructionOperator)theEObject;
        T result = caseMatrixConstructionOperator(matrixConstructionOperator);
        if (result == null) result = caseExpression(matrixConstructionOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.EXPRESSION_LIST:
      {
        ExpressionList expressionList = (ExpressionList)theEObject;
        T result = caseExpressionList(expressionList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.UNIT_CONSTRUCTION_OPERATOR:
      {
        UnitConstructionOperator unitConstructionOperator = (UnitConstructionOperator)theEObject;
        T result = caseUnitConstructionOperator(unitConstructionOperator);
        if (result == null) result = caseExpression(unitConstructionOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.PARENTHESIZED_EXPRESSION:
      {
        ParenthesizedExpression parenthesizedExpression = (ParenthesizedExpression)theEObject;
        T result = caseParenthesizedExpression(parenthesizedExpression);
        if (result == null) result = caseExpression(parenthesizedExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.BEGIN_EXPRESSION:
      {
        BeginExpression beginExpression = (BeginExpression)theEObject;
        T result = caseBeginExpression(beginExpression);
        if (result == null) result = caseExpression(beginExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.END_EXPRESSION:
      {
        EndExpression endExpression = (EndExpression)theEObject;
        T result = caseEndExpression(endExpression);
        if (result == null) result = caseExpression(endExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.UNIT_EXPRESSION:
      {
        UnitExpression unitExpression = (UnitExpression)theEObject;
        T result = caseUnitExpression(unitExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.UNIT_EXPRESSION_NUMERATOR:
      {
        UnitExpressionNumerator unitExpressionNumerator = (UnitExpressionNumerator)theEObject;
        T result = caseUnitExpressionNumerator(unitExpressionNumerator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.UNIT_EXPRESSION_DENOMINATOR:
      {
        UnitExpressionDenominator unitExpressionDenominator = (UnitExpressionDenominator)theEObject;
        T result = caseUnitExpressionDenominator(unitExpressionDenominator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.UNIT_EXPRESSION_FACTOR:
      {
        UnitExpressionFactor unitExpressionFactor = (UnitExpressionFactor)theEObject;
        T result = caseUnitExpressionFactor(unitExpressionFactor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.UNIT_EXPRESSION_EXPONENT:
      {
        UnitExpressionExponent unitExpressionExponent = (UnitExpressionExponent)theEObject;
        T result = caseUnitExpressionExponent(unitExpressionExponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.ASSIGNMENT_EXPRESSION:
      {
        AssignmentExpression assignmentExpression = (AssignmentExpression)theEObject;
        T result = caseAssignmentExpression(assignmentExpression);
        if (result == null) result = caseExpression(assignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.RANGE_EXPRESSION:
      {
        RangeExpression rangeExpression = (RangeExpression)theEObject;
        T result = caseRangeExpression(rangeExpression);
        if (result == null) result = caseExpression(rangeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.CONDITIONAL_EXPRESSION:
      {
        ConditionalExpression conditionalExpression = (ConditionalExpression)theEObject;
        T result = caseConditionalExpression(conditionalExpression);
        if (result == null) result = caseExpression(conditionalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.LOGICAL_OR_EXPRESSION:
      {
        LogicalOrExpression logicalOrExpression = (LogicalOrExpression)theEObject;
        T result = caseLogicalOrExpression(logicalOrExpression);
        if (result == null) result = caseExpression(logicalOrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.LOGICAL_AND_EXPRESSION:
      {
        LogicalAndExpression logicalAndExpression = (LogicalAndExpression)theEObject;
        T result = caseLogicalAndExpression(logicalAndExpression);
        if (result == null) result = caseExpression(logicalAndExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.EQUALITY_EXPRESSION:
      {
        EqualityExpression equalityExpression = (EqualityExpression)theEObject;
        T result = caseEqualityExpression(equalityExpression);
        if (result == null) result = caseExpression(equalityExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.RELATIONAL_EXPRESSION:
      {
        RelationalExpression relationalExpression = (RelationalExpression)theEObject;
        T result = caseRelationalExpression(relationalExpression);
        if (result == null) result = caseExpression(relationalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.ADDITIVE_EXPRESSION:
      {
        AdditiveExpression additiveExpression = (AdditiveExpression)theEObject;
        T result = caseAdditiveExpression(additiveExpression);
        if (result == null) result = caseExpression(additiveExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.MULTIPLICATIVE_EXPRESSION:
      {
        MultiplicativeExpression multiplicativeExpression = (MultiplicativeExpression)theEObject;
        T result = caseMultiplicativeExpression(multiplicativeExpression);
        if (result == null) result = caseExpression(multiplicativeExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.POWER_EXPRESSION:
      {
        PowerExpression powerExpression = (PowerExpression)theEObject;
        T result = casePowerExpression(powerExpression);
        if (result == null) result = caseExpression(powerExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.UNARY_EXPRESSION:
      {
        UnaryExpression unaryExpression = (UnaryExpression)theEObject;
        T result = caseUnaryExpression(unaryExpression);
        if (result == null) result = caseExpression(unaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.POSTFIX_EXPRESSION:
      {
        PostfixExpression postfixExpression = (PostfixExpression)theEObject;
        T result = casePostfixExpression(postfixExpression);
        if (result == null) result = caseExpression(postfixExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AstPackage.FEATURE_CALL:
      {
        FeatureCall featureCall = (FeatureCall)theEObject;
        T result = caseFeatureCall(featureCall);
        if (result == null) result = caseExpression(featureCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mscript</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mscript</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMscript(Mscript object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageDefinition(PackageDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Definition Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Definition Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageDefinitionElement(PackageDefinitionElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDefinition(TypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeDefinition(DataTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumerationDefinition(EnumerationDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration Literal Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumerationLiteralDeclaration(EnumerationLiteralDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Alias Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Alias Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeAliasDefinition(TypeAliasDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecordDefinition(RecordDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Record Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Record Field Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRecordFieldDeclaration(RecordFieldDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subroutine Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subroutine Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubroutineDefinition(SubroutineDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionDefinition(FunctionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckDefinition(CheckDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterDeclaration(ParameterDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Precondition Chain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Precondition Chain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreconditionChain(PreconditionChain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlockStatement(BlockStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionStatement(ExpressionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfStatement(IfStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfCase(IfCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhileStatement(WhileStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Do While Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Do While Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoWhileStatement(DoWhileStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForStatement(ForStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Statement Initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Statement Initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForStatementInitializer(ForStatementInitializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Foreach Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Foreach Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForeachStatement(ForeachStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitchStatement(SwitchStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitchCase(SwitchCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContinueStatement(ContinueStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Break Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Break Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBreakStatement(BreakStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnStatement(ReturnStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check Status Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Status Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckStatusStatement(CheckStatusStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeSpecifier(TypeSpecifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeSpecifier(DataTypeSpecifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Type Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Type Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveTypeSpecifier(PrimitiveTypeSpecifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Type Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Type Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericTypeSpecifier(NumericTypeSpecifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Type Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Type Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealTypeSpecifier(RealTypeSpecifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Type Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Type Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerTypeSpecifier(IntegerTypeSpecifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Type Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Type Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexTypeSpecifier(ComplexTypeSpecifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gaussian Type Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gaussian Type Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGaussianTypeSpecifier(GaussianTypeSpecifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Type Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Type Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanTypeSpecifier(BooleanTypeSpecifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Type Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Type Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringTypeSpecifier(StringTypeSpecifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Type Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Type Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedTypeSpecifier(NamedTypeSpecifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Dimension Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Dimension Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayDimensionSpecification(ArrayDimensionSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit Type Specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit Type Specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnitTypeSpecifier(UnitTypeSpecifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Additive Expression Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Additive Expression Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditiveExpressionPart(AdditiveExpressionPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expression Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicative Expression Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicativeExpressionPart(MultiplicativeExpressionPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Call Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Call Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureCallPart(FeatureCallPart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureReference(FeatureReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Element Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Element Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayElementReference(ArrayElementReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperationCall(OperationCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericLiteral(NumericLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealLiteral(RealLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerLiteral(IntegerLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanLiteral(BooleanLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualified Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualifiedName(QualifiedName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Symbol Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symbol Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymbolReference(SymbolReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subscript</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subscript</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubscript(Subscript object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Matrix Construction Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Matrix Construction Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMatrixConstructionOperator(MatrixConstructionOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionList(ExpressionList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit Construction Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit Construction Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnitConstructionOperator(UnitConstructionOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parenthesized Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parenthesized Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParenthesizedExpression(ParenthesizedExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Begin Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Begin Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBeginExpression(BeginExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>End Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>End Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEndExpression(EndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnitExpression(UnitExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit Expression Numerator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit Expression Numerator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnitExpressionNumerator(UnitExpressionNumerator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit Expression Denominator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit Expression Denominator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnitExpressionDenominator(UnitExpressionDenominator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit Expression Factor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit Expression Factor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnitExpressionFactor(UnitExpressionFactor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unit Expression Exponent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unit Expression Exponent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnitExpressionExponent(UnitExpressionExponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignmentExpression(AssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRangeExpression(RangeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalExpression(ConditionalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logical Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logical Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicalOrExpression(LogicalOrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logical And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logical And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogicalAndExpression(LogicalAndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqualityExpression(EqualityExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationalExpression(RelationalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdditiveExpression(AdditiveExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplicativeExpression(MultiplicativeExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Power Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Power Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePowerExpression(PowerExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryExpression(UnaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Postfix Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Postfix Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostfixExpression(PostfixExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureCall(FeatureCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AstSwitch
