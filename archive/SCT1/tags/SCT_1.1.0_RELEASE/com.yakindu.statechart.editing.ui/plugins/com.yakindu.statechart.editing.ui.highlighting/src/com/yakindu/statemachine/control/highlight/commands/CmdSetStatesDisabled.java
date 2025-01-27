/**
 * Copyright (c) 2010 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of YAKINDU - initial API and implementation
 */
package com.yakindu.statemachine.control.highlight.commands;

import java.util.List;


import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.Color;
import org.mda4e.statemachine.contribution.part.OurStatemachineDiagramEditorPlugin;
import org.mda4e.statemachine.contribution.tools.Constants;

import statemachine.diagram.edit.parts.StateEditPart;

public class CmdSetStatesDisabled extends AbstractTransactionalCommand {
	
	private List <StateEditPart> activeStates;
	private IPreferenceStore store;

	public CmdSetStatesDisabled(TransactionalEditingDomain domain, String label,
			List<IFile> affectedFiles, List <StateEditPart> activeStates) {
		super(domain, label, affectedFiles);
		this.activeStates=activeStates;
		store = OurStatemachineDiagramEditorPlugin.getInstance().getPreferenceStore();
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor arg0,
			IAdaptable arg1) throws ExecutionException {
		for (int i=0;i<activeStates.size();i++)
			activeStates.get(i).getPrimaryShape().setBackgroundColor(new Color(null,PreferenceConverter.getColor(store, Constants.P_STATE_BACKGROUND_COLOR)));
		return null;
	}
}