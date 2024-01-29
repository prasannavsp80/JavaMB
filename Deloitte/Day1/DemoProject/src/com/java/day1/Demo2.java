package com.java.day1;

public class Demo2 {

	public static void main(String[] args) {
		int i = 10;
		int j = i++ + ++i + i++;
		// Memory (11) + 12 + 13
		// Actual (10) + 12 + 12
		System.out.println(j);
		System.out.println(i);
	}
}
