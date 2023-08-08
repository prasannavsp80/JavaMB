package com.java.spr;

public class EmployeeService {

	private Employee employee;

	public EmployeeService() {
		
	}
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeService(Employee employee) {
		this.employee = employee;
	}
	
}
