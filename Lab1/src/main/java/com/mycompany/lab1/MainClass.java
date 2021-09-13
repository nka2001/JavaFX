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
       String Code; //varibales for testing the course class
       String className;
       System.out.println("Please enter the ID, the code, and the class name: ");
       
       id = getInput.nextInt();
       Code = getInput.next();//gets input from the user
       className = getInput.next();
       
       
       Course course1 = new Course(id, Code, className);// first test, uses the default constructor 
        System.out.println("ID: " + course1.getID()); //tests the getID method
        System.out.println("Code: " + course1.getCode());//tests the getCode method
        System.out.println("Class Name: " + course1.getClassName());//tests the getClassName method
        
       Course course2 = new Course(12243, "CSC-229", "Intro to Algorithms");//all three will test the overloaded constructor
       Course course3 = new Course(33224, "BCS-345", "Java Programming");
       Course course4 = new Course(88374, "BCS-260", "Intro to Databases");
        
       Course course5 = new Course();//nother course with a defult intiailization
       
       course5.setID(5);//tests the setID method
       course5.setClassName("Chemistry");//tests the setClassName method
       course5.setCode("CHM124");//tests the setCode method
        System.out.println("\n");
        System.out.println("-------------------------------");
        System.out.println(course5.toString());//something I added, it prints the code, class name and id
        System.out.println("-------------------------------");
        System.out.println("\n");
        
        System.out.println(course2.toString());//also tests the toString method. will show the id code and class name
    }
    
}
