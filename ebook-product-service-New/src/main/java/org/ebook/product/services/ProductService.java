package org.ebook.product.services;

import org.ebook.product.model.Product;
import org.ebook.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

 
    public Product getProduct(Integer productId) {
        return productRepository.findById(productId);
    }

    public void saveProduct(Product product){

    	productRepository.save(product);
     }

    public void updateProduct(Product product){
    	productRepository.save(product);
 
    }

    public void deleteProduct(Product product){
    	productRepository.delete(product);	  
    }
 
}
