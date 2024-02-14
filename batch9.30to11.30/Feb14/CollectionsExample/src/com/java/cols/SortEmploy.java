package com.java.cols;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator c = new NameComparator();
	//	Comparator c = new BasicComparator();
		SortedSet employs = new TreeSet(c);
		employs.add(new Employ(1, "Shiva", "Java", "Programmer", 84234));
		employs.add(new Employ(2, "Leela", "Dotnet", "Developer", 90034));
		employs.add(new Employ(3, "Ananth", "Sharepoint", "Manager", 98144));
		employs.add(new Employ(4, "Kavitha", "Java", "Team Lead", 98841));
		employs.add(new Employ(5, "Sravani", "Python", "ASE", 90883));
		employs.add(new Employ(6, "Tejaswi", "Dotnet", "Manager", 98832));
		System.out.println("Employ List  ");
		for (Object object : employs) {
			Employ employ = (Employ)object;
			System.out.println(employ);
		}
	}
}
