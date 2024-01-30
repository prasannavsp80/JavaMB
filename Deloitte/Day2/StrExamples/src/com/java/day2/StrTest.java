package com.java.day2;

public class StrTest {

	public static void main(String[] args) {
		String str = "Welcome to Java Programming...Trainer Prasanna";
		// length() : used to find out the length of given string 
		
		System.out.println("Length is  " +str.length());
		// indexOf() : Displays the first occrrence of given char in a string 
		System.out.println("First Occurrence of char 'o' is  " +str.indexOf("o"));
		// charAt() : used to display char at particular position 
		System.out.println("Char at 5th position  " +str.charAt(5));
		// toLowerCase() : Converts into lower case
		System.out.println("Lower Case is  " +str.toLowerCase());
		// toUpperCase() : Converts into upper case 
		System.out.println("Upper Case is  " +str.toUpperCase());
		// equals() : checks the strings are equal or not 
		String s1="Abhishek", s2="Bhanu", s3="Abhishek";
		String s4="Raja", s5="Milind";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s4.compareTo(s5));
		System.out.println("Part of String is  " +str.substring(5, 10));
	}
}
