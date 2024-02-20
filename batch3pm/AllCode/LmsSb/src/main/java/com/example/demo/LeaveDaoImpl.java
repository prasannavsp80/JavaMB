package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class LeaveDaoImpl implements LeaveDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	EmployDao dao;
	
	@Override
	public List<LeaveHistory> showEmployHistory(int empId) {
		String cmd = "select * from leave_history where Emp_ID=?";
		List<LeaveHistory> menuList=jdbcTemplate.query(cmd, new Object[] {empId}, new RowMapper<LeaveHistory>() {

			@Override
			public LeaveHistory mapRow(ResultSet rs, int arg1) throws SQLException {
				LeaveHistory leaveDetails = new LeaveHistory();
				leaveDetails.setLeaveId(rs.getInt("LEAVE_ID"));
				leaveDetails.setLeaveNoOfDays(rs.getInt("LEAVE_NO_OF_DAYS"));
				leaveDetails.setLeaveManagerComments("LEAVE_MNGR_COMMENTS");
				leaveDetails.setEmpId(rs.getInt("EMP_ID"));
				leaveDetails.setLeaveStartDate(rs.getDate("LEAVE_START_DATE"));
				leaveDetails.setLeaveEndDate(rs.getDate("LEAVE_END_DATE"));
				leaveDetails.setLeaveType(LeaveType.valueOf(rs.getString("Leave_Type")));
				leaveDetails.setLeaveStatus(LeaveStatus.valueOf(rs.getString("LEAVE_STATUS")));
				return leaveDetails;
			}
		});
		return menuList;
	}

	@Override
	public LeaveHistory searchByLeaveId(int leaveId) {
		String cmd = "select * from leave_history where Leave_ID=?";
		List<LeaveHistory> menuList=jdbcTemplate.query(cmd, new Object[] {leaveId}, new RowMapper<LeaveHistory>() {

			@Override
			public LeaveHistory mapRow(ResultSet rs, int arg1) throws SQLException {
				LeaveHistory leaveDetails = new LeaveHistory();
				leaveDetails.setLeaveId(rs.getInt("LEAVE_ID"));
				leaveDetails.setLeaveNoOfDays(rs.getInt("LEAVE_NO_OF_DAYS"));
				leaveDetails.setLeaveManagerComments("LEAVE_MNGR_COMMENTS");
				leaveDetails.setEmpId(rs.getInt("EMP_ID"));
				leaveDetails.setLeaveStartDate(rs.getDate("LEAVE_START_DATE"));
				leaveDetails.setLeaveEndDate(rs.getDate("LEAVE_END_DATE"));
				leaveDetails.setLeaveType(LeaveType.valueOf(rs.getString("Leave_Type")));
				leaveDetails.setLeaveStatus(LeaveStatus.valueOf(rs.getString("LEAVE_STATUS")));
				return leaveDetails;
			}
		});
		return menuList.get(0);
	}
	
	public int count(int empId, String sdate, String edate) {
		String cmd = "SELECT COUNT(*) cnt FROM leave_history WHERE EMP_ID = ? " + 
				"         AND LEAVE_STATUS = 'PENDING' AND " + 
				"       (  LEAVE_START_DATE <= ? AND LEAVE_END_DATE >= ? OR " + 
				"        LEAVE_START_DATE <= ? AND LEAVE_END_DATE >= ? )";
		List str=jdbcTemplate.query(cmd,new Object[] {empId,sdate,sdate,edate,edate}, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return rs.getInt("cnt");
			}
			
		});
		int count = Integer.parseInt(str.get(0).toString());
		return count;
	}
	
	public String applyLeave(LeaveHistory leave) {
		leave.setLeaveStatus(LeaveStatus.PENDING);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String sd = sdf.format(leave.getLeaveStartDate());
		String ed = sdf.format(leave.getLeaveEndDate());
		int cnt = count(leave.getEmpId(), sd, ed);
		System.out.println("Count is  " +cnt);
//		Connection con = ConnectionHelper.getConnection();
		  long ms = leave.getLeaveEndDate().getTime() - leave.getLeaveStartDate().getTime();
		    long m = ms / (1000 * 24 * 60 * 60);
		    int days = (int) m;
		    days = days + 1;
		leave.setLeaveNoOfDays(days);
		Employee found = dao.searchEmployDao(leave.getEmpId());
		int bal = found.getEmpAvailLeaveBal();
		int diff = bal - leave.getLeaveNoOfDays();
		if (leave.getLeaveNoOfDays() < 0) {
			return "Start-Date must be Less than End-Date...";
		} else if(bal - leave.getLeaveNoOfDays() < 0) {
			return "Insufficient Leave Balance...";
		} else if (cnt==1) {
			return "You are already applied on the given Dates...";
		}
		else {
		String cmd = "INSERT INTO leave_history(LEAVE_START_DATE,LEAVE_END_DATE,LEAVE_NO_OF_DAYS,LEAVE_REASON"
				+ ",LEAVE_TYPE,EMP_ID,LEAVE_STATUS) VALUES(?,?,?,?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[] {leave.getLeaveStartDate(),leave.getLeaveEndDate(), 
				leave.getLeaveNoOfDays(), leave.getLeaveReason(), leave.getLeaveType().toString(),
				leave.getEmpId(),LeaveStatus.PENDING.toString(),
				});
		cmd = "UPDATE employee SET EMP_AVAIL_LEAVE_BAL = ? WHERE EMP_ID = ?";
		jdbcTemplate.update(cmd, new Object[] {diff,leave.getEmpId()});
		return "Leave Applied Successfully...";
		}
	}


}
