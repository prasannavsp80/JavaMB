package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomerDetails {

	public static void main(String[] args) {
		String code = GenerateCode.createPassword();
		String customerName, email, user;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customerr Name  ");
		customerName = sc.next();
		System.out.println("Enter Email   ");
		email =  sc.next();
		System.out.println("Enter UserName  ");
		user = sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonixpractice",
					"root", "root");
			String cmd = "Insert into CustomerDetails(CustomerName, CustomerEmail, AuthCode, CustomerUser) values(?,?,?,?)";
			PreparedStatement pst = connection.prepareStatement(cmd);
			pst.setString(1, customerName);
			pst.setString(2, email);
			pst.setString(3, code);
			pst.setString(4, user);
			pst.executeUpdate();
			SendMail.mailSend(email, "Otp Code Sent", "Your OTP for Password is " +code);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
