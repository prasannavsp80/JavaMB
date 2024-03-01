package com.java.jdk8;

import java.util.Optional;

public class OptExNew {
	public static void main(String[] args) {
		String[] names = new String[10];
		Optional<String> str1 = Optional.ofNullable(names[5]);
		if (str1.isPresent()) {
			System.out.println("value is present...");
		} else {
			System.out.println("value does not exist...");
		}
	}
}
