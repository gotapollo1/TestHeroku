package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    private int id;
    @Column(name = "name")
    private String productName;
    private int price;

    public int getPid() {
        return id;
    }

    public void setPid(int pid) {
        this.id = pid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
