/**
 * Copyright (c) 2011 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * 	committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.runtime.java;

import org.yakindu.sct.runtime.java.INotificationListener;

public interface ITimedStatemachine extends
		IStatemachine, INotificationListener {

	public void setTimerHandler(ITimerHandler timerHandler);

	public ITimerHandler getTimerHandler();
}
