package com.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectOutEx1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("d:/java/object.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			objout.writeObject(new String("Date is :  "));
			objout.writeObject(new Date());
			objout.close();
			fout.close();
			System.out.println("*** Objects Stored in the File ***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
