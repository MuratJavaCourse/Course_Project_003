package com.blog.repository;

import com.blog.repository.entity.Messages;
import com.blog.unitlity.ICRUD;
import com.blog.unitlity.StaticDatas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MessagesRepository implements ICRUD {

    @Override
    public void created(Object o) {
        StaticDatas.MessagesDatas.add((Messages) o);
    }

    @Override
    public void update(Object o) {}

    @Override
    public void remove(Object o) {
        Messages messageID = (Messages) o;
        Optional<Messages> message = StaticDatas.MessagesDatas.stream().filter(x->x.getID().equals(messageID.getID())).findFirst();
        if(message.isPresent()){
            // MESAJ SİLİNDİ
        }else{
            // ÇIKIŞ
        }
    }

    @Override
    public Object SingleData(String ID) {
        Optional<Messages> message = StaticDatas.MessagesDatas.stream().filter(x->x.getID().equals(ID)).findFirst();
        if(message.isPresent()){
            return message.get();
        }else{
            return null;
        }
    }

    @Override
    public List<Object> MultipleData() {
        List<Object> messageList = new ArrayList<Object>();
        for(Messages msg : StaticDatas.MessagesDatas){
            messageList.add(msg);
        }
        return messageList;
    }
}
