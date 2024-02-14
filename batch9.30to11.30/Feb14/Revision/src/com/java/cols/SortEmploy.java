package com.java.cols;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	
	public static void main(String[] args) {
	//	Comparator c = new NameComparator();
		Comparator c = new BasicComparator();
		SortedSet employs = new TreeSet(c);
		employs.add(new Employ(1, "Ravi Teja", 88423));
		employs.add(new Employ(2, "Tejas", 90033));
		employs.add(new Employ(3, "Srujan", 90323));
		employs.add(new Employ(4, "Manisha", 91144));
		employs.add(new Employ(5, "Shivani", 90314));
		
		System.out.println("Employ List  ");
		for (Object object : employs) {
			Employ employ = (Employ)object;
			System.out.println(employ);
		}
	}
}
