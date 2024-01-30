package com.java.day2;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Welcome to Java Programming...");
		System.out.println(sb);
		sb.append("Trainer Prasanna...");
		System.out.println(sb);
		sb.insert(10, " Deloitte");
		System.out.println(sb);
		sb.delete(10, 20);
		System.out.println(sb);
		sb.replace(10, 15, "J2EE");
		System.out.println(sb);
	}
}
