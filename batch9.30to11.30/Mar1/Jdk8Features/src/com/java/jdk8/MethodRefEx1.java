package com.java.jdk8;

import java.util.Date;

@FunctionalInterface
interface IMethodRef {
	void show();
}

public class MethodRefEx1 {

	void greeting() {
		Date obj = new Date();
		int hr = obj.getHours();
		if (hr <=12) {
			System.out.println("Good Morning...");
		} else if (hr > 12 && hr < 16) {
			System.out.println("Good Afternoon...");
		} else {
			System.out.println("Good Evening...");
		}
	}
	
	public static void main(String[] args) {
		MethodRefEx1 obj = new MethodRefEx1();
		IMethodRef mr = obj::greeting;
		
//		IMethodRef obj1 = () -> {
//			Date objdate = new Date();
//			int hr = objdate.getHours();
//			if (hr <=12) {
//				System.out.println("Good Morning...");
//			} else if (hr > 12 && hr < 16) {
//				System.out.println("Good Afternoon...");
//			} else {
//				System.out.println("Good Evening...");
//			}
//		};
		
		mr.show();
	}
}
