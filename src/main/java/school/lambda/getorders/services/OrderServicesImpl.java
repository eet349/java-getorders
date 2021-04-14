package school.lambda.getorders.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import school.lambda.getorders.models.Order;
import school.lambda.getorders.repositories.OrderRepository;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "orderServices")
public class OrderServicesImpl implements OrderServices{
    @Autowired
    private OrderRepository orderrepo;

    @Transactional
    @Override
    public Order save(Order order) {
        return orderrepo.save(order);
    }
    @Override
    public Order findOrderByOrdnum(long ordnum){
        return orderrepo.findById(ordnum).orElseThrow(() -> new EntityNotFoundException("Order number " + ordnum + " Not Found!" ));
    }

}
