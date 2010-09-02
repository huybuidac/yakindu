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

package org.eclipselabs.damos.library.base.sources.policies;

import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.damos.dml.Block;
import org.eclipselabs.damos.dml.InputPort;
import org.eclipselabs.damos.evaluation.IEvaluationContext;
import org.eclipselabs.damos.evaluation.componentsignature.AbstractBlockSignaturePolicy;
import org.eclipselabs.damos.evaluation.componentsignature.ComponentSignature;
import org.eclipselabs.damos.evaluation.componentsignature.ComponentSignatureEvaluationResult;
import org.eclipselabs.damos.evaluation.componentsignature.IComponentSignatureEvaluationResult;
import org.eclipselabs.damos.evaluation.util.EvaluationUtil;
import org.eclipselabs.damos.library.base.LibraryBasePlugin;
import org.eclipselabs.damos.library.base.sources.util.SineWaveConstants;
import org.eclipselabs.damos.typesystem.DataType;
import org.eclipselabs.damos.typesystem.NumericalType;
import org.eclipselabs.damos.typesystem.RealType;
import org.eclipselabs.damos.typesystem.TypeSystemFactory;
import org.eclipselabs.damos.typesystem.Unit;
import org.eclipselabs.damos.typesystem.UnitSymbol;
import org.eclipselabs.damos.typesystem.util.TypeSystemUtil;

/**
 * @author Andreas Unger
 *
 */
public class SineWaveSignaturePolicy extends AbstractBlockSignaturePolicy {
	
	public IComponentSignatureEvaluationResult evaluateSignature(IEvaluationContext context, Block block, Map<InputPort, DataType> incomingDataTypes) {
		MultiStatus status = new MultiStatus(LibraryBasePlugin.PLUGIN_ID, 0, "", null);
		
		NumericalType amplitudeDataType = null;
		try {
			amplitudeDataType = EvaluationUtil.evaluateArgumentNumericalType(context, block, SineWaveConstants.PARAMETER__AMPLITUDE);
		} catch (CoreException e) {
			status.add(e.getStatus());
		}
		
		NumericalType biasDataType = null;
		try {
			biasDataType = EvaluationUtil.evaluateArgumentNumericalType(context, block, SineWaveConstants.PARAMETER__BIAS);
		} catch (CoreException e) {
			status.add(e.getStatus());
		}
		
		NumericalType frequencyDataType = null;
		try {
			frequencyDataType = EvaluationUtil.evaluateArgumentNumericalType(context, block, SineWaveConstants.PARAMETER__FREQUENCY);
		} catch (CoreException e) {
			status.add(e.getStatus());
		}
		
		NumericalType phaseDataType = null;
		try {
			phaseDataType = EvaluationUtil.evaluateArgumentNumericalType(context, block, SineWaveConstants.PARAMETER__PHASE);
		} catch (CoreException e) {
			status.add(e.getStatus());
		}

		if (amplitudeDataType == null || biasDataType == null || frequencyDataType == null || phaseDataType == null) {
			return new ComponentSignatureEvaluationResult(status);
		}

		if (!EcoreUtil.equals(amplitudeDataType.getUnit(), biasDataType.getUnit())) {
			status.add(new Status(IStatus.ERROR, LibraryBasePlugin.PLUGIN_ID, "Amplitude and Bias must have same unit"));
		}
		
		if (frequencyDataType.isSetUnit() 
				&& !frequencyDataType.getUnit().isSameAs(TypeSystemUtil.createUnit().divide(TypeSystemUtil.createUnit(UnitSymbol.SECOND)), true)) {
			status.add(new Status(IStatus.ERROR, LibraryBasePlugin.PLUGIN_ID, "Frequency unit must be 1/s"));
		}

		if (phaseDataType.isSetUnit() 
				&& !phaseDataType.getUnit().isSameAs(TypeSystemUtil.createUnit(), true)) {
			status.add(new Status(IStatus.ERROR, LibraryBasePlugin.PLUGIN_ID, "Phase unit must be dimensionless"));
		}

		if (!status.isOK()) {
			return new ComponentSignatureEvaluationResult(status);
		}
		
		Unit unit = amplitudeDataType.getUnit();
		ComponentSignature signature = new ComponentSignature();

		NumericalType outputDataType;
		if (amplitudeDataType instanceof RealType || biasDataType instanceof RealType) {
			outputDataType = TypeSystemFactory.eINSTANCE.createRealType();
		} else {
			outputDataType = TypeSystemFactory.eINSTANCE.createIntegerType();
		}
		outputDataType.setUnit((Unit) EcoreUtil.copy(unit));
		signature.getOutputDataTypes().put(block.getFirstOutputPort(), outputDataType);
		
		return new ComponentSignatureEvaluationResult(signature);
	}

}
