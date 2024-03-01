package com.shivam;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		Subject subject1 = new Subject("BTECH_101","Operating System",5);
		Subject subject2 = new Subject("BTECH_102","Data Base Management System",2);
		Subject subject3 = new Subject("BTECH_201","DSA",4);
		Subject subject4 = new Subject("BTECH_202","WebTechnology",3);
		
		ArrayList<Subject> firstSemesterList = new ArrayList();
		firstSemesterList.add(0,subject1);
		firstSemesterList.add(1,subject2);
		
		ArrayList<Subject> secondSemesterList = new ArrayList();
		secondSemesterList.add(0,subject3);
		secondSemesterList.add(1,subject4);
		
		Semester semester1 = new Semester("BTECH_01",firstSemesterList);
		
		Semester semester2 = new Semester("BTECH_02",secondSemesterList);
		
		Currency currency = new Currency(1000.00,"$");
		
		ArrayList<Semester> btechSemestersList = new ArrayList();
		btechSemestersList.add(0,semester1);
		btechSemestersList.add(1,semester2);
		Course course1 = new Course("Btech1","BTECH",currency,courseType.PROFESSIONAL,btechSemestersList );
	
		Student student1 = new Student("1","Aman garg","2024-2025");
		
		Student student2 = new Student("2","Harsh Chaudhary","2024-2025");
		
		Registration r1 = new Registration("1",student1,course1);
		
		Registration r2 = new Registration("2",student2,course1);
		
		
		
		
		
		
		
		
		
		
	}

}
