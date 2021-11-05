package com.blog.repository;

import com.blog.repository.entity.Contact;
import com.blog.unitlity.ICRUD;
import com.blog.unitlity.StaticDatas;

import java.util.List;
import java.util.Optional;

public class ContactRepository implements ICRUD {

    @Override
    public void created(Object o) {
        StaticDatas.ContactDatas.add((Contact) o);
    }

    @Override
    public void update(Object o) {
        Contact contact = (Contact) o;
        for (Contact ctc : StaticDatas.ContactDatas){
            if(ctc.getID().equals(contact.getID())){
                contact = ctc;
            }
        }
    }

    @Override
    public void remove(Object o) {
        StaticDatas.ContactDatas.remove((Contact) o);
    }

    @Override
    public Object SingleData(String ID) {
        Optional<Contact> ctc = StaticDatas.ContactDatas.stream().filter(x->x.getID().equals(ID)).findFirst();
        if(ctc.isPresent()){
            return ctc.get();
        }else{
            return null;
        }
    }

    @Override
    public List<Object> MultipleData() {
        return null;
    }
}
