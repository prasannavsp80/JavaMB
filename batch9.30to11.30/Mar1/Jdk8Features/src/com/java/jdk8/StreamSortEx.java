package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamSortEx {

	public static void main(String[] args) {
		List<Vendor> vendorList = new ArrayList<Vendor>();
		vendorList.add(new Vendor(1, "Swiggy", "Hyderabad", "TS", 88423));
		vendorList.add(new Vendor(2, "Zomato", "Chennai", "TN", 90224));
		vendorList.add(new Vendor(3, "RamkiBandi", "Hyderabad", "TS", 98873));
		vendorList.add(new Vendor(4, "WowDosa", "Chennai", "TN", 90882));
		vendorList.add(new Vendor(5, "Dominos", "Bangalore", "KA", 97773));
		vendorList.add(new Vendor(6, "MehFil", "Hyderabad", "TS", 87752));
		
		Stream<Vendor> sorted1 = vendorList.stream().sorted((v1, v2) -> v1.getVendorName().compareTo(v2.getVendorName()));
		
		System.out.println("Sorted Data  ");
		sorted1.forEach(x -> {
			System.out.println(x);
		});
		
	}
}
