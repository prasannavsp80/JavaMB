package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterExample1 {

	public static void main(String[] args) {
		List<Vendor> vendorList = new ArrayList<Vendor>();
		vendorList.add(new Vendor(1, "Swiggy", "Hyderabad", "TS", 88423));
		vendorList.add(new Vendor(2, "Zomato", "Chennai", "TN", 90224));
		vendorList.add(new Vendor(3, "RamkiBandi", "Hyderabad", "TS", 98873));
		vendorList.add(new Vendor(4, "WowDosa", "Chennai", "TN", 90882));
		vendorList.add(new Vendor(5, "Dominos", "Bangalore", "KA", 97773));
		vendorList.add(new Vendor(6, "MehFil", "Hyderabad", "TS", 87752));
		
		System.out.println("Fitered One Whose Amount < 80000 ");
		Stream<Vendor> vendorStream = vendorList.stream().filter(x -> x.getBillAmount() <= 90000);
		vendorStream.forEach(x -> {
			System.out.println(x);
		});
		
		System.out.println("Filterd One Whose City is Hyderabad  ");
		Stream<Vendor> searchByCity = vendorList.stream().filter(x -> x.getVendorCity().equals("Hyderabad"));
		searchByCity.forEach(x -> {
			System.out.println(x);
		});
	}
}
