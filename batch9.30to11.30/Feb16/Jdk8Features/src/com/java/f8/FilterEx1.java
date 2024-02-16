package com.java.f8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterEx1 {

	public static void main(String[] args) {
		List<Emp> employList = new ArrayList<Emp>();
		employList.add(new Emp(1, "Rachana", 88423));
		employList.add(new Emp(2, "Saiteja", 90032));
		employList.add(new Emp(3, "Kamalvardhan", 97733));
		employList.add(new Emp(4, "Harshitha", 81124));
		employList.add(new Emp(5, "Manisha", 89042));
		employList.add(new Emp(6, "Sohan", 81134));
		Stream<Emp> filterd1 = employList.stream().filter(x -> x.getBasic() >=90000);
		System.out.println("Filtered Data is  ");
		filterd1.forEach(System.out::println);
		
	}
}
