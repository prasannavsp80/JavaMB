package com.java.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

public class ListDemo1 {

	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Varun");
		names.add("Dileep");
		names.add("Shreyansh");
		names.add("Lakshmi");
		names.add("Ravi");
		System.out.println("Names are  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.add(2, "Heera");
		System.out.println("Names are ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.remove("Varun");
		System.out.println("List after remove operation");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
