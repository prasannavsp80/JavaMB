package com.java.day1;

public class LoopEx1 {

	public void show() {
		int n=10;
		int i=0;
		while(i < n) {
			System.out.println("Welcome to Java...");
			i++;
		}
	}
	public static void main(String[] args) {
		LoopEx1 obj = new LoopEx1();
		obj.show();
	}
}
