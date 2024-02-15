package com.java.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInEx1 {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("d:/java/data1.txt");
			DataInputStream din = new DataInputStream(fin);
			int x = din.readInt();
			int y = din.readInt();
			int c = x + y;
			System.out.println("Sum is  " +c);
			din.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
