package com.java.hib;

import java.util.List;

public interface EmployDAO {
	List<Employ> showEmploy();
	Employ searchEmploy(int empno);
	String updateEmploy(Employ employUpdated);
	String deleteEmploy(int empno);
	String addEmploy(Employ employNew);
	int validateUser(String user, String pwd);
}
