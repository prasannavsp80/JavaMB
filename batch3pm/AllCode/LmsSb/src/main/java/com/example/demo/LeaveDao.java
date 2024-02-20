package com.example.demo;

import java.util.List;

public interface LeaveDao {
	List<LeaveHistory> showEmployHistory(int empId);
	LeaveHistory searchByLeaveId(int leaveId);
}
