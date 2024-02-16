package com.java.jdk8;

@FunctionalInterface 
interface ICalculation {
	int calc(int a, int b);
}


public class MethodRefEx2 {
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mult(int a, int b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		MethodRefEx2 obj = new MethodRefEx2();
		ICalculation c1 = obj::sum;
		System.out.println("Sum is  " +c1.calc(12, 5));
		c1 = obj::sub;
		System.out.println("Sub is  " +c1.calc(12, 5));
		c1 = obj::mult;
		System.out.println("Mult is  " +c1.calc(12, 5));
	}
}
