package com.java.exception;

public class EmployException extends Exception {

	public EmployException() { }
	
	public EmployException(String error) {
		super(error);
	}
}
