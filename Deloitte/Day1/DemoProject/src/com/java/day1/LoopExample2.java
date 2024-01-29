package com.java.day1;

public class LoopExample2 {

	public void show(int n) {
		for(int i=1; i<=n;i++) {
			System.out.println("Deloitte Java Training...");
		}
	}
	public static void main(String[] args) {
		int n = 10;
		LoopExample2 obj = new LoopExample2();
		obj.show(n);
	}
}
