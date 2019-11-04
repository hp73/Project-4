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

public class ShapeHolder {   
    // The singleton instance variable
    private static ShapeHolder instance;
    
    public static ShapeHolder getInstance() {
       if (instance == null) {
          instance = new ShapeHolder();
       }
       
       return instance;
    }
 
    private ShapeHolder() {
       Class[] GeometricShape = new Class[50];

    }
 }
 