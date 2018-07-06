package org.itglance.collectioncrud.model;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private String subject;

	public Student(int id, String firstName, String lastName, String address,
			String subject) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return firstName;
	}

	public String getLname() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getSubject() {
		return subject;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + firstName + ", lname="
				+ lastName + ", address=" + address + ", sub=" + subject + "]";
	}

}
