package com.java.day2;

public class BoxDemo {

	public static void main(String[] args) {
		int x=12;
		double b=12.5;
		String str="Hello";
		
		// Implementing Boxing 
		
		Object ob1 = x;
		Object ob2= b;
		Object ob3 = str;
		
		// Implementing Unboxing 
		int x1 = (Integer)ob1;
		double y1 = (Double)ob2;
		String s1 =(String)ob3;
		
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(s1);
	}
}
