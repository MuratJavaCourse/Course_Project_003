package com.ecommerce.repository;

import com.ecommerce.repository.entity.Users;
import com.ecommerce.unitlity.ICRUD;
import com.ecommerce.unitlity.StaticDatas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements ICRUD {
    @Override
    public void created(Object o) {
        StaticDatas.UserList.add((Users) o);
    }

    @Override
    public void update(Object o) {
        Users usrID = (Users) o;
        Optional<Users> userUpdate = StaticDatas.UserList.stream().filter(x->x.getID().equals(usrID.getID())).findFirst();
        if(userUpdate.isPresent()){
            // UPDATE
        }else{
            // ÇIKIŞ
        }
    }

    @Override
    public void remove(Object o) {
        StaticDatas.UserList.remove((Users) o);
    }

    @Override
    public Object SingleData(String ID) {
        Optional<Users> user = StaticDatas.UserList.stream().filter(x->x.getID().equals(ID)).findFirst();
        if(user.isPresent()){
            return user.get();
        }else{
            return null;
        }
    }

    @Override
    public List<Object> MultipleData() {
        List<Object> userList = new ArrayList<Object>();
        for(Users user : StaticDatas.UserList){
            userList.add(user);
        }
        return userList;
    }
}
