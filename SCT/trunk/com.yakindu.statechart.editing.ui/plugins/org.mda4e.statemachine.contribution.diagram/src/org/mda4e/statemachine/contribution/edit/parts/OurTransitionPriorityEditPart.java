/**
 * Copyright (c) 2006-2009 committers of mda4e and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of mda4e (http://www.mda4e.org/) - initial API and implementation
 *
 */
package org.mda4e.statemachine.contribution.edit.parts;

import java.io.InputStream;

import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import statemachine.diagram.edit.parts.TransitionPriorityEditPart;

public class OurTransitionPriorityEditPart extends TransitionPriorityEditPart {

	public OurTransitionPriorityEditPart(View view) {
		super(view);
	}

	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		removeEditPolicy(EditPolicy.COMPONENT_ROLE);
	}

	@Override
	protected Image getLabelIcon() {
		InputStream iconStream = OurTransitionPriorityEditPart.class
				.getResourceAsStream("/icons/exclaim.gif");
		if (iconStream != null) {
			Image iconImage = new Image(Display.getCurrent(), iconStream);
			return iconImage;
		}
		return null;
	}
}
