package com.java.jdk8;

import java.util.List;

public class StudentDao {
	
	public Student searchById(List<Student> studentList, int sid) {
		Student studentFound = null;
		for (Student student : studentList) {
			if (student.getSid() == sid) {
				studentFound = student;
				break;
			}
		}
		return studentFound;
	}	
}
