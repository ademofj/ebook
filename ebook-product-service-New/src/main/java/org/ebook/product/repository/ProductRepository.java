package org.ebook.product.repository;

import org.ebook.product.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer>  {
    public Product findById(Integer userID);
    
}
