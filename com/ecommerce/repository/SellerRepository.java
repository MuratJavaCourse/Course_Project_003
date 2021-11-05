package com.ecommerce.repository;

import com.ecommerce.repository.entity.Sellers;
import com.ecommerce.unitlity.ICRUD;
import com.ecommerce.unitlity.StaticDatas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SellerRepository implements ICRUD {
    @Override
    public void created(Object o) {
        StaticDatas.SellerList.add((Sellers) o);
    }

    @Override
    public void update(Object o) {
        Sellers slrID = (Sellers) o;
        Optional<Sellers> sellerUpdate = StaticDatas.SellerList.stream().filter(x->x.getID().equals(slrID.getID())).findFirst();
        if(sellerUpdate.isPresent()){
            // UPDATE
        }else{
            // ÇIKIŞ
        }
    }

    @Override
    public void remove(Object o) {
        StaticDatas.SellerList.remove((Sellers) o);
    }

    @Override
    public Object SingleData(String ID) {
        Optional<Sellers> seller = StaticDatas.SellerList.stream().filter(x->x.getID().equals(ID)).findFirst();
        if(seller.isPresent()){
            return seller.get();
        }else{
            return null;
        }
    }

    @Override
    public List<Object> MultipleData() {
        List<Object> sellersList = new ArrayList<Object>();
        for(Sellers seller : StaticDatas.SellerList){
            sellersList.add(seller);
        }
        return sellersList;
    }
}
