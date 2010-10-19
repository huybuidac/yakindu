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

package org.eclipselabs.mscript.language.interpreter.value;

import java.util.List;

import org.eclipselabs.mscript.typesystem.DataType;
import org.eclipselabs.mscript.typesystem.InvalidDataType;
import org.eclipselabs.mscript.typesystem.OperatorKind;

/**
 * @author Andreas Unger
 *
 */
public abstract class AbstractValue implements IValue {
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.interpreter.value.IValue#convert(org.eclipselabs.mscript.typesystem.DataType)
	 */
	public IValue convert(DataType dataType) {
		if (dataType.isAssignableFrom(getDataType())) {
			return doConvert(dataType);
		}
		return InvalidValue.SINGLETON;
	}
	
	protected abstract IValue doConvert(DataType dataType);

	public IValue add(IValue other) {
		DataType dataType = getDataType().evaluate(OperatorKind.ADDITION, other.getDataType());
		if (dataType instanceof InvalidDataType) { 
			return InvalidValue.SINGLETON;
		}
		if (other instanceof AnyValue) {
			return new AnyValue(dataType);
		}
		if (other instanceof UninitializedValue || other instanceof InvalidValue) {
			return InvalidValue.SINGLETON;
		}
		return doAdd(other, dataType);
	}

	/**
	 * @param other
	 * @return
	 */
	protected IValue doAdd(IValue other, DataType resultDataType) {
		return InvalidValue.SINGLETON;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.evaluation.IValue#subtract(org.eclipselabs.damos.evaluation.IValue)
	 */
	public IValue subtract(IValue other) {
		DataType dataType = getDataType().evaluate(OperatorKind.SUBTRACTION, other.getDataType());
		if (dataType instanceof InvalidDataType) { 
			return InvalidValue.SINGLETON;
		}
		if (other instanceof AnyValue) {
			return new AnyValue(dataType);
		}
		if (other instanceof UninitializedValue || other instanceof InvalidValue) {
			return InvalidValue.SINGLETON;
		}
		return doSubtract(other, dataType);
	}
	
	protected IValue doSubtract(IValue other, DataType resultDataType) {
		return InvalidValue.SINGLETON;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.evaluation.IValue#multiply(org.eclipselabs.damos.evaluation.IValue)
	 */
	public IValue multiply(IValue other) {
		DataType dataType = getDataType().evaluate(OperatorKind.MULTIPLICATION, other.getDataType());
		if (dataType instanceof InvalidDataType) { 
			return InvalidValue.SINGLETON;
		}
		if (other instanceof AnyValue) {
			return new AnyValue(dataType);
		}
		if (other instanceof UninitializedValue || other instanceof InvalidValue) {
			return InvalidValue.SINGLETON;
		}
		return doMultiply(other, dataType);
	}

	protected IValue doMultiply(IValue other, DataType resultDataType) {
		return InvalidValue.SINGLETON;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.evaluation.IValue#divide(org.eclipselabs.damos.evaluation.IValue)
	 */
	public IValue divide(IValue other) {
		DataType dataType = getDataType().evaluate(OperatorKind.DIVISION, other.getDataType());
		if (dataType instanceof InvalidDataType) { 
			return InvalidValue.SINGLETON;
		}
		if (other instanceof AnyValue) {
			return new AnyValue(dataType);
		}
		if (other instanceof UninitializedValue || other instanceof InvalidValue) {
			return InvalidValue.SINGLETON;
		}
		return doDivide(other, dataType);
	}

	protected IValue doDivide(IValue other, DataType resultDataType) {
		return InvalidValue.SINGLETON;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.evaluation.IValue#elementWiseMultiply(org.eclipselabs.damos.evaluation.IValue)
	 */
	public IValue elementWiseMultiply(IValue other) {
		DataType dataType = getDataType().evaluate(OperatorKind.ELEMENT_WISE_MULTIPLICATION, other.getDataType());
		if (dataType instanceof InvalidDataType) { 
			return InvalidValue.SINGLETON;
		}
		if (other instanceof AnyValue) {
			return new AnyValue(dataType);
		}
		if (other instanceof UninitializedValue || other instanceof InvalidValue) {
			return InvalidValue.SINGLETON;
		}
		return doElementWiseMultiply(other, dataType);
	}

	protected IValue doElementWiseMultiply(IValue other, DataType resultDataType) {
		return InvalidValue.SINGLETON;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.evaluation.IValue#elementWiseDivide(org.eclipselabs.damos.evaluation.IValue)
	 */
	public IValue elementWiseDivide(IValue other) {
		DataType dataType = getDataType().evaluate(OperatorKind.ELEMENT_WISE_DIVISION, other.getDataType());
		if (dataType instanceof InvalidDataType) { 
			return InvalidValue.SINGLETON;
		}
		if (other instanceof AnyValue) {
			return new AnyValue(dataType);
		}
		if (other instanceof UninitializedValue || other instanceof InvalidValue) {
			return InvalidValue.SINGLETON;
		}
		return doElementWiseDivide(other, dataType);
	}

	protected IValue doElementWiseDivide(IValue other, DataType resultDataType) {
		return InvalidValue.SINGLETON;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.interpreter.value.IValue#power(org.eclipselabs.mscript.interpreter.value.IValue)
	 */
	public IValue power(IValue other) {
		return InvalidValue.SINGLETON;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.evaluation.IValue#unaryMinus()
	 */
	public IValue unaryMinus() {
		DataType dataType = getDataType().evaluate(OperatorKind.UNARY_MINUS, null);
		if (dataType instanceof InvalidDataType) { 
			return InvalidValue.SINGLETON;
		}
		return doUnaryMinus(dataType);
	}

	protected IValue doUnaryMinus(DataType resultDataType) {
		return InvalidValue.SINGLETON;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.interpreter.value.IValue#lessThan(org.eclipselabs.mscript.interpreter.value.IValue)
	 */
	public IValue lessThan(IValue other) {
		DataType dataType = getDataType().evaluate(OperatorKind.LESS_THAN, other.getDataType());
		if (dataType instanceof InvalidDataType) { 
			return InvalidValue.SINGLETON;
		}
		if (other instanceof AnyValue) {
			return new AnyValue(dataType);
		}
		if (other instanceof UninitializedValue || other instanceof InvalidValue) {
			return InvalidValue.SINGLETON;
		}
		return doLessThan(other, dataType);
	}

	protected IValue doLessThan(IValue other, DataType resultDataType) {
		return InvalidValue.SINGLETON;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.interpreter.value.IValue#lessThanOrEqualTo(org.eclipselabs.mscript.interpreter.value.IValue)
	 */
	public IValue lessThanOrEqualTo(IValue other) {
		DataType dataType = getDataType().evaluate(OperatorKind.LESS_THAN_OR_EQUAL_TO, other.getDataType());
		if (dataType instanceof InvalidDataType) { 
			return InvalidValue.SINGLETON;
		}
		if (other instanceof AnyValue) {
			return new AnyValue(dataType);
		}
		if (other instanceof UninitializedValue || other instanceof InvalidValue) {
			return InvalidValue.SINGLETON;
		}
		return doLessThanOrEqualTo(other, dataType);
	}

	protected IValue doLessThanOrEqualTo(IValue other, DataType resultDataType) {
		return InvalidValue.SINGLETON;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.interpreter.value.IValue#greaterThan(org.eclipselabs.mscript.interpreter.value.IValue)
	 */
	public IValue greaterThan(IValue other) {
		DataType dataType = getDataType().evaluate(OperatorKind.GREATER_THAN, other.getDataType());
		if (dataType instanceof InvalidDataType) { 
			return InvalidValue.SINGLETON;
		}
		if (other instanceof AnyValue) {
			return new AnyValue(dataType);
		}
		if (other instanceof UninitializedValue || other instanceof InvalidValue) {
			return InvalidValue.SINGLETON;
		}
		return doGreaterThan(other, dataType);
	}

	protected IValue doGreaterThan(IValue other, DataType resultDataType) {
		return InvalidValue.SINGLETON;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.interpreter.value.IValue#greaterThanOrEqualTo(org.eclipselabs.mscript.interpreter.value.IValue)
	 */
	public IValue greaterThanOrEqualTo(IValue other) {
		DataType dataType = getDataType().evaluate(OperatorKind.GREATER_THAN_OR_EQUAL_TO, other.getDataType());
		if (dataType instanceof InvalidDataType) { 
			return InvalidValue.SINGLETON;
		}
		if (other instanceof AnyValue) {
			return new AnyValue(dataType);
		}
		if (other instanceof UninitializedValue || other instanceof InvalidValue) {
			return InvalidValue.SINGLETON;
		}
		return doGreaterThanOrEqualTo(other, dataType);
	}

	protected IValue doGreaterThanOrEqualTo(IValue other, DataType resultDataType) {
		return InvalidValue.SINGLETON;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.interpreter.value.IValue#equalTo(org.eclipselabs.mscript.interpreter.value.IValue)
	 */
	public IValue equalTo(IValue other) {
		DataType dataType = getDataType().evaluate(OperatorKind.EQUAL_TO, other.getDataType());
		if (dataType instanceof InvalidDataType) { 
			return InvalidValue.SINGLETON;
		}
		if (other instanceof AnyValue) {
			return new AnyValue(dataType);
		}
		if (other instanceof UninitializedValue || other instanceof InvalidValue) {
			return InvalidValue.SINGLETON;
		}
		return doEqualTo(other, dataType);
	}

	protected IValue doEqualTo(IValue other, DataType resultDataType) {
		return InvalidValue.SINGLETON;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.interpreter.value.IValue#notEqualTo(org.eclipselabs.mscript.interpreter.value.IValue)
	 */
	public IValue notEqualTo(IValue other) {
		DataType dataType = getDataType().evaluate(OperatorKind.NOT_EQUAL_TO, other.getDataType());
		if (dataType instanceof InvalidDataType) { 
			return InvalidValue.SINGLETON;
		}
		if (other instanceof AnyValue) {
			return new AnyValue(dataType);
		}
		if (other instanceof UninitializedValue || other instanceof InvalidValue) {
			return InvalidValue.SINGLETON;
		}
		return doNotEqualTo(other, dataType);
	}

	protected IValue doNotEqualTo(IValue other, DataType resultDataType) {
		return InvalidValue.SINGLETON;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.interpreter.value.IValue#getProperty(java.lang.String, java.util.List)
	 */
	public IValue getProperty(String name, List<IValue> arguments) {
		return null;
	}

}
