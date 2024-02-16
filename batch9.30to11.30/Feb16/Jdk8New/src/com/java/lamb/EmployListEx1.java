package com.java.lamb;

import java.util.ArrayList;
import java.util.List;

public class EmployListEx1 {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Shiva", 90322));
		employList.add(new Employ(2, "Balaji", 81122));
		employList.add(new Employ(3, "Sravani", 87893));
		employList.add(new Employ(4, "Leela", 90883));
		employList.add(new Employ(5, "Ananth", 87732));
		employList.add(new Employ(6, "Manikantha", 90882));
		
		//employList.forEach(System.out::println);
		employList.forEach(x -> System.out.println(x));
	}
}
