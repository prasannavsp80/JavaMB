package com.java.day3;

import java.util.ArrayList;
import java.util.List;

public class ListEmploy {

	public static void main(String[] args) {
		List employList = new ArrayList();
		employList.add(new Employ(1, "Shreyas", 88422));
		employList.add(new Employ(2, "Ravi", 90322));
		employList.add(new Employ(3, "Renuka", 87733));
		employList.add(new Employ(4, "Dileep", 89902));
		employList.add(new Employ(5, "Naveen", 90833));
		System.out.println("Employ List  ");
		for (Object ob : employList) {
			Employ employ = (Employ)ob;
			System.out.println(employ);
		}
	}
}
