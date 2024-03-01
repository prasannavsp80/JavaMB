package com.java.jdk8;

interface ITest {
	void show();
}

class Satish implements ITest {

	@Override
	public void show() {
		System.out.println("From Satish Class Method...");
	}
	
}

class Sravani implements ITest {

	@Override
	public void show() {
		System.out.println("From Sravani Class... ");
	}
	
}
public class InterfaceDemo {
	public static void main(String[] args) {
		ITest obj1 = new Satish();
		ITest obj2 = new Sravani();
		obj1.show();
		obj2.show();
	}
}
