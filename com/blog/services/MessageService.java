package com.blog.services;

import com.blog.repository.MessagesRepository;
import com.blog.repository.entity.Blogs;
import com.blog.repository.entity.Messages;

import java.util.List;

public class MessageService {
    private MessagesRepository messagesRepository;

    public MessageService(){
        messagesRepository = new MessagesRepository();
    }

    public void created(Messages msg) {
        messagesRepository.created(msg);
    }

    public void update(Messages msg) {
        messagesRepository.update(msg);
    }

    public void remove(Messages msg) {
        messagesRepository.remove(msg);
    }

    public Object SingleData(String ID) {
        Object msg = messagesRepository.SingleData(ID);
        if(msg == null){
            return null;
        }else{
            return msg;
        }
    }

    public List<Object> MultipleData() {
        return messagesRepository.MultipleData();
    }
}
