package com.quinbay.ecommerce.search_microservice.controller;

import com.quinbay.ecommerce.search_microservice.dto.Product;
import com.quinbay.ecommerce.search_microservice.repository.ProductRepository;
import com.quinbay.ecommerce.search_microservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SearchController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductService productService;

//    @GetMapping(value = "/productName" , consumes = "application/json")
//    public List<ProductEntity> getProductByName(@RequestParam("name") String name){
//        return productRepository.findByProductName(name);
//    }
//
//
//    @GetMapping(value = "/categoryName" , consumes = "application/json")
//    public List<ProductEntity> getProductByCategory(@RequestParam("name") String name){
//        return productRepository.findByCategory(name);
//    }
//
//    @GetMapping(value = "/categoryName" , consumes = "application/json")
//    public List<ProductEntity> getProductByTitle(@RequestParam("name") String name){
//        return productRepository.findByProductTitle(name);
//    }
//
//
//    @GetMapping (value = "/findProduct")
//    public List<ProductEntity> getProductByQuery(@RequestParam String s){
//        return productRepository.findByCustomerQuery(s);
//    }

    @GetMapping(value = "/getProductDetails")
    public List<Product> getProduct(@RequestParam String searchTerm) {

       return productService.getProductDetails(searchTerm);


    }




    @PostMapping (value="/addProductToSolr")
    public void addProd(@RequestBody Product product){
        productService.addProduct(product);
    }





}

