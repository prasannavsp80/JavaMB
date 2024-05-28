package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomerPasswordUpdate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userName, otp,passwd,retypePasswd;
		System.out.println("Enter UserName  ");
		userName = sc.next();
		System.out.println("Enter Otp  ");
		otp = sc.next();
		int count = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonixpractice",
					"root", "root");
			String cmd = "select count(*) cnt from customerdetails where customerUser=? "
					+ "and AuthCode=? and authstatus='ACTIVE'";
			PreparedStatement pst = connection.prepareStatement(cmd);
			pst.setString(1, userName);
			pst.setString(2, otp);
			ResultSet rs = pst.executeQuery();
			rs.next();
			count = rs.getInt("cnt");
			if (count==1) {
				System.out.println("Enter Password  ");
				passwd = sc.next();
				System.out.println("Enter ReType Password   ");
				retypePasswd = sc.next();
				if (passwd.equals(retypePasswd)) {
					cmd = "Update CustomerDetails set CustomerPassword = ?, AuthStatus='INACTIVE' Where CustomerUser = ?";
					pst = connection.prepareStatement(cmd);
					pst.setString(1, passwd);
					pst.setString(2, userName);
					pst.executeUpdate();
					System.out.println("Password Updated Successfully...");
				}
			} else {
				System.out.println("Invalid UserName/AuthCode...");
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
