package com.java.day2;

public class EmployArray {
	public static void main(String[] args) {
		Employ e1 = new Employ();
		e1.empno = 1;
		e1.name = "Varun";
		e1.basic =88233;
		
		Employ e2 = new Employ();
		e2.empno = 2;
		e2.name = "Dileep";
		e2.basic =90322;
		
		Employ e3 = new Employ();
		e3.empno = 3;
		e3.name = "Shreyas";
		e3.basic =90032;
		
		Employ[] arrEmploy = new Employ[] {
			e1, e2, e3	
		};
		
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
		}
	}
}
