package com.java.day1;

import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {
		String firstName, lastName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter FirstName  ");
		firstName = sc.next();
		System.out.println("Enter LastName   ");
		lastName = sc.next();
		System.out.println("First Name  " +firstName);
		System.out.println("Last Name   " +lastName);
	}
}
