package com.quinbay.ecommerce.search_microservice.controller;

import com.quinbay.ecommerce.search_microservice.entity.ProductEntity;
import com.quinbay.ecommerce.search_microservice.repository.ProductRepository;
import com.quinbay.ecommerce.search_microservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class SearchController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductService productService;

    @GetMapping(value = "/productName" , consumes = "appplication/json")
    public ProductEntity getProductByName(@RequestParam("name") String ProdName){
        Optional<ProductEntity> prod = productRepository.findById(ProdName);
        if(prod.isPresent()){
            return prod.get();
        }else{
            return null;
        }
    }


    @GetMapping (value = "/productByCategory")
    public ProductEntity getProductByCategory(@RequestParam("category") String category){
        Iterable<ProductEntity> prod = productRepository.findAll();
        for(ProductEntity product : prod){
            if(product.getCategory().equals(category)){
                return product;
            }
        }

        return null;
    }


}
