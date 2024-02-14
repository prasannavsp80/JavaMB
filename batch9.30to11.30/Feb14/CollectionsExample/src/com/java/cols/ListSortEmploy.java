package com.java.cols;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortEmploy {
	public static void main(String[] args) {
		List namesList = new ArrayList();
		namesList.add(new Employ(1, "Shiva", "Java", "Programmer", 84234));
		namesList.add(new Employ(2, "Leela", "Dotnet", "Developer", 90034));
		namesList.add(new Employ(3, "Ananth", "Sharepoint", "Manager", 98144));
		namesList.add(new Employ(4, "Kavitha", "Java", "Team Lead", 98841));
		namesList.add(new Employ(5, "Sravani", "Python", "ASE", 90883));
		namesList.add(new Employ(6, "Tejaswi", "Dotnet", "Manager", 98832));
		
//		Collections.sort(namesList, new NameComparator());
		Collections.sort(namesList, new BasicComparator());
		System.out.println("Sorted Employ List is  ");
		for (Object object : namesList) {
			Employ employ = (Employ)object;
			System.out.println(employ);
		}
	}
}
