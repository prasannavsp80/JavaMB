package com.java.cols;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
	//	Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet employs = new TreeSet(c);
		employs.add(new Employ(1, "Padma", 88423));
		employs.add(new Employ(2, "Ganesh", 90323));
		employs.add(new Employ(3, "Karthik", 81155));
		employs.add(new Employ(4, "Anil", 87644));
		employs.add(new Employ(5, "Meghana", 89731));
		employs.add(new Employ(6, "Rajesh", 90422));
		System.out.println("Employ List  ");
		for (Object object : employs) {
			System.out.println(object);
		}
	}
}
