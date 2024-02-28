package com.java.junit;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {

  public static void main(String[] args) {
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	  try {
		LeaveDetails ld = new LeaveDetails(1, 1000, sdf.parse("2024-03-01"), 
					sdf.parse("2024-03-03"), 3, "EL", "PENDING", "Nothing");
		System.out.println(ld);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }

}
