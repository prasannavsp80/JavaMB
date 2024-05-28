package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginAuth {

	public static void main(String[] args) {
		String user, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName  ");
		user = sc.next();
		System.out.println("Enter Password   ");
		pwd = sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonixpractice",
					"root", "root");
			String cmd = "select count(*) cnt from Login Where UserName = ? and PassCode = ?";
			PreparedStatement pst = connection.prepareStatement(cmd);
			pst.setString(1, user);
			pst.setString(2, pwd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			int count = rs.getInt("cnt");
			if (count==1) {
				System.out.println("Correct Credentials...");
				SendMail.mailSend("v.rams1997@gmail.com", "Login Success", "Sending Email Through Java Program...Thank You");
			} else {
				System.out.println("Invalid Credentails...");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
