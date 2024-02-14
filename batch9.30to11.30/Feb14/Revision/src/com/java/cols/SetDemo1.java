package com.java.cols;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		Set names = new HashSet();
		names.add("Kalyan");
		names.add("Niranjan");
		names.add("Kamalvarthan");
		names.add("Srujan");
		names.add("Sohan");
		names.add("Kalyan");
		names.add("Niranjan");
		names.add("Kamalvarthan");
		names.add("Srujan");
		names.add("Kalyan");
		names.add("Niranjan");
		names.add("Kamalvarthan");
		names.add("Srujan");
		names.add("Niranjan");
		names.add("Kamalvarthan");
		names.add("Srujan");
		names.add("Sohan");
		names.add("Kalyan");
		names.add("Niranjan");
		names.add("Kamalvarthan");
		names.add("Srujan");
		names.add("Sohan");
		names.add("Kalyan");
		System.out.println("Sorted Data  ");
		for (Object ob : names) {
			System.out.println(ob);
		}

	}
}
