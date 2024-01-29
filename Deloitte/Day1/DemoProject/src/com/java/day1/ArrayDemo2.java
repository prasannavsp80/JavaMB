package com.java.day1;

public class ArrayDemo2 {

	public void show() {
		String[] names = new String[] {
			"Ayush","Deepankar",
			"Kiran","Milind", "Shivani",
			"Preeti", "Priya"
		};
		for (String s : names) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		ArrayDemo2 obj = new ArrayDemo2();
		obj.show();
	}
}
