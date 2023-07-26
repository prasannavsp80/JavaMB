package com.java.day1;

/**
 * program to displayy max. of 3 numbers
 * @author Prasanna P
 */

public class Max3 {
	
	public void check(int a, int b, int c) {
		int m=a;
		if (m < b) {
			m=b;
		}
		if (m < c) {
			m = c;
		}
		System.out.println("Max  " +m);
	}
	public static void main(String[] args) {
		int a, b, c;
		a = 5;
		b = 7;
		c = 3;
	}
	
}
