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

//the iterable
//integer is whatever you want to go over
//iterable,geometricabstract>


//put the for loop in paintComponent
   //theat for loop is what puts in on fancas
   //draw and paint is the same thign
   // seperate the view fromt eh data model
   //repaint just ipdats the view
   //clicks are modifying the data model
   //iterator is implicitely called for you
   //rhis is wher you can put the semicolin and things



class ShapeHolder implements Iterable<GeometricAbstract> {   
    private static ShapeHolder instance;
    GeometricAbstract[] shapes = new GeometricAbstract[50];


    public static ShapeHolder getInstance() {
        if (instance == null) {
           instance = new ShapeHolder();
           System.out.println("Created shapeholder");

        }
        else{
            System.out.println("idk");

        }
        
        return instance;
     }

     private ShapeHolder() {
        System.out.println("Created shapeholder");
        //index = 0;
     }

    public GeometricIterator iterator() {
        return new GeometricIterator(this);
     }

    
    
}
 
//the iterator
class GeometricIterator implements Iterator<GeometricAbstract> {
    private int index;
    ShapeHolder data;
    

    public GeometricIterator(ShapeHolder data) {
        this.data = data;
        index = 0;
     }

         /*public Square next() {
       return data.squares[current++];
       
    }*/
    public GeometricAbstract next(){
        //this tells you  what is next in the Geometric shape array
        index ++; 
        return data.shapes[index++];


    }

    /*public boolean hasNext() {
       return current < data.squares.length;
    }*/
    public boolean hasNext(){
        //checks where or not a there is room next in GeometricShapes has a next
        //returns string
        boolean ok;
        int length = data.shapes.length;

        if(index +  1 <= length ){
            ok = true;
        }
        else{
            ok = false;
        }

        return index < data.shapes.length;
      

    }
    
 }
 

 
 