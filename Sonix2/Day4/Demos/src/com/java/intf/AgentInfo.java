package com.java.intf;

public class AgentInfo {

	public static void main(String[] args) {
		Agent agent = new Agent();
		agent.setAgentId(1);
		agent.setName("Sushma");
		agent.setPremium(88842.45);
		
		System.out.println("Agent Id  " +agent.getAgentId());
		System.out.println("Agent Name  " +agent.getName());
		System.out.println("Premium  " +agent.getPremium());
	}
}
