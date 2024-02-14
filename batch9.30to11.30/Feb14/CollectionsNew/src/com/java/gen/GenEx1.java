package com.java.gen;

class Data<T> {

	public void swap(T a, T b) {
		T t;
		t = a;
		a = b;
		b = t;
		System.out.println("A value  " +a+ " B value  " +b);
	}
}

public class GenEx1 {
	public static void main(String[] args) {
		Data obj = new Data();
		obj.swap(12, 5);
		obj.swap(true, false);
		obj.swap("Tejaswi", "Madhurya");
	}
}
