/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miolex.domain;

/**
 *
 * @author OLEX
 */
public class Order {
    private final String id;
    private String name;
    private Courier courier;
    private String dateTime;

    public Order(String id, String name, Courier courier) {
        this.id = id;
        this.name = name;
        this.courier = courier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Courier getCourier() {
        return courier;
    }

    public String getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", name=" + name + ", courier=" + courier + ", dateTime=" + dateTime + '}';
    }
    
}
