package com.java.io;

import java.io.File;

public class FileEx {

	public static void main(String[] args) {
		File obj = 
				new File("D:/Excelr_930/Rev/LmsProject/src/com/java/lms/LeaveDao.java");
		System.out.println("File Name  " +obj.getName());
		System.out.println("Full Name  " +obj.getAbsolutePath());
		System.out.println("Parent Directory  " +obj.getParent());
	}
}
