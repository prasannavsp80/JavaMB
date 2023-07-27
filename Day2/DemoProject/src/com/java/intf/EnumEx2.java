package com.java.intf;

enum OrderStatus {
	PENDING, ACCEPTED, REJECTED
}

public class EnumEx2 {
	public static void main(String[] args) {
		String status = "ACCEPTED";
		OrderStatus ordStatus = OrderStatus.valueOf(status);
		System.out.println(ordStatus);
	}
}
