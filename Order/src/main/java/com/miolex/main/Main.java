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
    public static void main(String[] args) {
        String in = "";
        String name, id, courier, date;
        Scanner sc = new Scanner(System.in);
        Order o;
        
        
        
        while (!in.equals("q")) {
            System.out.println("1 - add usual order\n2 - add urgent order\nq - to exit");
            in = sc.nextLine();
            
            switch (in) {
                case "1":
                    System.out.println("Enter id");
                    id = sc.nextLine();

                    System.out.println("Enter name");
                    name = sc.nextLine();

                    System.out.println("Enter courier name");
                    courier = sc.nextLine();
                    o = new UsualOrder(id, name, new Courier(courier));
                    System.out.println("Enter date");
                    date = sc.nextLine();
                    o.setDateTime(date);
                    writeToFile(o);
                    break;
                case "2":
                    System.out.println("Enter id");
                    id = sc.nextLine();

                    System.out.println("Enter name");
                    name = sc.nextLine();

                    System.out.println("Enter courier name");
                    courier = sc.nextLine();
                    o = new UrgentOrder(id, name, new Courier(courier));
                    System.out.println("Enter date");
                    date = sc.nextLine();
                    o.setDateTime(date);
                    writeToFile(o);
                    break;
                default:
                    System.out.println("Unknown command!ddfsddsf");
                    break;
            }
        }
    }
    
    private static void writeToFile(Order o) {
        try(FileWriter writer = new FileWriter("Orders.txt", true))
        {
            writer.write(o.toString());
            writer.flush();
        }
        catch(IOException ex){ 
            System.out.println(ex.getMessage());
        }
    }
}
