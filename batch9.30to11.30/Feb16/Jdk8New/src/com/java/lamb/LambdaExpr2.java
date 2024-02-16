package com.java.lamb;

interface ICalc{
	int calculation(int a, int b);
}

public class LambdaExpr2 {
	public static void main(String[] args) {
		ICalc obj1 = (a, b) -> {
			return a + b;
		};
		
		ICalc obj2 = (a, b) -> {
			return a - b;
		};
		
		ICalc obj3 = (a, b) -> {
			return a * b;
		};
		System.out.println("Sum is  " +obj1.calculation(12, 5));
		System.out.println("Sub is  " +obj2.calculation(12, 5));
		System.out.println("Mult is  " +obj3.calculation(12, 5));
	}
}
