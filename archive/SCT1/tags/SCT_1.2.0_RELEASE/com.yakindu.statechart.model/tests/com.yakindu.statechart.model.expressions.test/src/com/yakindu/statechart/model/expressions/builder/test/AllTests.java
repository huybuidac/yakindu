/**
 * Copyright (c) 2010 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of YAKINDU - initial API and implementation
 */
package com.yakindu.statechart.model.expressions.builder.test;

import junit.framework.Test;
import junit.framework.TestSuite;

//import org.junit.runner.RunWith;
//import org.junit.runners.Suite;
//import org.junit.runners.Suite.SuiteClasses;

/**
@RunWith(value=Suite.class)
@SuiteClasses(value={
		BuilderTest.class
		}) */
public class AllTests extends TestSuite {
	
	public static Test suite() {
		TestSuite suite = new AllTests();
			suite.addTestSuite(BuilderTest.class);
			
		return suite;
	}

}
