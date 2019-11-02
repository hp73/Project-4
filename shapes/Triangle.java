/*
 * This is a Triangle class for generating a triangle.
 * @author Laurie Jones
 * @version 1.0
*/


 import java.lang.Math;

public class Triangle extends EdgesAbstract{

    /*
     * Constructors to create a Triangle given one of the following:
     * width, height, color, position x, position y, or filled.
     * @param width - double length for the side of a triangle
     * @param height - int length for the side of a triangle
     * @param filled - boolean true or false if the shape filled.
     * @param color - A string representing the color of the triangle.
     * @param x - the x-coordinate of the shape
     * @param y - the y-coordinate of the shape
     *
     */
    public Triangle() {
        this(DEFAULT_HEIGHT, DEFAULT_WIDTH, DEFAULT_POSITION, DEFAULT_POSITION, DEFAULT_FILLED, DEFAULT_COLOR);
     }

     public Triangle(int height) {
        this(height, DEFAULT_WIDTH, DEFAULT_POSITION, DEFAULT_POSITION, DEFAULT_FILLED, DEFAULT_COLOR);
     }

     public Triangle(int height, int width) {
        this(height, width, DEFAULT_POSITION, DEFAULT_POSITION, DEFAULT_FILLED, DEFAULT_COLOR);
     }

     public Triangle(int height, int width, int x) {
        this(height, width, x, DEFAULT_POSITION, DEFAULT_FILLED, DEFAULT_COLOR);
     }

     public Triangle(int height, int width, int x, int y) {
        this(height, width, x, y, DEFAULT_FILLED, DEFAULT_COLOR);
     }

     public Triangle(int height, int width, int x, int y, boolean filled) {
        this(height, width, x, y, filled, DEFAULT_COLOR);
     }
     
    public Triangle(int height, int width, int x, int y, boolean filled, String color) {
       if (width <= 0) {
          throw new IllegalArgumentException("Width must be positive.");
       }
       if (height <= 0) {
          throw new IllegalArgumentException("Height must be positive.");
       }
 
       //sets each parameter in the triangle object
       this.width = width;
       this.height = height;
       this.x = x;
       this.y = y;
       
       this.filled = filled;
       if (filled == false){
             this.color = "none";
         }
         else{
             this.color = color;
         }

       //Creates an array for xcoords and y coords paired by index position.
       xCoords = new int[3]; 
       yCoords = new int[3];
       
       xCoords[0] = x + (width/2);
       xCoords[1] = x + width;
       xCoords[2] = x; 
       
       yCoords[0] = y;
       yCoords[1] = y + height;
       yCoords[2] = y + height; 

       //Calculates the diagonal of the triangle
       int halfside = width/2;

       sides = new double[3];
       sides[0] = Math.sqrt( Math.pow(halfside, 2) + Math.pow(height, 2) );
       sides[1] = width;
       sides[2] = Math.sqrt( Math.pow(halfside, 2) + Math.pow(height, 2) );


    }



/**
   *Compares two shapes and determines if they are the same.
   *@param other - the object to compare the shape to.
   *@return a boolean value true if the shapes are the same object or false if
   *they are different.
   */  
    public boolean equals (Object other) {
        super.equals(other);

        //tests to see if its the same shape
        if (! (other instanceof Triangle)) {
            return false;

        } 

        //returns the sharable things between 
        else {
            Triangle New = (Triangle) other;
            return (this.width == New.width &&
                     this.height == New.height);

        }
      }
      

   











     
}