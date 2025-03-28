package com.bandeira.corts.entitys.enums;

public enum Status {

	OPEN("Open"), CLOSED("Closed"), CANCELED("Canceled");

	private String description;

	Status(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
