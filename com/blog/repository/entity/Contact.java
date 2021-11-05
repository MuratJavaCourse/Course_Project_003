package com.blog.repository.entity;

public class Contact {

    private final String ID = "1";
    private String Phone;
    private String Email;
    private String Location;

    // CONTACT -> ID
    public String getID() {
        return ID;
    }

    // CONTACT -> PHONE
    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    // CONTACT -> EMAIL
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    // CONTACT -> LOCATION
    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
