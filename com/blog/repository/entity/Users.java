package com.blog.repository.entity;

import java.util.Date;

public class Users {

    private String ID;
    private String Name;
    private String Surname;
    private String Email;
    private String Password;
    private String Phone;
    private Date SaveDate;

    // USER -> ID
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    // USER -> NAME
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    // USER -> SURNAME
    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    // USER -> EMAIL
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    // USER -> PASSWORD
    public String getPassword(){
        return Password;
    }

    public void setPassword(String password){
        Password = password;
    }

    // USER -> PHONE
    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    // USER -> SAVE DATE
    public Date getSaveDate() {
        return SaveDate;
    }

    public void setSaveDate(Date saveDate) {
        SaveDate = saveDate;
    }
}
