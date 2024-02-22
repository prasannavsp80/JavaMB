package com.java.day1;

public class CaseDemo1 {

	public void show(int choice) {
		switch(choice) {
		case 1 : 
			System.out.println("Hi I am Ganesh...");
			break;
		case 2 : 
			System.out.println("Hi I am Adi Lakshmi...");
			break;
		case 3 : 
			System.out.println("Hi I am Megha...");
			break;
		case 4 : 
			System.out.println("Hi I am Mohammad...");
			break;
		case 5 : 
			System.out.println("Hi I am Anil Varma...");
			break;
		default : 
			System.out.println("Invalid Choice...");
		}
	}
	public static void main(String[] args) {
		int choice = 3;
		CaseDemo1 obj = new CaseDemo1();
		obj.show(choice);
	}
}
