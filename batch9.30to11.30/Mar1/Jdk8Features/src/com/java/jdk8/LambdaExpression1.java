package com.java.jdk8;

interface IHello {
	void greeting();
}

public class LambdaExpression1 {
	public static void main(String[] args) {
		IHello obj1 = () -> {
			System.out.println("Good Morning to all...");
		};
		
		IHello obj2 = () -> {
			System.out.println("Welcome to Jdk 8 world...");
		};
		
		IHello obj3 = () -> {
			System.out.println("Jdk8 new features visiting...");
		};
		
		obj1.greeting();
		obj2.greeting();
		obj3.greeting();
	}
}
