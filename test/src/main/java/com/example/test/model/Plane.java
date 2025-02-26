package com.example.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Plane {

    @Id
    private String id;
    private String model;
    private String manufacturer;
    private int seats;
    private double maxSpeed;
    private int num;
    @ManyToOne
    @JoinColumn(name = "AIRPORT_FK")
    private Airport airport;


    public Plane() {
    };

    public Plane(String id, String model, String manufacturer, int seats, double maxSpeed) {
        this.id = id;
        this.model = model;
        this.manufacturer = manufacturer;
        this.seats = seats;
        this.maxSpeed = maxSpeed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
