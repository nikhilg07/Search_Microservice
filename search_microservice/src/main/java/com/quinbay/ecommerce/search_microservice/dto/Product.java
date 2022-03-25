package com.quinbay.ecommerce.search_microservice.dto;


import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection="products")
public class Product{

    @Field
    private Integer pid;

    @Id
    @Field
    private String productName;

    @Field
    private String productDescription;

    @Field
    private String productCategory;

    @Field
    private String productTitle;

    @Field
    private String productImage;

    @Field
    private Integer merchantId;

    @Field
    private String merchantName;

    @Field
    private Integer merchantPrice;

    public Product(){}

    public Product(Integer pid, String productName, String productDescription, String productCategory, String productTitle, String productImage, Integer merchantId, String merchantName, Integer merchantPrice) {
        this.pid = pid;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
        this.productTitle = productTitle;
        this.productImage = productImage;
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.merchantPrice = merchantPrice;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchanrName() {
        return merchantName;
    }

    public void setMerchanrName(String merchanrName) {
        this.merchantName = merchanrName;
    }

    public Integer getMerchantPrice() {
        return merchantPrice;
    }

    public void setMerchantPrice(Integer merchantPrice) {
        this.merchantPrice = merchantPrice;
    }
}


