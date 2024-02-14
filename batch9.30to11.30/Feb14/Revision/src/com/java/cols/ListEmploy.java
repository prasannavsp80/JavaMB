package com.java.cols;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEmploy {
	public static void main(String[] args) {
		List employList = new ArrayList();
		employList.add(new Employ(1, "Ravi Teja", 88423));
		employList.add(new Employ(2, "Tejas", 90033));
		employList.add(new Employ(3, "Srujan", 90323));
		employList.add(new Employ(4, "Manisha", 91144));
		employList.add(new Employ(5, "Shivani", 90314));
		System.out.println("Employ List  ");
		for (Object object : employList) {
			Employ employ = (Employ)object;
			System.out.println(employ);
		}
		System.out.println("Sort Employs  ");
		Collections.sort(employList, new NameComparator());
		for (Object object : employList) {
			Employ employ = (Employ)object;
			System.out.println(employ);
		}
	}
}
