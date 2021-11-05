package com.ecommerce.repository.entity;

import java.util.Date;

public class Products {

    private String ID;
    private String SellerID;
    private String Name;
    private String Details;
    private double price;
    private double discount;
    private Date date;

    // PRODUCTS -> ID
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    // PRODUCTS -> SELLER ID
    public String getSellerID() {
        return SellerID;
    }

    public void setSellerID(String sellerID) {
        SellerID = sellerID;
    }

    // PRODUCTS -> NAME
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    // PRODUCTS -> DETAILS
    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    // PRODUCTS -> PRICE
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // PRODUCTS -> DISCOUNT
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    // PRODUCTS -> DATE
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
