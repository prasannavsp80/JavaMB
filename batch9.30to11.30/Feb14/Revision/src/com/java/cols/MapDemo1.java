package com.java.cols;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo1 {

	public static void main(String[] args) {
		Map userData = new HashMap();
		userData.put("Sohan", "Sohan123");
		userData.put("Ravi", "Teja");
		userData.put("Shiva", "Shivathmika");
		userData.put("Harshitha", "Harshitha");
		String user, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName and Password   ");
		user = sc.next();
		pwd = sc.next();
		String res = (String) userData.getOrDefault(user, "Not Found");
		if (pwd.equals(res)) {
			System.out.println("Correct Credentials...");
		} else {
			System.out.println("Invalid Credentials...");
		}
	}
}
