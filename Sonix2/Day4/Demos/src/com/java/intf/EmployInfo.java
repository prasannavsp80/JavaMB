package com.java.intf;

public class EmployInfo {
	public static void main(String[] args) {
		Employ employ = new Employ(1, "Chandra Sekhar", 84222);
		System.out.println("Employ No  " +employ.getEmpno());
		System.out.println("Employ Name  " +employ.getName());
		System.out.println("Basic  " + employ.getBasic());
	}
}
