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
public class EmbeddedRungeKuttaIntegrationData extends AdaptiveStepSizeIntegrationData {
	
	public double[] y;

	public double[] yTmps;

	public double[][] yDotKs;
	
	public double[] yDotTmp;
	
	/**
	 * 
	 */
	public EmbeddedRungeKuttaIntegrationData(IComponentSimulationObject simulationObject, int stageCount) {
		super(simulationObject);
		y = simulationObject.getStateVector();

		yTmps = new double[y.length];
		yDotKs = new double[stageCount][y.length];
		yDotTmp = new double[y.length];
	}

}
