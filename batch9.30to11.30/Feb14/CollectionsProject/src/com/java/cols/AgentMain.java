package com.java.cols;

import java.util.List;
import java.util.Scanner;

public class AgentMain {

	static Scanner sc = new Scanner(System.in);
	static AgentDao dao = new AgentDaoImpl();

	public static void deleteAgent() {
		int agentId;
		System.out.println("Enter Agent Id  ");
		agentId = sc.nextInt();
		System.out.println(dao.deleteAgent(agentId));
	}

	
	public static void searchAgent() {
		int agentId;
		System.out.println("Enter Agent Id  ");
		agentId = sc.nextInt();
		Agent agent = dao.searchAgent(agentId);
		if (agent != null) {
			System.out.println(agent);
		} else {
			System.out.println("*** Agent Record Not Found ***");
		}
	}
	
	public static void addAgent() {
		Agent agent = new Agent();
		System.out.println("Enter Agent Id  ");
		agent.setAgentId(sc.nextInt());
		System.out.println("Enter Agent Name  ");
		agent.setAgentName(sc.next());
		System.out.println("Enter Gender  ");
		agent.setGender(sc.next());
		System.out.println("Enter Premium   ");
		agent.setPremium(sc.nextDouble());
		System.out.println(dao.addAgent(agent));
	}

	public static void updateAgent() {
		Agent agent = new Agent();
		System.out.println("Enter Agent Id  ");
		agent.setAgentId(sc.nextInt());
		System.out.println("Enter Agent Name  ");
		agent.setAgentName(sc.next());
		System.out.println("Enter Gender  ");
		agent.setGender(sc.next());
		System.out.println("Enter Premium   ");
		agent.setPremium(sc.nextDouble());
		System.out.println(dao.updateAgent(agent));
	}
	
	
	public static void showAgent() {
		List agentList = dao.showAgent();
		for (Object object : agentList) {
			Agent agent = (Agent)object;
			System.out.println(agent);
		}
	}
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("1. Add Agent   ");
			System.out.println("2. Show Agent  ");
			System.out.println("3. Search Agent  ");
			System.out.println("4. Delete Agent  ");
			System.out.println("5. Update Agent  ");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice   ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				addAgent();
				break;
			case 2 : 
				showAgent();
				break;
			case 3 : 
				searchAgent();
				break;
			case 4 : 
				deleteAgent();
				break;
			case 5 : 
				updateAgent();
				break;
			case 6 : 
				return;
			}
		} while(choice!=6);
	}
}
