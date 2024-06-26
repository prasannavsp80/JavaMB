package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Employ> showEmploy() {
		String cmd = "select * from Employ";
		List<Employ> listEmploy = jdbcTemplate.query(cmd, new RowMapper<Employ>() {
			 
	        @Override
	        public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
	            Employ employ = new Employ();
	            employ.setEmpno(rs.getInt("empno"));
	            employ.setName(rs.getString("name"));
	            employ.setGender(Gender.valueOf(rs.getString("gender")));
	            employ.setDept(rs.getString("dept"));
	            employ.setDesig(rs.getString("desig"));
	            employ.setBasic(rs.getInt("basic"));
	 
	            return employ;
	        }
	 
	    });
	 
	    return listEmploy;

	}
}
