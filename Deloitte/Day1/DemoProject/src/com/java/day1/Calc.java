package com.java.day1;

import java.util.Scanner;

public class Calc {

	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mult(int a, int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers  ");
		a = sc.nextInt();
		b = sc.nextInt();
		Calc obj = new Calc();
		int result = obj.sum(a, b);
		System.out.println("Sum is  " +result);
		result = obj.sub(a, b);
		System.out.println("Sub is  " +result);
		result = obj.mult(a, b);
		System.out.println("Mult is  " +result);
	}
}
