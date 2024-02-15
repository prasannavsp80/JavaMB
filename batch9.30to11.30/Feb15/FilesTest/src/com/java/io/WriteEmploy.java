package com.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmploy {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("d:/java/employ.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			Employ employ = new Employ();
			employ.setEmpno(1);
			employ.setName("Ananth");
			employ.setBasic(99423);
			objout.writeObject(employ);
			objout.close();
			fout.close();
			System.out.println("Employ Object Stored in File...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
