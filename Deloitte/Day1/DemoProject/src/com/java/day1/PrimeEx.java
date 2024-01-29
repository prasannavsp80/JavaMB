package com.java.day1;

import java.util.Scanner;

/**
 * Program to Check given no. is prime or not 
 * @author lenovo
 *
 */
public class PrimeEx {

	public void check(int n) {
		boolean flag = true;
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				flag = false;
				break;
			}
		}
		if (flag==true) {
			System.out.println("Prime Number...");
		} else {
			System.out.println("Not Prime Number...");
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value  ");
		n = sc.nextInt();
		PrimeEx obj = new PrimeEx();
		obj.check(n);
	}
}
