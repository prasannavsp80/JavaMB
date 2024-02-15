package com.java.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutEx1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("d:/java/data1.txt");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(23);
			dout.writeInt(18);
			dout.close();
			fout.close();
			System.out.println("Integers Stored in the file...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
