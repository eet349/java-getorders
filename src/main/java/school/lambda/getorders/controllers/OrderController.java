package school.lambda.getorders.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.lambda.getorders.models.Order;
import school.lambda.getorders.services.OrderServices;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
//    http://localhost:2019/orders/order/7
    @Autowired
    OrderServices orderServices;
    @GetMapping(value = "/order/{ordnum}")
    public ResponseEntity<?> findOrderById(@PathVariable long ordnum) {
        Order rtnAgent = orderServices.findOrderByOrdnum(ordnum);

        return new ResponseEntity<>(rtnAgent, HttpStatus.OK);
    }

}
