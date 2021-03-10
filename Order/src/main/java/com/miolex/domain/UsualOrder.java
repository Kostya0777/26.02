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
public class UsualOrder extends Order {
    private final String type = "Usual";

    public UsualOrder(String id, String name, Courier courier) {
        super(id, name, courier);
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + super.getId() + ", name=" + super.getName() +
                ", courier=" + super.getCourier() + ", dateTime=" +
                super.getDateTime() + ", type=" + type + "}\n";
    }
}
