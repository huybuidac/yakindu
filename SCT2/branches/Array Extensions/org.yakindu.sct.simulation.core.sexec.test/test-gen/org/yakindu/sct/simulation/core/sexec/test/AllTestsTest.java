/**
 * Copyright (c) 2014 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of YAKINDU - initial API and implementation
 */
package org.yakindu.sct.simulation.core.sexec.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({AlwaysOncycleTest.class, AssignmentAsExpressionTest.class,
		BitExpressionsTest.class, BooleanExpressionsTest.class,
		ChoiceTest.class, CKeywordsTest.class, ConditionalExpressionTest.class,
		DeclarationsTest.class, DeepEntryTest.class, DeepHistoryTest.class,
		DynamicChoiceTest.class, EnterStateTest.class, EntryChoiceTest.class,
		EntryExitSelfTransitionTest.class, ExitOnSelfTransitionTest.class,
		ExitStateTest.class, FeatureCallsTest.class, GuardTest.class,
		GuardedEntryTest.class, GuardedExitTest.class,
		HistoryWithoutInitialStepTest.class, InEventLifeCycleTest.class,
		IntegerExpressionsTest.class, InternalEventLifeCycleTest.class,
		LocalReactionsTest.class, LogicalAndTestsTest.class,
		LogicalOrTestsTest.class, NamedInterfaceAccessTest.class,
		OutEventLifeCycleTest.class, ParenthesisTest.class,
		PriorityValuesTest.class, RaiseEventTest.class,
		SameNameDifferentRegionTest.class, ShallowHistoryTest.class,
		SimpleEventTest.class, StatechartLocalReactionsTest.class,
		SimpleHierachyTest.class, StateIsActiveTest.class,
		StaticChoiceTest.class, STextKeywordsInStatesAndRegionsTest.class,
		StringExpressionsTest.class, SyncForkTest.class, SyncJoinTest.class,
		TransitionWithoutConditionTest.class, ValuedEventsTest.class})
public class AllTestsTest {
}
