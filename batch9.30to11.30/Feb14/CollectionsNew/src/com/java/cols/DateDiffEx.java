package com.java.cols;

import java.util.Calendar;
import java.util.Date;

public class DateDiffEx {

	public static void main(String[] args) {
		Date starDate = new Date();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 5);
		Date endDate = cal.getTime();
		
		long diff = endDate.getTime() - starDate.getTime();
		long days = diff/(1000 * 60 * 60 * 24);
		System.out.println(days);
	}
}
