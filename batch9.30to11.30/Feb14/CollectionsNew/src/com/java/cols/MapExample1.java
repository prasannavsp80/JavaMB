package com.java.cols;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapExample1 {

	public static void main(String[] args) {
		Map employs = new Hashtable();
		employs.put("Maneesh", 88423.44);
		employs.put(true, false);
		employs.put("Shiva", 90032.44);
		employs.put("Leela", 91144.44);
		employs.put("Sravani", 97733.44);
		employs.put("Balaji", 93945.44);
		String key;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key (Your Name) ");
		key = sc.next();
		double basic = (Double) employs.getOrDefault(key, 0.0);
		System.out.println("Basic is  " +basic);
	}
}
