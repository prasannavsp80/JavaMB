package com.java.jdk8;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class OptionalMap {
	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("Sanghavi", 84823.22);
		map.put("Balaji", 84823.12);
		map.put("Satish", 84823.32);
		map.put("Manohar", 90044.32);
		
		String key;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key  ");
		key = sc.next();
		Optional<Double> res = Optional.ofNullable(map.get(key));
		if (res.isPresent()) {
			System.out.println(res.get());
		} else {
			System.out.println("Key Not Found...");
		}
	}
}
