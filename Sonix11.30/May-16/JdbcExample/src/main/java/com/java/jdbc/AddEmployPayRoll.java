package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddEmployPayRoll {

	public static void main(String[] args) {
		int empno;
		String name;
		double salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No   ");
		empno = sc.nextInt();
		System.out.println("Enter Name  ");
		name = sc.next();
		System.out.println("Enter Basic  ");
		salary = sc.nextDouble();
		double hra = salary * 0.03;
		double da = salary * 0.012;
		double tax = salary * 0.142;
		double pf = salary * 0.033;
		double gross =salary+ hra + da ;
		double net = gross - tax -pf;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonixpractice",
					"root", "root");
			String cmd = "Insert into EmployPayRoll(empno, name, Salary, Hra, Da, tax,"
					+ "Pf,GrossPay,NetPay) Values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst = connection.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.setString(2, name);
			pst.setDouble(3, salary);
			pst.setDouble(4, hra);
			pst.setDouble(5, da);
			pst.setDouble(6, tax);
			pst.setDouble(7, pf);
			pst.setDouble(8, gross);
			pst.setDouble(9, net);
			pst.executeUpdate();
			System.out.println("*** Record Inserted for Payroll ***");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
