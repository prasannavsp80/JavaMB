package com.java.day1;

public class BooleanExample1 {

	public void show(boolean status) {
		if (status==true) {
			System.out.println("Student is Present...");
		} else {
			System.out.println("Student is Absent...");
		}
	}
	public static void main(String[] args) {
		boolean status = true;
		BooleanExample1 obj = new BooleanExample1();
		obj.show(status);
	}
}
