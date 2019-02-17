package com.example.udemy.spring5demowebapp.model;

import javax.persistence.*;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    //for JPA
    public Publisher() {
    }

    public Publisher(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
