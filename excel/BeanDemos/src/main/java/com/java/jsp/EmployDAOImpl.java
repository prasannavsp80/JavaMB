package com.java.jsp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployDAOImpl implements EmployDAO {

	Connection connection;
	PreparedStatement pst;
	
	@Override
	public List<Employ> showEmployDao() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Employ> employList = new ArrayList<Employ>();
		Employ employ = null;
		while(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(rs.getString("gender"));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			employList.add(employ);
		}
		return employList;
	}

	@Override
	public Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ where empno=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet rs = pst.executeQuery();
		Employ employ = null;
		if (rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(rs.getString("gender"));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));			
		}
		return employ;
	}

	@Override
	public String addEmployDao(Employ employ) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Employ(Empno,Name,Gender,Dept,Desig,Basic)  "
				+ " values(?, ?, ?, ?, ?, ?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, employ.getEmpno());
		pst.setString(2, employ.getName());
		pst.setString(3, employ.getGender());
		pst.setString(4, employ.getDept());
		pst.setString(5, employ.getDesig());
		pst.setDouble(6, employ.getBasic());
		pst.executeUpdate();
		return "Employ Record Inserted...";
	}

	@Override
	public String deleteEmployDao(int empno) throws ClassNotFoundException, SQLException {
		Employ employFound = searchEmployDao(empno);
		if (employFound==null) {
			return "Employ record not found...";
		}
		connection = ConnectionHelper.getConnection();
		String cmd = "delete from Employ where empno=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
		pst.executeUpdate();
		return "Employ Record Deleted...";
	}

}
