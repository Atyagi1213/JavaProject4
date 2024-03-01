package com.shivam;

public class Student {
	private String enrollment_Number;
	private String name;
	private Address address;
	private String session;

	Student(String enrollment_Number,String name,String session){
		this.enrollment_Number = enrollment_Number;
		this.name = name;
		this.session = session;
	}

	public String toString() {
		return this.enrollment_Number+"|"+this.name+"|"+this.session;
	}
	
	public String getEnrollment_Number() {
		return enrollment_Number;
	}

	public void setEnrollment_Number(String enrollment_Number) {
		this.enrollment_Number = enrollment_Number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}
	
}
