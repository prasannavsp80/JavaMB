package com.java.bank;

import java.sql.SQLException;

public interface BankDAO {

	String createAccount(Bank bank) throws ClassNotFoundException, SQLException;
	Bank searchAccount(int accountNo) throws ClassNotFoundException, SQLException;
	String depositAccount(int accountNo, double depositAmount) throws ClassNotFoundException, SQLException;
	String withdrawAccount(int accountNo, double withdrawAmount) throws ClassNotFoundException, SQLException;
}
