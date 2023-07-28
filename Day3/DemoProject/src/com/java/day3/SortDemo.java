package com.java.day3;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Varun");
		names.add("Dileep");
		names.add("Shreyansh");
		names.add("Lakshmi");
		names.add("Ravi");
		names.add("Abhishek");
		names.add("Renuka");
		System.out.println("Sorted Data ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
