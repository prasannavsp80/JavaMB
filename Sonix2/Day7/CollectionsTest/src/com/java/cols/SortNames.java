package com.java.cols;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortNames {
	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Lakshmi");
		names.add("Karanam");
		names.add("Likith");
		names.add("Sushma");
		names.add("Anil");
		names.add("Manohar");
		names.add("Vara Lakshmi");
		
		System.out.println("Sorted Data ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
