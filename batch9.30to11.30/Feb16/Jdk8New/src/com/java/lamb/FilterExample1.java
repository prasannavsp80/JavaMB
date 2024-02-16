package com.java.lamb;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterExample1 {
	
	public static void main(String[] args) {
		
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Shiva", 90322));
		employList.add(new Employ(2, "Balaji", 81122));
		employList.add(new Employ(3, "Sravani", 87893));
		employList.add(new Employ(4, "Leela", 90883));
		employList.add(new Employ(5, "Ananth", 87732));
		employList.add(new Employ(6, "Manikantha", 90882));
		
		Stream<Employ> filter1 = employList.stream().filter(x -> x.getBasic() >= 90000);
			//employList.stream().map(null)
		System.out.println("Filtered Data ");
		filter1.forEach(System.out::println);
	}
}
