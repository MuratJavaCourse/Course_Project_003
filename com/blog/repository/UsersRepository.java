package com.blog.repository;

import com.blog.repository.entity.Users;
import com.blog.unitlity.ICRUD;
import com.blog.unitlity.StaticDatas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsersRepository implements ICRUD {

    @Override
    public void created(Object o) {
        StaticDatas.UserDatas.add((Users)o);
    }

    @Override
    public void update(Object o) {
        Users user = (Users)o;
        Optional<Users> users = StaticDatas.UserDatas.stream().filter(x->x.getID().equals(user.getID())).findFirst();
        if(users.isPresent()){
            // Üye Bilgileri Güncellendi
        }else{
            // ÇIKIŞ
        }
    }

    @Override
    public void remove(Object o) {
        StaticDatas.UserDatas.remove((Users)o);
    }

    @Override
    public Object SingleData(String ID) {
        Optional<Users> user = StaticDatas.UserDatas.stream().filter(x->x.getID().equals(ID)).findFirst();
        if(user.isPresent()){
            return user.get();
        }else{
            return null;
        }
    }

    @Override
    public List<Object> MultipleData() {
        List<Object> userResults = new ArrayList<Object>();
        for(Users user : StaticDatas.UserDatas){
            userResults.add(user);
        }
        return userResults;
    }
}
