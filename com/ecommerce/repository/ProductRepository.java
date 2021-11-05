package com.ecommerce.repository;

import com.ecommerce.repository.entity.Products;
import com.ecommerce.unitlity.ICRUD;
import com.ecommerce.unitlity.StaticDatas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository implements ICRUD {
    @Override
    public void created(Object o) {
        StaticDatas.ProductList.add((Products) o);
    }

    @Override
    public void update(Object o) {
        Products prdID = (Products) o;
        Optional<Products> productsUpdate = StaticDatas.ProductList.stream().filter(x->x.getID().equals(prdID.getID())).findFirst();
        if(productsUpdate.isPresent()){
            // PRODUCT
        }else{
            // ÇIKIŞ
        }
    }

    @Override
    public void remove(Object o) {
        StaticDatas.ProductList.remove((Products) o);
    }

    @Override
    public Object SingleData(String ID) {
        Optional<Products> product = StaticDatas.ProductList.stream().filter(x->x.getID().equals(ID)).findFirst();
        if(product.isPresent()){
            return product.get();
        }else{
            return null;
        }
    }

    @Override
    public List<Object> MultipleData() {
        List<Object> productList = new ArrayList<Object>();
        for(Products products : StaticDatas.ProductList){
            productList.add(products);
        }
        return productList;
    }
}
