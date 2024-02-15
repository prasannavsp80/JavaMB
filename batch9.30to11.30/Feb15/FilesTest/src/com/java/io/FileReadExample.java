package com.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
	
	public static void main(String[] args) {
		int ch;
		File f1 = 
		new File("D:/Excelr_930/Rev/EmployCrudProject/src/com/java/model/Employ.java");
		try {
			FileReader fr = new FileReader(f1);
			while((ch=fr.read()) != -1) {
				System.out.print((char)ch);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
