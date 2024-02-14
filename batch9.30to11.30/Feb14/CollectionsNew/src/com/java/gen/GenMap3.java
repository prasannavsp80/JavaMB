package com.java.gen;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class GenMap3 {

	public static void main(String[] args) {
		Map<String, String> userData = new Hashtable<String, String>();
		userData.put("Maneesh", "Maneesh123");
		userData.put("Guru", "Vardhan");
		userData.put("Shiva", "Shiva");
		userData.put("Leela", "Chinmai");
		userData.put("Sanghavi", "Sanghavi");
		
		String userName, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName   ");
		userName = sc.next();
		System.out.println("Enter Password  ");
		pwd = sc.next();
		
		String result = userData.getOrDefault(userName, "Not Found");
		if (pwd.equals(result)) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentials...");
		}
	}
}
