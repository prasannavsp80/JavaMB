package com.java.f8;

interface IOne {
	default void show() {
		System.out.println("Show from Interface One");
	}
}

interface ITwo {
	default void show() {
		System.out.println("Show from interface Two");
	}
}

interface IThree {
	default void show() {
		System.out.println("Show From interface Three");
	}
}

class MultiInh implements IOne, ITwo, IThree {

	@Override
	public void show() {
		IOne.super.show();
		ITwo.super.show();
		IThree.super.show();
	}
	
}

public class InterfaceEx {
	public static void main(String[] args) {
		MultiInh obj =new MultiInh();
		obj.show();
	}
}
