package com.ecommerce.repository.entity;

import java.util.Date;

public class Supports {

    private String ID;
    private String UserID;
    private String Type;
    private Date date;
    private boolean Status;

    // SUPPORTS -> ID
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    // SUPPORTS -> USER ID
    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    // SUPPORTS -> TYPE
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    // SUPPORTS -> DATE
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // SUPPORTS -> STATUS
    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }
}
