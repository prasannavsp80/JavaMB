package com.java.cols;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {
	public static void main(String[] args) {
		Set names = new LinkedHashSet();
		names.add("Karthik");
		names.add("Likith");
		names.add("Chandra");
		names.add("Sushma");
		names.add("Vignesh");
		names.add("Karthik");
		names.add("Likith");
		names.add("Chandra");
		names.add("Sushma");
		names.add("Vignesh");
		names.add("Karthik");
		names.add("Likith");
		names.add("Chandra");
		names.add("Sushma");
		names.add("Vignesh");
		names.add("Likith");
		names.add("Chandra");
		names.add("Sushma");
		names.add("Vignesh");
		names.add("Likith");
		names.add("Chandra");
		names.add("Sushma");
		names.add("Vignesh");
		names.add("Likith");
		names.add("Chandra");
		names.add("Sushma");
		names.add("Vignesh");
		System.out.println("Names are ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
