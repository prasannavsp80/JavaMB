package com.java.customer;

public interface CustomerDao {

	String addCustomerDao(Customer customer);
	int authenticate(String customerUser, String authCode);
	String updatePassword(String customerUser, String customerPassword);
	
}
