package com.java.day2;

public class StrTest {

	public void show() {
		String str="Welcome to Java Programming...Trainer Prasanna...";
		System.out.println("Length of String  " +str.length());
		System.out.println("First occurrence of char 'o' is  " +str.indexOf("o"));
		System.out.println("Char at 5th position  " +str.charAt(5));
		System.out.println("Lower Case  " +str.toLowerCase());
		System.out.println("Upper Case  " +str.toUpperCase());
		String s1="Dileep", s2="Shreyas", s3="Dileep";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println("Part of String is  " +str.substring(5,10));
		System.out.println("Replaced String  " +str.replace("Java", "J2EE"));
	}
	public static void main(String[] args) {
		new StrTest().show();
	}
}
