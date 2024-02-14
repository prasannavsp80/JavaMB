package com.java.cols;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedExample1 {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Maneesh");
		names.add("Shiva");
		names.add("Muskan");
		names.add("Yeshwanth");
		names.add("Ananth");
		names.add("Guru");
		System.out.println("Sorted Data  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
