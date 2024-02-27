package com.java.intf;

public class MultiInh implements IOne, ITwo {

	@Override
	public void email() {
		System.out.println("Email is chandra@gmail.com");
	}

	@Override
	public void name() {
		System.out.println("Name is Chandra Sekhar...");
	}

}
