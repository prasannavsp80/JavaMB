package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployDAOImpl {

	static List<Employ> employList;
	
	public EmployDAOImpl() {
		
	}
	
	static {

		employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Venkat", "Java", "Programmer", 88323));
		employList.add(new Employ(2, "Avinash", "Dotnet", "Developer", 89321));
		employList.add(new Employ(3, "Chandan", "Angular", "Manager", 78933));
		employList.add(new Employ(4, "Nagesh", "Java", "Expert", 90883));
		employList.add(new Employ(5, "Akhila", "React", "Programmer", 78833));
		employList.add(new Employ(6, "Shashank", "Sql", "Developer", 98222));
		
	}
	
	public List<Employ> showEmployDao() {
		return employList;
	}

	public Employ searchEmployDao(int empno) {
		Employ employFound = null;
		for(Employ employ : employList) {
			if (employ.getEmpno()==empno) {
				employFound = employ;
				break;
			}
		}
		return employFound;
	}


}
