package com.ecommerce.service;

import com.ecommerce.repository.OrderRepository;
import com.ecommerce.repository.entity.Orders;

import java.util.List;

public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(){
        orderRepository = new OrderRepository();
    }

    public void created(Orders orders) {
        orderRepository.created(orders);
    }

    public void update(Orders orders) {
        orderRepository.update(orders);
    }

    public void remove(Orders orders) {
        orderRepository.remove(orders);
    }

    public Object SingleData(String ID) {
        Object order = orderRepository.SingleData(ID);
        if(order==null){
            return null;
        }else{
            return order;
        }
    }

    public List<Object> MultipleData() {
        return orderRepository.MultipleData();
    }
}
