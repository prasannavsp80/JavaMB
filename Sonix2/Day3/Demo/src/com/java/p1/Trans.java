package com.java.p1;

import com.java.inh.Demo;

public class Trans extends Demo {

	public void show() {
		Trans obj = new Trans();
		System.out.println(obj.protectedName);
		System.out.println(obj.publicName);
	}
}
