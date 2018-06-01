package org.ebook.product.controllers;


import org.ebook.product.model.Product;
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
    @Autowired
    private ProductService productService;
    private static final Logger logger = LoggerFactory.getLogger(ProductServiceController.class);

    @RequestMapping(value="/{productId}",method = RequestMethod.GET)
    public Product getProduct( @PathVariable("productId") Integer productId) {

        Product product = productService.getProduct(productId);
        
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
    public void deleteProduct( @RequestBody Product product) {
        productService.deleteProduct( product );
    }
    
    
}
