package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployService {

	@Autowired
	EmployRepository repo;
	
	
	public List<Employ> showEmploy() {
		return repo.findAll();
	}
	
	public Employ searchEmploy(int empno) {
		return repo.findById(empno).get();
	}
	
	public String addEmploy(Employ employ) {
		repo.save(employ);
		return "Employ Record Inserted...";
	}
}
