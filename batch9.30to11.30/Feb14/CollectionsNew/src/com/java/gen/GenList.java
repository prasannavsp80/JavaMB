package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenList {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Balaji", 88423.32));
		employList.add(new Employ(2, "Madhuri", 99684.23));
		employList.add(new Employ(3, "Sravani", 98844.23));
		employList.add(new Employ(4, "Guru", 90444.23));
		employList.add(new Employ(5, "Rajesh", 98873.23));
		
		System.out.println("Employ List ");
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
