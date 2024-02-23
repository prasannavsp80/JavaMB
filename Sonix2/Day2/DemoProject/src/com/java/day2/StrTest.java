package com.java.day2;

public class StrTest {
	public static void main(String[] args) {
		String str = "Welcome to Java Training...Trainer Prasanna...";
		System.out.println("Length of String is  " +str.length());
		System.out.println("First Occurrence of Char 'o' is  " +str.indexOf("o"));
		System.out.println("Char at 5th position  " +str.charAt(5));
		System.out.println("Upper Case String is  " +str.toUpperCase());
		System.out.println("Lower Case String is  " +str.toLowerCase());
		System.out.println("Part of String is  " +str.substring(5, 15));
		System.out.println("Replaced String is  " +str.replace("Java", "J2EE"));
		String s1 = "Chandra", s2 = "Ganesh", s3="Chandra";
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
	}
}
