package com.java.day2;

public class BoxTest {
	public void show(Object ob) {
		String type = ob.getClass().getSimpleName();
		System.out.println(type);
		if (type.equals("Integer")) {
			int x = (Integer)ob;
			System.out.println("Integer  " +x);
		}
		
		if (type.equals("String")) {
			String x = (String)ob;
			System.out.println("String  " +x);
		}
		
		if (type.equals("Double")) {
			double x = (Double)ob;
			System.out.println("Double  " +x);
		}
	}
	
	public static void main(String[] args) {
		int a = 12;
		double b = 12.5;
		String str = "Hello";
		BoxTest obj = new BoxTest();
		obj.show(a);
		obj.show(12.5);
		obj.show("Sonix");
	}
}
