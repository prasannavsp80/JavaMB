package com.java.cols;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEmploy {

	public static void main(String[] args) {
		List employList = new ArrayList();
		employList.add(new Employ(1, "Padma", 88423));
		employList.add(new Employ(2, "Ganesh", 90323));
		employList.add(new Employ(3, "Karthik", 81155));
		employList.add(new Employ(4, "Anil", 87644));
		employList.add(new Employ(5, "Meghana", 89731));
		employList.add(new Employ(6, "Rajesh", 90422));
		
		Collections.sort(employList, new NameComparator());
		System.out.println("Sort By Name  ");
		for (Object object : employList) {
			System.out.println(object);
		}
		
		Collections.sort(employList, new BasicComparator());
		System.out.println("Sort By Basic Descending Order  ");
		for (Object object : employList) {
			System.out.println(object);
		}
	}
}
