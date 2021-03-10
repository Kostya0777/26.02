/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miolex.main;

import com.miolex.domain.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author OLEX
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ContactBook cb = new ContactBook();
        String name, lastName, address, num, in = "";
        Contact c;
        Scanner sc = new Scanner(System.in);
        
        while (!in.equals("q")) {
            System.out.println("1 - to enter contact\n2 - enter telephone number\n3 - show contacts\n4 - write contact book to file1"
                    + "\nq - to exit");
            in = sc.nextLine();
            
            switch (in) {
                case "1":
                    System.out.println("Enter name");
                    name = sc.nextLine();

                    System.out.println("Enter lastname");
                    lastName = sc.nextLine();

                    System.out.println("Enter address");
                    address = sc.nextLine();
                    c = new Contact(name, lastName, address);
                    cb.addContact(c);
                    break;
                case "2":
                    System.out.println("Enter name");
                    name = sc.nextLine();

                    System.out.println("Enter lastname");
                    lastName = sc.nextLine();

                    System.out.println("Enter address");
                    address = sc.nextLine();
                    
                    System.out.println("Enter number");
                    num = sc.nextLine();
                    
                    c = new TelephoneContact(name, lastName, address, num);
                    cb.addContact(c);
                    break;
                case "3":
                    System.out.println(cb);
                    break;
                case "4":
                    writeToFile(cb);
                    break;
                default:
                    System.out.println("Unknown command!ddfsddsf");
                    break;
            }
        }
    }
    
    private static void writeToFile(ContactBook cb) {
        try(FileWriter writer = new FileWriter("contactbook.txt", true))
        {
            writer.write(cb.toString());
            writer.flush();
        }
        catch(IOException ex){ 
            System.out.println(ex.getMessage());
        }
    }
    
}
