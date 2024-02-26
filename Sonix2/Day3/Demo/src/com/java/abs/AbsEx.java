package com.java.abs;

abstract class Training {
	abstract void name();
	abstract void email();
}

class Megha extends Training {

	@Override
	void name() {
		System.out.println("Name is Megha...");
	}

	@Override
	void email() {
		System.out.println("Email is megha@gmail.com");
	}
	
}

class Tarak extends Training {

	@Override
	void name() {
		System.out.println("Name is Tarak...");
	}

	@Override
	void email() {
		System.out.println("Email is tarak@gmail.com");
	}
	
}
class Ramanaji extends Training {

	@Override
	void name() {
		System.out.println("Name is Ramanaji...");
	}

	@Override
	void email() {
		System.out.println("Email is ramana@gmail.com");
	}
	
}
public class AbsEx {
	public static void main(String[] args) {
		Training[] arr = new Training[] {
			new Ramanaji(), new Tarak(), new Megha()
		};
		for (Training t : arr) {
			t.name();
			t.email();
		}
	}
}
