package com.java.day1;

import java.util.Scanner;

public class CtoF {

	public void calc(double c) {
		double f = ((9*c)/5) + 32;
		System.out.println("Fahrenheit Value  " +f);
	}
	public static void main(String[] args) {
		double c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Celsius Value  ");
		c = sc.nextDouble();
		CtoF obj = new CtoF();
		obj.calc(c);
	}
}
