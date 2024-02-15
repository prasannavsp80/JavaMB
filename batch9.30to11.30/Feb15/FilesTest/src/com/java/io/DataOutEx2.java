package com.java.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutEx2 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("d:/java/out1.txt");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(12);
			dout.writeUTF("Welcome");
			dout.writeDouble(99992.43);
			dout.writeBoolean(true);
			dout.close();
			fout.close();
			System.out.println("DataTypes Stored in File...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
