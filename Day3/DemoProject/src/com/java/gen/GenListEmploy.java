package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenListEmploy {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Shreyas", 88422));
		employList.add(new Employ(2, "Ravi", 90322));
		employList.add(new Employ(3, "Renuka", 87733));
		employList.add(new Employ(4, "Dileep", 89902));
		employList.add(new Employ(5, "Naveen", 90833));
		employList.add(new Employ(6, "Abhishek", 89003));
		employList.add(new Employ(7, "Srikar", 80099));
		System.out.println("Employ List  ");
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
