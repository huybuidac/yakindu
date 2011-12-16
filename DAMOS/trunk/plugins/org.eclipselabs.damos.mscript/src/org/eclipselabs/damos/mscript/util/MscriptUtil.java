/****************************************************************************
 * Copyright (c) 2008, 2010 Andreas Unger and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andreas Unger - initial API and implementation 
 ****************************************************************************/

package org.eclipselabs.damos.mscript.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.damos.mscript.AdditiveOperator;
import org.eclipselabs.damos.mscript.AdditiveStepExpression;
import org.eclipselabs.damos.mscript.Compound;
import org.eclipselabs.damos.mscript.Declaration;
import org.eclipselabs.damos.mscript.FunctionDeclaration;
import org.eclipselabs.damos.mscript.LocalVariableDeclaration;
import org.eclipselabs.damos.mscript.Module;
import org.eclipselabs.damos.mscript.MscriptFactory;
import org.eclipselabs.damos.mscript.StepLiteral;
import org.eclipselabs.damos.mscript.VariableAccess;
import org.eclipselabs.damos.mscript.VariableDeclaration;
import org.eclipselabs.damos.mscript.interpreter.IStaticEvaluationContext;

/**
 * @author Andreas Unger
 *
 */
public class MscriptUtil {

	public static FunctionDeclaration getFunctionDefinition(Module module, String qualifiedName) {
		for (Declaration declaration : module.getDeclarations()) {
			if (declaration instanceof FunctionDeclaration) {
				FunctionDeclaration functionDeclaration = (FunctionDeclaration) declaration;
				if (qualifiedName.equals(functionDeclaration.getName())) {
					return functionDeclaration;
				}
			}
		}
		return null;
	}
	
	public static VariableAccess createVariableAccess(IStaticEvaluationContext context, VariableDeclaration variableDeclaration, int stepIndex, boolean initial) {
		VariableAccess variableAccess = MscriptFactory.eINSTANCE.createVariableAccess();
		variableAccess.setFeature(variableDeclaration);
		if (initial) {
			StepLiteral stepLiteral = MscriptFactory.eINSTANCE.createStepLiteral();
			stepLiteral.setValue(stepIndex);
			variableAccess.setStepExpression(stepLiteral);
		} else {
			AdditiveStepExpression stepExpression = MscriptFactory.eINSTANCE.createAdditiveStepExpression();
			stepExpression.setLeftOperand(MscriptFactory.eINSTANCE.createStepN());
			if (stepIndex < 0) {
				stepExpression.setOperator(AdditiveOperator.SUBTRACT);
			} else {
				stepExpression.setOperator(AdditiveOperator.ADD);
			}
			StepLiteral stepLiteral = MscriptFactory.eINSTANCE.createStepLiteral();
			stepLiteral.setValue(Math.abs(stepIndex));
			stepExpression.setRightOperand(stepLiteral);
			variableAccess.setStepExpression(stepLiteral);
		}
		context.setStepIndex(variableAccess, stepIndex);
		return variableAccess;
	}
	
	public static String findAvailableLocalVariableName(Compound compound, String preferredName) {
		String name = preferredName;
		int i = 2;
		while (!isLocalVariableNameAvailable(compound, name)) {
			name = preferredName + i++;
		}
		return name;
	}
	
	private static boolean isLocalVariableNameAvailable(Compound compound, String name) {
		EObject container = compound;
		while (container != null) {
			if (container instanceof Compound) {
				for (LocalVariableDeclaration localVariableDeclaration : ((Compound) container).getLocalVariableDeclarations()) {
					if (name.equals(localVariableDeclaration.getName())) {
						return false;
					}
				}
			}
			container = container.eContainer();
		}
		return true;
	}
	
}
