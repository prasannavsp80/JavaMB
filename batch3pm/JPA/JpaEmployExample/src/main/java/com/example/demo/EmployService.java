package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	public String deleteEmploy(int empno) {
		repo.deleteById(empno);
		return "Employ Record Deleted...";
	}
	
	public List<Employ> searchByDept(String dept) {
		return repo.searchByDept(dept);
	}
	public String addEmploy(Employ employ) {
		repo.save(employ);
		return "Employ Record Inserted...";
	}
	
	public String updateEmploy(Employ employNew) {
		repo.save(employNew);
		return "Employ Record Updated...";
	}
}
