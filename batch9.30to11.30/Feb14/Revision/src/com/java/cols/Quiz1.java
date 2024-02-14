package com.java.cols;

public class Quiz1 {

	public static void main(String[] args) {
		String s1="Sohan", s2="Manisha", s3="Sohan";
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		Employ emp1 = new Employ(1, "Ravi", 88423);
		Employ emp2 = new Employ(1, "Ravi", 88423);
		
		System.out.println(emp1==emp2);
		System.out.println(emp1.equals(emp2));
	}
}
