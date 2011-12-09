/****************************************************************************
 * Copyright (c) 2008, 2011 Andreas Unger and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andreas Unger - initial API and implementation 
 ****************************************************************************/

package org.eclipselabs.damos.mscript.il.transform;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.damos.mscript.AdditiveExpression;
import org.eclipselabs.damos.mscript.ArrayElementAccess;
import org.eclipselabs.damos.mscript.ArraySubscript;
import org.eclipselabs.damos.mscript.Compound;
import org.eclipselabs.damos.mscript.DataType;
import org.eclipselabs.damos.mscript.Expression;
import org.eclipselabs.damos.mscript.IntegerLiteral;
import org.eclipselabs.damos.mscript.IntegerType;
import org.eclipselabs.damos.mscript.MscriptFactory;
import org.eclipselabs.damos.mscript.MultiplicativeExpression;
import org.eclipselabs.damos.mscript.MultiplicativeOperator;
import org.eclipselabs.damos.mscript.OperatorKind;
import org.eclipselabs.damos.mscript.ParenthesizedExpression;
import org.eclipselabs.damos.mscript.RealLiteral;
import org.eclipselabs.damos.mscript.RealType;
import org.eclipselabs.damos.mscript.TensorType;
import org.eclipselabs.damos.mscript.VariableAccess;
import org.eclipselabs.damos.mscript.functionmodel.util.FunctionModelSwitch;
import org.eclipselabs.damos.mscript.interpreter.ComputationContext;
import org.eclipselabs.damos.mscript.interpreter.IStaticEvaluationContext;
import org.eclipselabs.damos.mscript.interpreter.value.AnyValue;
import org.eclipselabs.damos.mscript.interpreter.value.IArrayValue;
import org.eclipselabs.damos.mscript.interpreter.value.ISimpleNumericValue;
import org.eclipselabs.damos.mscript.interpreter.value.IValue;
import org.eclipselabs.damos.mscript.util.MscriptSwitch;
import org.eclipselabs.damos.mscript.util.TypeUtil;

/**
 * @author Andreas Unger
 *
 */
public class ArrayOperationDecomposer extends FunctionModelSwitch<Boolean> implements IArrayOperationDecomposer {

	private IStaticEvaluationContext context;
	
	private ArrayExpressionTransformer arrayExpressionTransformer = new ArrayExpressionTransformer();
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.language.il.transform.IArrayOperationDecomposer#decompose(org.eclipselabs.mscript.language.il.Compound)
	 */
	public void decompose(IStaticEvaluationContext context, Compound compound) {
		this.context = context;
		doSwitch(compound);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.language.il.util.FunctionModelSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public Boolean defaultCase(EObject object) {
		if (object instanceof Expression) {
			arrayExpressionTransformer.doSwitch(object);
		} else {
			for (EObject child : object.eContents()) {
				doSwitch(child);
			}
		}
		return true;
	}
	
	private DataType getDataType(Expression expression) {
		return context.getValue(expression).getDataType();
	}
	
	private void setDataType(Expression expression, DataType dataType) {
		context.setValue(expression, new AnyValue(new ComputationContext(), dataType));
	}

	private class ArrayExpressionTransformer extends MscriptSwitch<Boolean> {
		
		/* (non-Javadoc)
		 * @see org.eclipselabs.mscript.language.ast.util.AstSwitch#caseMultiplicativeExpression(org.eclipselabs.mscript.language.ast.MultiplicativeExpression)
		 */
		@Override
		public Boolean caseMultiplicativeExpression(MultiplicativeExpression multiplicativeExpression) {
			// TODO: Implement better support for vector multiplication expressions
			if (multiplicativeExpression.getOperator() == MultiplicativeOperator.MULTIPLY) {
				Expression leftOperand = multiplicativeExpression.getLeftOperand();
				Expression rightOperand = multiplicativeExpression.getRightOperand();
				if (leftOperand instanceof VariableAccess && rightOperand instanceof VariableAccess) {
					DataType leftDataType = getDataType(leftOperand);
					DataType rightDataType = getDataType(rightOperand);
					if (leftDataType instanceof TensorType && rightDataType instanceof TensorType) {
						TensorType leftTensorType = (TensorType) leftDataType;
						TensorType rightTensorType = (TensorType) rightDataType;
						if (leftTensorType.isVector() && rightTensorType.isVector()) {
							Expression transformedExpression = createVectorMultiplicationExpression((VariableAccess) leftOperand, (VariableAccess) rightOperand);
							EcoreUtil.replace(multiplicativeExpression, transformedExpression);
						}
					}
				}
			}
			return super.caseMultiplicativeExpression(multiplicativeExpression);
		}
		
		private Expression createVectorMultiplicationExpression(VariableAccess leftOperand, VariableAccess rightOperand) {			
			ParenthesizedExpression parenthesizedExpression = MscriptFactory.eINSTANCE.createParenthesizedExpression();

			TensorType leftTensorType = (TensorType) getDataType(leftOperand);
			TensorType rightTensorType = (TensorType) getDataType(rightOperand);
			
			DataType resultDataType = leftTensorType.getElementType().evaluate(OperatorKind.MULTIPLY, rightTensorType.getElementType());

			Expression rootExpression = null;
			for (int i = 0; i < TypeUtil.getArraySize(leftTensorType); ++i) {
				MultiplicativeExpression multiplicativeExpression = MscriptFactory.eINSTANCE.createMultiplicativeExpression();
				setDataType(multiplicativeExpression, EcoreUtil.copy(resultDataType));
				
				Expression leftMultiplicationOperand = createArrayElementAccess(leftOperand, leftTensorType, i);
				Expression rightMultiplicationOperand = createArrayElementAccess(rightOperand, rightTensorType, i);

				multiplicativeExpression.setOperator(MultiplicativeOperator.MULTIPLY);
				multiplicativeExpression.setLeftOperand(leftMultiplicationOperand);
				multiplicativeExpression.setRightOperand(rightMultiplicationOperand);
				
				if (rootExpression == null) {
					rootExpression = multiplicativeExpression;
				} else {
					AdditiveExpression additiveExpression = MscriptFactory.eINSTANCE.createAdditiveExpression();
					additiveExpression.setLeftOperand(rootExpression);
					additiveExpression.setRightOperand(multiplicativeExpression);
					setDataType(additiveExpression, EcoreUtil.copy(resultDataType));
					rootExpression = additiveExpression;
				}
			}
			
			parenthesizedExpression.getExpressions().add(rootExpression);

			setDataType(rootExpression, EcoreUtil.copy(resultDataType));
			setDataType(parenthesizedExpression, EcoreUtil.copy(resultDataType));
			
			return parenthesizedExpression;
		}

		/**
		 * @param operand
		 * @param tensorType
		 * @param index
		 * @return
		 */
		private Expression createArrayElementAccess(VariableAccess operand, TensorType tensorType, int index) {
			IValue value = context.getValue(operand);
			if (value instanceof IArrayValue) {
				IValue elementValue = ((IArrayValue) value).get(index);
				if (elementValue instanceof ISimpleNumericValue) {
					ISimpleNumericValue numericValue = (ISimpleNumericValue) elementValue;
					if (tensorType.getElementType() instanceof RealType) {
						RealLiteral realLiteral = MscriptFactory.eINSTANCE.createRealLiteral();
						realLiteral.setUnit(EcoreUtil.copy(tensorType.getElementType().getUnit()));
						realLiteral.setValue(numericValue.doubleValue());
						context.setValue(realLiteral, numericValue);
						return realLiteral;
					} else if (tensorType.getElementType() instanceof IntegerType) {
						IntegerLiteral integerLiteral = MscriptFactory.eINSTANCE.createIntegerLiteral();
						integerLiteral.setUnit(EcoreUtil.copy(tensorType.getElementType().getUnit()));
						integerLiteral.setValue(numericValue.longValue());
						context.setValue(integerLiteral, numericValue);
						return integerLiteral;
					}
				}
			}
			
			VariableAccess variableAccess = EcoreUtil.copy(operand);
			setDataType(variableAccess, EcoreUtil.copy(tensorType));
			IntegerLiteral integerLiteral = MscriptFactory.eINSTANCE.createIntegerLiteral();
			integerLiteral.setUnit(TypeUtil.createUnit());
			integerLiteral.setValue(index);
			IntegerType integerType = MscriptFactory.eINSTANCE.createIntegerType();
			integerType.setUnit(TypeUtil.createUnit());
			setDataType(integerLiteral, integerType);
			ArrayElementAccess arrayElementAccess = MscriptFactory.eINSTANCE.createArrayElementAccess();
			arrayElementAccess.setArray(variableAccess);
			ArraySubscript subscript = MscriptFactory.eINSTANCE.createArraySubscript();
			subscript.setExpression(integerLiteral);
			arrayElementAccess.getSubscripts().add(subscript);
			setDataType(arrayElementAccess, EcoreUtil.copy(tensorType.getElementType()));
			return arrayElementAccess;
		}

		/* (non-Javadoc)
		 * @see org.eclipselabs.mscript.language.ast.util.AstSwitch#defaultCase(org.eclipse.emf.ecore.EObject)
		 */
		@Override
		public Boolean defaultCase(EObject object) {
			for (EObject child : object.eContents()) {
				doSwitch(child);
			}
			return true;
		}
		
	}
	
}
