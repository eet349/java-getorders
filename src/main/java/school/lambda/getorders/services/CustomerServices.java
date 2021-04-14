package school.lambda.getorders.services;

import school.lambda.getorders.models.Customer;
import school.lambda.getorders.views.OrderCount;

import java.util.List;

public interface CustomerServices {
    Customer save(Customer customer);
    List<Customer> findAllCustomers();
    Customer findCustomerById(long custcode);
    List<Customer> findByCustnameLike(String subname);
    List<OrderCount> getOrderCounts();
}
