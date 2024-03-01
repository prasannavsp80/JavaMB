package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;

public class VendorListDemo {
	public static void main(String[] args) {
		List<Vendor> vendorList = new ArrayList<Vendor>();
		vendorList.add(new Vendor(1, "Swiggy", "Hyderabad", "TS", 88423));
		vendorList.add(new Vendor(2, "Zomato", "Chennai", "TN", 90224));
		vendorList.add(new Vendor(3, "RamkiBandi", "Hyderabad", "TS", 98873));
		vendorList.add(new Vendor(4, "WowDosa", "Chennai", "TN", 90882));
		vendorList.add(new Vendor(5, "Dominos", "Bangalore", "KA", 97773));
		vendorList.add(new Vendor(6, "MehFil", "Hyderabad", "TS", 87752));
		
		System.out.println("Vendor List is  ");
		vendorList.forEach(x -> {
			System.out.println(x);
		});
		
	}
}
