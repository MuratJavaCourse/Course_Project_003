package com.blog.repository.entity;

import java.util.Date;

public class Messages {

    private String ID;
    private String Type;
    private String Details;
    private String FromWho;
    private Date SendDate;

    // MESSAGES -> ID
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    // MESSAGES -> TYPE
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    // MESSAGES -> DETAILS
    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    // MESSAGES -> FROM WHO
    public String getFromWho() {
        return FromWho;
    }

    public void setFromWho(String fromWho) {
        FromWho = fromWho;
    }

    // MESSAGES -> SEND DATE
    public Date getSendDate() {
        return SendDate;
    }

    public void setSendDate(Date sendDate) {
        SendDate = sendDate;
    }
}
