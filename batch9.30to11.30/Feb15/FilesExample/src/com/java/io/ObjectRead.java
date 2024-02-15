package com.java.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjectRead {

	public static void main(String[] args) {
		FileInputStream fin;
		try {
			fin = new FileInputStream("d:/java/fileout.txt");
			ObjectInputStream objin = new ObjectInputStream(fin);
			while(true) {
				Object object = objin.readObject();
				String type = object.getClass().getSimpleName();
				System.out.println(object.getClass().getSimpleName());
				if (type.equals(("String"))) {
					String str = (String)object;
					System.out.println(str);
				}
				if (type.equals("Date")) {
					Date date = (Date)object;
					System.out.println(date);
				}
			}
			
		}catch(EOFException e) {
			
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
