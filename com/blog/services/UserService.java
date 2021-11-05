package com.blog.services;

import com.blog.repository.UsersRepository;
import com.blog.repository.entity.Blogs;
import com.blog.repository.entity.Users;

import java.util.List;

public class UserService {
    private UsersRepository usersRepository;

    public UserService(){
        usersRepository = new UsersRepository();
    }

    public void created(Users users) {
        usersRepository.created(users);
    }

    public void update(Users users) {
        usersRepository.update(users);
    }

    public void remove(Users users) {
        usersRepository.remove(users);
    }

    public Object SingleData(String ID) {
        Object users = usersRepository.SingleData(ID);
        if(users == null){
            return null;
        }else{
            return users;
        }
    }

    public List<Object> MultipleData() {
        return usersRepository.MultipleData();
    }
}
