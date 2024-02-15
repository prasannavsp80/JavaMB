package com.java.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataCustom {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("d:/java/dataout.txt");
			DataInputStream din = new DataInputStream(fin);
			int count = fin.available();  
			byte[] array = new byte[count];  
			din.read(array);  
			for (byte b : array) {  
				char ch = (char) b;  
				System.out.print(ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
