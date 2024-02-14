package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class AgentDaoImpl implements AgentDao {

	static List agentList;
	
	static {
		agentList = new ArrayList();
	}
	
	@Override
	public List showAgent() {
		return agentList;
	}

	@Override
	public String addAgent(Agent agent) {
		agentList.add(agent);
		return "Agent Record Inserted...";
	}

	@Override
	public Agent searchAgent(int agentId) {
		Agent agentFound = null;
		for(Object object : agentList) {
			Agent agent = (Agent)object;
			if (agent.getAgentId() == agentId) {
				agentFound = agent;
				break;
			}
		}
		return agentFound;
	}

	@Override
	public String deleteAgent(int agentId) {
		Agent agentFound = searchAgent(agentId);
		if (agentFound !=null) {
			agentList.remove(agentFound);
			return "Agent Record Deleted...";
		}
		return "Agent Record Not Found...";
	}

	@Override
	public String updateAgent(Agent agentNew) {
		Agent agentFound = searchAgent(agentNew.getAgentId());
		if (agentFound !=null) {
			agentFound.setAgentName(agentNew.getAgentName());
			agentFound.setGender(agentNew.getGender());
			agentFound.setPremium(agentNew.getPremium());
			return "Agent Record Updated...";
		}
		return "Agent Record Not Found...";
	}

}
