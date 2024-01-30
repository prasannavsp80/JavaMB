package com.java.day2;

public class EmployArray {

	public static void main(String[] args) {
		Employ e1 = new Employ();
		e1.empno =1;
		e1.name = "Karthika";
		e1.basic = 84823;
		
		Employ e2 = new Employ();
		e2.empno =2;
		e2.name = "Nithin";
		e2.basic = 90042;
		
		
		Employ e3 = new Employ();
		e3.empno = 3;
		e3.name = "Pratik";
		e3.basic = 88344;
		
		
		Employ e4 = new Employ();
		e4.empno = 4;
		e4.name = "Preeti";
		e4.basic = 90455;
		
		Employ[] arr = new Employ[] {
			e1, e2, e3, e4	
		};
		
		for (Employ employ : arr) {
			System.out.println("Employ No " +employ.empno);
			System.out.println("Employ Name  " +employ.name);
			System.out.println("Basic  " +employ.basic);
			System.out.println("------------------------------");
		}
	}
}
