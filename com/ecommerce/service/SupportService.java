package com.ecommerce.service;

import com.ecommerce.repository.SupportRepository;
import com.ecommerce.repository.entity.Supports;

import java.util.List;

public class SupportService {

    private SupportRepository supportRepository;

    public SupportService(){
        supportRepository = new SupportRepository();
    }

    public void created(Supports supports) {
        supportRepository.created(supports);
    }

    public void update(Supports supports) {
        supportRepository.update(supports);
    }

    public void remove(Supports supports) {
        supportRepository.remove(supports);
    }

    public Object SingleData(String ID) {
        Object support = supportRepository.SingleData(ID);
        if(support==null){
            return null;
        }else{
            return support;
        }
    }

    public List<Object> MultipleData() {
        return supportRepository.MultipleData();
    }
}
