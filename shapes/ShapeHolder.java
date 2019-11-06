/*
 * Laurie Jones
 * Project 4
 * 
 * File:  ShapeHolder.java
 * 
 * 
 */

 /**
 * this is a  singleton which  contains several shapes inside a  Geometric Shape array
 * this basically holds all of the shapes that are created in teh GUI once they are created
 * 
 * @author Laurie Jones
 * 
 */

import java.util.Arrays; 
import java.util.*;
import java.io.*; 
//import shapes.*;


public class ShapeHolder {   
    // The singleton instance variable
    private static ShapeHolder instance;
    private int index;

    
    public static ShapeHolder getInstance() {
       if (instance == null) {
          instance = new ShapeHolder();
       }
       
       return instance;
    }
 
    private ShapeHolder() {
        GeometricAbstract[] shapes = new GeometricAbstract[50];
        Iterator iterator = ShapeHolder.iterator();
        index = 0;

    }

    private void next(){
        //this tells you  what is next in the Geometric shape array
        index ++; 
        System.out.println(shapes[index]);

    }

    private void hasNext(){
        //checks where or not a there is room next in GeometricShapes has a next
        //returns string
        //needs to check the next value but address thsi later

        String ok;
        //shapes[index];

        if(index +  1 <= shapes.length() ){
            ok = "the next value is: " + index + 1;
        }
        else{
            ok = "there is no next value";
        }

        System.out.println(ok);
      

    }
 }
 