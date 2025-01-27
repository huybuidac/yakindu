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

package org.eclipselabs.mscript.language.interpreter.builtin;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.mscript.computation.core.IComputationContext;
import org.eclipselabs.mscript.computation.core.value.INumericValue;
import org.eclipselabs.mscript.computation.core.value.IValue;
import org.eclipselabs.mscript.computation.core.value.UnitValue;

/**
 * @author Andreas Unger
 *
 */
public class NumFunction implements IFunction {

	public List<IValue> call(IComputationContext context, List<? extends IValue> arguments) {
		INumericValue argument = (INumericValue) arguments.get(0);
		UnitValue unitValue = (UnitValue) arguments.get(1);
		return Collections.<IValue>singletonList(argument.convertUnit(EcoreUtil.copy(unitValue.getValue())));
	}
	
}
