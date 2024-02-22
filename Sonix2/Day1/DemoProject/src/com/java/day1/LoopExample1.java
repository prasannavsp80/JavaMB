package com.java.day1;

public class LoopExample1 {

	public void show() {
		int n = 10, i = 1;
		while(i <= n) {
			System.out.println("Welcome to Java Training...");
			i++;
		}
	}
	
	public static void main(String[] args) {
		LoopExample1 obj = new LoopExample1();
		obj.show();
	}
}
