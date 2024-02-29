package com.java.cols;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Lakshmi");
		names.add("Karanam");
		names.add("Likith");
		names.add("Sushma");
		names.add("Anil");
		names.add("Manohar");
		names.add("Vara Lakshmi");
		System.out.println("Original List");
		for (Object object : names) {
			System.out.println(object);
		}
		Collections.sort(names);
		System.out.println("Sorted List  ");
		for (Object object : names) {
			System.out.println(object);
		}
	}
}
