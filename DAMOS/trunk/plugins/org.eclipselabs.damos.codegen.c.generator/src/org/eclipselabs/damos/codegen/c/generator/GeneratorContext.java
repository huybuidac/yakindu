/****************************************************************************
 * Copyright (c) 2008, 2011 Andreas Unger and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andreas Unger - initial API and implementation 
 ****************************************************************************/

package org.eclipselabs.damos.codegen.c.generator;

import org.eclipselabs.damos.codegen.c.cgenmodel.GenModel;

/**
 * @author Andreas Unger
 *
 */
public class GeneratorContext implements IGeneratorContext {

	private GenModel genModel;
	
	/**
	 * 
	 */
	public GeneratorContext(GenModel genModel) {
		this.genModel = genModel;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.codegen.c.generator.IGeneratorContext#getGenModel()
	 */
	public GenModel getGenModel() {
		return genModel;
	}

}
