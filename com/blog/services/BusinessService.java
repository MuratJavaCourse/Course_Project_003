package com.blog.services;

import com.blog.repository.BusinessRepository;
import com.blog.repository.entity.Blogs;
import com.blog.repository.entity.Business;

import java.util.List;

public class BusinessService {

    private BusinessRepository businessRepository;

    public BusinessService(){
        businessRepository = new BusinessRepository();
    }

    public void created(Business business) {
        businessRepository.created(business);
    }

    public void update(Business business) {
        businessRepository.update(business);
    }

    public void remove(Business business) {
        businessRepository.remove(business);
    }

    public Object SingleData(String ID) {
        Object business = businessRepository.SingleData(ID);
        if(business == null){
            return null;
        }else{
            return business;
        }
    }

    public List<Object> MultipleData() {
        return businessRepository.MultipleData();
    }
}
