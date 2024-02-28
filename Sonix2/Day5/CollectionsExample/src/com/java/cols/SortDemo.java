package com.java.cols;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Ganesh");
		names.add("Anil");
		names.add("Meghana");
		names.add("Satish");
		names.add("Chandra");
		names.add("Shabir");
		
		System.out.println("Sorted Data  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
