package com.java.cols;

import java.util.Calendar;
import java.util.Date;

public class CalEx1 {
	public static void main(String[] args) {
		Date obj = new Date();
		System.out.println(obj);
		System.out.println(obj.getDate());
		System.out.println(obj.getYear());
		System.out.println(obj.getMonth()+1);
		System.out.println(obj.getHours());
		System.out.println(obj.getMinutes());
		System.out.println(obj.getSeconds());
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 5);
		cal.add(Calendar.MONTH, 3);
		System.out.println(cal.getTime());
	}
}
