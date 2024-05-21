-- Display Idle Agent

--  Display common records from Agent and AgentPolicy tables

select * from Agent where agentId = ANY
(select agentId from AgentPolicy);

-- AgentId exists in Agent Table and not in AgentPolicy table (diff operator)

select * from Agent where agentId <> ALL
(select agentId from AgentPolicy);

-- Display Idle Policies 

select * from Policy where policyID <> ALL(select 
policyId from AgentPolicy);

-- Display Matching Policies 

select * from Policy where policyId = ANY 
(select policyid from AgentPolicy);