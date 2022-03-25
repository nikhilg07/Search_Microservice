package com.quinbay.ecommerce.search_microservice.service;

import com.quinbay.ecommerce.search_microservice.dto.Product;

import com.quinbay.ecommerce.search_microservice.repository.ProductRepository;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private SolrClient solrClient;

    public void addProduct(Product pro){
        productRepository.save(pro);
    }

    @Override
    public List<Product> getProductDetails(String searchTerm) {
        SolrQuery solrQuery = new SolrQuery();
        String query = "productCategory:"+searchTerm+" OR productName:"+searchTerm;
        solrQuery.setQuery(query);
        List<Product> list = new ArrayList<>();
        try {
            QueryResponse  queryResponse = solrClient.query("products", solrQuery);
            queryResponse.getResults();
            for(org.apache.solr.common.SolrDocument i : queryResponse.getResults()){
                Product product = new Product();
                product.setProductCategory(i.get("productCategory").toString());
                product.setProductName(i.get("productName").toString());
                list.add(product);
            }
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}