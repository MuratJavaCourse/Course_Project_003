package com.ecommerce.repository.entity;

import java.util.Date;

public class Users {

    private String ID;
    private String Name;
    private String Surname;
    private String Email;
    private String Password;
    private boolean Status;
    private Date date;

    // USERS -> ID
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    // USERS -> NAME
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    // USERS -> SURNAME
    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    // USERS -> EMAIL
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    // USERS -> PASSWORD
    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    // USERS -> STATUS
    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    // USERS -> DATE
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
