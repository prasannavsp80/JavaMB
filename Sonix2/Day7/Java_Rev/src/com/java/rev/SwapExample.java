package com.java.rev;

class Data<T> {
	
	public void swap(T a, T b) {
		T t;
		t = a;
		a = b;
		b = t;
		System.out.println("A value  " +a+ " B value  " +b);
	}
}

public class SwapExample {
	public static void main(String[] args) {
		int a=5, b=7;
		Data data = new Data();
		data.swap(a, b);
		String s1="Chandra", s2="Vigneswar";
		data.swap(s1, s2);
		double d1=12.5, d2=5.2;
		data.swap(d1, d2);
		boolean b1 = true, b2 = false;
		data.swap(b1, b2);
	}
}
