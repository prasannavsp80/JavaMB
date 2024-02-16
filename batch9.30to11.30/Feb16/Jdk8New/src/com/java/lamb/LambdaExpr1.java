package com.java.lamb;

@FunctionalInterface
interface IHello {
	void sayHello();
}

public class LambdaExpr1 {
	public static void main(String[] args) {
		IHello obj1 = () -> System.out.println("Welcome to Lambda Expression...");
		IHello obj2 = () -> System.out.println("From Moring 7 to 9 Batch...");
		IHello obj3 = () -> System.out.println("Trainer Prasanna...");
		
		obj1.sayHello();
		obj2.sayHello();
		obj3.sayHello();
	}
}
