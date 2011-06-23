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

package org.eclipselabs.damos.library.base.simulation.sources;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipselabs.damos.execution.engine.util.ExpressionUtil;
import org.eclipselabs.damos.library.base.sources.util.StepConstants;
import org.eclipselabs.damos.simulation.core.ISimulationMonitor;
import org.eclipselabs.damos.simulation.engine.AbstractBlockSimulationObject;
import org.eclipselabs.mscript.computation.engine.value.IValue;
import org.eclipselabs.mscript.computation.engine.value.ValueTransformer;

/**
 * @author Andreas Unger
 *
 */
public class StepSimulationObject extends AbstractBlockSimulationObject {

	private IValue initialValue;
	private IValue finalValue;
	private double stepTime;
	
	private IValue outputValue;

	@Override
	public void initialize(IProgressMonitor monitor) throws CoreException {
		initialValue = ExpressionUtil.evaluateSimpleNumericArgument(getComponent(), StepConstants.PARAMETER__INITIAL_VALUE);
		finalValue = ExpressionUtil.evaluateSimpleNumericArgument(getComponent(), StepConstants.PARAMETER__FINAL_VALUE);
		stepTime = ExpressionUtil.evaluateSimpleNumericArgument(getComponent(), StepConstants.PARAMETER__STEP_TIME).doubleValue();

		ValueTransformer valueTransformer = new ValueTransformer();
		
		initialValue = valueTransformer.transform(getComputationContext(), initialValue);
		finalValue = valueTransformer.transform(getComputationContext(), finalValue);
	}
	
	@Override
	public IValue getOutputValue(int outputIndex, int portIndex) {
		return outputValue;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.simulation.engine.AbstractComponentSimulationObject#computeOutputValues()
	 */
	@Override
	public void computeOutputValues(double t, ISimulationMonitor monitor) throws CoreException {
		outputValue = t < stepTime ? initialValue : finalValue;
	}

	/* (non-Javadoc)
	 * @see org.eclipselabs.damos.simulation.engine.AbstractComponentSimulationObject#getZeroCrossingTime(double)
	 */
	@Override
	public double computeZeroCrossingTime(double t) {
		return stepTime;
	}
	
}
