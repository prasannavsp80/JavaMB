package com.java.gen;

public class Data<T> {

	public void swap(T a, T b) {
		T t;
		t = a;
		a = b;
		b = t;
		System.out.println("A value is  " +a+ " B value is  " +b);
	}
}
