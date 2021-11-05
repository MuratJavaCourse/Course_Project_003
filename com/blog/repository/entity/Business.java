package com.blog.repository.entity;

public class Business {

    private final String ID = "1";
    private String Name;
    private String Logo;
    private String Respect;
    private String Comment;

    // BUSINESS -> ID
    public String getID() {
        return ID;
    }

    // BUSINESS -> NAME
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    // BUSINESS -> LOGO
    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    // BUSINESS -> RESPECT
    public String getRespect() {
        return Respect;
    }

    public void setRespect(String respect) {
        Respect = respect;
    }

    // BUSINESS -> COMMENT
    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }
}
