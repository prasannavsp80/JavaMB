package com.java.abstest;

public class MainProg {

	public static void main(String[] args) {
		String type = "Iphone";
		MobileFactory factory = new Factory();
		Mobile mobile = factory.getDetails(type);
		mobile.name();
		mobile.price();
	}
}
