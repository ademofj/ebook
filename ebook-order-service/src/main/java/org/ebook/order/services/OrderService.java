package org.ebook.order.services;

import org.ebook.order.model.Order;
import org.ebook.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.UUID;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

 
    public Order getOrder(Integer orderId) {
        return orderRepository.findById(orderId);
    }

    public void saveOrder(Order order){

    	orderRepository.save(order);
     }

    public void updateOrder(Order order){
    	orderRepository.save(order);
 
    }

    public void deleteOrder(Order order){
    	orderRepository.delete(order);	  
    }
 
}
