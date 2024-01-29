package com.java.day1;

public class Demo3 {

	public static void main(String[] args) {
		int i=10;
		int j = i++ + i++ + i++ + ++i;
		// Memory (11) + (12) + (13)  + 14
		// Actual (10) + 11 + 12 + (14)
		System.out.println(j);
		System.out.println(i);
	}
}
