package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Employee> showEmployoeeDao() {
		String cmd = "select * from Employee";
		List<Employee> employeeList = jdbcTemplate.query(cmd, new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee employee = new Employee();
				employee.setEmpId(rs.getInt("Emp_ID"));
				employee.setEmpName(rs.getString("EMP_NAME"));
			//	employee.setEmpDtJoin(rs.getDate("EMP_DT_JOIN"));
				employee.setEmpEmail(rs.getString("EMP_MAIL"));
				employee.setEmpMobileNo(rs.getString("EMP_MOB_NO"));
				employee.setEmpDept("EMP_DEPT");
				employee.setEmpMgrId(rs.getInt("EMP_MANAGER_ID"));
				employee.setEmpAvailLeaveBal(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
				return employee;
			}
			
		});
		return employeeList;
	}

	@Override
	public Employee searchEmployDao(int empno) {
		String cmd = "select * from Employee WHERE EMP_ID=?";
		List<Employee> employeeList = jdbcTemplate.query(cmd, new Object[] {empno}, new RowMapper<Employee>(){

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee employee = new Employee();
				employee.setEmpId(rs.getInt("Emp_ID"));
				employee.setEmpName(rs.getString("EMP_NAME"));
			//	employee.setEmpDtJoin(rs.getDate("EMP_DT_JOIN"));
				employee.setEmpEmail(rs.getString("EMP_MAIL"));
				employee.setEmpMobileNo(rs.getString("EMP_MOB_NO"));
				employee.setEmpDept("EMP_DEPT");
				employee.setEmpMgrId(rs.getInt("EMP_MANAGER_ID"));
				employee.setEmpAvailLeaveBal(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
				return employee;
			}
			
		});
		return employeeList.get(0);
	}

	@Override
	public String addEmployDao(Employee employee) {
		String cmd = "Insert into Employee(Emp_ID,Emp_Name,Emp_Mail, EMP_MOB_No,EMP_DEPT,"
				+ "EMP_MANAGER_ID,Emp_AVAIL_LEAVE_BAL) values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[] {employee.getEmpId(), employee.getEmpName(),
							employee.getEmpEmail(),employee.getEmpMobileNo(),
							employee.getEmpDept(), employee.getEmpMgrId(), 
							employee.getEmpAvailLeaveBal()
							});
		return "Record Inserted Successfully...";
	}

}
