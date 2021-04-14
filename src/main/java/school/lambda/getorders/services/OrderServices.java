package school.lambda.getorders.services;

import school.lambda.getorders.models.Order;

public interface OrderServices {
    Order save(Order order);
    Order findOrderByOrdnum(long ordnum);
}
