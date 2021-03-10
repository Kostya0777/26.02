/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miolex.main;

import com.miolex.domain.Student;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author OLEX
 */
public class Main {
    public static void main(String[] args) {
        Student s;
        String in = "";
        String studId, group, mark;
        String name, surname, depart, des, teacher;
        Scanner sc = new Scanner(System.in);
 
        while (!in.equals("q")) {
            System.out.println("1 - add student\nq - to exit");
            in = sc.nextLine();
            
            switch (in) {
                case "1":
                    System.out.println("Enter student id");
                    studId = sc.nextLine();
                    System.out.println("Enter student group");
                    group = sc.nextLine();
                    System.out.println("Enter student departament");
                    depart = sc.nextLine();
                    System.out.println("Enter student name");
                    name = sc.nextLine();
                    System.out.println("Enter student surname");
                    surname = sc.nextLine();

                    s = new Student(studId, group, depart, surname, name);
                    System.out.println("Enter discipline");
                    des = sc.nextLine();
                    s.setDiscipline(des);
                    System.out.println("Enter mark");
                    mark = sc.nextLine();
                    s.setMark(mark);
                    System.out.println("Enter teacher name");
                    depart = sc.nextLine();
                    s.setTeacherName("Oliynik))");
                    writeToFile(s);
                    break;
                default:
                    System.out.println("Unknown command!ddfsddsf");
                    break;
            }
        }
    }
    
    private static void writeToFile(Student s) {
        try(FileWriter writer = new FileWriter("Students.txt", true))
        {
            writer.write(s.toString());
            writer.flush();
        }
        catch(IOException ex){ 
            System.out.println(ex.getMessage());
        }
    }
}
