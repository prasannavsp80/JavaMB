package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
	public static void main(String[] args) {
		List names = new ArrayList();
		names.add("Karthik");
		names.add("Likith");
		names.add("Chandra");
		names.add("Sushma");
		names.add("Vignesh");
		System.out.println("Names are ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.add(2, "Raj");
		System.out.println("Names after Insert Opeation  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.set(5, "Vigneshwar");
		System.out.println("Names after set Operation  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
		names.remove("Raj");
		System.out.println("Names after Remove Operation  ");
		for (Object ob : names) {
			System.out.println(ob);
		}
	}
}
