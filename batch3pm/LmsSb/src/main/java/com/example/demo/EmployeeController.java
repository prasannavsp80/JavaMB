package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeDaoImpl impl;
	
	@GetMapping(value="/")
	public List<Employee> showEmployee() {
		return impl.showEmployoeeDao();
	}
	
	@GetMapping(value="/searchEmploy/{empno}")
	public Employee searchEmployee(@PathVariable int empno) {
		return impl.searchEmployDao(empno);
	}
}
