package org.yakindu.sct.ui.editor.propertysheets;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;

import de.itemis.gmf.runtime.commons.properties.GenericFormBasedPropertySection;
import de.itemis.gmf.runtime.commons.properties.descriptors.XtextPropertyDescriptor;
import de.itemis.xtext.utils.jface.viewers.util.ActiveEditorResolver;

/**
 * 
 * @author andreas muelder
 * 
 */
public abstract class AbstractEditorPropertySection extends
		GenericFormBasedPropertySection {
	/**
	 * returns the resource that is active in the current editor, this is used
	 * for the {@link XtextPropertyDescriptor}s context resource to enable
	 * scoping to elements outside the text block
	 */
	protected Resource getActiveEditorResource() {
		ActiveEditorResolver activeEditorResolver = new ActiveEditorResolver();
		Display.getDefault().syncExec(activeEditorResolver);
		IEditorPart editor = activeEditorResolver.getResult();

		EditingDomain domain = null;
		if (editor instanceof IEditingDomainProvider) {
			domain = ((IEditingDomainProvider) editor).getEditingDomain();
		} else if (editor.getAdapter(IEditingDomainProvider.class) != null) {
			domain = ((IEditingDomainProvider) editor
					.getAdapter(IEditingDomainProvider.class))
					.getEditingDomain();
		} else if (editor.getAdapter(EditingDomain.class) != null) {
			domain = (EditingDomain) editor.getAdapter(EditingDomain.class);
		}
		if (domain == null) {
			return null;
		}

		EList<Resource> resources = domain.getResourceSet().getResources();
		if (resources.size() != 1) {
			throw new IllegalStateException(
					"Different resources in resource set , don't know which to use...");
		}
		return resources.get(0);

	}
}
