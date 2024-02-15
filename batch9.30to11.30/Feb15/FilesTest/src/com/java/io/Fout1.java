package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fout1 {
	public static void main(String[] args) {
		try {
			FileInputStream src = new FileInputStream("D:/java/Employ930.txt");
			FileOutputStream tar = new FileOutputStream("d:/java/out1.txt");
			int ch;
			while((ch=src.read()) != -1) {
				tar.write((char)ch);
			}
			src.close();
			tar.close();
			System.out.println("*** File Copied ***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
