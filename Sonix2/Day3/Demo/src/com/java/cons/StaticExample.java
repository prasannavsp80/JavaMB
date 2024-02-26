package com.java.cons;

public class StaticExample {

	static int count;
	
	public void increment() {
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		StaticExample obj1 = new StaticExample();
		StaticExample obj2 = new StaticExample();
		StaticExample obj3 = new StaticExample();
		
		obj1.increment();
		obj2.increment();
		obj3.increment();
	}
}
