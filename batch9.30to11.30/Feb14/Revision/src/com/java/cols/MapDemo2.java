package com.java.cols;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapDemo2 {
	public static void main(String[] args) {
		Map userData = new Hashtable();
		userData.put(1, "Owais");
		userData.put(2, "Ayaz");
		userData.put(3, "Harshitha");
		userData.put(4, "Pallavi");
		userData.put(5, "Ravi");
		int key;
		String result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key   ");
		key = sc.nextInt();
		result = (String) userData.getOrDefault(key, "Not Found");
		System.out.println(result);
	}
}
