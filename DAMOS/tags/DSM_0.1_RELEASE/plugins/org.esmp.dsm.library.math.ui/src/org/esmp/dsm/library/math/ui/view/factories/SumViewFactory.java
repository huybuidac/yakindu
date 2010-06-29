/****************************************************************************
 * Copyright (c) 2008, 2009 Andreas Unger and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andreas Unger - initial API and implementation 
 ****************************************************************************/

package org.esmp.dsm.library.math.ui.view.factories;

import java.util.List;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.PropertiesSetStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.esmp.dsm.diagram.ui.view.factories.BlockViewFactory;
import org.esmp.dsm.library.basic.ui.view.styles.MultiShapeBlockStyles;
import org.esmp.dsm.library.math.ui.figures.shapes.SumShapeType;
import org.esmp.dsm.library.math.ui.view.styles.SumStyles;

/**
 * @author Andreas Unger
 *
 */
public class SumViewFactory extends BlockViewFactory {

	@SuppressWarnings("unchecked")
	protected List createStyles(View view) {
		List styles = super.createStyles(view);

		PropertiesSetStyle shapeStyle = NotationFactory.eINSTANCE.createPropertiesSetStyle();
		shapeStyle.setName(MultiShapeBlockStyles.SHAPE_STYLE);
		shapeStyle.createProperty(MultiShapeBlockStyles.SHAPE_STYLE__SHAPE, EcorePackage.eINSTANCE.getEString(), SumShapeType.ROUND.name());
		styles.add(shapeStyle);
		
		PropertiesSetStyle inputPortsStyle = NotationFactory.eINSTANCE.createPropertiesSetStyle();
		inputPortsStyle.setName(SumStyles.INPUT_PORTS_STYLE);
		inputPortsStyle.createProperty(SumStyles.INPUT_PORTS_STYLE__ARRANGEMENT, EcorePackage.eINSTANCE.getEString(), "|oo");
		styles.add(inputPortsStyle);

		return styles;
	}

}
