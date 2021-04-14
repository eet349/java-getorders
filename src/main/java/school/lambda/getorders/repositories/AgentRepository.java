package school.lambda.getorders.repositories;

import org.springframework.data.repository.CrudRepository;
import school.lambda.getorders.models.Agent;

public interface AgentRepository extends CrudRepository<Agent, Long> {
}
