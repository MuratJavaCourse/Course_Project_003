package com.blog.repository;

import com.blog.repository.entity.Business;
import com.blog.unitlity.ICRUD;
import com.blog.unitlity.StaticDatas;

import java.util.List;
import java.util.Optional;

public class BusinessRepository implements ICRUD {

    @Override
    public void created(Object o) {
        StaticDatas.BusinessDatas.add((Business)o);
    }


    @Override
    public void update(Object o) {
        Business business = (Business)o;
        for(Business business1 : StaticDatas.BusinessDatas){
            business = business1;
        }
    }

    @Override
    public void remove(Object o) {}

    @Override
    public Object SingleData(String ID) {
        Optional<Business> businessRead = StaticDatas.BusinessDatas.stream().filter(x->x.getID().equals(ID)).findFirst();
        if(businessRead.isPresent()){
            return businessRead.get();
        }else{
            return null;
        }
    }

    @Override
    public List<Object> MultipleData() {return null;}
}
