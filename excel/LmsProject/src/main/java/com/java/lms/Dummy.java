package com.java.lms;

import java.sql.SQLException;

public class Dummy {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAOImpl();
		try {
			System.out.println(dao.showEmployeeDao());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
