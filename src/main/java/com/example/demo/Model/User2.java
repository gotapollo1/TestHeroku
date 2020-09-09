package com.example.demo.Model;

import org.apache.tomcat.jni.Proc;

import javax.persistence.*;
import javax.swing.text.html.parser.TagElement;
import java.util.List;

@Entity
@Table(name = "update_user")
public class User2 {
    @Id
    private Integer id;
    private String name;
    private String lastname;
    private Integer phone;
    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    private List<Product> products;

    public String getLastname() {

        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
