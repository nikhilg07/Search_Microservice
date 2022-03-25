package com.quinbay.ecommerce.search_microservice.service;

import com.quinbay.ecommerce.search_microservice.dto.Product;

import java.util.List;

public interface ProductService {

    void addProduct(Product product);
    List<Product> getProductDetails(String searchTerm);
}
