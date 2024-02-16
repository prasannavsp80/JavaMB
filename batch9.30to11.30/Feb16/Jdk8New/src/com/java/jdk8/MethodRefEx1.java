package com.java.jdk8;

import java.util.Date;

@FunctionalInterface 
interface IHello {
	void sayHello();
}

class HelloWorld {
	void greeting() {
		Date obj = new Date();
		int hr = obj.getHours();
		if (hr <= 12) {
			System.out.println("Good Morning...");
		} else if (hr > 12 && hr < 16) {
			System.out.println("Good Afternoon...");
		} else {
			System.out.println("Good Evening...");
		}
	}
}
public class MethodRefEx1 {
	public static void main(String[] args) {
		HelloWorld obj = new HelloWorld();
		IHello objHello = obj::greeting;
		objHello.sayHello();
	}
}
