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

import org.eclipselabs.damos.mscript.DataType;
import org.eclipselabs.damos.mscript.OperatorKind;
import org.eclipselabs.damos.mscript.Unit;
import org.eclipselabs.damos.mscript.interpreter.IComputationContext;
import org.eclipselabs.damos.mscript.util.TypeUtil;


/**
 * @author Andreas Unger
 *
 */
public class UnitValue extends AbstractValue {

	private Unit value;
	
	/**
	 * 
	 */
	public UnitValue(IComputationContext context, Unit value) {
		super(context);
		this.value = value;
	}
	
	/**
	 * @return the value
	 */
	public Unit getValue() {
		return value;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.execution.value.IValue#getDataType()
	 */
	public DataType getDataType() {
		return TypeUtil.UNIT_TYPE;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.interpreter.value.AbstractValue#doConvert(org.eclipselabs.mscript.typesystem.DataType)
	 */
	@Override
	protected IValue doConvert(DataType dataType) {
		return this;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.interpreter.value.AbstractValue#doMultiply(org.eclipselabs.mscript.interpreter.value.IValue, org.eclipselabs.mscript.typesystem.DataType)
	 */
	@Override
	protected IValue doMultiply(IValue other, DataType resultDataType) {
		if (other instanceof UnitValue) {
			return new UnitValue(getContext(), value.evaluate(OperatorKind.MULTIPLY, ((UnitValue) other).value));
		}
		return InvalidValue.SINGLETON;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.interpreter.value.AbstractValue#doDivide(org.eclipselabs.mscript.interpreter.value.IValue, org.eclipselabs.mscript.typesystem.DataType)
	 */
	@Override
	protected IValue doDivide(IValue other, DataType resultDataType) {
		if (other instanceof UnitValue) {
			return new UnitValue(getContext(), value.evaluate(OperatorKind.DIVIDE, ((UnitValue) other).value));
		}
		return InvalidValue.SINGLETON;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.interpreter.value.AbstractValue#doEqualTo(org.eclipselabs.mscript.interpreter.value.IValue, org.eclipselabs.mscript.typesystem.DataType)
	 */
	@Override
	protected IValue doEqualTo(IValue other, DataType resultDataType) {
		UnitValue otherUnitValue = (UnitValue) other;
		if (value == null && otherUnitValue.value == null) {
			return new BooleanValue(getContext(), true);
		}
		if (value == null || otherUnitValue == null) {
			return new BooleanValue(getContext(), false);
		}
		return new BooleanValue(getContext(), value.isEquivalentTo(otherUnitValue.value, false));
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.interpreter.value.AbstractValue#doNotEqualTo(org.eclipselabs.mscript.interpreter.value.IValue, org.eclipselabs.mscript.typesystem.DataType)
	 */
	@Override
	protected IValue doNotEqualTo(IValue other, DataType resultDataType) {
		UnitValue otherUnitValue = (UnitValue) other;
		if (value == null && otherUnitValue.value == null) {
			return new BooleanValue(getContext(), false);
		}
		if (value == null || otherUnitValue == null) {
			return new BooleanValue(getContext(), true);
		}
		return new BooleanValue(getContext(), !value.isEquivalentTo(otherUnitValue.value, false));
	}
	
}
