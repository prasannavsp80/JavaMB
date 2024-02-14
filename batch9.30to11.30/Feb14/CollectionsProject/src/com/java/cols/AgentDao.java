package com.java.cols;

import java.util.List;

public interface AgentDao {

	List showAgent();
	String addAgent(Agent agent);
	Agent searchAgent(int agentId);
	String deleteAgent(int agentId);
	String updateAgent(Agent agentNew);
}
