package com.java.ex;

public class Lamb2 {

	public static void main(String[] args) {
		
		ICalculation obj1 = (a, b) -> {
			return a + b;
		};
		
		ICalculation obj2 = (a, b) -> {
			return a - b;
		};
		
		ICalculation obj3 = (a, b) -> {
			return a * b;
		};
		
		System.out.println("Sum is  " +obj1.calc(12, 5));
		System.out.println("Sub is  " +obj2.calc(12, 5));
		System.out.println("Mult is  " +obj3.calc(12, 5));
	}
}
