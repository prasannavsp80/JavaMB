package com.java.spr;

import java.util.List;

public class Faculty {

	private String faculty;
	private List<Student> students;
	
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public void teaching() {
		System.out.println(("Faculty ")+faculty+" Sharing lunch with Students ");
		for (Student student : students) {
			student.display();
		}
	}

}
