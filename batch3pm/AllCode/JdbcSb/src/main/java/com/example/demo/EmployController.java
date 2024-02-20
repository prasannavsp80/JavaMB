package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {

	@Autowired
	EmployDao dao;
	
	@GetMapping(value="/search/{empno}")
	public Employ searchEmploy(@PathVariable int empno) {
		return dao.searchEmploy(empno);
	}
	
	@GetMapping(value="/")
	public List<Employ> showEmploy() {
		return dao.showEmploy();
	}
}
