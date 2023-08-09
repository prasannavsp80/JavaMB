package com.java.mvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@Autowired
	EmployDAOImpl dao;
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		List<Employ> employList = dao.showEmployDao();
		return new ModelAndView("home","employList",employList);
	}
	
	@RequestMapping(value="/editemploy")
	public ModelAndView search(HttpServletRequest req) {
		int empno = Integer.parseInt(req.getParameter("empno"));
		Employ employ = dao.searchEmployDao(empno);
		return new ModelAndView("employsearchform","employ",employ);
	}

	@RequestMapping(value="/createEmploy")
	public ModelAndView addEmploy() {
		return new ModelAndView("addEmploy");
	}

	@RequestMapping(value="/saveEmploy")
	public ModelAndView saveEmploy(HttpServletRequest req) {
		Employ employ = new Employ();
		employ.setEmpno(Integer.parseInt(req.getParameter("empno")));
		employ.setName(req.getParameter("name"));
		employ.setDept(req.getParameter("dept"));
		employ.setDesig(req.getParameter("desig"));
		employ.setBasic(Integer.parseInt(req.getParameter("basic")));
		dao.addEmployDao(employ);
		//return new ModelAndView("home");
		return new ModelAndView("redirect:/");
	}

}
