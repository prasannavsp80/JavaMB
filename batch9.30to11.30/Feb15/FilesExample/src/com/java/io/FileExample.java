package com.java.io;

import java.io.File;

public class FileExample {
	public static void main(String[] args) {
		File f1 = new File("D:/Excelr_930/Rev/FilesExample/src/com/java/io/Custom.java");
		System.out.println("File Name  " +f1.getName());
		System.out.println("Parent Directory  " +f1.getParent());
		System.out.println("File Path  " +f1.getPath());
	}
}
