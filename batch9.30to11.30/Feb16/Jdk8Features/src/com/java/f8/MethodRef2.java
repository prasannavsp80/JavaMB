package com.java.f8;

import java.util.Date;

@FunctionalInterface
interface IGreeting {
	void greetMe(String name);
}

class Demo2 {
	void salute(String name) {
		Date today = new Date();
		int hr = today.getHours();
		if (hr <= 12) {
			System.out.println("Good Morning..." +name+ " Have Great Day");
		} else if (hr > 12 && hr < 16) {
			System.out.println("Good Afternoon..." +name+ " Have Great Day");
		} else if (hr >= 16) {
			System.out.println("Good Evening..." +name+ " Have Nice Time");
		}
	}
}
public class MethodRef2 {
	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		IGreeting obj1 = obj::salute;
		obj1.greetMe("Kamal");
	}
}
