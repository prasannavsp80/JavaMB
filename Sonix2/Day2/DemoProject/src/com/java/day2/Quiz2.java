package com.java.day2;

public class Quiz2 {

	int n;
	public static void main(String[] args) {
		Quiz2 obj1 = new Quiz2();
		obj1.n = 12;
		Quiz2 obj2 = obj1;
		obj2.n = 13;
		System.out.println(obj1.n);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
