package com.java.day1;

public class Demo4 {

	public static void main(String[] args) {
		int i = 10;
		int j = i++ + i-- + ++i + i++;
		// Memory (11) + 10  + 11 + 12
		// Actual (10) + 11 + 11 + 11
		System.out.println(j);
		System.out.println(i);
	}
}
