/**
 * Copyright (c) 2011 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.ui.editor.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.yakindu.sct.ui.editor.editor.figures.SynchronizationFigure;

import com.google.inject.Inject;

import de.itemis.gmf.runtime.commons.editpolicies.BarResizeEditPolicy;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class SynchronizationEditPart extends ShapeNodeEditPart {

	private static final int DEFAULT_WIDTH = 8;
	private static final int DEFAULT_HEIGHT = 32;

	@Inject
	private SynchronizationFigure primaryShape;

	public SynchronizationEditPart() {
		super(null);
	}

	@Override
	protected NodeFigure createNodeFigure() {
		final DefaultSizeNodeFigure nodeFigure = new DefaultSizeNodeFigure(
				getMapMode().DPtoLP(DEFAULT_WIDTH), getMapMode().DPtoLP(
						DEFAULT_HEIGHT));
		nodeFigure.setLayoutManager(new StackLayout());
		nodeFigure.add(getPrimaryShape());
		return nodeFigure;
	}

	private IFigure getPrimaryShape() {
		return primaryShape;
	}

	@Override
	public EditPolicy getPrimaryDragEditPolicy() {
		return new BarResizeEditPolicy();
	}

}
