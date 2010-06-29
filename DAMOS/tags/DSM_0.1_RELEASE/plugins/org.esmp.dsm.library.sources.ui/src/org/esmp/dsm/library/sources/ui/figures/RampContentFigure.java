/****************************************************************************
 * Copyright (c) 2008, 2009 Andreas Unger and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andreas Unger - initial API and implementation 
 ****************************************************************************/

package org.esmp.dsm.library.sources.ui.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.esmp.dsm.diagram.ui.figures.FigureConstants;

/**
 * @author Andreas Unger
 *
 */
public class RampContentFigure extends Figure implements FigureConstants {
	
	private int[] points = new int[6];
	
	/**
	 * 
	 */
	public RampContentFigure() {
		setPreferredSize(400, 400);
	}

	/* (non-Javadoc)
	 * @see org.esmp.dsm.diagram.figures.BlockFigure#paintCanvas(org.esmp.dsm.diagram.figures.ICanvasContext)
	 */
	protected void paintFigure(Graphics g) {
		g.setLineWidth(DEFAULT_LINE_WIDTH);
		Rectangle border = getBounds().getCopy().shrink(DEFAULT_LINE_WIDTH_HALF, DEFAULT_LINE_WIDTH_HALF);
		points[0] = border.x;
		points[1] = border.y + border.height;
		points[2] = border.x + border.width / 3;
		points[3] = border.y + border.height;
		points[4] = border.x + border.width;
		points[5] = border.y;
		g.drawPolyline(points);
	}
	
}
