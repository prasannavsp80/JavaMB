package com.java.gen;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
		SortedSet<Employ> employs = new TreeSet<Employ>(new BasicComparator());
		employs.add(new Employ(1, "Balaji", 88423.32));
		employs.add(new Employ(2, "Madhuri", 99684.23));
		employs.add(new Employ(3, "Sravani", 98844.23));
		employs.add(new Employ(4, "Guru", 90444.23));
		employs.add(new Employ(5, "Rajesh", 98873.23));
		
		for (Employ employ : employs) {
			System.out.println(employ);
		}
	}
}
