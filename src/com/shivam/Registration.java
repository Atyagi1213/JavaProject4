package com.shivam;

public class Registration {
	private String registrationNumber;
	private Student student;
	private Course course;
	public Registration(String registrationNumber, Student student, Course course) {
		super();
		this.registrationNumber = registrationNumber;
		this.student = student;
		this.course = course;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
}
