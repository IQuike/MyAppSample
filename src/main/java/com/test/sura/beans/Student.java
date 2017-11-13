package com.test.sura.beans;

public class Student {
	private String name;
	
	private String lastName;
	
	public void Student(String name, String LastName) {

	this.name=name;
	this.lastName=lastName;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}

