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
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.ViewportAwareConnectionLayerClippingStrategy;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.editparts.LayerManager;
import org.eclipse.gmf.runtime.common.ui.services.marker.MarkerNavigationService;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.help.IWorkbenchHelpSystem;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.yakindu.sct.model.sgraph.SGraphPackage;
import org.yakindu.sct.ui.editor.DiagramActivator;
import org.yakindu.sct.ui.editor.utils.IYakinduSctHelpContextIds;
import org.yakindu.sct.ui.editor.validation.ValidationAction;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * @author martin esser
 */
public class StatechartDiagramEditor extends DiagramDocumentEditor implements
		IGotoMarker {

	public static final String ID = "org.yakindu.sct.ui.editor.editor.StatechartDiagramEditor";

	// Listenes the ResourceSet for semantic changes
	private ResourceSetListener validationListener = new ResourceSetListenerImpl() {
		@Override
		public void resourceSetChanged(ResourceSetChangeEvent event) {
			validate();

			// FIXME: Validation should only be done if semantic changes are
			// done
			// with the solution below the error marker is set not correctly
			// (See YAK-HMI 511)
			// if (isGraphModelAffected(event)) {
			// validate();
			// }
		}
	};

	// private boolean isGraphModelAffected(ResourceSetChangeEvent event) {
	// for (Notification notification : event.getNotifications()) {
	// if (notification.getNotifier() instanceof EObject) {
	// EObject eObject = (EObject) notification.getNotifier();
	// if (SGraphPackage.eINSTANCE == eObject.eClass().getEPackage()) {
	// return true;
	// }
	// }
	// }
	// return false;
	// }

	public StatechartDiagramEditor() {
		super(true);
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		super.init(site, input);
		getEditingDomain().addResourceSetListener(validationListener);
		checkXtextNature();
	}

	private void checkXtextNature() {
		IFileEditorInput editorInput = (IFileEditorInput) getEditorInput();
		IProject project = editorInput.getFile().getProject();
		if (project != null && !XtextProjectHelper.hasNature(project)
				&& project.isAccessible() && !project.isHidden()) {
			addNature(project);
		}
	}

	public void addNature(IProject project) {
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 0, natures.length);
			newNatures[natures.length] = XtextProjectHelper.NATURE_ID;
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
		} catch (CoreException e) {
			DiagramActivator
					.getDefault()
					.getLog()
					.log(new Status(IStatus.ERROR, DiagramActivator.PLUGIN_ID,
							"Xtext nature can't be added", e));
		}
	}

	@Override
	protected void sanityCheckState(IEditorInput input) {
		super.sanityCheckState(input);
		//validate();
	}

	protected void validate() {
		if (getDiagram() != null) {
			ValidationAction.validate(getDiagramEditPart(), getDiagram());
		}
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
		IWorkbenchHelpSystem helpSystem = PlatformUI.getWorkbench()
				.getHelpSystem();
		helpSystem.setHelp(getGraphicalViewer().getControl(),
				IYakinduSctHelpContextIds.SC_EDITOR_GRAPHICAL_VIEWER);
	}

	@Override
	public String getContributorId() {
		return ID;
	}

	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		RootEditPart rootEditPart = getDiagramGraphicalViewer()
				.getRootEditPart();
		// set clipping strategy for connection layer
		if (rootEditPart instanceof LayerManager) {
			ConnectionLayer connectionLayer = (ConnectionLayer) ((LayerManager) rootEditPart)
					.getLayer(LayerConstants.CONNECTION_LAYER);
			connectionLayer
					.setClippingStrategy(new ViewportAwareConnectionLayerClippingStrategy(
							connectionLayer));
		}
	}

	@Override
	public void dispose() {
		getEditingDomain().removeResourceSetListener(validationListener);
		super.dispose();
	}
}
