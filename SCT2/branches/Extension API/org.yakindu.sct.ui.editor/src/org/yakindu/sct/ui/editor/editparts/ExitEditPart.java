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
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.NonResizableEditPolicyEx;
import org.eclipse.gmf.runtime.diagram.ui.handles.ConnectionHandle.HandleDirection;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.yakindu.sct.ui.editor.editor.figures.ExitFigure;
import org.yakindu.sct.ui.editor.editor.figures.utils.MapModeUtils;

import com.google.inject.Inject;

import de.itemis.gmf.runtime.commons.editpolicies.OneWayConnectionHandlesEditPolicy;
import de.itemis.gmf.runtime.commons.figures.EllipseAnchorDefaultSizeNodeFigure;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class ExitEditPart extends BorderedShapeEditPart {

	@Inject
	private ExitFigure primaryShape;

	public ExitEditPart() {
		super(null);
	}

	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.CONNECTION_HANDLES_ROLE,
				new OneWayConnectionHandlesEditPolicy(HandleDirection.INCOMING));
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new NonResizableEditPolicyEx());
	}

	@Override
	protected NodeFigure createMainFigure() {
		final NodeFigure figure = new EllipseAnchorDefaultSizeNodeFigure(
				MapModeUtils.DEFAULT_SMALL_NODE_DIMENSION);
		figure.setLayoutManager(new StackLayout());
		figure.add(createPrimaryShape());
		return figure;
	}

	private IFigure createPrimaryShape() {
		return primaryShape;
	}
}
