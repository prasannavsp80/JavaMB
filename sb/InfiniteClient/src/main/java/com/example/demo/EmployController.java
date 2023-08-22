package com.example.demo;

import java.util.List;

import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {

	@Autowired
	private EmployService service;
	
	@RequestMapping(value="/showEmploy")
	public List<Employ> list() {
		return service.showEmploy();
	}
	
	@RequestMapping("/employAuthenticate/{user}/{pwd}")
	public String autneticateion(@PathVariable String user, @PathVariable String pwd) {
		return service.authenticate(user, pwd);
	}

	
	@RequestMapping("/search/{id}")
	public ResponseEntity<Employ> get(@PathVariable int id) {
		try {
		Employ employ = service.search(id);
		return new ResponseEntity<Employ>(employ,HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Employ>(HttpStatus.NOT_FOUND);
		}
	}


}
