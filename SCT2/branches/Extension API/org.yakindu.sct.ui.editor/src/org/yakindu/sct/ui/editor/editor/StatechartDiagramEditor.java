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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.ViewportAwareConnectionLayerClippingStrategy;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.editparts.LayerManager;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
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
import org.yakindu.sct.ui.editor.editor.guice.InjectableDiagramDocumentEditor;
import org.yakindu.sct.ui.editor.module.SCTModule;
import org.yakindu.sct.ui.editor.providers.StatechartMarkerNavigationProvider;
import org.yakindu.sct.ui.editor.utils.HelpContextIds;
import org.yakindu.sct.ui.editor.validation.SCTValidationJob;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;

import de.itemis.xtext.utils.gmf.resource.DirtyStateListener;

/**
 * 
 * @author andreas muelder - Initial contribution and API
 * @author martin esser
 */
public class StatechartDiagramEditor extends InjectableDiagramDocumentEditor implements IGotoMarker {

	public static final String ID = "org.yakindu.sct.ui.editor.editor.StatechartDiagramEditor";

	@Inject
	@Named(SCTModule.CONTRIBUTOR_ID)
	private String contributorId;

	private static final int DELAY = 200; // ms

	@Inject
	private StatechartMarkerNavigationProvider markerNavigator;

	private ResourceSetListener validationListener = new ResourceSetListenerImpl() {

		@Override
		public void resourceSetChanged(ResourceSetChangeEvent event) {
			for (Notification notification : event.getNotifications()) {
				if (notification.getNotifier() instanceof EObject
						&& notification.getEventType() != Notification.REMOVING_ADAPTER
						&& notification.getEventType() != Notification.RESOLVE) {
					EObject eObject = (EObject) notification.getNotifier();
					if (eObject.eClass().getEPackage() == SGraphPackage.eINSTANCE) {
						validationJob.cancel();
						validationJob.schedule(DELAY);
					} else
						for (EClass eClass : eObject.eClass().getEAllSuperTypes()) {
							if (SGraphPackage.eINSTANCE == eClass.getEPackage()) {
								validationJob.cancel();
								validationJob.schedule(DELAY);
								return;
							}
						}
				}
			}
		}
	};

	private DirtyStateListener domainAdapter;

	private SCTValidationJob validationJob;

	public StatechartDiagramEditor() {
		super(true);
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		super.init(site, input);
		getEditingDomain().addResourceSetListener(validationListener);
		checkXtextNature();
		initValidationJob();
	}

	private void initValidationJob() {
		final IFile file = ((IFileEditorInput) getEditorInput()).getFile();
		validationJob = new SCTValidationJob(getDiagram());
		Injector injector = DiagramActivator.getDefault().getInjector();
		injector.injectMembers(validationJob);
		validationJob.setRule(file);
	}

	private void checkXtextNature() {
		IFileEditorInput editorInput = (IFileEditorInput) getEditorInput();
		IProject project = editorInput.getFile().getProject();
		if (project != null && !XtextProjectHelper.hasNature(project) && project.isAccessible() && !project.isHidden()) {
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
			e.printStackTrace();
		}
	}

	@Override
	protected TransactionalEditingDomain createEditingDomain() {
		TransactionalEditingDomain domain = super.createEditingDomain();
		domainAdapter = new DirtyStateListener();
		domain.addResourceSetListener(domainAdapter);
		return domain;
	}

	public void gotoMarker(IMarker marker) {
		markerNavigator.gotoMarker(this, marker);
	}

	@Override
	protected PreferencesHint getPreferencesHint() {
		return DiagramActivator.DIAGRAM_PREFERENCES_HINT;
	}

	@Override
	protected void createGraphicalViewer(Composite parent) {
		super.createGraphicalViewer(parent);
		IWorkbenchHelpSystem helpSystem = PlatformUI.getWorkbench().getHelpSystem();
		helpSystem.setHelp(getGraphicalViewer().getControl(), HelpContextIds.SC_EDITOR_GRAPHICAL_VIEWER);
	}

	@Override
	public String getContributorId() {
		return contributorId;
	}

	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		RootEditPart rootEditPart = getDiagramGraphicalViewer().getRootEditPart();
		if (rootEditPart instanceof LayerManager) {
			ConnectionLayer connectionLayer = (ConnectionLayer) ((LayerManager) rootEditPart)
					.getLayer(LayerConstants.CONNECTION_LAYER);
			connectionLayer.setClippingStrategy(new ViewportAwareConnectionLayerClippingStrategy(connectionLayer));
		}
	}

	@Override
	public void dispose() {
		 validationJob.cancel();
		 getEditingDomain().removeResourceSetListener(validationListener);
		getEditingDomain().removeResourceSetListener(domainAdapter);
		domainAdapter.dispose();
		IFileEditorInput editorInput = (IFileEditorInput) getEditorInput();
		try {
			// Touch the file for revalidation, when the user did not save
			// the changes
			if (editorInput.getFile() != null && editorInput.getFile().exists()) {
				editorInput.getFile().touch(new NullProgressMonitor());
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		super.dispose();
	}

}
