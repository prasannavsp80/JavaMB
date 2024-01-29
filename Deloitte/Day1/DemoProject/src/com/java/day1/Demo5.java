package com.java.day1;

public class Demo5 {

	public static void main(String[] args) {
		int i = 10;
		int j = i++ + i++ - i-- + ++i + --i;
		// Memory (11) + 12 - 11 + 12 + 11
		// Actual (10) + 11 - 12 + 12 + 11
		System.out.println(j);
		System.out.println(i);
	}
}
