/**
 * Copyright (c) 2012 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.simulation.core.runtime.impl;

import org.yakindu.sct.simulation.core.runtime.IExecutionFacade;
import org.yakindu.sct.simulation.core.runtime.IExecutionFacadeController;
import org.yakindu.sct.simulation.core.runtime.timer.VirtualTimer;
import org.yakindu.sct.simulation.core.runtime.timer.VirtualTimer.VirtualTimerTask;

/**
 * Cycle based implementation of {@link IExecutionFacadeController}.
 * 
 * runCycle is called on {@link IExecutionFacade} periodically, depending on the
 * cyclePeriod value.
 * 
 * @author andreas muelder - Initial contribution and API
 * 
 */
public class CycleBasedExecutionFacadeController extends
		AbstractExecutionFacadeController {

	private VirtualTimer timer;

	private long cyclePeriod;
	
	//Hier 

	public CycleBasedExecutionFacadeController(IExecutionFacade facade,
			long cyclePeriod) {
		super(facade);
		this.cyclePeriod = cyclePeriod;
		timer = new VirtualTimer(facade.getExecutionContext().getVirtualClock());
	}

	protected void scheduleCycle() {
		if (!terminated && !suspended) {
			VirtualTimerTask virtualTimerTask = new VirtualTimerTask() {
				public void run() {
					facade.runCycle();
					scheduleCycle();
				}
			};
			timer.scheduleTask(virtualTimerTask, cyclePeriod);
		}
	}

	public void start() {
		super.start();
		scheduleCycle();
	}

	public void resume() {
		super.resume();
		scheduleCycle();
	}

	public void terminate() {
		super.terminate();
		timer.cancel();
	}

	public void step() {
		facade.runCycle();
	}

}
