package com.quinbay.ecommerce.search_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@SpringBootApplication(scanBasePackages = {"com.quinbay.ecommerce"})

@EnableSolrRepositories(basePackages = "com.quinbay.ecommerce")

public class SearchMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchMicroserviceApplication.class, args);
	}

}
