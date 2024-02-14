package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmploySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empno;
		System.out.println("Enter Employ No   ");
		empno = sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/infinite_december", 
							"root", "root");
			String cmd = "select * from Emp where empno=?";
			PreparedStatement pst = connection.prepareStatement(cmd);
			pst.setInt(1, empno);
			//means in 1st question mark position add value empno 
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				System.out.println("Employ No  " + rs.getInt("empno"));
				System.out.println("Employ Name  " +rs.getString("ename"));
				System.out.println("Job  " +rs.getString("job"));
				System.out.println("Mgr  " +rs.getInt("mgr"));
				System.out.println("HireDate  " +rs.getDate("hiredate"));
				System.out.println("Salary  " +rs.getInt("sal"));
			} else {
				System.out.println("*** Record not Found ***");
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
