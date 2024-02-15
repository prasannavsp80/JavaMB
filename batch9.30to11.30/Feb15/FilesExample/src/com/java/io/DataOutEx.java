package com.java.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutEx {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("d:/java/dataout.txt");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(52);
			dout.writeUTF("Niranjan");
			dout.writeDouble(88842.44);
			dout.writeBoolean(true);
			dout.close();
			fout.close();
			System.out.println("Primitive Data Stored in the file...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
