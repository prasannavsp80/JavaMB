package com.java.day2;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] a = new int[] {12,45,22,55,22};
		int[] b = a;
		for (int i : b) {
			System.out.println(i);
		}
	}
}
