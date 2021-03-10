/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miolex.domain;

import java.util.ArrayList;

/**
 *
 * @author OLEX
 */
public class ContactBook {
    private final ArrayList<Contact> contactBook;

    public ContactBook() {
        contactBook = new ArrayList<>();
    }
    
    public void addContact(Contact c) {
        contactBook.add(c);
    }

    @Override
    public String toString() {
        String str = "ContactBook {\n";
        
        for(Contact c : contactBook){
            str += c;
        }
        
        str += "}";
        return str;
    }
    
}
