package com.example.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Airport {

    @Id
    private String id;
    private String name;
    private String city;


    public Airport() {
    }
    public Airport(String id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}
