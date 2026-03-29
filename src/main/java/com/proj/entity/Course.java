package com.proj.entity;

public class Course {

	private int id;
	private String name;
	private String instructor;

	// Getter for id
	public int getId() {
		return id;
	}

	// Setter for id
	public void setId(int id) {
		this.id = id;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Setter for name
	public void setName(String name) {
		this.name = name;
	}

	// Getter for instructor
	public String getInstructor() {
		return instructor;
	}

	// Setter for instructor
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
}