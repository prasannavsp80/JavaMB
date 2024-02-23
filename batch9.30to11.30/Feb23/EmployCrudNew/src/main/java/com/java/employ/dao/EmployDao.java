package com.java.employ.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.employ.model.Employ;

public interface EmployDao {
	List<Employ> showEmployDao() throws ClassNotFoundException, SQLException;
	Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException;
	String addEmployDao(Employ employ) throws SQLException, ClassNotFoundException;
	String deleteEmployDao(int empno) throws ClassNotFoundException, SQLException;
	String updateEmployDao(Employ employNew) throws ClassNotFoundException, SQLException;
}
