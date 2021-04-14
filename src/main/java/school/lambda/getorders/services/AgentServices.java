package school.lambda.getorders.services;

import school.lambda.getorders.models.Agent;

public interface AgentServices  {
    Agent save(Agent agent);
    Agent findAgentById(long agentcode);
}
