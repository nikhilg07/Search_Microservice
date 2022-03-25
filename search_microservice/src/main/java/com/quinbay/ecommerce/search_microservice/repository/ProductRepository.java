package com.quinbay.ecommerce.search_microservice.repository;

import com.quinbay.ecommerce.search_microservice.dto.Product;

import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends SolrCrudRepository<Product,String> {

//    List<ProductEntity> findByProductName(String productName);
//
//    List<ProductEntity> findByCategory(String category);
//
//    List<ProductEntity> findByProductTitle(String productTitle);

//    List<ProductEntity> findByProductTitleAndProductNameAndCategory(String s);

    @Query("ProductCategory:*?0* OR ProductImage:*?0* OR ProdDescription:*?0* OR ProductName:*?0* OR ProductTitle:*?0*")
    List<Product> findByCustomerQuery(String searchTerm);



}
