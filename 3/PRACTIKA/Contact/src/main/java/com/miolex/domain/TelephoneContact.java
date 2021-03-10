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
public class TelephoneContact extends Contact {
    private String telephoneNumber;

    public TelephoneContact(String firstName, String lastName, String address, String telephoneNumber) {
        super(firstName, lastName, address);
        this.telephoneNumber = telephoneNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return "Id=" + super.getId() + "\tfirstName=" + super.getFirstName() + "\tlastName=" + super.getLastName() + "\taddress=" + super.getAddress() + "\ttelephoneNumber=" + telephoneNumber + '\n';
    }
    
}
