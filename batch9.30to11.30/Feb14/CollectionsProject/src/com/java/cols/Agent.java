package com.java.cols;

public class Agent {

	private int agentId;
	private String agentName;
	private String gender;
	private double premium;
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}

	public Agent() {
		// TODO Auto-generated constructor stub
	}
	public Agent(int agentId, String agentName, String gender, double premium) {
		this.agentId = agentId;
		this.agentName = agentName;
		this.gender = gender;
		this.premium = premium;
	}

	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", agentName=" + agentName + ", gender=" + gender + ", premium=" + premium
				+ "]";
	}
	
}
