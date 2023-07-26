package com.java.day1;

public class ArrayDemo1 {

	public void show() {
		int[] a = new int[] {42,11,54,12,231};
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ArrayDemo1 obj = new ArrayDemo1();
		obj.show();
	}
}
