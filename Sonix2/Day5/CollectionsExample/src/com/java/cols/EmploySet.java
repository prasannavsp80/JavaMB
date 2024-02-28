package com.java.cols;

import java.util.HashSet;
import java.util.Set;

public class EmploySet {

	public static void main(String[] args) {

		Set employList = new HashSet();
		employList.add(new Employ(1, "Padma", 88423));
		employList.add(new Employ(2, "Ganesh", 90323));
		employList.add(new Employ(3, "Karthik", 81155));
		employList.add(new Employ(4, "Anil", 87644));
		employList.add(new Employ(5, "Meghana", 89731));
		employList.add(new Employ(6, "Rajesh", 90422));
		employList.add(new Employ(1, "Padma", 88423));
		employList.add(new Employ(2, "Ganesh", 90323));
		employList.add(new Employ(3, "Karthik", 81155));
		employList.add(new Employ(4, "Anil", 87644));
		employList.add(new Employ(3, "Karthik", 81155));
		employList.add(new Employ(4, "Anil", 87644));
		employList.add(new Employ(5, "Meghana", 89731));
		employList.add(new Employ(6, "Rajesh", 90422));
		employList.add(new Employ(6, "Rajesh", 90422));
		employList.add(new Employ(1, "Padma", 88423));
		employList.add(new Employ(2, "Ganesh", 90323));
		employList.add(new Employ(3, "Karthik", 81155));
		employList.add(new Employ(4, "Anil", 87644));
		
		System.out.println("Employ List  ");
		for (Object object : employList) {
			System.out.println(object);
		}
	}
}
