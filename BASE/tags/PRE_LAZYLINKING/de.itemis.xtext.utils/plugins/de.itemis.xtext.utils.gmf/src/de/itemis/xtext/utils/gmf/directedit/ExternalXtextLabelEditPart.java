/**
 * Copyright (c) 2011 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 	itemis AG - initial API and implementation
 * 
 */
package de.itemis.xtext.utils.gmf.directedit;

import static org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants.REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.Request;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.DragEditPartsTrackerEx;
import org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager;
import org.eclipse.gmf.runtime.draw2d.ui.figures.LabelEx;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.ShapeStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * Abstract base implementation for all external {@link LabelEditPart} that use
 * Xtext for direct editing.
 * 
 * 
 * @author muelder
 * 
 */
public abstract class ExternalXtextLabelEditPart extends LabelEditPart
		implements IXtextAwareEditPart {

	private DirectEditManager manager;

	protected abstract DirectEditManager createDirectEditManager();

	public ExternalXtextLabelEditPart(final View view) {
		super(view);
	}

	@Override
	protected IFigure createFigure() {
		final LabelEx label = new LabelEx();
		label.setLabelAlignment(PositionConstants.LEFT);
		label.setTextAlignment(PositionConstants.TOP);
		return label;
	}

	@Override
	public LabelEx getFigure() {
		return (LabelEx) super.getFigure();
	}

	public void setLabelText(final String text) {
		getFigure().setText(text);
	}

	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		refreshFont();
		refreshFontColor();
		updateLabelText();
	}

	private void updateLabelText() {
		getFigure().setText(getEditText());
	}

	@Override
	protected void setFontColor(final Color color) {
		getFigure().setForegroundColor(color);
	}

	@Override
	protected void handleNotificationEvent(final Notification notification) {
		if (notification.getNotifier() instanceof ShapeStyle) {
			refreshVisuals();
		} else if (NotationPackage.eINSTANCE.getFontStyle().getEAllAttributes()
				.contains(notification.getFeature())) {
			refreshFont();
		} else {
			super.handleNotificationEvent(notification);
		}
	}

	/**
	 * Performs direct edit on double click
	 */
	@Override
	public DragTracker getDragTracker(final Request request) {
		return new DragEditPartsTrackerEx(this) {
			protected boolean isMove() {
				return true;
			}

			protected boolean handleDoubleClick(int button) {
				performDirectEditRequest(request);
				return super.handleDoubleClick(button);
			}
		};
	}

	@Override
	protected void performDirectEditRequest(final Request request) {
		if (manager == null) {
			manager = createDirectEditManager();
		}
		final Request theRequest = request;
		try {
			getEditingDomain().runExclusive(new Runnable() {

				public void run() {
					if (isActive()) {
						if (theRequest.getExtendedData().get(
								REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR) instanceof Character) {
							final Character initialChar = (Character) theRequest
									.getExtendedData()
									.get(REQ_DIRECTEDIT_EXTENDEDDATA_INITIAL_CHAR);
							if (manager instanceof XtextDirectEditManager) {
								((XtextDirectEditManager) manager)
										.show(initialChar);
							} else if (manager instanceof TextDirectEditManager) {
								((TextDirectEditManager) manager)
										.show(initialChar);
							}
						} else {
							manager.show();
						}
					}
				}
			});
		} catch (final InterruptedException e) {
			e.printStackTrace();
		}
	}

}
