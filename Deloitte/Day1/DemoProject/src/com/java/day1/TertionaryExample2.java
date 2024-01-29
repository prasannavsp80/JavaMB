package com.java.day1;

import java.util.Scanner;

public class TertionaryExample2 {

	public void show(int a, int b, int c) {
		int m =(a > b ? (a > c ? a : c) : (b > c ? b : c));
		System.out.println("Maximum Value is  " +m);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter 3 Numbers  ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		TertionaryExample2 obj = new TertionaryExample2();
		obj.show(a, b, c);
	}
}
