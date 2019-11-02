/*
 * This is a Circle class for generating a cirle.
 * @author Laurie Jones
 * @version 1.0 Project 3
 * 
 */

import java.lang.Math;

public class Circle extends roundAbstract{

   /*
    * Constructors to create a circle given one of the following:
    * radius, position x, position y, fille, and color.
    * @param radius - int radius for the radius of the circle.
    * @param filled - boolean true or false if the shape is filled.
    * @param color - A string representing the color of the circle.
    * @param x - the x-coordinate of the shape.
    * @param y - the y-coordinate of the shape.
    *
    */

    public Circle () {
        this (DEFAULT_RADIUS, DEFAULT_X, DEFAULT_Y, DEFAULT_FILLED, DEFAULT_COLOR );
    
    }
    
    public Circle (int radius){
        this (radius, DEFAULT_X, DEFAULT_Y, DEFAULT_FILLED, DEFAULT_COLOR );
    }

    public Circle (int radius, int x){
        this (radius, x, DEFAULT_Y, DEFAULT_FILLED, DEFAULT_COLOR );
    }

    public Circle (int radius, int x, int y){
        this (radius, x, y, DEFAULT_FILLED, DEFAULT_COLOR );
    }

    public Circle (int radius, int x, int y, boolean filled){
        this (radius, x, y, filled, DEFAULT_COLOR );
    }

    
    //Given every parameter, Sets each parameter to the Circle object
    public Circle (int radius, int x, int y, boolean filled, String color){
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.filled = filled;
        
    }


    //getMethods

/**
   *Compares two shapes and determines if they are the same.
   *@param other - the object to compare the shape to.
   *@return a boolean value true if the shapes are the same object or false if
   *they are different.
   */
    public boolean equals(Object other ) {
        super.equals(other);
        //^^ for the individual calss equals

        //tests to see if its the exact same circle/oval
        
    

        //tests to see if its the same shape
        if (! (other instanceof Circle)) {
            return false;

        } 

        //returns the sharable things between 
        else {
            Circle New = (Circle) other;
            return (this.radius  == New.radius);
            //use and if it more than one thing returning
        }

    }


}