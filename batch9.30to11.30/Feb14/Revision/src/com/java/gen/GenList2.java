package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenList2 {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Ravi Teja", 88423));
		employList.add(new Employ(2, "Tejas", 90033));
		employList.add(new Employ(3, "Srujan", 90323));
		employList.add(new Employ(4, "Manisha", 91144));
		employList.add(new Employ(5, "Shivani", 90314));
		System.out.println("Employ List  ");
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
