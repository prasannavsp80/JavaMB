package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaveController {

	@Autowired
	LeaveDaoImpl impl;
	
	@GetMapping(value="/showHisotry/{empId}")
	public List<LeaveHistory> showHistory(@PathVariable int empId) {
		return impl.showEmployHistory(empId);
	}
	
	@GetMapping(value="/searchByLeaveId/{leaveId}")
	public LeaveHistory searchByLeaveid(@PathVariable int leaveId) {
		return impl.searchByLeaveId(leaveId);
	}
	
	@PostMapping(value="/applyLeave")
	public String applyLeave(@RequestBody LeaveHistory leaveHistory) {
		return impl.applyLeave(leaveHistory);
	}
}
