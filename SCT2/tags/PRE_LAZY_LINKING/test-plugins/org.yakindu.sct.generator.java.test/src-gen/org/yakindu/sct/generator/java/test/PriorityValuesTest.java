/**
 * Copyright (c) 2012 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of YAKINDU - initial API and implementation
 */
package org.yakindu.sct.generator.java.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.yakindu.scr.priorityvalues.PriorityValuesStatemachine;
import org.yakindu.scr.priorityvalues.PriorityValuesStatemachine.State;
/**
 *  Unit TestCase for PriorityValues
 */
@SuppressWarnings("all")
public class PriorityValuesTest {

	private PriorityValuesStatemachine statemachine;

	@Before
	public void setUp() {
		statemachine = new PriorityValuesStatemachine();
		statemachine.init();
		statemachine.enter();
	}

	@After
	public void tearDown() {
		statemachine = null;
	}

	@Test
	public void testtransitionPriority() {
		assertTrue(statemachine.isStateActive(State.Main_region_A));
		statemachine.raiseEvent1();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.Main_region_C));
	}
	@Test
	public void testregionPriority() {
		assertTrue(statemachine.isStateActive(State.SomeRegion_A));
		statemachine.raiseEvent2();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.SomeRegion_B));
		assertTrue(!statemachine.isStateActive(State.Main_region_E));
	}
}
