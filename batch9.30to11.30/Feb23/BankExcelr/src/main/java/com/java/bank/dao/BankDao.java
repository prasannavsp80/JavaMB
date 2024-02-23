package com.java.bank.dao;

import java.sql.SQLException;

import com.java.bank.model.Bank;

public interface BankDao {
	String createAccount(Bank bank) throws SQLException, ClassNotFoundException;
	Bank searchAccount(int accountNo) throws ClassNotFoundException, SQLException;
	String closeAccount(int accountNo) throws ClassNotFoundException, SQLException;
	String depositAccount(int accountNo, double depositAmount) throws ClassNotFoundException, SQLException;
	String withdrawAccount(int accountNo, double withdrawAmount) throws ClassNotFoundException, SQLException;
}
