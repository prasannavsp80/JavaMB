package com.java.cols;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Owais");
		names.add("Ravi");
		names.add("Harshitha");
		names.add("Sohan");
		names.add("Kamal");
		names.add("Niranjan");
		names.add("Ayaz");
		names.add("Shivathmika");
		System.out.println("Names are  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		System.out.println("Names after Sorting...");
		Collections.sort(names);
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
