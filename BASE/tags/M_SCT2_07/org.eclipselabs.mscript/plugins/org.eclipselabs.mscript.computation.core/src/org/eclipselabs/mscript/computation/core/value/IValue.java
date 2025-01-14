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

package org.eclipselabs.mscript.computation.core.value;

import org.eclipselabs.mscript.typesystem.DataType;

/**
 * @author Andreas Unger
 *
 * @noextend
 * @noimplement
 */
public interface IValue {
	
	DataType getDataType();
	
	IValue convert(DataType dataType);

	IValue add(IValue other);
	IValue subtract(IValue other);
	IValue multiply(IValue other);
	IValue divide(IValue other);
	IValue elementWiseMultiply(IValue other);
	IValue elementWiseDivide(IValue other);
	IValue negate();
	IValue power(IValue other);
	IValue transpose();
	IValue lessThan(IValue other);
	IValue lessThanOrEqualTo(IValue other);
	IValue greaterThan(IValue other);
	IValue greaterThanOrEqualTo(IValue other);
	IValue equalTo(IValue other);
	IValue notEqualTo(IValue other);
	
}
