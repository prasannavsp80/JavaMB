package com.java.cols;

import java.util.Hashtable;
import java.util.Map;

public class MapExample1 {

	public static void main(String[] args) {
		Map employData = new Hashtable();
		employData.put("Satish",88523.44);
		employData.put("Tarak", 88234.55);
		employData.put("Sirisha", 90032.44);
		employData.put("Naveen", 94234.23);
		employData.put("Padma", 88832.44);
		
		System.out.println(employData.get("Padma"));
	}
}
