package com.ecommerce.service;

import com.ecommerce.repository.ProductRepository;
import com.ecommerce.repository.entity.Products;

import java.util.List;

public class ProductService {

    private ProductRepository productRepository;

    public ProductService(){
        productRepository = new ProductRepository();
    }

    public void created(Products product) {
        productRepository.created(product);
    }

    public void update(Products product) {
        productRepository.update(product);
    }

    public void remove(Products product) {
        productRepository.remove(product);
    }

    public Object SingleData(String ID) {
        Object product = productRepository.SingleData(ID);
        if(product==null){
            return null;
        }else{
            return product;
        }
    }

    public List<Object> MultipleData() {
        return productRepository.MultipleData();
    }
}
