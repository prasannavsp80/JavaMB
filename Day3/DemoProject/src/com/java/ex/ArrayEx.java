package com.java.ex;

public class ArrayEx {

	public static void main(String[] args) {
		int[] a = new int[] {12,5};
		try {
			a[10]=563;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size is small...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
