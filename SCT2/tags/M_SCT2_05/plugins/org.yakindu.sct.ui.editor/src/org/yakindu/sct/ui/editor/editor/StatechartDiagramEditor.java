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
package org.yakindu.sct.ui.editor.editor;

import org.eclipse.core.resources.IMarker;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.gmf.runtime.common.ui.services.marker.MarkerNavigationService;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IGotoMarker;
import org.yakindu.sct.ui.editor.DiagramActivator;
import org.yakindu.sct.ui.editor.utils.IYakinduSctHelpContextIds;
import org.yakindu.sct.ui.editor.validation.ValidationAction;

/**
 * 
 * @author andreas muelder
 * @author martin esser
 */
public class StatechartDiagramEditor extends DiagramDocumentEditor implements
		IGotoMarker {

	public static final String ID = "org.yakindu.sct.ui.editor.editor.StatechartDiagramEditor";

	public StatechartDiagramEditor() {
		super(true);
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		super.init(site, input);

		getEditingDomain().addResourceSetListener(
				new ResourceSetListenerImpl() {
					@Override
					public void resourceSetChanged(ResourceSetChangeEvent event) {
						Display.getDefault().asyncExec(new Runnable() {
							public void run() {
								if (getDiagram() != null) {
									ValidationAction.validate(
											getDiagramEditPart(), getDiagram());
								}
							}
						});

					}
				});
	}

	public void gotoMarker(IMarker marker) {
		MarkerNavigationService.getInstance().gotoMarker(this, marker);
	}

	@Override
	protected PreferencesHint getPreferencesHint() {
		return DiagramActivator.DIAGRAM_PREFERENCES_HINT;
	}

	@Override
	protected void createGraphicalViewer(Composite parent) {
		super.createGraphicalViewer(parent);
		// Tag the viewer with the desired help context id
		PlatformUI
				.getWorkbench()
				.getHelpSystem()
				.setHelp(getGraphicalViewer().getControl(),
						IYakinduSctHelpContextIds.SC_EDITOR_GRAPHICAL_VIEWER);
	}

	@Override
	public String getContributorId() {
		return ID;
	}

}
