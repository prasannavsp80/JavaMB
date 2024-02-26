package com.java.inh;

public class Demo {

	private String privateName = "Chandra Sekhar";
	public String publicName = "Karthik";
	protected String protectedName = "Padmanjali";
	String friendlyName = "Meghana";
	
	public void show() {
		System.out.println(privateName);
		System.out.println(publicName);
		System.out.println(protectedName);
		System.out.println(friendlyName);
	}
}

class Hello extends Demo {
	public void show() {
		Hello hello = new Hello();
		System.out.println(hello.friendlyName);
		System.out.println(hello.protectedName);
		System.out.println(hello.publicName);
	}
}
class TestMe {
	public void show() {
		Demo obj = new Demo();
		System.out.println(obj.publicName);
		System.out.println(obj.friendlyName);
		System.out.println(obj.protectedName);
	}
}