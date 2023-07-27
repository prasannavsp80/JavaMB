package com.java.abstest;

public class Factory extends MobileFactory {

	@Override
	public Mobile getDetails(String type) {
		if (type.equals("Iphone")) {
			return new IPhone();
		} else if (type.equals("Samsung")) {
			return new Samsung();
		}
		return null;
	}

}
