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

package org.esmp.dsm.execution.datatype;

import java.util.List;

import org.esmp.dsm.semantic.blockdiagram.Block;

/**
 * @author Andreas Unger
 *
 */
public class InvalidDataTypeException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private List<Block> invalidBlocks;
	
	/**
	 * 
	 */
	public InvalidDataTypeException() {
	}
	
	/**
	 * 
	 */
	public InvalidDataTypeException(List<Block> invalidBlocks) {
		this.invalidBlocks = invalidBlocks;
	}
	
	/**
	 * @return the backlog
	 */
	public List<Block> getInvalidBlocks() {
		return invalidBlocks;
	}

}
