/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab1;

/**
 *
 * @author nicka
 */


public class Course {
    private int ID; //variable for ID
    private String Code; //variable for Code
    private String className; //variable for classes name
    

    
    public void setID(int num){//method sets the ID, accepts one int parameter as input
        ID = num;//sets the ID equal to the parameter "num"
    }
    public void setCode(String codeStr){//methos for setting the code, accepts one String as a parameter
        Code = codeStr;//sets the Code equal to the parameter "codeStr"
    }
    public void setClassName(String classStr){//method for setting the classes name, accepts one String as a parameter
        className = classStr;//sets the class name equal to the parameter "classStr"
    }
    public int getID(){//getter method for ID
        return ID;//returns the ID
    }
    public String getCode(){//getter method for Code
        return Code;//returns the Code
    }
    public String getClassName(){//getter method for class name
        return className;//returns the class name
    }
    public String toString(){
        String str = "ID: " + ID + " Class Code: " + Code + " Class Name: " + className;
        return str;
    }
    public Course(){//default constructor
        ID = 0; // sets the ID to 0
        Code = "Null"; // sets the code to null
        className = "Null"; //sets the class name to null
    }
    public Course(int ID, String Code, String className){//overloded constructor, accepts three parameters as input
        this.ID = ID;//sets ID equal to parameters's value
        this.Code = Code;//sets the Code equal to parameters's value
        this.className = className; //sets the class name to Null
    }
       
    
}
    