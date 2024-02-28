package com.java.junit;

import java.util.Date;

public class Data {
	
	public boolean evenOdd(int n) {
		if (n%2==0) {
			return true;
		}
		return false;
	}
	public String tat(Date leaveStartDate, Date leaveEndDate) {
		Date today = new Date();
		long ms = leaveStartDate.getTime() - today.getTime();
		long days1 = ms / (1000 * 60 * 60 * 24);
		days1++;
		long ms2 = leaveEndDate.getTime() - today.getTime();
		long days2 = ms2/ (1000 * 60 * 60 * 24);
		days2++;
		if (days1 <= 0) { 
			return "Leave Start-Date cannot be Yesterday's date..."; 
		} else if (days2 <= 0) {
			return "Leave End-Date cannot be Yesterday's date...";
		} else {
			return "Leave Applied Successfully...";
		}
		
	}
	public int sum(int a, int b) {
		return a+b;
	}
	
	public String sayHello() {
		return "Welcome to Java Programming...";
	}
	
	public int max(int a,int b, int c) {
		int m = a;
		if (m < b) {
			m = b;
		}
		if (m < c) {
			m = c;
		}
		return m;
	}
}
