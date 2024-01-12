package com.java.lms;

import java.sql.SQLException;
import java.util.List;

public interface LeaveHistoryDAO {

	String applyLeave(LeaveHistory leaveHistory) throws ClassNotFoundException, SQLException;
	List<LeaveHistory> showLeaveHistory(int empId) throws ClassNotFoundException, SQLException;
	List<LeaveHistory> pendingLeaves(int empId) throws ClassNotFoundException, SQLException;
	LeaveHistory searchByLeaveId(int leaveId) throws ClassNotFoundException, SQLException;
	String acceptReject(int leaveId, String status, String managerComments) throws ClassNotFoundException, SQLException;
}
