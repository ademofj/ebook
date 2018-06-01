package org.ebook.product.controllers;


import java.util.List;

import org.ebook.product.domain.Product;
import org.ebook.product.services.ProductService;
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
@RequestMapping(value="v1/product")
public class ProductServiceController {
   
    private static final Logger logger = LoggerFactory.getLogger(ProductServiceController.class);
    @Autowired
    private ProductService productService;
    
    @RequestMapping(value="/list",method = RequestMethod.GET)
    public List<Product> findAllProduct(){
    	return  this.productService.findAllProduct();
    }
    
    @RequestMapping(value="/{productId}",method = RequestMethod.GET)
    public Product getProduct( @PathVariable("productId") Integer productId) {

        Product product = this.productService.getProduct(productId);
        
        return product;
    }

    @RequestMapping(value="/{productId}",method = RequestMethod.PUT)
    public void updateProduct( @PathVariable("productId") Integer productId, @RequestBody Product product) {
        productService.updateProduct( product );

    }

    @RequestMapping(value="/{productId}",method = RequestMethod.POST)
    public void saveProduct(@RequestBody Product product) {
       productService.saveProduct( product );
    }
 
    @RequestMapping(value="/{productId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct( @PathVariable("productId") Integer productId) {
        productService.deleteProduct( productId );
    }
    
    
}
