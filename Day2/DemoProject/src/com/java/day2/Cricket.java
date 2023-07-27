package com.java.day2;

public class Cricket {

	static int score;
	
	public void incr(int x) {
		score+=x;
	}
	
	public static void main(String[] args) {
		Cricket fb = new Cricket();
		Cricket sb = new Cricket();
		Cricket ext = new Cricket();
		
		fb.incr(12);
		sb.incr(8);
		ext.incr(4);
		
		System.out.println("Score   " +Cricket.score);
	}
}
