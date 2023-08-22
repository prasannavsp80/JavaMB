package com.example.demo;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service	
@Transactional
public class EmployService {

	@Autowired
	EmployRepository repo;
	
	@Autowired  
    JdbcTemplate jdbc;  
	
	public String authenticate(String user,String pwd) {
		String cmd = "select count(*) cnt from Users where userName=? "
				+ " AND passCode=?";
		List str=jdbc.query(cmd,new Object[] {user,pwd}, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return rs.getInt("cnt");
			}
			
		});
		return str.get(0).toString();
	}

	
	public Employ search(int menuId) {
		return repo.findById(menuId).get();
	}
	public List<Employ> showEmploy() {
		return repo.findAll();
	}

}
