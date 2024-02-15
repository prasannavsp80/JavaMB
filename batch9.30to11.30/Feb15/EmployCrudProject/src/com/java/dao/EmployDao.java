package com.java.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.java.model.Employ;

public interface EmployDao {

	List<Employ> showEmployDao();
	String addEmployDao(Employ employNew);
	Employ searchEmployDao(int empno);
	String deleteEmployDao(int empno);
	String updateEmployDao(Employ employUpdated);
	String storeFileDao() throws FileNotFoundException, IOException;
	String readFileDao() throws FileNotFoundException, IOException, ClassNotFoundException;
}
