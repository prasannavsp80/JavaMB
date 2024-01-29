package com.java.day1;

public class TertionaryExample1 {

	public void check(int x) {
		int y = (x > 5 ) ? 7 : 8;
		System.out.println("Y value is  " +y);
	}
	public static void main(String[] args) {
		int x = 6;
		TertionaryExample1 obj = new TertionaryExample1();
		obj.check(x);
	}
}
