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

package org.eclipselabs.damos.diagram.ui.internal.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.ResizableCompartmentViewFactory;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipselabs.damos.diagram.ui.internal.view.factories.CompoundConnectorViewFactory;
import org.eclipselabs.damos.diagram.ui.internal.view.factories.CompoundViewFactory;
import org.eclipselabs.damos.diagram.ui.view.ISemanticHints;
import org.eclipselabs.damos.diagram.ui.view.factories.BlockDiagramViewFactory;
import org.eclipselabs.damos.diagram.ui.view.factories.ComponentNameViewFactory;
import org.eclipselabs.damos.diagram.ui.view.factories.ComponentViewFactory;
import org.eclipselabs.damos.diagram.ui.view.factories.ConnectionViewFactory;
import org.eclipselabs.damos.diagram.ui.view.factories.PortViewFactory;
import org.eclipselabs.damos.dml.Block;
import org.eclipselabs.damos.dml.BlockInput;
import org.eclipselabs.damos.dml.BlockInputPort;
import org.eclipselabs.damos.dml.BlockOutput;
import org.eclipselabs.damos.dml.BlockOutputPort;
import org.eclipselabs.damos.dml.BlockType;
import org.eclipselabs.damos.dml.DMLPackage;
import org.eclipselabs.damos.dml.Input;
import org.eclipselabs.damos.dml.InputPort;
import org.eclipselabs.damos.dml.Output;
import org.eclipselabs.damos.dml.OutputPort;

public class ViewProvider extends AbstractViewProvider {
	
	private ViewProviderDelegate delegate = new ViewProviderDelegate();

	protected Class<?> getDiagramViewClass(IAdaptable semanticAdapter, String diagramKind) {
		if (DMLPackage.Literals.SYSTEM.isSuperTypeOf(getSemanticEClass(semanticAdapter))) {
			return BlockDiagramViewFactory.class;
		}
		return super.getDiagramViewClass(semanticAdapter, diagramKind);
	}
	
	protected Class<?> getNodeViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		EClass eClass = getSemanticEClass(semanticAdapter);
		
		if (DMLPackage.Literals.INPUT_PORT.isSuperTypeOf(eClass)) {
			if (DMLPackage.Literals.BLOCK_INPUT_PORT.isSuperTypeOf(eClass)) {
				EObject element = getSemanticElement(semanticAdapter);
				if (element instanceof BlockInputPort) {
					Class<?> clazz = null;
					Input input = ((InputPort) element).getInput();
					if (input instanceof BlockInput) {
						BlockInput blockInput = (BlockInput) input;
						if (input.getComponent() instanceof Block) {
							Block block = (Block) input.getComponent();
							clazz = delegate.getInputClass(block.getType().getQualifiedName(), blockInput.getDefinition().getName());
						}
					}
					if (clazz != null) {
						return clazz;
					}
				}
			}
			return PortViewFactory.class;
		}
		
		
		if (DMLPackage.Literals.OUTPUT_PORT.isSuperTypeOf(eClass)) {
			if (DMLPackage.Literals.BLOCK_OUTPUT_PORT.isSuperTypeOf(eClass)) {
				EObject element = getSemanticElement(semanticAdapter);
				if (element instanceof BlockOutputPort) {
					Class<?> clazz = null;
					Output output = ((OutputPort) element).getOutput();
					if (output instanceof BlockOutput) {
						BlockOutput blockOutput = (BlockOutput) output;
						if (output.getComponent() instanceof Block) {
							Block block = (Block) output.getComponent();
							clazz = delegate.getOutputClass(block.getType().getQualifiedName(), blockOutput.getDefinition().getName());
						}
					}
					if (clazz != null) {
						return clazz;
					}
				}
			}
			return PortViewFactory.class;
		}

		if (DMLPackage.Literals.COMPONENT.isSuperTypeOf(eClass)) {
			if (ISemanticHints.COMPONENT_NAME.equals(semanticHint)) {
				return ComponentNameViewFactory.class;
			}
			if (DMLPackage.Literals.BLOCK.isSuperTypeOf(eClass)) {
				CreateElementRequest request = (CreateElementRequest) semanticAdapter.getAdapter(CreateElementRequest.class);
				if (request != null) {
					BlockType blockType = (BlockType) request.getParameters().get(BlockType.class);
					if (blockType != null) {
						if (semanticHint != null && semanticHint.length() != 0) {
							Class<?> clazz = delegate.getContentClass(blockType.getQualifiedName(), semanticHint);
							if (clazz != null) {
								return clazz;
							}
						} else {
							Class<?> clazz = delegate.getClazz(blockType.getQualifiedName());
							if (clazz != null) {
								return clazz;
							}
						}
					}
				}
			}
			return ComponentViewFactory.class;
		}
		
		if (DMLPackage.eINSTANCE.getCompound().isSuperTypeOf(eClass)) {
			if (ISemanticHints.COMPOUND_COMPARTMENT.equals(semanticHint)) {
				return ResizableCompartmentViewFactory.class;
			}
			return CompoundViewFactory.class;
		}
		
		if (DMLPackage.eINSTANCE.getCompoundConnector().isSuperTypeOf(eClass)) {
			return CompoundConnectorViewFactory.class;
		}
		
		return super.getNodeViewClass(semanticAdapter, containerView, semanticHint);
	}
	
	protected Class<?> getEdgeViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		if (DMLPackage.Literals.CONNECTION.isSuperTypeOf(getSemanticEClass(semanticAdapter))) {
			return ConnectionViewFactory.class;
		}
		return super.getEdgeViewClass(semanticAdapter, containerView, semanticHint);
	}
	
}
