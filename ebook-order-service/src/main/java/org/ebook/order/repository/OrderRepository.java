package org.ebook.order.repository;

import org.ebook.order.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order,Integer>  {
    public Order findById(Integer orderID);
    
}
