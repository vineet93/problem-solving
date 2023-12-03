package com.vineet.interview;

public class Student implements Comparable<Student> {
	
	private int id;
	private String firstName;
	private String lastname;
	
	Student(int id,String fname, String lname) {
		this.id=id;
		this.firstName=fname;
		this.lastname=lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public int compareTo(Student obj) {
		return this.firstName.compareTo(obj.firstName);
		
	}

}
