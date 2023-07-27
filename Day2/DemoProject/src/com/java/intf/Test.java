package com.java.intf;

public class Test implements IOne, ITwo {

	@Override
	public void email() {
		System.out.println("Email is MayBank@gmail.com");
	}

	@Override
	public void name() {
		System.out.println("Name is MayBank Labs...");
		
	}

}
