package com.java.jdbc;

import java.sql.SQLException;
import java.util.List;

public interface EmployDao {  
	List<Employ> showEmployDao() throws ClassNotFoundException, SQLException;
	Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException;
	String addEmploy(Employ employ) throws ClassNotFoundException, SQLException;
	String updateEmploy(Employ employNew) throws ClassNotFoundException, SQLException;
	String deleteEmploy(int empno) throws ClassNotFoundException, SQLException;
}
