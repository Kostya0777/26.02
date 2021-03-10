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
public class Courier {
    private static int count = 0;
    private final int id;
    private final String name;

    public Courier(String name) {
        count++;
        id = count;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Courier{" + "id=" + id + ", name=" + name + '}';
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    
}
