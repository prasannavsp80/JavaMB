package com.java.f8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmploy1 {
	public static void main(String[] args) {
		List<Emp> EmpList = new ArrayList<Emp>();
		EmpList.add(new Emp(1, "Avesh", 48234));
		EmpList.add(new Emp(2, "Lata", 90323));
		EmpList.add(new Emp(3, "Chetan", 77423));
		EmpList.add(new Emp(4, "Subodh", 46533));
		EmpList.add(new Emp(5, "Azhar", 90323));
		EmpList.add(new Emp(6, "Priya", 49999));
		System.out.println("Sorted Data By Name ");
		Collections.sort(EmpList, (e1, e2) -> {
			return e1.getName().compareTo(e2.getName());
		});
		System.out.println("Sort By Name Wise...");
//		for (Emp emp : EmpList) {
//			System.out.println(emp);
//		}
		EmpList.forEach(System.out::println);
		
		System.out.println("Sorted Data by Basic  ");
		Collections.sort(EmpList, (e1, e2) -> {
			return (int) (e1.getBasic() - e2.getBasic());
		});
		EmpList.forEach(System.out::println);
	}
}
