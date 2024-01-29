package com.java.day1;

public class Test {

	public void greeting() {
		System.out.println("Good Morning to All...");
	}
	
	public void trainer() {
		System.out.println("Trainer is Mr. Prasanna");
	}
	
	public void company() {
		System.out.println("Company is Deloitte...");
	}
	
	public static void main(String[] args) {
		Test obj = new Test();
		obj.greeting();
		obj.trainer();
		obj.company();
	}
}
