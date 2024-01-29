package com.java.day1;

import java.util.Scanner;

public class CaseDemo1 {

	public void show(int choice) {
		switch(choice) {
		case 1 : 
			System.out.println("Hi I am Pranjal...");
			break;
		case 2 : 
			System.out.println("Hi I am Raja Babu...");
			break;
		case 3 : 
			System.out.println("Hi i am Saili Patil...");
			break;
		case 4 : 
			System.out.println("Hi I am Sheetal...");
			break;
		case 5 : 
			System.out.println("Hi I am Vishesh...");
			break;
		default : 
			System.out.println("Invalid Choice...");
			break;
		}
	}
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice  ");
		choice = sc.nextInt();
		CaseDemo1 obj = new CaseDemo1();
		obj.show(choice);
	}
}
