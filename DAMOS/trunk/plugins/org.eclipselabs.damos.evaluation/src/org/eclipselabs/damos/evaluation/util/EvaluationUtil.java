/****************************************************************************
 * Copyright (c) 2008, 2010 Andreas Unger and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andreas Unger - initial API and implementation 
 ****************************************************************************/

package org.eclipselabs.damos.evaluation.util;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipselabs.damos.common.util.NameUtil;
import org.eclipselabs.damos.dml.Block;
import org.eclipselabs.damos.evaluation.DataTypeSpecifierEvaluator;
import org.eclipselabs.damos.evaluation.EvaluationPlugin;
import org.eclipselabs.damos.evaluation.ExpressionDataTypeEvaluator;
import org.eclipselabs.damos.evaluation.ExpressionValueEvaluator;
import org.eclipselabs.damos.evaluation.IEvaluationContext;
import org.eclipselabs.damos.evaluation.INumericValue;
import org.eclipselabs.damos.evaluation.IValue;
import org.eclipselabs.mscript.language.ast.Expression;
import org.eclipselabs.mscript.language.ast.ExpressionList;
import org.eclipselabs.mscript.language.parser.antlr.MscriptParser;
import org.eclipselabs.mscript.typesystem.BooleanType;
import org.eclipselabs.mscript.typesystem.DataType;
import org.eclipselabs.mscript.typesystem.IntegerType;
import org.eclipselabs.mscript.typesystem.NumericType;

/**
 * @author Andreas Unger
 *
 */
public class EvaluationUtil {

	public static DataType evaluateArgumentDataType(IEvaluationContext context, Block block, String parameterName) throws CoreException {
		String parameterExpression = block.getArgumentStringValue(parameterName);
		if (parameterExpression != null) {
			return evaluateExpressionDataType(context, parameterExpression);
		}
		throw new CoreException(new Status(IStatus.ERROR, EvaluationPlugin.PLUGIN_ID, "Parameter '" + parameterName + "' not found"));
	}

	public static List<DataType> evaluateArgumentExpressionListDataTypes(IEvaluationContext context, Block block, String parameterName) throws CoreException {
		String parameterExpressionList = block.getArgumentStringValue(parameterName);
		if (parameterExpressionList != null) {
			return evaluateExpressionListDataTypes(context, parameterExpressionList);
		}
		throw new CoreException(new Status(IStatus.ERROR, EvaluationPlugin.PLUGIN_ID, "Parameter '" + parameterName + "' not found"));
	}

	public static NumericType evaluateArgumentNumericType(IEvaluationContext context, Block block, String parameterName) throws CoreException {
		DataType dataType = evaluateArgumentDataType(context, block, parameterName);
		if (dataType instanceof NumericType) {
			return (NumericType) dataType;
		}
		throw new CoreException(new Status(IStatus.ERROR, EvaluationPlugin.PLUGIN_ID, NameUtil.formatName(parameterName) + " must be numeric"));
	}

	public static IntegerType evaluateArgumentIntegerType(IEvaluationContext context, Block block, String parameterName) throws CoreException {
		DataType dataType = evaluateArgumentDataType(context, block, parameterName);
		if (dataType instanceof IntegerType) {
			return (IntegerType) dataType;
		}
		throw new CoreException(new Status(IStatus.ERROR, EvaluationPlugin.PLUGIN_ID, NameUtil.formatName(parameterName) + " must be integer"));
	}

	public static BooleanType evaluateArgumentBooleanType(IEvaluationContext context, Block block, String parameterName) throws CoreException {
		DataType dataType = evaluateArgumentDataType(context, block, parameterName);
		if (dataType instanceof BooleanType) {
			return (BooleanType) dataType;
		}
		throw new CoreException(new Status(IStatus.ERROR, EvaluationPlugin.PLUGIN_ID, NameUtil.formatName(parameterName) + " must be boolean"));
	}

	public static DataType evaluateExpressionDataType(IEvaluationContext context, String expression) throws CoreException {
		MscriptParser parser = EvaluationPlugin.getDefault().getMscriptParser();
		IParseResult result = parser.parse(
				parser.getGrammarAccess().getExpressionRule().getName(),
				new StringReader(expression));
		if (!result.getParseErrors().isEmpty()) {
			throw new CoreException(new Status(IStatus.ERROR, EvaluationPlugin.PLUGIN_ID, "Parse error"));
		}
		return new ExpressionDataTypeEvaluator(context).doSwitch(result.getRootASTElement());
	}

	public static List<DataType> evaluateExpressionListDataTypes(IEvaluationContext context, String expressionList) throws CoreException {
		MscriptParser parser = EvaluationPlugin.getDefault().getMscriptParser();
		IParseResult result = parser.parse(
				parser.getGrammarAccess().getExpressionListRule().getName(),
				new StringReader(expressionList));
		if (!result.getParseErrors().isEmpty()) {
			throw new CoreException(new Status(IStatus.ERROR, EvaluationPlugin.PLUGIN_ID, "Parse error"));
		}
		List<DataType> dataTypes = new ArrayList<DataType>();
		ExpressionList expressions = (ExpressionList) result.getRootASTElement();
		for (Expression expression : expressions.getExpressions()) {
			dataTypes.add(new ExpressionDataTypeEvaluator(context).doSwitch(expression));
		}
		return dataTypes;
	}

	public static DataType evaluateDataTypeSpecifierDataType(IEvaluationContext context, String dataTypeSpecifier) throws CoreException {
		MscriptParser parser = EvaluationPlugin.getDefault().getMscriptParser();
		IParseResult result = parser.parse(
				parser.getGrammarAccess().getDataTypeSpecifierRule().getName(),
				new StringReader(dataTypeSpecifier));
		if (!result.getParseErrors().isEmpty()) {
			throw new CoreException(new Status(IStatus.ERROR, EvaluationPlugin.PLUGIN_ID, "Parse error"));
		}
		return new DataTypeSpecifierEvaluator(context).doSwitch(result.getRootASTElement());
	}
	
	public static IValue evaluateArgumentValue(IEvaluationContext context, Block block, String parameterName) throws CoreException {
		String parameterExpression = block.getArgumentStringValue(parameterName);
		if (parameterExpression != null) {
			return evaluateExpressionValue(context, parameterExpression);
		}
		throw new CoreException(new Status(IStatus.ERROR, EvaluationPlugin.PLUGIN_ID, "Parameter '" + parameterName + "' not found"));
	}

	public static INumericValue evaluateArgumentNumericalValue(IEvaluationContext context, Block block, String parameterName) throws CoreException {
		IValue value = evaluateArgumentValue(context, block, parameterName);
		if (value instanceof INumericValue) {
			return (INumericValue) value;
		}
		throw new CoreException(new Status(IStatus.ERROR, EvaluationPlugin.PLUGIN_ID, NameUtil.formatName(parameterName) + " must be numeric"));
	}

	public static IValue evaluateExpressionValue(IEvaluationContext context, String expression) throws CoreException {
		MscriptParser parser = EvaluationPlugin.getDefault().getMscriptParser();
		IParseResult result = parser.parse(
				parser.getGrammarAccess().getExpressionRule().getName(),
				new StringReader(expression));
		if (!result.getParseErrors().isEmpty()) {
			throw new CoreException(new Status(IStatus.ERROR, EvaluationPlugin.PLUGIN_ID, "Parse error"));
		}
		return new ExpressionValueEvaluator(context).doSwitch(result.getRootASTElement());
	}

}
