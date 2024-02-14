package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenEx2 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Balaji");
		names.add("Harsha");
		names.add("Vaishnav");
		names.add("Sravani");
		names.add("Maneesh");
		System.out.println("Names are  ");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
