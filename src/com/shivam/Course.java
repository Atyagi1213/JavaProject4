package com.shivam;

import java.util.ArrayList;

enum courseType {
	TECHNICAL,
	PROFESSIONAL,
	NON_TECHNICAL
}



public class Course {
	private String id;
	private String name;
	private Currency fees;
	private courseType course;
	private ArrayList<Semester> semesterList;
	public Course(String id, String name, Currency fees, courseType course, ArrayList<Semester> semesterList) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.course = course;
		this.semesterList = semesterList;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Currency getFees() {
		return fees;
	}
	public void setFees(Currency fees) {
		this.fees = fees;
	}
	public courseType getCourse() {
		return course;
	}
	public void setCourse(courseType course) {
		this.course = course;
	}
	public ArrayList<Semester> getSemesterList() {
		return semesterList;
	}
	public void setSemesterList(ArrayList<Semester> semesterList) {
		this.semesterList = semesterList;
	}
	
	
	
}


