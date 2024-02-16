package com.java.f8;

@FunctionalInterface 
interface IMethodRef1 {
	void show();
}

class Demo1 {
	void display() {
		System.out.println("Demo1 class Display Method...");
	}
}
public class MethodRef1 {

	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		IMethodRef1 i1 = obj::display;
		i1.show();
	}
}
