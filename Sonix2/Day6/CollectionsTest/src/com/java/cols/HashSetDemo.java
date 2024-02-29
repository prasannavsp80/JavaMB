package com.java.cols;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set names = new HashSet();
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
		System.out.println("Data is");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
