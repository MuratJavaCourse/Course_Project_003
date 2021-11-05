package com.blog.repository.entity;

import java.util.Date;

public class Blogs {

    private String ID;
    private String Name;
    private String Details;
    private String LikeCount;
    private String DislikeCount;
    private Date SendDate;

    // BLOG -> ID
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    // BLOG -> NAME
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    // BLOG -> DETAILS
    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    // BLOG -> LIKE COUNT
    public String getLikeCount() {
        return LikeCount;
    }

    public void setLikeCount(String likeCount) {
        LikeCount = likeCount;
    }

    // BLOG -> DISLIKE COUNT
    public String getDislikeCount() {
        return DislikeCount;
    }

    public void setDislikeCount(String dislikeCount) {
        DislikeCount = dislikeCount;
    }

    // BLOG -> SEND DATE
    public Date getSendDate() {
        return SendDate;
    }

    public void setSendDate(Date sendDate) {
        SendDate = sendDate;
    }
}
