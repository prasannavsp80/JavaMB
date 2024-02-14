package com.java.gen;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class GenMap1 {

	public static void main(String[] args) {
		Map<Integer, String> employData = new Hashtable<Integer, String>();
		employData.put(1, "Sanghavi");
		employData.put(2, "Madhurya");
		employData.put(3, "Vaishnav");
		employData.put(4, "Ambadas");
		int key;
		String res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key  ");
		key = sc.nextInt();
		res = employData.getOrDefault(key, "Not Found");
		System.out.println(res);
	}
}
