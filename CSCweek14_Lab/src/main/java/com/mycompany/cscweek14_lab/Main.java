/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cscweek14_lab;

/**
 *
 * @author nicka
 */

import java.util.*;
import java.util.Scanner;
public class Main {
    
    
    public static void main(String[]args){
        Stack s = new Stack();
        String line; // the string of characters to be checked
        Scanner scan = new Scanner(System.in);
        System.out.println ("\nParenthesis Matching");
        System.out.print ("Enter a parenthesized expression: ");
        line = scan.nextLine();
        
        /* my orginal work
        String str="";
        
        int left = 0;
        int right = 0;
        */
        boolean ok = true;
        for(int i = 0; i < line.length() && ok; i++){
            String c = line.substring(i, i+1);
            if(c.equals("(")){
                s.push(c);
            }
            else if(c.equals(")")){
                if(s.isEmpty()){
                    System.out.println("Extra Right Parentheses");
                    ok = false;
                }
                else{
                    s.pop();
                }
            }
            
            
        }
        if(ok){
        if(s.isEmpty()){
            System.out.println("No Errors Detected");
        }else{
            System.out.println("more left ones");
        }
        //My Original work:
        /*
        for(int i = 0; i < line.length(); i++){
            str+=(String)s.pop();
           
            if(str.contains(")")){
                right++;
            }
            else if(str.contains("(")){
                left++;
            }
           
        }
        if(left == right){
            System.out.println();
            System.out.println("No errors Detected");
        }
        else{
            System.out.println("Error Detected, Left Parentheses do not equal right parentheses");
        }
        */
        
       
    }
    
}
