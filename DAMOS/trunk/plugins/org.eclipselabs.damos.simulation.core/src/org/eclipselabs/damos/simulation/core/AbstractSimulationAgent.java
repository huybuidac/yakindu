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

package org.eclipselabs.damos.simulation.core;

import org.eclipse.core.runtime.PlatformObject;
import org.eclipselabs.damos.dml.Component;
import org.eclipselabs.mscript.computation.engine.IComputationContext;

/**
 * @author Andreas Unger
 *
 */
public abstract class AbstractSimulationAgent extends PlatformObject implements ISimulationAgent {

	Component component;
	
	/**
	 * 
	 */
	public AbstractSimulationAgent(Component component) {
		this.component = component;
	}
	
	public Component getComponent() {
		return component;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.simulation.engine.ISimulationAgent#getTracePoints()
	 */
	public ISimulationTracePoint[] getTracePoints() {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.simulation.engine.ISimulationAgent#getVariationPoints()
	 */
	public ISimulationVariationPoint[] getVariationPoints() {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.simulation.engine.ISimulationAgent#getComputationContext()
	 */
	public IComputationContext getComputationContext() {
		return null;
	}

}
