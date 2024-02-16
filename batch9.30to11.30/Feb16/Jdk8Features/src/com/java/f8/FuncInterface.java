package com.java.f8;

@FunctionalInterface
interface ICalc {
	int calc(int a, int b);
}

public class FuncInterface {
	public static void main(String[] args) {
		ICalc obj1 = (a, b) -> {
			return a+b;
		};
		
		ICalc obj2 = (a, b) -> {
			return a-b;
		};
		
		ICalc obj3 = (a, b) -> {
			return a * b;
		};
		System.out.println("Sum is  " +obj1.calc(12, 5));
		System.out.println("Sub is  " +obj1.calc(12, 5));
		System.out.println("Mult is  " +obj1.calc(12, 5));
	}
}
