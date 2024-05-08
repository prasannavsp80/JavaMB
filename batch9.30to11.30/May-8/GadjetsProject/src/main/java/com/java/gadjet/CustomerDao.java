package com.java.gadjet;

import java.util.List;

public interface CustomerDao {

	List<Customers> showCustomer();
	int LoginCheck(Login login);
}
