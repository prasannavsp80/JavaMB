package com.java.io;

import java.io.File;

public class FileExample1 {

	public static void main(String[] args) {
		File f1 = new File("D:/Excelr_930/Rev/EmployCrudProject/src/com/java/model/Employ.java");
		System.out.println("File Name  " +f1.getName());
		System.out.println("Parent  " +f1.getParent());
		System.out.println("Path  " +f1.getPath());
	}
}
