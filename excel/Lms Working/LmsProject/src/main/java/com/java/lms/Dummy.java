package com.java.lms;

import java.sql.SQLException;

public class Dummy {

	public static void main(String[] args) {
		try {
			System.out.println(new LeaveHistoryDAOImpl().pendingLeaves(1000));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
