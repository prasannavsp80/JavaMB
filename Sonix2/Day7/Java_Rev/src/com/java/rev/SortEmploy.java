package com.java.rev;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
		SortedSet<Employ> employList = new TreeSet<Employ>();
//		employList.add(12);
		employList.add(new Employ(1, "Ramana", 88323));
		employList.add(new Employ(2, "Likith", 90322));
		employList.add(new Employ(3, "Vara Lakshmi", 93211));
		employList.add(new Employ(4, "Manohar", 90221));
		employList.add(new Employ(5, "Sirisha", 97322));
		
		System.out.println("Employ List  ");
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
