package com.yakindu.statechart;

/**
 * Representation of a Pseudostate.
 */
public class Pseudostate extends Node {

	PseudostateKind kind;

	public Pseudostate(String id, Region owningRegion, PseudostateKind kind) {
		super(id, owningRegion);
		this.kind = kind;
	}

	public PseudostateKind getKind() {
		return kind;
	}

	protected void enter() {

		// defensive code, check that there is one outgoing transition that can be taken	
		if (kind == PseudostateKind.CHOICE) {
			assertEnabledOutgoingTransitionExists();
		}

		if (kind == PseudostateKind.INITIAL) {
			// go directly into the next state (special transition needs no
			// event
			outgoingTransitions.get(0).take();
		} else if (kind == PseudostateKind.SHALLOWHISTORY
				|| kind == PseudostateKind.DEEPHISTORY) {
			// if this is the first time we enter this state, prolong the
			// default transition, else reenter the region
			if (owningRegion.getCurrentState() == null) {
				outgoingTransitions.get(0).take();
			} else {
				owningRegion.reenter(kind == PseudostateKind.SHALLOWHISTORY
						? HistoryMode.SHALLOW
						: HistoryMode.DEEP);
			}
		} else if (kind == PseudostateKind.CHOICE) {
			// choose the first outgoing transition that can be taken and take it
			getEnabledOutgoingTransitionOfHighestPriority().take();
		} else if (kind == PseudostateKind.JUNCTION) {
			// just take the single outgoing transition to the next state
			outgoingTransitions.get(0).take();
		} else {
			throw new IllegalArgumentException("UNSUPPORTED Pseudostate Kind");
		}

	}

	protected void leave() {

		// do nothing by default

	}

	private void assertEnabledOutgoingTransitionExists() {
		// choose the first outgoing transition that can be taken and take it
		if (getEnabledOutgoingTransitionOfHighestPriority() == null) {
			throw new IllegalStateException(
					"At least one outgoing transition must be enabled.");
		}
	}

}
