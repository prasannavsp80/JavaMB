package com.java.jdbc;

import java.sql.SQLException;
import java.util.List;

public interface EmployDao {
	List<Employ> showEmployDao() throws ClassNotFoundException, SQLException;
}
