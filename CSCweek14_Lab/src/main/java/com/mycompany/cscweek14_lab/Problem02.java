/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cscweek14_lab;

import java.util.*;

/**
 *
 * @author nicka
 */
public class Problem02 {
    public static void main(String[]args){
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        Scanner stdin= new Scanner("( 1 + 5 ) ");
        while(stdin.hasNext()){
            String s = stdin.next();
            if(s.equals("(")){}
            else if(s.equals("+"))  ops.push(s);
            else if(s.equals("-"))  ops.push(s);
            else if(s.equals("*"))  ops.push(s);
            else if(s.equals("/"))  ops.push(s);
            else if(s.equals(")")){
                String op = ops.pop();
                double v = vals.pop();
                if(op.equals("+"))  v = vals.pop() + v;
                if(op.equals("-"))  v = vals.pop() - v;
                if(op.equals("*"))  v = vals.pop() * v;
                if(op.equals("/"))  v = vals.pop() / v;
                vals.push(v);
                    }
                else{
                    vals.push(Double.parseDouble(s));
                    }
            System.out.println(vals.pop());
        }
        
    }
    
    
}
