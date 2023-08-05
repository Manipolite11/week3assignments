package org.student;

import org.college.College;

public class Student extends College {

	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("manikandan");

	}
	
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("mech");

	}
	
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("101");

	}
	public static void main(String[] args) {
		
		Student m = new Student();
		
		m.collegeCode();
		m.collegeName();
		m.depaName();
		m.studentDept();
		m.studentId();
		m.studentName();
		m.collegeRank();
		
		
		
	}
	
	
	
}
