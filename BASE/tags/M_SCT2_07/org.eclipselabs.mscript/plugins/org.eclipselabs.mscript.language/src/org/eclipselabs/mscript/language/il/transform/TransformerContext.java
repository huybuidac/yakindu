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

package org.eclipselabs.mscript.language.il.transform;

import org.eclipselabs.mscript.common.internal.util.Scope;
import org.eclipselabs.mscript.language.il.Compound;
import org.eclipselabs.mscript.language.il.VariableDeclaration;
import org.eclipselabs.mscript.language.interpreter.IStaticEvaluationContext;

/**
 * @author Andreas Unger
 *
 */
public class TransformerContext implements ITransformerContext {

	private IStaticEvaluationContext staticEvaluationContext;
	
	private TransformerScope scope = new TransformerScope(null);
	
	/**
	 * 
	 */
	public TransformerContext(IStaticEvaluationContext staticEvaluationContext) {
		this.staticEvaluationContext = staticEvaluationContext;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.language.il.transform.ITransformerContext#getStaticEvaluationContext()
	 */
	public IStaticEvaluationContext getStaticEvaluationContext() {
		return staticEvaluationContext;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.language.il.transform.IExpressionTransformerContext#enterScope()
	 */
	public void enterScope() {
		scope = new TransformerScope(scope);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.language.il.transform.IExpressionTransformerContext#leaveScope()
	 */
	public void leaveScope() {
		scope = scope.getOuterScope();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.language.il.transform.IExpressionTransformerContext#getCompound()
	 */
	public Compound getCompound() {
		return scope.getCompound();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.language.il.transform.IExpressionTransformerContext#setCompound(org.eclipselabs.mscript.language.il.Compound)
	 */
	public void setCompound(Compound compound) {
		scope.setCompound(compound);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.language.il.transform.IExpressionTransformerContext#getVariableDeclaration(java.lang.String)
	 */
	public VariableDeclaration getVariableDeclaration(String name) {
		return scope.findInEnclosingScopes(name);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.mscript.language.il.transform.IExpressionTransformerContext#addVariableDeclaration(org.eclipselabs.mscript.language.il.VariableDeclaration)
	 */
	public void addVariableDeclaration(VariableDeclaration variableDeclaration) {
		scope.add(variableDeclaration);
	}
	
	private static class TransformerScope extends Scope<TransformerScope, String, VariableDeclaration> {

		private Compound compound;
		
		/**
		 * 
		 */
		public TransformerScope(TransformerScope outerScope) {
			super(outerScope);
		}
		
		/* (non-Javadoc)
		 * @see org.eclipselabs.mscript.language.il.transform.IExpressionTransformerScope#getCompound()
		 */
		public Compound getCompound() {
			return compound;
		}
		
		/**
		 * @param compound the compound to set
		 */
		public void setCompound(Compound compound) {
			this.compound = compound;
		}
		
		/* (non-Javadoc)
		 * @see org.eclipselabs.mscript.language.il.transform.IExpressionTransformerScope#add(org.eclipselabs.mscript.language.il.VariableDeclaration)
		 */
		public void add(VariableDeclaration element) {
			super.add(element.getName(), element);
		}
		
	}

}
