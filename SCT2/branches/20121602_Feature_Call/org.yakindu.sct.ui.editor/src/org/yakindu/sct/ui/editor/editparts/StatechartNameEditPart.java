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
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.yakindu.base.base.BasePackage;
import org.yakindu.sct.ui.editor.DiagramActivator;

import de.itemis.gmf.runtime.commons.editparts.TextAwareLabelEditPart;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class StatechartNameEditPart extends TextAwareLabelEditPart {

	public StatechartNameEditPart(View view) {
		super(view, BasePackage.Literals.NAMED_ELEMENT__NAME,
				DiagramActivator.PLUGIN_ID);
	}

	public void setLabel(IFigure label) {
		setFigure(label);
	}

	@Override
	protected void setFont(FontData fontData) {
		super.setFont(new FontData(fontData.getName(), fontData.getHeight(),
				fontData.getStyle() | SWT.BOLD));
	}

	@Override
	protected IFigure createFigure() {
		// Figure is set from parent addChild
		return null;
	}
}
