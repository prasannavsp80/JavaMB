package com.java.cols;

import java.util.LinkedList;

public class LinkExample {

	public static void main(String[] args) {
		LinkedList data = new LinkedList();
		data.add("Adhi Laxmi");
		data.add("Ganesh");
		data.add("Karthik");
		data.add("Padmanjali");
		data.add("Nanaji");
		data.addFirst("Mohammad");
		data.addLast("Manohar");
		
		System.out.println("Linked List Data ");
		for (Object ob : data) {
			System.out.println(ob);
		}
	}
}
