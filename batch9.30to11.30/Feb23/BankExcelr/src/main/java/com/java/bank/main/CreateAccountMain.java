package com.java.bank.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.bank.dao.BankDao;
import com.java.bank.dao.BankDaoImpl;
import com.java.bank.model.Bank;

public class CreateAccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		System.out.println("Enter FirstName  ");
		bank.setFirstName(sc.next());
		System.out.println("Enter LastName  ");
		bank.setLastName(sc.next());
		System.out.println("Enter City  ");
		bank.setCity(sc.next());
		System.out.println("Enter State  ");
		bank.setState(sc.next());
		System.out.println("Enter Amount  ");
		bank.setAmount(sc.nextInt()); 
		System.out.println("Enter CheqFacil  ");
		bank.setCheqFacil(sc.next());
		System.out.println("Enter Account Type  ");
		bank.setAccountType(sc.next());
		BankDao dao = new BankDaoImpl();
		try {
			System.out.println(dao.createAccount(bank));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
