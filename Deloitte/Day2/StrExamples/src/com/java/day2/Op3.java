package com.java.day2;

public class Op3 {

	public static void main(String[] args) {
		int n = 2;
		System.out.println(n << 2);
		n = 5; // 0101 as it is left shifted by 3 digits 
		
	//	101000 ->  40
		System.out.println(n << 1); // 10
		System.out.println(n << 2); // 20
		System.out.println(n << 3); // 40
		System.out.println(n << 4); // 80
	}
}
