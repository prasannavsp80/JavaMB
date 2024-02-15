package com.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {

	public static void main(String[] args) {
		File src = 
				new File("D:/Excelr_930/Rev/LmsProject/src/com/java/lms/LeaveDao.java");
		File tar = new File("D:/java/Leave.txt");
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(tar);
			int ch;
			while((ch=fr.read()) != -1) {
				fw.write((char)ch);
			}
			fw.close();
			fr.close();
			System.out.println("*** File Copied ***");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
