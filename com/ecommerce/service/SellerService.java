package com.ecommerce.service;

import com.ecommerce.repository.SellerRepository;
import com.ecommerce.repository.entity.Sellers;

import java.util.List;

public class SellerService{

    private SellerRepository sellerRepository;

    public SellerService(){
        sellerRepository = new SellerRepository();
    }

    public void created(Sellers seller) {
        sellerRepository.created(seller);
    }

    public void update(Sellers seller) {
        sellerRepository.update(seller);
    }

    public void remove(Sellers seller) {
        sellerRepository.remove(seller);
    }

    public Object SingleData(String ID) {
        Object sellers = sellerRepository.SingleData(ID);
        if(sellers==null){
            return null;
        }else{
            return sellers;
        }
    }

    public List<Object> MultipleData() {
        return sellerRepository.MultipleData();
    }
}
