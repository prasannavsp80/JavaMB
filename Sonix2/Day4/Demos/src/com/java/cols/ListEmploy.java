package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class ListEmploy {

	public static void main(String[] args) {
		List employList = new ArrayList();
		employList.add(new Employ(1, "Tarak", 88424.22));
		employList.add(new Employ(2, "Sushma", 90042.22));
		employList.add(new Employ(3, "Sirisha", 81114.22));
		employList.add(new Employ(4, "Tarak", 98833.22));
		employList.add(new Employ(5, "RamaAnjaneyulu", 96753.22));
		employList.add(new Employ(6, "Ramanaji", 80024.22));
		
		System.out.println("Employ List is  ");
		for (Object ob : employList) {
			// unbox Object into Employ class
			Employ employ = (Employ)ob;
			System.out.println(employ);
		}
	}
}
