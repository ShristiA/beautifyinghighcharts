package com.careydevelopment.highchartsdemo;


import com.careydevelopment.highchartsdemo.Security.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sale {
    @Id
    @GeneratedValue
    private long id;
    private String salesPerson;
    private String item;
    private int quantity;
    private double amount;
    private String date;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName(){
        return salesPerson;
    }

    public Double getY(){
        return amount;
    }
}
