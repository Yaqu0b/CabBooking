package com.example.CabBooking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Booking {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String location;

    @Column
    private String destination;

    @Column
    private int fee;

    public Booking(){
        super();
    }

    public Booking(int id, String name, String location, String destination, int fee) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.destination = destination;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
