package com.ecommerce.repository;

import com.ecommerce.repository.entity.Supports;
import com.ecommerce.unitlity.ICRUD;
import com.ecommerce.unitlity.StaticDatas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SupportRepository implements ICRUD {
    @Override
    public void created(Object o) {
        StaticDatas.SupportList.add((Supports) o);
    }

    @Override
    public void update(Object o) {
        Supports sprID = (Supports) o;
        Optional<Supports> supportsUpdate = StaticDatas.SupportList.stream().filter(x->x.getID().equals(sprID.getID())).findFirst();
        if(supportsUpdate.isPresent()){
            // UPDATE
        }else{
            // ÇIKIŞ
        }
    }

    @Override
    public void remove(Object o) {
        StaticDatas.SupportList.remove((Supports) o);
    }

    @Override
    public Object SingleData(String ID) {
        Optional<Supports> support = StaticDatas.SupportList.stream().filter(x->x.getID().equals(ID)).findFirst();
        if(support.isPresent()){
            return support.get();
        }else{
            return null;
        }
    }

    @Override
    public List<Object> MultipleData() {
        List<Object> supportList = new ArrayList<Object>();
        for(Supports support : StaticDatas.SupportList){
            supportList.add(support);
        }
        return supportList;
    }
}
