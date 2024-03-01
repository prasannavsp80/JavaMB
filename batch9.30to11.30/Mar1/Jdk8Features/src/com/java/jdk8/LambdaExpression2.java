package com.java.jdk8;

@FunctionalInterface
interface ICalculation {
	int calc(int a, int b);
	default void trainer() {
		System.out.println("Trainer is Prasanna Pappu...");
	}
//	int test();
}

public class LambdaExpression2 {
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
		
		ICalculation obj4 = (a, b) -> {
			if (a > b) {
				return a;
			} else {
				return b;
			}
		};
		System.out.println("Sum is  " +obj1.calc(12, 5));
		System.out.println("Sub is  " +obj2.calc(12, 5));
		System.out.println("Mult is  " +obj3.calc(12, 5));
		System.out.println("Max " +obj4.calc(12, 5));
	}
}
