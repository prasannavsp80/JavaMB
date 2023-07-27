package com.java.day2;

public class ConTest {

	int a,b;
	
	public ConTest() {
		a=5;
		b=7;
	}
	
	public ConTest(int a, int b) {
		this.a=a;
		this.b=b;
	}

	@Override
	public String toString() {
		return "ConTest [a=" + a + ", b=" + b + "]";
	}
	
	public static void main(String[] args) {
		ConTest obj1 = new ConTest();
		System.out.println(obj1);
		ConTest obj2 = new ConTest(15, 9);
		System.out.println(obj2);
	}
}
