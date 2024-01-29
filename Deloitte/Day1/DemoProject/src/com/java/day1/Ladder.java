package com.java.day1;

import java.util.Scanner;

public class Ladder {

	public void show(int choice) {
		if (choice==1) {
			System.out.println("Hi I am Abhishek...");
		} else if (choice == 2) {
			System.out.println("Hi I am Neha Merin...");
		} else if (choice == 3) {
			System.out.println("Hi I am Milind...");
		} else if (choice == 4) {
			System.out.println("Hi I am Kiran...");
		} else if (choice == 5) {
			System.out.println("Hi I am Sheetala Hegde...");
		} else {
			System.out.println("*** Invalid Value ***");
		}
	} 
	
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice  ");
		choice = sc.nextInt();
		Ladder obj = new Ladder();
		obj.show(choice);
	}
}
