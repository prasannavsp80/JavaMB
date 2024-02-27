package com.java.intf;

public class Employ {

	private int empno;
	private String name;
	private double basic;
	
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
	public int getEmpno() {
		return empno;
	}
	public String getName() {
		return name;
	}
	public double getBasic() {
		return basic;
	}
	
	
}
