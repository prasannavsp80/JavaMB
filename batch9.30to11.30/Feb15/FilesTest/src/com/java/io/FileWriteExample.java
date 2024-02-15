package com.java.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) {
		File f1 = new File("d:/java/excelr930.txt");
		try {
			FileWriter fw = new FileWriter(f1,true);
			fw.write("From Morning 9.30 Batch...\n");
			fw.write("Thank You All...\n");
			fw.write("Trainer Prasanna...\n");
			fw.close();
			System.out.println("*** File Created Successfully ***");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
