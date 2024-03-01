package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class OptionalStudent {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "Sanghavi", 9.2));
		studentList.add(new Student(2, "Padma", 8.9));
		studentList.add(new Student(3, "Satish", 7.8));
		studentList.add(new Student(4, "Karthik", 9.6));
		StudentDao dao = new StudentDao();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id  ");
		int sid = sc.nextInt();
		Optional<Student> result = Optional.ofNullable(dao.searchById(studentList, sid));
		if (result.isPresent()) {
			System.out.println(result.get());
		} else {
			System.out.println("Student Record Not Found...");
		}
	}
}
