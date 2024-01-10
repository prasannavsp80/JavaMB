package com.java.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployAddMain {

	public static void main(String[] args) {
		Employ employ = new Employ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number   ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Name   ");
		employ.setName(sc.next());
		System.out.println("Enter Gender  ");
		employ.setGender(sc.next());
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic  ");
		employ.setBasic(sc.nextDouble());
		EmployDAO dao = new EmployDAOImpl();
		try {
			System.out.println(dao.addEmployDao(employ));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
