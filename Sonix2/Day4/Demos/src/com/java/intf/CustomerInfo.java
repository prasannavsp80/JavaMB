package com.java.intf;

public class CustomerInfo {
	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setCustId(1);
		customer1.setCustName("Vara Lakshmi");
		customer1.setBillAmount(88245.22);
		System.out.println(customer1);
	}
}
