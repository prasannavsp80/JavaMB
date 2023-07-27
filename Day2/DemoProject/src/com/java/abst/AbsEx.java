package com.java.abst;

public class AbsEx {

	public static void main(String[] args) {
//		Training obj1 =  new Heera();
//		Training obj2 = new Abhishek();
//		Training obj3 = new Renuka();
//		
		Training[] arrTraining = new Training[] {
			new Heera(), new Abhishek(), new Renuka()	
		};
		
		for (Training t : arrTraining) {
			t.name();
			t.email();
		}
	}
}
