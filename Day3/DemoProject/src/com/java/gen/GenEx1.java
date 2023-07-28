package com.java.gen;

public class GenEx1 {

	public static void main(String[] args) {
		int a, b;
		a = 5;
		b = 7;
		Data obj = new Data();
		obj.swap(a, b);
		
		String s1, s2;
		s1 = "Shreyansh";
		s2 = "Dileep";
		obj.swap(s1, s2);
		
		boolean f1, f2;
		f1 = true;
		f2 = false;
		obj.swap(f1, f2);
	}
}
