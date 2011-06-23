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

package org.eclipselabs.damos.simulation.engine.solver;

import org.eclipselabs.damos.simulation.engine.IComponentSimulationObject;

/**
 * @author Andreas Unger
 *
 */
public class AdaptiveStepSizeIntegrationData extends AbstractIntegrationData {

	private double nextStepSize;

	/**
	 * 
	 */
	public AdaptiveStepSizeIntegrationData(IComponentSimulationObject simulationObject) {
		super(simulationObject);
	}
		
	public double getNextStepSize() {
		return nextStepSize;
	}

	public void setNextStepSize(double stepSize) {
		this.nextStepSize = stepSize;
	}

}
