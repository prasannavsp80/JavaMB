package com.java.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHSet {

	public static void main(String[] args) {
		Set names = new LinkedHashSet();
		names.add("Varun");
		names.add("Dileep");
		names.add("Shreyansh");
		names.add("Lakshmi");
		names.add("Ravi");
		names.add("Varun");
		names.add("Dileep");
		names.add("Shreyansh");
		names.add("Lakshmi");
		names.add("Dileep");
		names.add("Shreyansh");
		names.add("Lakshmi");
		names.add("Ravi");
		names.add("Dileep");
		names.add("Shreyansh");
		names.add("Lakshmi");
		names.add("Ravi");
		System.out.println("Names are  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
