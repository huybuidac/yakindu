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
package org.yakindu.sct.ui.editor.propertysheets;

import java.util.Collections;
import java.util.List;

import org.yakindu.sct.model.sgraph.SGraphPackage;
import org.yakindu.sct.ui.editor.editparts.TransitionEditPart;
import org.yakindu.sct.ui.editor.utils.IYakinduSctHelpContextIds;

import de.itemis.gmf.runtime.commons.properties.descriptors.IFormPropertyDescriptor;
import de.itemis.gmf.runtime.commons.properties.descriptors.XtextPropertyDescriptor;
import de.itemis.xtext.utils.jface.viewers.context.CloningBasedFakeContextResourcesProvider;

/**
 * Property Section for {@link TransitionEditPart}s. Consists of a
 * {@link XtextPropertyDescriptor} for the expression.
 * 
 * @author andreas muelder
 * 
 */
public class TransitionPropertySection extends AbstractEditorPropertySection {

	@Override
	protected void createPropertyDescriptors(
			List<IFormPropertyDescriptor> descriptors) {
		XtextPropertyDescriptor expressionsDescriptor = new XtextPropertyDescriptor(
				SGraphPackage.Literals.EXPRESSION_ELEMENT__EXPRESSION,
				"Expression: ",
				IYakinduSctHelpContextIds.SC_PROPERTIES_TRANSITION_EXPRESSION,
				getInjector(SGraphPackage.Literals.TRANSITION),
				new CloningBasedFakeContextResourcesProvider(
						Collections.singletonList(getActiveEditorResource())));
		descriptors.add(expressionsDescriptor);
	}
}
