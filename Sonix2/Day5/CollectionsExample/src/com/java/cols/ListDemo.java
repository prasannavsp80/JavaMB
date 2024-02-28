package com.java.cols;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Ganesh");
		names.add("Anil");
		names.add("Meghana");
		names.add("Satish");
		names.add("Chandra");
		names.add("Shabir");
		System.out.println("Names before sorting...");
		for (Object object : names) {
			System.out.println(object);
		}
		
		Collections.sort(names);
		System.out.println("Names after Sorting...");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
