package com.ecommerce.repository.entity;

import java.util.Date;

public class Sellers {

    private String ID;
    private String Name;
    private String Surname;
    private String Email;
    private String Password;
    private Date date;
    private boolean Status;

    // SELLERS -> ID
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    // SELLERS -> NAME
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    // SELLERS -> SURNAME
    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    // SELLERS -> EMAIL
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    // SELLERS -> PASSWORD
    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    // SELLERS -> DATE
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // SELLERS -> STATUS
    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }
}
