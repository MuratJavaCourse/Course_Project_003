package com.blog.services;

import com.blog.repository.ContactRepository;
import com.blog.repository.entity.Blogs;
import com.blog.repository.entity.Contact;

import java.util.List;

public class ContactService {

    private ContactRepository contactRepository;

    public ContactService(){
        contactRepository = new ContactRepository();
    }

    public void created(Contact contact) {
        contactRepository.created(contact);
    }

    public void update(Contact contact) {
        contactRepository.update(contact);
    }

    public void remove(Contact contact) {
        contactRepository.remove(contact);
    }

    public Object SingleData(String ID) {
        Object contact = contactRepository.SingleData(ID);
        if(contact == null){
            return null;
        }else{
            return contact;
        }
    }

    public List<Object> MultipleData() {
        return contactRepository.MultipleData();
    }
}
