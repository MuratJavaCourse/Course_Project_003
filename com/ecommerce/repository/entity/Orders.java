package com.ecommerce.repository.entity;

import java.util.Date;

public class Orders {

    private String ID;
    private String UserID;
    private String ProductID;
    private String Name;
    private String Details;
    private Date date;
    private boolean Status;

    // ORDERS -> ID
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    // ORDERS -> USER ID
    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    // ORDERS -> PRODUCT ID
    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String productID) {
        ProductID = productID;
    }

    // ORDERS -> PRODUCT NAME
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    // ORDERS -> PRODUCT DETAILS
    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    // ORDERS -> PRODUCT DATE
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // ORDERS -> PRODUCT STATUS
    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

}
