/*
 * Laurie Jones
 * Project 3
 * 
 * File: Oval.java
 * 
 * @author Laurie Jones
 * 
 */


import java.lang.Math;

public class Oval extends roundAbstract{


    //constructors
    public Oval () {
        this (DEFAULT_RADIUS, DEFAULT_RADIUS_TWO, DEFAULT_X, DEFAULT_Y, DEFAULT_FILLED, DEFAULT_COLOR );
    
    }

    public Oval (int radius){
        this (radius, DEFAULT_RADIUS_TWO, DEFAULT_X, DEFAULT_Y, DEFAULT_FILLED, DEFAULT_COLOR );
    }

    public Oval (int radius, int radius2 ){
        this (radius, radius2, DEFAULT_X, DEFAULT_Y, DEFAULT_FILLED, DEFAULT_COLOR );
    }

    public Oval (int radius, int radius2, int x){
        this (radius, radius2, x, DEFAULT_Y, DEFAULT_FILLED, DEFAULT_COLOR );
    }

    public Oval (int radius, int radius2, int x, int y){
        this (radius, radius2, x, y, DEFAULT_FILLED, DEFAULT_COLOR );
    }

    public Oval (int radius, int radius2, int x, int y, boolean filled){
        this (radius, radius2, x, y, filled, DEFAULT_COLOR );
    }



    public Oval (int radius, int radius2, int x, int y, boolean filled, String color) {
        this.radius = radius;

        if (radius2 == radius){
            System.out.println("If you have two radii that are the same, its a circle.  We doubled your radius. ");
            this.radius2 = radius2  * 2;
        }
        else{
            this.radius2 = radius2;
        }

        this.x = x;
        this.y = y;
        this.filled = filled;

    
    }




/**
   *Compares two shapes and determines if they are the same.
   *@param other - the object to compare the shape to.
   *@return a boolean value true if the shapes are the same object or false if
   *they are different.
   */
    public boolean equals(Object other ) {


        super.equals(other);

        //tests to see if its the same shape
        if (! (other instanceof Oval)) {
            return false;

        } 

        else {
            Oval New = (Oval) other;
            return (this.radius  == New.radius &&
                    this.radius2 == New.radius2);
        }

    }

    
}