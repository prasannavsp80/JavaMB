package com.java.day1;

public class ArrayCopy {

	public void show() {
		String[] names = new String[] {
				"Ayush","Deepankar",
				"Kiran","Milind", "Shivani",
				"Preeti", "Priya"
			};
		String[] cpy = names;
		for (String s : cpy) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		ArrayCopy obj = new ArrayCopy();
		obj.show();
	}
}
