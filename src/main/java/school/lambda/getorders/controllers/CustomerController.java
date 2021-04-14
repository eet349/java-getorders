package school.lambda.getorders.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.lambda.getorders.models.Customer;
import school.lambda.getorders.services.CustomerServices;
import school.lambda.getorders.views.OrderCount;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
    @Autowired
    CustomerServices customerServices;
//    http://localhost:2019/customers/orders
    @GetMapping(value = "/orders")
    public ResponseEntity<?> getCustomerOrders() {
        List<Customer> rtnList = customerServices.findAllCustomers();

        return new ResponseEntity<>(rtnList, HttpStatus.OK);
    }

    @GetMapping(value = "/customer/{custcode}", produces = "application/json")
    public ResponseEntity<?> getCustomerById(@PathVariable long custcode) {
//    http://localhost:2019/customers/customer/7
//    http://localhost:2019/customers/customer/77
        Customer rtnCust = customerServices.findCustomerById(custcode);
        return new ResponseEntity<>(rtnCust, HttpStatus.OK);
    }

    @GetMapping(value = "/namelike/{subname}")
    public ResponseEntity<?> getCustomersLikeName(@PathVariable String subname) {
//    http://localhost:2019/customers/namelike/mes
//    http://localhost:2019/customers/namelike/cin
        List<Customer> rtnList = customerServices.findByCustnameLike(subname);

        return new ResponseEntity<>(rtnList, HttpStatus.OK);
    }

    @GetMapping(value = "/orders/count")
    public ResponseEntity<?> getOrderCounts() {
//    http://localhost:2019/customers/orders/count
        List<OrderCount> rtnList = customerServices.getOrderCounts();
        return new ResponseEntity<>(rtnList, HttpStatus.OK);
    }


}
