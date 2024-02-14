package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenList1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ayaz");
		names.add("Ravi");
		names.add("Kamal");
		names.add("Shiva");
		names.add("Sohan");
		System.out.println("Names are  ");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
