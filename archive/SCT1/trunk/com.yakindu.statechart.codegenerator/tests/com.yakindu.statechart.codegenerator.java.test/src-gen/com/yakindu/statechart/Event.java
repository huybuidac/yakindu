package com.yakindu.statechart;

public abstract class Event {

	private String id;

	public Event(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
