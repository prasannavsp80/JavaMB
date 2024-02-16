package com.java.lamb;

interface ICalculation {
	int calc(int x, int y);
}

class C1 implements ICalculation {
	@Override
	public int calc(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}
}

class C2 implements ICalculation {

	@Override
	public int calc(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}
	
}
public class CalcTest {
	public static void main(String[] args) {
		ICalculation obj1 = new C1();
		ICalculation obj2 = new C2();
		System.out.println(obj1.calc(12, 5));
		System.out.println(obj2.calc(12, 5));
	}
}
