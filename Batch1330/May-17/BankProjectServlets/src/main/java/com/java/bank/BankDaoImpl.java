package com.java.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankDaoImpl implements BankDao {

	Connection connection;
	PreparedStatement pst;
	
	public int generateAccountNo() throws SQLException, ClassNotFoundException {
		String cmd = "select case when max(AccountNo) IS NULL THEN 1 ELSE "
				+ " MAX(AccountNo)+1 end accno from Bank";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int accno = rs.getInt("accno");
		return accno;
	}
	
	@Override
	public String createAccount(Bank bank) throws SQLException, ClassNotFoundException {
		int accno = generateAccountNo();
		String cmd = "Insert into Bank(AccountNo, FirstName, LastName, City, "
				+ "State, Amount, Cheqfacil, AccountType) values(?,?,?,?,?,?,?,?)";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accno);
		pst.setString(2, bank.getFirstName());
		pst.setString(3, bank.getLastName());
		pst.setString(4, bank.getCity());
		pst.setString(5, bank.getState());
		pst.setInt(6, bank.getAmount());
		pst.setString(7, bank.getCheqFacil());
		pst.setString(8, bank.getAccountType());
		pst.executeUpdate();
		return "Account Created...";
	}

	@Override
	public Bank searchAccount(int accountNo) throws ClassNotFoundException, SQLException {
		String cmd = "select * from Bank where accountNo = ?";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		ResultSet rs = pst.executeQuery();
		Bank bank = null;
		if (rs.next()) {
			bank = new Bank();
			bank.setAccountNo(rs.getInt("accountNo"));
			bank.setFirstName(rs.getString("firstName"));
			bank.setLastName(rs.getString("lastName"));
			bank.setCity(rs.getString("city"));
			bank.setState(rs.getString("state"));
			bank.setAmount(rs.getInt("amount"));
			bank.setCheqFacil(rs.getString("cheqFacil"));
			bank.setAccountType(rs.getString("AccountType"));
		}
		return bank;
	}

	@Override
	public String closeAccount(int accountNo) throws ClassNotFoundException, SQLException {
		Bank bank = searchAccount(accountNo);
		if (bank==null) {
			return "Account No Not Found...";
		}
		String cmd = "Update Bank set status='inactive' where AccountNo=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		pst.executeUpdate();
		return "Account Closed...";
	}

	@Override
	public String depositAccount(int accountNo, double depositAmount) throws ClassNotFoundException, SQLException {
		Bank bank = searchAccount(accountNo);
		if (bank == null) {
			return "Account No Not Found...";
		}
		String cmd = "Update Bank set Amount = Amount+? Where AccountNo = ?";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setDouble(1, depositAmount);
		pst.setInt(2, accountNo);
		pst.executeUpdate();
		cmd = "Insert into Trans(AccountNo, TransAmount, TransType) values(?, ?, ?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		pst.setDouble(2, depositAmount);
		pst.setString(3, "C");
		pst.executeUpdate();
		return "Amount Credited...";
	}

	@Override
	public String withdrawAccount(int accountNo, double withdrawAmount) throws ClassNotFoundException, SQLException {
		Bank bank = searchAccount(accountNo);
		if (bank == null) {
			return "Account No Not Found...";
		}
		int amount = bank.getAmount();
		if (amount - withdrawAmount < 1000) {
			return "Insufficient Funds...";
		}
		String cmd = "Update Bank set Amount = Amount - ? Where AccountNo = ?";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setDouble(1, withdrawAmount);
		pst.setInt(2, accountNo);
		pst.executeUpdate();
		cmd = "Insert into Trans(AccountNo, TransAmount, TransType) values(?, ?, ?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		pst.setDouble(2, withdrawAmount);
		pst.setString(3, "D");
		pst.executeUpdate();
		return "Amount Debited...";
	}
}
