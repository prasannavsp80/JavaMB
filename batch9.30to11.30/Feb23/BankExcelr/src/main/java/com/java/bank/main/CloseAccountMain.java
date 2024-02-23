package com.java.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.bank.dao.BankDao;
import com.java.bank.dao.BankDaoImpl;

public class CloseAccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int accountNo;
		System.out.println("Enter Account No  ");
		accountNo = sc.nextInt();
		BankDao dao = new BankDaoImpl();
		try {
			System.out.println(dao.closeAccount(accountNo));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
