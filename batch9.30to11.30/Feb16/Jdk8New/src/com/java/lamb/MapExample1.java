package com.java.lamb;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample1 {

	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Shiva", 90322));
		employList.add(new Employ(2, "Balaji", 81122));
		employList.add(new Employ(3, "Sravani", 87893));
		employList.add(new Employ(4, "Leela", 90883));
		employList.add(new Employ(5, "Ananth", 87732));
		employList.add(new Employ(6, "Manikantha", 90882));
		
		// Store all salaries in separte list 
		
		List<Double> salaries = 
			employList.stream().map(x -> x.getBasic()).collect(Collectors.toList());
		System.out.println("Salaries are  ");
		//salaries.forEach(System.out::println);
		salaries.forEach(x -> System.out.println(x));
		
		List<String> names = 
				employList.stream().map(x -> x.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println("Names w.r.t. Upper Case");
		names.forEach(System.out::println);
		
		double sum = employList.stream().map(x -> x.getBasic()).reduce(0.0, Double::sum);
		System.out.println(sum);
	}
}
