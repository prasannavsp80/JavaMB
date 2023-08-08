package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext  ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService serviceByType = ctx.getBean("employeeServiceByName", EmployeeService.class);
		System.out.println("Autowiring byType. Employee Name="+serviceByType.getEmployee().getName());

	}
}
