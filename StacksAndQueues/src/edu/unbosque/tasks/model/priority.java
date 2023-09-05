package edu.unbosque.tasks.model;

public enum priority {
	
	HIGH(1), MEDIUM(2), LOW(3);
	
	public int priority;

	priority(int i) {
		this.priority = i;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
}
