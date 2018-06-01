package org.ebook.product.services;

import org.ebook.product.domain.Product;
import org.ebook.product.persistence.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {
    

    @Autowired
	private ProductMapper productMapper;
    
    public List<Product> findAllProduct(){
		return  this.productMapper.findAllProduct();
	}
    
    public Product getProduct(Integer id) {
		return this.productMapper.selectByPrimaryKey(id);
	}
    
    public void saveProduct(Product product){

    	productMapper.insert(product);
     }

    public void updateProduct(Product product){
    	productMapper.updateByPrimaryKey(product);
 
    }

    public void deleteProduct(Integer id) {
    	productMapper.deleteByPrimaryKey(id);	  
    }
 
}
