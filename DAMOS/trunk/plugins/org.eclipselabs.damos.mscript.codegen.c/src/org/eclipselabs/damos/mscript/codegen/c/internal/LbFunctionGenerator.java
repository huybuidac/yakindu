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

package org.eclipselabs.damos.mscript.codegen.c.internal;

import org.eclipselabs.damos.mscript.computationmodel.FixedPointFormat;
import org.eclipselabs.damos.mscript.computationmodel.FloatingPointFormat;

/**
 * @author Andreas Unger
 *
 */
public class LbFunctionGenerator extends AbstractSingleParameterFunctionGenerator {

	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.mscript.codegen.c.internal.AbstractSingleParameterFunctionGenerator#getFixedPointFunctionName(org.eclipselabs.damos.mscript.computationmodel.FixedPointFormat)
	 */
	@Override
	protected String getFixedPointFunctionName(FixedPointFormat fixedPointFormat) {
		return fixedPointFormat.getWordSize() > 32 ? "DamosMath_lbfix64" : "DamosMath_lbfix32";
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.mscript.codegen.c.internal.AbstractSingleParameterFunctionGenerator#getFloatingPointFunctionName(org.eclipselabs.damos.mscript.computationmodel.FloatingPointFormat)
	 */
	@Override
	protected String getFloatingPointFunctionName(FloatingPointFormat floatingPointFormat) {
		return "log2";
	}

}
