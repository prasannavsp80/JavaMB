package com.java.dao;

import java.util.List;

import com.java.model.Employ;

public interface EmployDao {

	List<Employ> showEmployDao();
	String addEmployDao(Employ employNew);
	Employ searchEmployDao(int empno);
	String deleteEmployDao(int empno);
	String updateEmployDao(Employ employUpdated);
}
