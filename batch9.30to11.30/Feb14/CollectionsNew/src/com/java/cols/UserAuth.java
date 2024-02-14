package com.java.cols;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserAuth {
	public static void main(String[] args) {
		Map userData = new HashMap();
		userData.put("Maneesh", "Maneesh123");
		userData.put("Guru", "Vardhan");
		userData.put("Shiva", "Shiva");
		userData.put("Leela", "Chinmai");
		userData.put("Sanghavi", "Sanghavi");
		String user, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName and Password  ");
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
