package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {

	@Autowired
	EmployDAOImpl dao;
	// http://localhost:8811/employShow  
	// http://localhost:8811/empSearch/1
	
	@RequestMapping("/employShow")
	public List<Employ> showAll() {
		return dao.showEmployDao();
	}
	
	@RequestMapping("/empSearch/{empno}")
	public Employ searchEmploy(@PathVariable int empno) {
		return dao.searchEmployDao(empno);
	}
}
