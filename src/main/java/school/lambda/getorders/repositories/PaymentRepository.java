package school.lambda.getorders.repositories;

import org.springframework.data.repository.CrudRepository;
import school.lambda.getorders.models.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
