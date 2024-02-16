package com.java.f8;

import java.util.Optional;

public class OptionExample1 {
	public static void main(String[] args) {
		String[] str = new String[10];
		System.out.println(str[5]);
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if (checkNull.isPresent()) {
            System.out.println(str[5].toUpperCase());
        } else {
            System.out.println("String Value not Present");	
        }
}
}