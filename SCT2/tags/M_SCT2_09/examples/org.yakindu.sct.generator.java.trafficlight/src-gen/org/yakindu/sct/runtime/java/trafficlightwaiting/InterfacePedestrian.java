/**
 * Copyright (c) 2011 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of YAKINDU - initial API and implementation
 */
package org.yakindu.sct.runtime.java.trafficlightwaiting;

public interface InterfacePedestrian {

	public boolean getVarRequest();
	public void setVarRequest(boolean value);
	public boolean getVarRed();
	public void setVarRed(boolean value);
	public boolean getVarGreen();
	public void setVarGreen(boolean value);
}
