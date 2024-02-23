package com.java.day2;

public class StringArrayDemo {

	public void show() {
		String[] names = new String[] {
			"Karthik", "Naveen","Chandra",
			"Vara","Nanaji"
		};
		for (String s : names) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		StringArrayDemo obj = new StringArrayDemo();
		obj.show();
	}
}
