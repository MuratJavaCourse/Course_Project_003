package com.ecommerce.unitlity;

import java.util.List;

public interface ICRUD {

    void created(Object o);
    void update(Object o);
    void remove(Object o);
    Object SingleData(String ID);
    List<Object> MultipleData();

}
