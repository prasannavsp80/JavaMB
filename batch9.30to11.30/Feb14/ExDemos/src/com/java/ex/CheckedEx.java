package com.java.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckedEx {

	public void convert(String str) throws ParseException  {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(str);
		System.out.println(date);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date (yyyy-MM-dd)  ");
		String date = sc.next();
		CheckedEx obj = new CheckedEx();
		try {
			obj.convert(date);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	}
}
