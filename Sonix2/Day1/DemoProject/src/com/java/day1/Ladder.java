package com.java.day1;

public class Ladder {

	public void check(int choice) {
		if (choice==1) {
			System.out.println("Hi I am Nanaji...");
		} else if (choice==2) {
			System.out.println("Hi I am Naveen...");
		} else if (choice==3) {
			System.out.println("Hi I am Meghana...");
		} else {
			System.out.println("Invalid Choice...");
		}
	}
	public static void main(String[] args) {
		int choice = 2;
		Ladder obj =  new Ladder();
		obj.check(choice);
	}
}
