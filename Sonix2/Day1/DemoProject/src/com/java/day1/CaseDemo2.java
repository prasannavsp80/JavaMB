package com.java.day1;

public class CaseDemo2 {

	public void show(String dayName) {
		switch(dayName) {
		case "Sun" : 
			System.out.println("Its Sunday...");
			break;
		case "Mon" : 
			System.out.println("Its Monday...");
			break;
		case "Tue" : 
			System.out.println("Its Tuesday...");
			break;
		case "Wed":
			System.out.println("Its Wednesday...");
			break;
		case "Thu":
			System.out.println("Its Thursday...");
			break;
		case "Fri" :
			System.out.println("Its Friday...");
			break;
		case "Sat" :
			System.out.println("Its Saturday...");
			break;
		default : 
			System.out.println("Invalid Choice...");
		}
	}
	public static void main(String[] args) {
		String dayName = "Thu";
		CaseDemo2 obj = new CaseDemo2();
		obj.show(dayName);
	}
}
