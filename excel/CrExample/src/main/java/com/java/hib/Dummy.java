package com.java.hib;

import java.util.List;

public class Dummy {

	public static void main(String[] args) {
		EmployDAOImpl impl = new EmployDAOImpl();
		System.out.println(impl.authenticate("Sohan", "Sohan"));
	//	System.out.println(listEmploy);
	}
}
