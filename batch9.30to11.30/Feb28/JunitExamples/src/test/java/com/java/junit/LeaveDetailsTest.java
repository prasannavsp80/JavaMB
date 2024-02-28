package com.java.junit;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class LeaveDetailsTest {

	@Test
	public void testToString() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LeaveDetails ld = new LeaveDetails(1, 1000, sdf.parse("2024-03-01"), 
				sdf.parse("2024-03-03"), 3, "EL", "PENDING", "Nothing");
		String result = "LeaveDetails [leaveId=1, empId=1000, leaveStartDate=Fri Mar 01 00:00:00 IST 2024, leaveEndDate=Sun Mar 03 00:00:00 IST 2024, "
				+ "noOfDays=3, leaveType=EL, leaveStatus=PENDING, leaveReason=Nothing]";
		assertEquals(result, ld.toString());
	}
	
	@Test
	public void testConstructor() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LeaveDetails leaveDetails = new LeaveDetails();
		assertNotNull(leaveDetails);
		LeaveDetails ld = new LeaveDetails(1, 1000, sdf.parse("2024-03-01"), 
				sdf.parse("2024-03-03"), 3, "EL", "PENDING", "Nothing");
		assertEquals(1, ld.getLeaveId());
		assertEquals(1000, ld.getEmpId());
		assertEquals("2024-03-01", sdf.format(ld.getLeaveStartDate()));
		assertEquals("2024-03-03", sdf.format(ld.getLeaveEndDate())); 
		assertEquals(3, ld.getNoOfDays());
		assertEquals("EL", ld.getLeaveType());
		assertEquals("PENDING", ld.getLeaveStatus());
		assertEquals("Nothing", ld.getLeaveReason()); 
	}
	
	@Test
	public void testGettersAndSetters() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		LeaveDetails leaveDetails = new LeaveDetails();
		leaveDetails.setLeaveId(1);
		leaveDetails.setEmpId(1000);
		leaveDetails.setLeaveStartDate(sdf.parse("2024-03-01"));
		leaveDetails.setLeaveEndDate(sdf.parse("2024-03-03"));
		leaveDetails.setNoOfDays(3);
		leaveDetails.setLeaveType("EL");
		leaveDetails.setLeaveStatus("PENDING");
		leaveDetails.setLeaveReason("Going Home");
		
		assertEquals(1, leaveDetails.getLeaveId());
		assertEquals(1000, leaveDetails.getEmpId());
	}
}
