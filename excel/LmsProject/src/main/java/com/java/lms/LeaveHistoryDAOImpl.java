package com.java.lms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import sun.jvm.hotspot.oops.java_lang_Class;

public class LeaveHistoryDAOImpl implements LeaveHistoryDAO {

	Connection connection;
	PreparedStatement pst;
	
	public int generateLeaveId() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Select case when max(LEAVE_ID) is NULL THEN 1 else "
				+ " max(LEAVE_ID)+1 end leavId from Leave_History";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int leaveId = rs.getInt("leavId");
		return leaveId;
	}
	
	public Date convertToSql(String str) throws ParseException {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date udate = sf.parse(str);
		return udate;
	}
	@Override
	public String applyLeave(LeaveHistory leaveHistory) throws ClassNotFoundException, SQLException {
		int lid = generateLeaveId();
		Date leaveStartDate = leaveHistory.getLeaveStartDate();
		Date leaveEndDate = leaveHistory.getLeaveEndDate();
		long diff = leaveEndDate.getTime() - leaveStartDate.getTime();
		int days = (int) (diff/(1000 * 60 * 60 * 24));
		days++;
		leaveHistory.setLeaveId(lid);
		leaveHistory.setNoOfDays(days);
		leaveHistory.setLeaveStatus("PENDING");
		java.sql.Date date1 = new java.sql.Date(leaveHistory.getLeaveStartDate().getTime());
		java.sql.Date date2 = new java.sql.Date(leaveHistory.getLeaveEndDate().getTime());
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Leave_History(Leave_ID, Emp_ID, LEAVE_START_DATE, LEAVE_END_DATE, LEAVE_TYPE,"
				+ " Leave_Reason, Leave_NO_OF_DAYS, Leave_STATUS) values(?,?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, lid);
		pst.setInt(2, leaveHistory.getEmpId());
		pst.setDate(3, date1);
		pst.setDate(4, date2);
		pst.setString(5, leaveHistory.getLeaveType());
		pst.setString(6, leaveHistory.getLeaveReason());
		pst.setInt(7, days);
		pst.setString(8, leaveHistory.getLeaveStatus());
		pst.executeUpdate();
		Employee employ = new EmployeeDAOImpl().searchEmployeeDao(leaveHistory.getEmpId());
		int balance = employ.getLeaveAvail();
		balance = balance-days;
		cmd = "Update Employee set EMP_AVAIL_LEAVE_BAL = ? where EMP_ID = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, balance);
		pst.setInt(2, leaveHistory.getEmpId());
		pst.executeUpdate();
		return "Leave Applied...";
	}

}
