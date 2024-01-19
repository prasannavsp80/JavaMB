package com.java.hib;

import java.util.List;

public interface EmployDAO {

	List<Employ> showEmploy();
	Employ searchEmploy(int empno);
	int validate(String user, String pwd);
}
