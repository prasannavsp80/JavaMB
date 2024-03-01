package com.java.rev;

import java.util.ArrayList;
import java.util.List;

public class GenListExample1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Chandra");
		names.add("Sirisha");
		names.add("Likhith");
		names.add("Nanaji");
		names.add("Tarak");
		
		for (String s : names) {
			System.out.println(s);
		}
	}
}
