package com.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		int ch;
		File src = 
			new File("D:/Excelr_930/Rev/EmployCrudProject/src/com/java/model/Employ.java");
		File tar = new File("D:/java/Employ930.txt");
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(tar);
			while((ch=fr.read()) != -1) {
				fw.write((char)ch);
			}
			fr.close();
			fw.close();
			System.out.println("*** File Copied Successfully ***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
