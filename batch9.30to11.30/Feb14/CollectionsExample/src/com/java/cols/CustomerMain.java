package com.java.cols;

import java.util.SortedSet;
import java.util.TreeSet;

public class CustomerMain {
	
	public static void main(String[] args) {
	
		SortedSet customers = new TreeSet();
		customers.add(new Customer(1, "Balaji", "Hyderabad", 88344.23));
		customers.add(new Customer(2, "Shiva", "Chennai", 90044.23));
		customers.add(new Customer(3, "Leela", "Hyderabad", 91153.44));
		customers.add(new Customer(4, "Ananth", "Bangalore", 98773.22));
		customers.add(new Customer(5, "Sravani", "Pune", 89903.32));
		System.out.println("Customers List is  ");
		for (Object object : customers) {
			Customer customer = (Customer)object;
			System.out.println(customer);
		}
	}
}
