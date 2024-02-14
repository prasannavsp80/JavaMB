package com.java.cols;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo1 {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Kalyan");
		names.add("Niranjan");
		names.add("Ayaz");
		names.add("Shivani");
		names.add("Kamalvarthan");
		names.add("Srujan");
		names.add("Sohan");
		System.out.println("Names are  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
