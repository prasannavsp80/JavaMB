package com.java.jdk8;

public class Test implements IOne, ITwo, IThree {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		IOne.super.show();
		ITwo.super.show();
		IThree.super.show();
	}
	
	public static void main(String[] args) {
		Test obj = new Test();
		obj.show();
	}
	
}
