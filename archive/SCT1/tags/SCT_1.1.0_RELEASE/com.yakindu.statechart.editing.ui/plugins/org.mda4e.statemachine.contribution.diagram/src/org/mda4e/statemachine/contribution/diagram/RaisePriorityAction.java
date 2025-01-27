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
package org.mda4e.statemachine.contribution.diagram;

import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IWorkbenchPart;
import org.mda4e.statemachine.contribution.helper.TransitionHelper;

public class RaisePriorityAction extends AbstractTransitionAction {

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// do nothing
	}

	public void run(IAction action) {
		TransitionHelper.raisePriority(getSelectedElement(), getEditPart()
				.getEditingDomain());
	}
}
