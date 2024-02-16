package com.java.f8;

import java.util.ArrayList;
import java.util.List;

public class MaxMinEx {
	public static void main(String[] args) {
		List<Emp> EmpList = new ArrayList<Emp>();
		EmpList.add(new Emp(1, "Avesh", 48234));
		EmpList.add(new Emp(2, "Lata", 90323));
		EmpList.add(new Emp(3, "Chetan", 77423));
		EmpList.add(new Emp(4, "Subodh", 46533));
		EmpList.add(new Emp(5, "Azhar", 90323));
		EmpList.add(new Emp(6, "Priya", 49999));
		
		
		Emp employMaxBasic = EmpList.stream().max((m1, m2) -> 
			m1.getBasic() >= m2.getBasic() ? 1 : -1).get();
		System.out.println("Max Employ Record Details  ");
		System.out.println(employMaxBasic);
		
		Emp employMinBasic = EmpList.stream().min((m1, m2) -> 
			m1.getBasic() >= m2.getBasic() ? 1 : -1).get();
		System.out.println("Min Employ Record Details  ");
		System.out.println(employMinBasic);
	}
}
