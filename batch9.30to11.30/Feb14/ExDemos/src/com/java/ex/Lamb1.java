package com.java.ex;

public class Lamb1 {

	public static void main(String[] args) {
		IOne obj1 = () -> {
			System.out.println("Welcome to Lambda Expression...");
		};
		
		IOne obj2 = () -> {
			System.out.println("From JDK 1.8 New Features...");
		};
		
		obj1.show();
		obj2.show();
	}
}
