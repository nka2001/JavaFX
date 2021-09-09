/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.lab1;
import java.util.*;
/**
 *
 * @author nicka
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner getInput = new Scanner(System.in);
       
       int id;
       String Code;
       String className;
       System.out.println("Please enter the ID, the code, and the class name: ");
       
       id = getInput.nextInt();
       Code = getInput.next();
       className = getInput.next();
       
       
       Course course1 = new Course(id, Code, className);
        System.out.println("ID: " + course1.getID());
        System.out.println("Code: " + course1.getCode());
        System.out.println("Class Name: " + course1.getClassName());
        
       Course course2 = new Course(12243, "CSC-229", "Intro to Algorithms");
       Course course3 = new Course(33224, "BCS-345", "Java Programming");
       Course course4 = new Course(88374, "BCS-260", "Intro to Databases");
        
       Course course5 = new Course();
       
       course5.setID(5);
       course5.setClassName("Chemistry");
       course5.setCode("CHM124");
        System.out.println("\n");
        System.out.println("-------------------------------");
        System.out.println(course5.toString());
        System.out.println("-------------------------------");
        System.out.println("\n");
        
        System.out.println(course2.toString());
    }
    
}
