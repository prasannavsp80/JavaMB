package com.java.cols;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHSetDemo {
	public static void main(String[] args) {
		Set names = new LinkedHashSet();
		names.add("Chandra");
		names.add("Rajesh");
		names.add("Sirisha");
		names.add("Sushma");
		names.add("Meghana");
		names.add("Tarak");
		names.add("Chandra");
		names.add("Rajesh");
		names.add("Sirisha");
		names.add("Sushma");
		names.add("Meghana");
		names.add("Chandra");
		names.add("Rajesh");
		names.add("Sirisha");
		names.add("Sushma");
		names.add("Meghana");
		names.add("Rajesh");
		names.add("Sirisha");
		names.add("Sushma");
		names.add("Meghana");
		names.add("Tarak");
		names.add("Rajesh");
		names.add("Sirisha");
		names.add("Sushma");
		names.add("Meghana");
		names.add("Tarak");

		for (Object object : names) {
			System.out.println(object);
		}
	}
}
