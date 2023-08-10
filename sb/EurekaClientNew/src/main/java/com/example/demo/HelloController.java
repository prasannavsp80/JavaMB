package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value="/")
	public String sayHello() {
		return "Hello";
	}
	
/*	http://localhost:8811  http://localhost:8811/shashank http://localhost:8811/akhila
		http://localhost:8811/nagesh */
	
	@RequestMapping(value="/shashank")
	public String manideep() {
		return "Hi I am Shashank...";
	}
	
	@RequestMapping(value="/akhila")
	public String sindhu() {
		return "Hi I am Akhila...";
	}
	
	@RequestMapping(value="/nagesh")
	public String manoj() {
		return "Hi I am Nagesh...";
	}
}
