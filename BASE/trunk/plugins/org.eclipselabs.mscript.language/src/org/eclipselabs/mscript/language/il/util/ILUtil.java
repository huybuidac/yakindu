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

package org.eclipselabs.mscript.language.il.util;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.mscript.language.ast.Expression;
import org.eclipselabs.mscript.typesystem.DataType;

/**
 * @author Andreas Unger
 *
 */
public class ILUtil {

	public static DataType getDataType(Expression expression) {
		DataTypeAdapter adapter = (DataTypeAdapter) EcoreUtil.getAdapter(expression.eAdapters(), DataTypeAdapter.class);
		return adapter != null ? adapter.getDataType() : null;
	}
	
	public static void setDataType(Expression expression, DataType dataType) {
		DataTypeAdapter adapter = (DataTypeAdapter) EcoreUtil.getAdapter(expression.eAdapters(), DataTypeAdapter.class);
		if (adapter == null) {
			adapter = new DataTypeAdapter();
			expression.eAdapters().add(adapter);
		}
		adapter.setDataType(dataType);
	}
	
}
