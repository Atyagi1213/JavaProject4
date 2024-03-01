package com.shivam;

import java.util.ArrayList;

public class Semester {
	private String id;
	private ArrayList<Subject> subjectList;
	public Semester(String id,ArrayList<Subject> subjectList) {
		this.id = id;
		this.subjectList = subjectList;
	}
}
