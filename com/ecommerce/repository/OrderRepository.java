package com.ecommerce.repository;

import com.ecommerce.repository.entity.Orders;
import com.ecommerce.unitlity.ICRUD;
import com.ecommerce.unitlity.StaticDatas;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OrderRepository implements ICRUD {

    @Override
    public void created(Object o) {
        StaticDatas.OrderList.add((Orders)o);
    }

    @Override
    public void update(Object o) {
        Orders ordID = (Orders)o;
        Optional<Orders> orderUpdate = StaticDatas.OrderList.stream().filter(x->x.getID().equals(ordID)).findFirst();
        if(orderUpdate.isPresent()){
            // ORDER
        }else{
            // ÇIKIŞ
        }
    }

    @Override
    public void remove(Object o) {
        StaticDatas.OrderList.remove((Orders)o);
    }

    @Override
    public Object SingleData(String ID) {
        Optional<Orders> order = StaticDatas.OrderList.stream().filter(x->x.getID().equals(ID)).findFirst();
        if(order.isPresent()){
            return order.get();
        }else {
            return null;
        }
    }

    @Override
    public List<Object> MultipleData() {
        List<Object> orderList = new ArrayList<Object>();
        for(Orders order : StaticDatas.OrderList){
            orderList.add(order);
        }
        return orderList;
    }
}
