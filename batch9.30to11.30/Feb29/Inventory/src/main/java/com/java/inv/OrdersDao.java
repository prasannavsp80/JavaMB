package com.java.inv;

import java.sql.SQLException;

public interface OrdersDao {
	String placeOrder(Order order) throws ClassNotFoundException, SQLException;
}
