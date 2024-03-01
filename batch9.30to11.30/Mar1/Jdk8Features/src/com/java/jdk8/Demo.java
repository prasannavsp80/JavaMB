package com.java.jdk8;

interface IOne {
	default void show() {
		System.out.println("Show from Interface One...");
	}
}

interface ITwo {
	default void show() {
		System.out.println("Show from Interface Two...");
	}
}

interface IThree {
	default void show() {
		System.out.println("Show from Interface Three...");
	}
}

class Test implements IOne, ITwo, IThree {

	@Override
	public void show() {
		IOne.super.show();
		ITwo.super.show();
		IThree.super.show();
	}
	
}

public class Demo {
	public static void main(String[] args) {
		Test obj = new Test();
		obj.show();
	}
}
