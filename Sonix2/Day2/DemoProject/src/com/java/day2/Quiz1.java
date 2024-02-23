package com.java.day2;

public class Quiz1 {

	public static void main(String[] args) {
		int[] a = new int[] {23, 43, 33, 12, 46};
		int[] b = a;
		b[2]=9;
		System.out.println(a[2] + " " +b[2]);
	}
}
