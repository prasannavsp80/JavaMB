package com.java.lms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


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
		Date today = new Date();
		long ms = leaveHistory.getLeaveStartDate().getTime() - today.getTime();
		int dif = (int)(ms/(1000 * 60 * 60 * 24));
		if (dif < 0) {
			return "Leave-StartDate Cannot be Yesterday's Date...";
		}
		
		ms = leaveHistory.getLeaveEndDate().getTime() - today.getTime();
		dif = (int)(ms/(1000 * 60 * 60 * 24));
		if (dif < 0) {
			return "Leave-Enddate Cannot be Yesterday's Date...";
		}
		int lid = generateLeaveId();
		Date leaveStartDate = leaveHistory.getLeaveStartDate();
		Date leaveEndDate = leaveHistory.getLeaveEndDate();
		long diff = leaveEndDate.getTime() - leaveStartDate.getTime();
		int days = (int) (diff/(1000 * 60 * 60 * 24));
		if (days < 0) {
			return "Leave-StartDate cannot be greater than leave-End Date...";
		}
		days++;
		Employee employ = new EmployeeDAOImpl().searchEmployeeDao(leaveHistory.getEmpId());
		int balance = employ.getLeaveAvail();
		balance = balance-days;
		if (balance < 0) {
			return "Insufficient Leave Balance...";
		}
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
		cmd = "Update Employee set EMP_AVAIL_LEAVE_BAL = ? where EMP_ID = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, balance);
		pst.setInt(2, leaveHistory.getEmpId());
		pst.executeUpdate();
		return "Leave Applied...";
	}

	@Override
	public List<LeaveHistory> showLeaveHistory(int empId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Leave_history where EMP_ID = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empId);
		ResultSet rs = pst.executeQuery();
		LeaveHistory leaveHistory = null;
		List<LeaveHistory> listHistory = new ArrayList<LeaveHistory>();
		while(rs.next()) {
			leaveHistory = new LeaveHistory();
			leaveHistory.setEmpId(rs.getInt("Emp_Id"));
			leaveHistory.setLeaveId(rs.getInt("Leave_ID"));
			leaveHistory.setNoOfDays(rs.getInt("LEAVE_NO_OF_DAYS"));
			leaveHistory.setManagerComments(rs.getString("LEAVE_MNGR_COMMENTS"));
			leaveHistory.setLeaveStartDate(rs.getDate("LEAVE_START_DATE"));
			leaveHistory.setLeaveEndDate(rs.getDate("LEAVE_END_DATE"));
			leaveHistory.setLeaveType(rs.getString("Leave_Type"));
			leaveHistory.setLeaveStatus(rs.getString("Leave_Status"));
			leaveHistory.setLeaveReason(rs.getString("Leave_Reason"));
			listHistory.add(leaveHistory);
		}
		return listHistory;
	}

	@Override
	public List<LeaveHistory> pendingLeaves(int empId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Leave_History where emp_id in (select emp_id from Employee where "
				+ " EMP_MANAGER_ID=?) AND LEAVE_STATUS='PENDING'";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empId);
		ResultSet rs = pst.executeQuery();
		LeaveHistory leaveHistory = null;
		List<LeaveHistory> listHistory = new ArrayList<LeaveHistory>();
		while(rs.next()) {
			leaveHistory = new LeaveHistory();
			leaveHistory.setEmpId(rs.getInt("Emp_Id"));
			leaveHistory.setLeaveId(rs.getInt("Leave_ID"));
			leaveHistory.setNoOfDays(rs.getInt("LEAVE_NO_OF_DAYS"));
			leaveHistory.setManagerComments(rs.getString("LEAVE_MNGR_COMMENTS"));
			leaveHistory.setLeaveStartDate(rs.getDate("LEAVE_START_DATE"));
			leaveHistory.setLeaveEndDate(rs.getDate("LEAVE_END_DATE"));
			leaveHistory.setLeaveType(rs.getString("Leave_Type"));
			leaveHistory.setLeaveStatus(rs.getString("Leave_Status"));
			leaveHistory.setLeaveReason(rs.getString("Leave_Reason"));
			listHistory.add(leaveHistory);
		}
		return listHistory;

	}

	@Override
	public LeaveHistory searchByLeaveId(int leaveId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Leave_history where LEAVE_ID = ?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, leaveId);
		ResultSet rs = pst.executeQuery();
		LeaveHistory leaveHistory = null;
		if(rs.next()) {
			leaveHistory = new LeaveHistory();
			leaveHistory.setEmpId(rs.getInt("Emp_Id"));
			leaveHistory.setLeaveId(rs.getInt("Leave_ID"));
			leaveHistory.setNoOfDays(rs.getInt("LEAVE_NO_OF_DAYS"));
			leaveHistory.setManagerComments(rs.getString("LEAVE_MNGR_COMMENTS"));
			leaveHistory.setLeaveStartDate(rs.getDate("LEAVE_START_DATE"));
			leaveHistory.setLeaveEndDate(rs.getDate("LEAVE_END_DATE"));
			leaveHistory.setLeaveType(rs.getString("Leave_Type"));
			leaveHistory.setLeaveStatus(rs.getString("Leave_Status"));
			leaveHistory.setLeaveReason(rs.getString("Leave_Reason"));
		}
		return leaveHistory;
		
	}

	@Override
	public String acceptReject(int leaveId, String status, String managerComments) throws ClassNotFoundException, SQLException {
		System.out.println(leaveId);
		System.out.println(status);
		System.out.println(managerComments);
		LeaveHistory leaveHistory = searchByLeaveId(leaveId);
		connection = ConnectionHelper.getConnection();
		String message="";
		if (status.toUpperCase().equals("YES")) {
			String cmd = "Update Leave_History set LEAVE_STATUS='ACCEPTED', LEAVE_MNGR_COMMENTS = ? "
					+ " Where Leave_ID = ?";
			pst = connection.prepareStatement(cmd);
			pst.setString(1, managerComments);
			pst.setInt(2, leaveId);
			pst.executeUpdate();
			message = "Leave Approved...Status Changed...";
		}
		if (status.toUpperCase().equals("NO")) {
			String cmd = "Update Leave_History set LEAVE_STATUS='REJECTED', LEAVE_MNGR_COMMENTS = ? "
					+ " Where Leave_ID = ?";
			pst = connection.prepareStatement(cmd);
			pst.setString(1, managerComments);
			pst.setInt(2, leaveId);
			pst.executeUpdate();
			int leaveApplied = leaveHistory.getNoOfDays();
			int empId = leaveHistory.getEmpId();
			cmd = "Update Employee set LEAVE_NO_OF_DAYS = LEAVE_NO_OF_DAYS + ? WHERE Emp_ID = ?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, leaveApplied);
			pst.setInt(2, empId);
			pst.executeUpdate();
			message = "Leave Rejected...Balance Updated"; 
		}
		return message;
	}

}
