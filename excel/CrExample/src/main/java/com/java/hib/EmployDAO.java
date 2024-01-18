package com.java.hib;

import java.util.List;

public interface EmployDAO {

	List<Employ> showEmploy();
	Employ searchEmploy(int empno);
	List<Object[]> showProjections();
	long authenticate(String user, String pwd);
	String addUser(Users user);
}
