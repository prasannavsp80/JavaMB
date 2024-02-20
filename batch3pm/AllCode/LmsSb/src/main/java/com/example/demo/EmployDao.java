package com.example.demo;

import java.util.List;
public interface EmployDao {

	List<Employee> showEmployoeeDao();
	Employee searchEmployDao(int empno);
	String addEmployDao(Employee employee);
}
