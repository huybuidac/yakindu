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
import org.yakindu.scr.simplehierachy.SimpleHierachyStatemachine;
import org.yakindu.scr.simplehierachy.SimpleHierachyStatemachine.State;
/**
 *  Unit TestCase for SimpleHierachy
 */
@SuppressWarnings("all")
public class SimpleHietachyTest {

	private SimpleHierachyStatemachine statemachine;

	@Before
	public void setUp() {
		statemachine = new SimpleHierachyStatemachine();
		statemachine.init();
		statemachine.enter();
	}

	@After
	public void tearDown() {
		statemachine = null;
	}

	@Test
	public void testsimpleHierachyTest() {
		assertTrue(statemachine.isStateActive(State.Main_region_A));
		statemachine.raiseEvent1();
		statemachine.raiseEvent1();
		statemachine.raiseEvent1();
		statemachine.runCycle();
		assertTrue(statemachine.isStateActive(State.Main_region_B));
		assertTrue(statemachine
				.isStateActive(State.Main_region_B_subregion1_B1));
	}
}
