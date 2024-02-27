package com.java.intf;

public class Main1 {

	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
			new Chandra(), new Sushma(), new Mohammad()	
		};
		
		for (ITraining i : arr) {
		//	i.company = "ABC";
			System.out.println(i.company + " " +i.topic + " " +i.trainer);
			i.name();
			i.email();
			i.mobile();
		}
	}
}
