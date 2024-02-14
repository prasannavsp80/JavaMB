package com.java.gen;

class Test<T> {
	public void swap(T a, T b) {
		T t;
		t = a; 
		a = b;
		b = t;
		System.out.println("A value " +a+ " B value  " +b);
	}
}

public class GenEx1 {
	public static void main(String[] args) {
		Test obj = new Test();
		int a=5, b=7;
		obj.swap(a, b);
		obj.swap("Ayaz", "Owais");
		obj.swap(true, false);
		obj.swap(12.5, 11.9);
	}
}
