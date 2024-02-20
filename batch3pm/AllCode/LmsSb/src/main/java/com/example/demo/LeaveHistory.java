package com.example.demo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Leave_History")
public class LeaveHistory {

	@Id
	@Column(name="Leave_ID")
	private int leaveId;
	
	@Column(name="LEAVE_NO_OF_DAYS")
	private int leaveNoOfDays;
	
	@Column(name="LEAVE_MNGR_COMMENTS")
	private String leaveManagerComments;
	
	@Column(name="Emp_ID")
	private int empId;
	@Column(name="Leave_Start_Date")
	private Date leaveStartDate;
	
	@Column(name="Leave_End_Date")
	private Date leaveEndDate;
	
	@Column(name="Leave_Type")
	@Enumerated(EnumType.STRING)
	private LeaveType leaveType;
	
	@Column(name="Leave_Status")
	@Enumerated(EnumType.STRING)
	private LeaveStatus leaveStatus;
	
	@Column(name="Leave_Reason")
	private String leaveReason;

	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public int getLeaveNoOfDays() {
		return leaveNoOfDays;
	}

	public void setLeaveNoOfDays(int leaveNoOfDays) {
		this.leaveNoOfDays = leaveNoOfDays;
	}

	public String getLeaveManagerComments() {
		return leaveManagerComments;
	}

	public void setLeaveManagerComments(String leaveManagerComments) {
		this.leaveManagerComments = leaveManagerComments;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Date getLeaveStartDate() {
		return leaveStartDate;
	}

	public void setLeaveStartDate(Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}

	public Date getLeaveEndDate() {
		return leaveEndDate;
	}

	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}

	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}

	public LeaveStatus getLeaveStatus() {
		return leaveStatus;
	}

	public void setLeaveStatus(LeaveStatus leaveStatus) {
		this.leaveStatus = leaveStatus;
	}

	public String getLeaveReason() {
		return leaveReason;
	}

	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	
	
}
