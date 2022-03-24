package com.quinbay.ecommerce.search_microservice.service;

import com.quinbay.ecommerce.search_microservice.entity.ProductEntity;
import com.quinbay.ecommerce.search_microservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void addProduct(ProductEntity productEntity){
        productRepository.save(productEntity);
    }




}
