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

package org.eclipselabs.damos.mscript.interpreter.value;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.damos.mscript.DataType;
import org.eclipselabs.damos.mscript.IntegerType;
import org.eclipselabs.damos.mscript.MscriptFactory;
import org.eclipselabs.damos.mscript.NumericType;
import org.eclipselabs.damos.mscript.computationmodel.FixedPointFormat;
import org.eclipselabs.damos.mscript.computationmodel.FixedPointOperation;
import org.eclipselabs.damos.mscript.computationmodel.FixedPointOperationKind;
import org.eclipselabs.damos.mscript.computationmodel.FloatingPointFormat;
import org.eclipselabs.damos.mscript.computationmodel.NumberFormat;
import org.eclipselabs.damos.mscript.computationmodel.util.ComputationModelUtil;
import org.eclipselabs.damos.mscript.interpreter.IComputationContext;

/**
 * @author Andreas Unger
 *
 */
public class Binary64Value extends AbstractNumericValue implements ISimpleNumericValue {

	private static final double LOG_2 = Math.log(2);

	private double value;
	
	public Binary64Value(IComputationContext context, NumericType dataType, FloatingPointFormat numberFormat, double value) {
		super(context, dataType, numberFormat);
		this.value = value;
	}
	
	public double doubleValue() {
		return value;
	}
	
	public long longValue() {
		return (long) value;
	}
	
	@Override
	protected FloatingPointFormat getNumberFormat() {
		return (FloatingPointFormat) super.getNumberFormat();
	}

	@Override
	protected IValue doConvert(DataType dataType) {
		NumberFormat numberFormat = getContext().getComputationModel().getNumberFormat(dataType);
		if (getNumberFormat().isEquivalentTo(numberFormat)) {
			return new Binary64Value(getContext(), (NumericType) dataType, getNumberFormat(), value);
		}
		return doCast((NumericType) dataType, numberFormat);
	}
	
	@Override
	protected AbstractNumericValue basicAdd(AbstractNumericValue other, NumericType resultDataType) {
		Binary64Value otherBinary64Value = (Binary64Value) other;
		double result = value + otherBinary64Value.value;
		return new Binary64Value(getContext(), resultDataType, getNumberFormat(), result);
	}

	@Override
	protected AbstractNumericValue basicSubtract(AbstractNumericValue other, NumericType resultDataType) {
		Binary64Value otherBinary64Value = (Binary64Value) other;
		double result = value - otherBinary64Value.value;
		return new Binary64Value(getContext(), resultDataType, getNumberFormat(), result);
	}
	
	@Override
	protected AbstractNumericValue basicMultiply(AbstractNumericValue other, NumericType resultDataType) {
		Binary64Value otherBinary64Value = (Binary64Value) other;
		double result = value * otherBinary64Value.value;
		return new Binary64Value(getContext(), resultDataType, getNumberFormat(), result);
	}
	
	@Override
	protected AbstractNumericValue basicDivide(AbstractNumericValue other, NumericType resultDataType) {
		Binary64Value otherBinary64Value = (Binary64Value) other;
		double result = value / otherBinary64Value.value;
		return new Binary64Value(getContext(), resultDataType, getNumberFormat(), result);
	}
	
	@Override
	protected AbstractNumericValue basicNegate(NumericType resultDataType) {
		return new Binary64Value(getContext(), resultDataType, getNumberFormat(), -value);
	}
	
	@Override
	protected AbstractNumericValue basicPower(AbstractNumericValue other, NumericType resultDataType) {
		Binary64Value otherBinary64Value = (Binary64Value) other;
		return new Binary64Value(getContext(), resultDataType, getNumberFormat(), Math.pow(value, otherBinary64Value.value));
	}

	@Override
	protected IValue basicLessThan(AbstractNumericValue other, DataType resultDataType) {
		Binary64Value otherBinary64Value = (Binary64Value) other;
		return new BooleanValue(getContext(), value < otherBinary64Value.value);
	}
	
	@Override
	protected IValue basicLessThanOrEqualTo(AbstractNumericValue other, DataType resultDataType) {
		Binary64Value otherBinary64Value = (Binary64Value) other;
		return new BooleanValue(getContext(), value <= otherBinary64Value.value);
	}
	
	@Override
	protected IValue basicGreaterThan(AbstractNumericValue other, DataType resultDataType) {
		Binary64Value otherBinary64Value = (Binary64Value) other;
		return new BooleanValue(getContext(), value > otherBinary64Value.value);
	}
	
	@Override
	protected IValue basicGreaterThanOrEqualTo(AbstractNumericValue other, DataType resultDataType) {
		Binary64Value otherBinary64Value = (Binary64Value) other;
		return new BooleanValue(getContext(), value >= otherBinary64Value.value);
	}
	
	@Override
	protected IValue basicEqualTo(AbstractNumericValue other, DataType resultDataType) {
		Binary64Value otherBinary64Value = (Binary64Value) other;
		return new BooleanValue(getContext(), value == otherBinary64Value.value);
	}
	
	@Override
	protected IValue basicNotEqualTo(AbstractNumericValue other, DataType resultDataType) {
		Binary64Value otherBinary64Value = (Binary64Value) other;
		return new BooleanValue(getContext(), value != otherBinary64Value.value);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.computation.core.value.ISimpleNumericValue#round()
	 */
	public IValue round() {
		IntegerType resultDataType = MscriptFactory.eINSTANCE.createIntegerType();
		resultDataType.setUnit(EcoreUtil.copy(getDataType().getUnit()));
		
		NumberFormat numberFormat = getContext().getComputationModel().getNumberFormat(resultDataType);
		return new Binary64Value(getContext(), resultDataType, getNumberFormat(), Math.round(value)).cast(numberFormat);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.mscript.interpreter.value.ISimpleNumericValue#exp()
	 */
	public IValue exp() {
		return new Binary64Value(getContext(), getDataType(), getNumberFormat(), Math.exp(value));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.mscript.interpreter.value.ISimpleNumericValue#ln()
	 */
	public IValue ln() {
		return new Binary64Value(getContext(), getDataType(), getNumberFormat(), Math.log(value));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.mscript.interpreter.value.ISimpleNumericValue#lg()
	 */
	public IValue lg() {
		return new Binary64Value(getContext(), getDataType(), getNumberFormat(), Math.log10(value));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.mscript.interpreter.value.ISimpleNumericValue#lb()
	 */
	public IValue lb() {
		return new Binary64Value(getContext(), getDataType(), getNumberFormat(), Math.log(value) / LOG_2);
	}
	
	protected AbstractNumericValue cast(NumberFormat numberFormat) {
		if (getNumberFormat().isEquivalentTo(numberFormat)) {
			return this;
		}
		return doCast(getDataType(), numberFormat);
	}

	protected AbstractNumericValue doCast(NumericType numericType, NumberFormat numberFormat) {
		if (numberFormat instanceof FixedPointFormat) {
			FixedPointFormat fixedPointFormat = (FixedPointFormat) numberFormat;
			FixedPointValue fixedPointValue = new FixedPointValue(getContext(), numericType, fixedPointFormat, 0);
			FixedPointOperation fixedPointOperation = ComputationModelUtil.getFixedPointOperation(fixedPointFormat,
					FixedPointOperationKind.CAST);
			FixedPointValue.initializeValue(getContext(), fixedPointValue, fixedPointOperation, value);
			return fixedPointValue;
		}
		return null;
	}

}
