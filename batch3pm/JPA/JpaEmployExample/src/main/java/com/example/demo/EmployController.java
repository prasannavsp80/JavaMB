package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {

	@Autowired
	EmployService service;
	
	@GetMapping(value="/")
	public List<Employ> showEmploy() {
		return service.showEmploy();
	}
	
	@GetMapping(value="/searchEmploy/{empno}")
	public Employ searchEmploy(@PathVariable int empno) {
		return service.searchEmploy(empno);
	}
	
	@GetMapping(value="/searchByDept/{dept}")
	public List<Employ> searchByDept(@PathVariable String dept) {
		return service.searchByDept(dept);
	}
	
	@PostMapping(value="/deleteEmploy/{empno}")
	public String deleteEmploy(@PathVariable int empno) {
		return service.deleteEmploy(empno);
	}
	
	@PostMapping(value="/addEmploy")
	public String addEmploy(@RequestBody Employ employ) {
		return service.addEmploy(employ);
	}
	
	@PostMapping(value="/updateEmploy")
	public String updateEmploy(@RequestBody Employ employ) {
		return service.updateEmploy(employ);
	}
}
