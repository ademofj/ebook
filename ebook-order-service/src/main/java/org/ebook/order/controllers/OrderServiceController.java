package org.ebook.order.controllers;


import org.ebook.order.model.Order;
import org.ebook.order.services.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping(value="v1/order")
public class OrderServiceController {
    @Autowired
    private OrderService orderService;
    private static final Logger logger = LoggerFactory.getLogger(OrderServiceController.class);

    @RequestMapping(value="/{orderId}",method = RequestMethod.GET)
    public Order getOrder( @PathVariable("orderId") Integer orderId) {

        Order order = orderService.getOrder(orderId);
        
        return order;
    }

    @RequestMapping(value="/{orderId}",method = RequestMethod.PUT)
    public void updateOrder( @RequestBody Order order) {
        orderService.updateOrder( order );

    }

    @RequestMapping(value="/{orderId}",method = RequestMethod.POST)
    public void saveOrder(@RequestBody Order order) {
       orderService.saveOrder( order );
    }
 
    @RequestMapping(value="/{orderId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrder( @RequestBody Order order) {
        orderService.deleteOrder( order );
    }
    
    
}
