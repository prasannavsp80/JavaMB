package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Owais");
		names.add("Ravi");
		names.add("Harshitha");
		names.add("Sohan");
		System.out.println("Names List  ");
		for (Object object : names) {
			System.out.println(object);
		}
		names.add(2, "Ayaz");
		System.out.println("List after insert operation  ");
		for (Object object : names) {
			System.out.println(object);
		}
		names.set(1, "Ravi Teja");
		System.out.println("List after Update Operation  ");
		for (Object object : names) {
			System.out.println(object);
		}
		names.remove("Sohan");
		System.out.println("List after remove Opeation...");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
