package com.quinbay.ecommerce.search_microservice.repository;

import com.quinbay.ecommerce.search_microservice.entity.ProductEntity;
import org.springframework.data.solr.repository.SolrCrudRepository;

public interface ProductRepository extends SolrCrudRepository<ProductEntity,String> {
}
