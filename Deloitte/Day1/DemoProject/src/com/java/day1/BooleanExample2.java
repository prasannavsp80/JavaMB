package com.java.day1;

import java.util.Scanner;

public class BooleanExample2 {
	
	public void show(boolean status) {
		if (status==true) {
			System.out.println("Student is Present...");
		} else {
			System.out.println("Student is Absent...");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean status;
		System.out.println("Enter Your Status  ");
		status = sc.nextBoolean();
		BooleanExample2 obj = new BooleanExample2();
		obj.show(status);
	}

}
