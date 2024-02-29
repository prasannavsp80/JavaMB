package com.java.cols;

import java.util.SortedSet;
import java.util.TreeSet;

public class CustomerSort {

	public static void main(String[] args) {
		SortedSet customers = new TreeSet();
		customers.add(new Customer(1, "Chandra Sekhar", "Hyderabad", 88423));
		customers.add(new Customer(2, "Anil Varma", "Chennai", 90422));
		customers.add(new Customer(3, "Manohar", "Bangalore", 81113));
		customers.add(new Customer(4, "Karthik", "Pune", 87644));
		customers.add(new Customer(5, "Satish", "Mumbai", 89032));
		customers.add(new Customer(6, "Padmanjali", "Latur", 82443));
		System.out.println("Customer List  ");
		for (Object object : customers) {
			Customer customer = (Customer)object;
			System.out.println(customer);
		}
	}
}
