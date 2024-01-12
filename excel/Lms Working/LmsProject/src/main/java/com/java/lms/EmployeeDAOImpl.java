package com.java.lms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

	Connection connection;
	PreparedStatement pst;
	
	@Override
	public List<Employee> showEmployeeDao() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Select * from Employee";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		Employee employee = null;
		List<Employee> employeeList = new ArrayList<Employee>();
		while(rs.next()) {
			employee = new Employee();
			employee.setEmpId(rs.getInt("EMP_ID"));
			employee.setEmpName(rs.getString("EMP_NAME"));
			employee.setEmpEmail(rs.getString("EMP_MAIL"));
			employee.setEmpMobile(rs.getString("EMP_MOB_NO"));
			employee.setManagerId(rs.getInt("EMP_MANAGER_ID"));
			employee.setLeaveAvail(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
			employeeList.add(employee);
		}
		return employeeList;
	}

	@Override
	public Employee searchEmployeeDao(int empno) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Select * from Employee where Emp_ID = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet rs = pst.executeQuery();
		Employee employee = null;	
		if(rs.next()) {
			employee = new Employee();
			employee.setEmpId(rs.getInt("EMP_ID"));
			employee.setEmpName(rs.getString("EMP_NAME"));
			employee.setEmpEmail(rs.getString("EMP_MAIL"));
			employee.setEmpMobile(rs.getString("EMP_MOB_NO"));
			employee.setManagerId(rs.getInt("EMP_MANAGER_ID"));
			employee.setLeaveAvail(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
			//employeeList.add(employee);
		}
		return employee;
	}

}
