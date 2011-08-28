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

package org.eclipselabs.damos.library.base.ui.discrete.editparts;

import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipselabs.damos.diagram.ui.editparts.StandardBlockEditPart;
import org.eclipselabs.damos.library.base.ui.discrete.figures.CounterFigure;

/**
 * @author Andreas Unger
 *
 */
public class CounterEditPart extends StandardBlockEditPart {

	/**
	 * @param view
	 */
	public CounterEditPart(View view) {
		super(view);
	}

	protected NodeFigure createMainFigure() {
		return new CounterFigure();
	}

}
