package com.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFile {
	public static void main(String[] args) {
		File f1 = new File("D:/Excelr_930/Rev/EmployCrudProject/src/com/java/model/Employ.java");
		try {
			Scanner sc = new Scanner(f1);
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
