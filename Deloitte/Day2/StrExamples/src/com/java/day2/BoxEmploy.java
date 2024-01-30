package com.java.day2;

public class BoxEmploy {

	public void show(Object ob) {
		String type = ob.getClass().getSimpleName();
		System.out.println(type);
		if (type.equals("Employ")) {
			Employ employ = (Employ)ob;
			System.out.println("Employ No  " +employ.empno);
			System.out.println("Employ Name  " +employ.name);
			System.out.println("Basic   " +employ.basic);
		}
		if (type.equals("Student")) {
			Student student = (Student)ob;
			System.out.println("Student Id  " +student.sid);
			System.out.println("Student Name  "+student.sname);
			System.out.println("City  " +student.city);
			System.out.println("Cgp  " +student.cgp);
		}
	}
	public static void main(String[] args) {
		Employ employ = new Employ();
		employ.empno = 1;
		employ.name = "Abhishek";
		employ.basic = 88323;
		
		Student student = new Student();
		student.sid = 1;
		student.sname = "Raj";
		student.city = "Hyderabad";
		student.cgp = 9.2;
		
		BoxEmploy obj = new BoxEmploy();
		obj.show(employ);
		obj.show(student);
	}
}
