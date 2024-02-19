package com.example.demo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Employee")
public class Employee {

	@Id
	@Column(name="empId")
	private int empId;
	
	@Column(name="EMP_NAME")
	private String empName;
	
	@Column(name="EMP_MAIL")
	private String empEmail;
	
	@Column(name="EMP_MOBILE_NO")
	private String empMobileNo;
	
	@Column(name="EMP_DT_JOIN")
	private Date empDtJoin;
	
	@Column(name="EMP_DEPT")
	private String empDept;
	
	@Column(name="EMP_MANAGER_ID")
	private int empMgrId;
	
	@Column(name="EMP_AVAIL_LEAVE_BAL")
	private int empAvailLeaveBal;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpMobileNo() {
		return empMobileNo;
	}

	public void setEmpMobileNo(String empMobileNo) {
		this.empMobileNo = empMobileNo;
	}

	public Date getEmpDtJoin() {
		return empDtJoin;
	}

	public void setEmpDtJoin(Date empDtJoin) {
		this.empDtJoin = empDtJoin;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public int getEmpMgrId() {
		return empMgrId;
	}

	public void setEmpMgrId(int empMgrId) {
		this.empMgrId = empMgrId;
	}

	public int getEmpAvailLeaveBal() {
		return empAvailLeaveBal;
	}

	public void setEmpAvailLeaveBal(int empAvailLeaveBal) {
		this.empAvailLeaveBal = empAvailLeaveBal;
	}
	
	
}
