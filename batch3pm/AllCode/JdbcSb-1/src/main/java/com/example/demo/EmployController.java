package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class EmployController {

	@Autowired
	EmployService service;
	
	@GetMapping(value="/")
	public List<Employ> showEmploy() {
		return service.showEmploy();
	}
	
	@PostMapping(value="/addEmploy")
	public String addEmploy(@RequestBody Employ employ) {
		return service.addEmploy(employ);
	}
	
	@GetMapping(value="/searchEmploy/{empno}")
	public Employ searchEmploy(@PathVariable int empno) {
		return service.searchEmploy(empno);
	}
}
