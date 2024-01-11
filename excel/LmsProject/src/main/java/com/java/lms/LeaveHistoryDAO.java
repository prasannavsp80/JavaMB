package com.java.lms;

import java.sql.SQLException;

public interface LeaveHistoryDAO {

	String applyLeave(LeaveHistory leaveHistory) throws ClassNotFoundException, SQLException;
}
