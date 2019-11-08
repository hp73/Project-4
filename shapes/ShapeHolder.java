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



public class ShapeHolder implements Iterable<GeometricAbstract> {   
    GeometricAbstract[] shapes = new GeometricAbstract[50];
    private static ShapeHolder instance;

    public GeometricIterator iterator() {
        return new PointIterator(this);
     }
    
    public static ShapeHolder getInstance() {
       if (instance == null) {
          instance = new ShapeHolder();
       }
       
       return instance;
    }
}
 
//the iterator
class GeometricIterator implements Iterable<GeometricAbstract> {
    private int index = 0;
    
    /*public ShapeContainer() {
       shapes = new shapes[] {new GeometricShape(),
                               new Square(1, "Blue", 3, 4),
                               new Square()};
    }*/
    
    public GeometricIterator iterator() {
        index = 0;
       return new GeometricIterator(this);
    }
    
 }
 
 class GeometricIterator implements Iterator<Square> {
    SquareContainer data;
    int current;
    
    public SquareIterator(SquareContainer data) {
       this.data = data;
       current = 0;
    }
    
    /*public Square next() {
       return data.squares[current++];
       
    }*/
    private void next(){
        //this tells you  what is next in the Geometric shape array
        index ++; 
        System.out.println(shapes[index]);

    }
    
    /*public boolean hasNext() {
       return current < data.squares.length;
    }*/
    private void hasNext(){
        //checks where or not a there is room next in GeometricShapes has a next
        //returns string
        String ok;
        int length = shapes.length;

        if(index +  1 <= length ){
            ok = "the next value is: " + index + 1;
        }
        else{
            ok = "there is no next value";
        }

        System.out.println(ok);
      

    }
 }

 
 