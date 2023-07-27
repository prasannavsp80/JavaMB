package com.java.day2;

public class BoxTest {

	public void show(Object ob) {
		String type = ob.getClass().getSimpleName();
		System.out.println(type);
		if (type.equals("Integer")) {
			System.out.println("Integer Casting...");
			int x = (Integer)ob;
		}
		
		if (type.equals("Double")) {
			System.out.println("Double Casting...");
			double x = (Double)ob;
		}
		
		if (type.equals("String")) {
			System.out.println("String Casting...");
			String x = (String)ob;
		}
		
	}
	public static void main(String[] args) {
		int x=12;
		double y=12.5;
		String str="Hello";
		BoxTest obj = new BoxTest();
		obj.show(x);
		obj.show(y);
		obj.show(str);
	}
}
