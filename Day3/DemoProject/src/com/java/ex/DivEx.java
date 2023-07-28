package com.java.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter 2 Numbers   ");
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println("Division is  " +c);
		} catch (ArithmeticException e) {
			System.err.println("Division by zero impossible...");
		} catch (InputMismatchException e) {
			System.err.println("String Cannot be Converted as Integer...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Program From MayBank Labs...");
		}
	}
}
