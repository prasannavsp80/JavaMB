package com.java.jdk8;

public class Student {

	private int sid;
	private String sname;
	private double cgp;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getCgp() {
		return cgp;
	}
	public void setCgp(double cgp) {
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", cgp=" + cgp + "]";
	}
	public Student() {

	}
	public Student(int sid, String sname, double cgp) {
		this.sid = sid;
		this.sname = sname;
		this.cgp = cgp;
	}
	
	
}
