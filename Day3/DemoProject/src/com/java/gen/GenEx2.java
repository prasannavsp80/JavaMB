package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenEx2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		names.add("Varun");
		names.add("Lakshmi");
		names.add("Abhishek");
		names.add("Shreya");
		names.add("Ravi");
		
		System.out.println("Names are ");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
