package com.yakindu.statechart;

import java.util.Set;

/**
 * Representation of a state (i.e. abstract base class for CompoundState, SimpleState,
 * and FinalState). A state has the unique property, that the system may be "in"
 * it, i.e. the state will - if being entered - react to incoming events of its
 * Statechart until it has been left again (although FinalStates will not show any reaction). 
 * When being entered or left, a state may execute an Action, i.e. its entry or exit action 
 * respectively.
 */
public abstract class State extends Node {

	// marker to keep track if state was entered or not
	protected boolean entered = false;

	private Action entryAction;
	private Action exitAction;
	private String name;

	public State(String id, String name, Region owningRegion,
			Action entryAction, Action exitAction) {
		super(id, owningRegion);
		this.name = name;
		this.entryAction = entryAction;
		this.exitAction = exitAction;
	}

	public String getName() {
		return name;
	}

	protected AbstractStatechart getStatechart() {
		return owningRegion.getStatechart();
	}

	protected void enter() {

		assertInitialized();
		assertNotEntered();

		owningRegion.setCurrentState(this);

		// see if we have transitions that are time-triggered
		for (Transition transition : outgoingTransitions) {
			if (transition.isTimeTriggered()) {
				// register timer with timing service
				getStatechart().requestTimeEvent(transition.getTimeTrigger());
			}
		}

		// execute entry action
		if (entryAction != null) {
			entryAction.execute();
		}

		entered = true;

	}

	protected void reenter(HistoryMode history) {

		assertInitialized();
		assertNotEntered();

		enter();

		entered = true;

	}

	protected void reactOn(Set<Event> events) {

		assertInitialized();
		assertEntered();

		Transition transition = getEnabledOutgoingTransitionOfHighestPriority(events);
		if (transition != null) {
			// if there is an enabled transition, take it
			transition.take();
		} else {
			// otherwise this state might react to it (by executing a do action
			// or by delegating to nested regions)
			reactLocallyOn(events);
		}

	}

	private Transition getEnabledOutgoingTransitionOfHighestPriority(
			Set<Event> events) {

		for (Transition transition : outgoingTransitions /* sorted by priority */) {
			if (transition.isTriggeredBy(events) && transition.isEnabled()) {
				return transition;
			}
		}
		return null;

	}

	protected abstract void reactLocallyOn(Set<Event> events);

	protected void leave() {

		assertInitialized();
		assertEntered();

		// see if we have transitions that are time-triggered
		for (Transition transition : outgoingTransitions) {
			if (transition.isTimeTriggered()) {
				// cancel all time events that could have been requested
				getStatechart().cancelTimeEvent(transition.getTimeTrigger());
			}
		}

		if (exitAction != null) {
			exitAction.execute();
		}

		entered = false;

	}

	protected void assertEntered() {
		if (!entered) {
			throw new IllegalStateException("Region was not entered");
		}
	}

	protected void assertNotEntered() {
		if (entered) {
			throw new IllegalStateException("Region was already entered");
		}
	}

}
