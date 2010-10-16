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

package org.eclipselabs.damos.evaluation;

import org.eclipselabs.mscript.typesystem.DataType;
import org.eclipselabs.mscript.typesystem.InvalidDataType;
import org.eclipselabs.mscript.typesystem.OperatorKind;

/**
 * @author Andreas Unger
 *
 */
public class RealValue extends AbstractValue implements INumericValue {

	private double value;
	
	/**
	 * @param dataType
	 */
	public RealValue(DataType dataType, double value) {
		super(dataType);
		this.value = value;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.evaluation.INumericalValue#doubleValue()
	 */
	public double doubleValue() {
		return value;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.evaluation.IValue#add(org.eclipselabs.damos.evaluation.IValue)
	 */
	public IValue add(IValue other) {
		if (other instanceof INumericValue) {
			return createValue(
					getDataType().evaluate(OperatorKind.ADDITION, other.getDataType()),
					value + ((INumericValue) other).doubleValue());
		}
		return InvalidValue.SINGLETON;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.evaluation.IValue#subtract(org.eclipselabs.damos.evaluation.IValue)
	 */
	public IValue subtract(IValue other) {
		if (other instanceof INumericValue) {
			return createValue(
					getDataType().evaluate(OperatorKind.SUBTRACTION, other.getDataType()),
					value - ((INumericValue) other).doubleValue());
		}
		return InvalidValue.SINGLETON;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.evaluation.IValue#multiply(org.eclipselabs.damos.evaluation.IValue)
	 */
	public IValue multiply(IValue other) {
		if (other instanceof INumericValue) {
			return createValue(
					getDataType().evaluate(OperatorKind.MULTIPLICATION, other.getDataType()),
					value * ((INumericValue) other).doubleValue());
		}
		return InvalidValue.SINGLETON;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.evaluation.IValue#divide(org.eclipselabs.damos.evaluation.IValue)
	 */
	public IValue divide(IValue other) {
		if (other instanceof INumericValue) {
			return createValue(
					getDataType().evaluate(OperatorKind.DIVISION, other.getDataType()),
					value / ((INumericValue) other).doubleValue());
		}
		return InvalidValue.SINGLETON;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.evaluation.IValue#elementWiseMultiply(org.eclipselabs.damos.evaluation.IValue)
	 */
	public IValue elementWiseMultiply(IValue other) {
		return InvalidValue.SINGLETON;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.evaluation.IValue#elementWiseDivide(org.eclipselabs.damos.evaluation.IValue)
	 */
	public IValue elementWiseDivide(IValue other) {
		return InvalidValue.SINGLETON;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.evaluation.IValue#unaryMinus()
	 */
	public IValue unaryMinus() {
		return createValue(getDataType().evaluate(OperatorKind.UNARY_MINUS, null), -value);
	}
	
	private IValue createValue(DataType dataType, double value) {
		if (dataType instanceof InvalidDataType) {
			return InvalidValue.SINGLETON;
		}
		return new RealValue(dataType, value);
	}

}
