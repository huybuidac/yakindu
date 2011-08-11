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

package org.eclipselabs.damos.diagram.ui.internal.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipselabs.damos.diagram.ui.figures.IFigureConstants;
import org.eclipselabs.damos.diagram.ui.figures.PolylineTerminalFigure;
import org.eclipselabs.damos.diagram.ui.figures.PortFigure;

public class OutputTerminalFigure extends PolylineTerminalFigure {
	
	private static final int SIZE = IFigureConstants.DEFAULT_TERMINAL_SIZE;

	private static final PointList POLYLINE = new PointList();

	static {
		POLYLINE.addPoint(0, -SIZE);
		POLYLINE.addPoint(SIZE, 0);
		POLYLINE.addPoint(0, SIZE);
	}

	/**
	 * @param owner
	 */
	public OutputTerminalFigure(PortFigure owner) {
		super(owner);
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.diagram.figures.TerminalFigure#getPolyline()
	 */
	protected PointList getPointList() {
		return POLYLINE;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.diagram.ui.figures.PolylineTerminalFigure#paintFigure(org.eclipse.draw2d.Graphics)
	 */
	@Override
	protected void paintFigure(Graphics graphics) {
		if (!isConnected()) {
			super.paintFigure(graphics);
		}
	}

}