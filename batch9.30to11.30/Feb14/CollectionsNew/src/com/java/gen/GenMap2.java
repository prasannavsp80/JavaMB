package com.java.gen;

import java.util.Hashtable;
import java.util.Map;

public class GenMap2 {

	public static void main(String[] args) {
		Map<Integer, String> employData = new Hashtable<Integer, String>();
		employData.put(1, "Sanghavi");
		employData.put(2, "Madhurya");
		employData.put(3, "Vaishnav");
		employData.put(4, "Ambadas");
		
		for(Map.Entry<Integer, String> map : employData.entrySet()) {
			System.out.println(map.getKey() +  "  " +map.getValue());
		}
	}
}
