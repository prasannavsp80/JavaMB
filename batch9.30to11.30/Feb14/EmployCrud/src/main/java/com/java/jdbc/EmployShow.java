package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployShow {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = 
				DriverManager.getConnection("jdbc:mysql://localhost:3306/infinite_december", 
						"root", "root");
			String cmd = "select * from Emp";
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("select * from Emp");
			while(rs.next()) {
				System.out.println("Employ No  " + rs.getInt("empno"));
				System.out.println("Employ Name  " +rs.getString("ename"));
				System.out.println("Job  " +rs.getString("job"));
				System.out.println("Mgr  " +rs.getInt("mgr"));
				System.out.println("HireDate  " +rs.getDate("hiredate"));
				System.out.println("Salary  " +rs.getInt("sal"));
				System.out.println("------------------------------------");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
