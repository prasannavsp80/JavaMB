package com.java.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.bank.dao.BankDao;
import com.java.bank.dao.BankDaoImpl;

public class WithdrawAccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int accountNo;
		double withdrawAmount;
		System.out.println("Enter AccountNo and Withdraw Amount  ");
		accountNo = sc.nextInt();
		System.out.println("Enter Withdraw Amount  ");
		withdrawAmount = sc.nextDouble();
		BankDao dao = new BankDaoImpl();
		try {
			System.out.println(dao.withdrawAccount(accountNo, withdrawAmount));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
