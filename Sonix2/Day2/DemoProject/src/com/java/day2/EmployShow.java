package com.java.day2;

public class EmployShow {

	public static void main(String[] args) {
		Employ e1 = new Employ();
		e1.empno =1;
		e1.name = "Anil Varma";
		e1.basic = 83234;
		
		Employ e2 = new Employ();
		e2.empno = 2;
		e2.name ="Meghana";
		e2.basic = 88423;
		
		Employ e3 = new Employ();
		e3.empno = 3;
		e3.name = "Ramanjaneyalu";
		e3.basic = 88114;
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
	}
}
