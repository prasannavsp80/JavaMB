package com.java.day1;

/**
 * Program to check the given number is positive or negative
 * @author Prasanna P
 * 
 */
public class PosNeg {

	public void check(int n) {
		if (n >= 0) {
			System.out.println("Positive Number...");
		} else {
			System.out.println("Negative Number...");
		}
	}
	
	public static void main(String[] args) {
		int x=-12;
		PosNeg obj = new PosNeg();
		obj.check(x);
	}
}
