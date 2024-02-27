package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {

	public static void main(String[] args) {
		List studentList = new ArrayList();
		studentList.add(new Student(1, "Padmanjali", "Hyderabad", 9.2));
		studentList.add(new Student(2, "Rajesh", "Chennai", 8.9));
		studentList.add(new Student(3, "Ramanaji", "Bangalore", 9.1));
		studentList.add(new Student(4, "Nanaji", "Vizag", 9.8));
		studentList.add(new Student(5, "Naveen", "Hyderabad", 8.7));
		
		for (Object object : studentList) {
			Student student = (Student)object;
			System.out.println(student);
		}
	}
}
