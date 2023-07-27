package com.java.intf;

public class Main {

	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
			new Dileep(), new Ravi()	
		};
		
		for (ITraining i : arr) {
			i.name();
			i.email();
		}
	}
}
