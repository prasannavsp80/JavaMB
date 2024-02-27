package com.java.intf;

import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agent agent = new Agent();
		System.out.println("Enter Agent Id ");
		agent.setAgentId(sc.nextInt());
		System.out.println("Enter Agent Name  ");
		agent.setName(sc.next());
		System.out.println("Enter Premium  ");
		agent.setPremium(sc.nextDouble());
		
		System.out.println("Agent Id  " +agent.getAgentId());
		System.out.println("Agent Name " +agent.getName());
		System.out.println("Premium  " +agent.getPremium());
	}
}
