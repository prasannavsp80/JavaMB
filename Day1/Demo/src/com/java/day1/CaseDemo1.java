package com.java.day1;

public class CaseDemo1 {
	public void show(int n) {
		switch(n) {
		case 1 : 
			System.out.println("Hi I am dileep...");
			break;
		case 2 : 
			System.out.println("Hi I am Shariv...");
			break;
		case 3 : 
			System.out.println("Hi I am lakshmi...");
			break;
		case 4 : 
			System.out.println("Hi I am Aneena...");
			break;
		default : 
			System.out.println("Invalid Choice...");
			break;
		}
	}
	public static void main(String[] args) {
		int n=3;
		new CaseDemo1().show(n);
	}
}
