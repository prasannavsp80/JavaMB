package com.java.abst;

public class AbsCon {

	public static void main(String[] args) {
		Employ[] arrEmploy = new Employ[] {
			new Lakshmi(2, "Lakshmi", 83822), new Varun(1, "Varun", 83823)	
		};
		
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
		}
	}
}
