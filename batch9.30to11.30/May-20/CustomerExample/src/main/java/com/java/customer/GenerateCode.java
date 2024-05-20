package com.java.customer;

import java.util.Random;

public class GenerateCode {

	private static String chars = "abcdefghijklmnopqrstuvwxyz";
	private static String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String NUMS = "1234567890";
	private static String SPEC = "@#$%^&+=";
	private static Random rnd = new Random();

	private static String getTwoFrom(String src) {
	    int index1 = (int) (rnd.nextFloat() * src.length()),
	            index2 = (int) (rnd.nextFloat() * src.length());
	    return "" + src.charAt(index1) + src.charAt(index2);
	}

	public static String createPassword() {
	    return getTwoFrom(chars) + getTwoFrom(CHARS) + getTwoFrom(NUMS) + getTwoFrom(SPEC);
	}
}
