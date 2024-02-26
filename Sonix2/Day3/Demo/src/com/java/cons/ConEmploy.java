package com.java.cons;

public class ConEmploy {

	public static void main(String[] args) {
		Employ emp1 = new Employ(1, "Likith", 99323);
		Employ emp2 = new Employ(1, "Likith", 99323);
		Employ emp3 = new Employ(1, "Likith", 99323);
		Employ emp4 = new Employ(1, "Likith", 99323);
		
		Employ[] arr = new Employ[] {
			emp1, emp2, emp3, emp4	
		};
		
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
