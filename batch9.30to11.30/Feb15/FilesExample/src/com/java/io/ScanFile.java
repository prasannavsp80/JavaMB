package com.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFile {

	public static void main(String[] args) {
		File obj = 
				new File("D:/Excelr_930/Rev/LmsProject/src/com/java/lms/LeaveDao.java");
		try {
			Scanner sc = new Scanner(obj);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
