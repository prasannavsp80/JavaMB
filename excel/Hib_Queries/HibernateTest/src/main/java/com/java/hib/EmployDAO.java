package com.java.hib;
import java.util.List;

public interface EmployDAO {

	List<String> showNames();
	List<String> showDept();
	List<Employ> showByDeptName(String dept);
	long authenticate(String user, String pwd);
}
