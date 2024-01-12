package com.java.lms;

import java.util.Date;

public class LeaveHistory {

	private int leaveId;
	private int empId;
	private Date leaveStartDate;
	private Date leaveEndDate;
	private String leaveType;
	private String leaveStatus;
	private String leaveReason;
	private int noOfDays;
	private String managerComments;
	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
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
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public String getManagerComments() {
		return managerComments;
	}
	public void setManagerComments(String managerComments) {
		this.managerComments = managerComments;
	}
	@Override
	public String toString() {
		return "LeaveHistory [leaveId=" + leaveId + ", empId=" + empId + ", leaveStartDate=" + leaveStartDate
				+ ", leaveEndDate=" + leaveEndDate + ", leaveType=" + leaveType + ", leaveStatus=" + leaveStatus
				+ ", leaveReason=" + leaveReason + ", noOfDays=" + noOfDays + ", managerComments=" + managerComments
				+ "]";
	}
	
	
}
