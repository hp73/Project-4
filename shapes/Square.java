/*
 * This is a Square class for generating a square.
 * @author Harry Pinkerton
 * @version 1.0
*/

public class Square extends EdgesAbstract{
   
   /*
    * Constructors to create a Square given the following:
    * width, color, position x, position y, or filled.
    * @param width - double length for the side of the square
    * @param filled - boolean true or false if the color is filled.
    * @param color - A string representing the color of the square
    * @param x - the x-coordinate of the shape
    * @param y - the y-coordinate of the shape
    * @throws IllegalArgumentException if width is <= 0
    *
    */
   public Square(int width, int x, int y, boolean filled, String color) {
      if (width <= 0) {
         throw new IllegalArgumentException("Width must be positive.");
      }
      
      // Creates array to store lengths of each side
      sides = new double[4];
      
      // Fills the array with width in 4 index positions
      for (int i = 0; i < 4; i++){
         sides[i] = width;
      }

      //Creates an array for xcoords and y coords paired by index position
      xCoords = new int[4]; 
      yCoords = new int[4];
      
      xCoords[0] = x;
      xCoords[1] = x + width;
      xCoords[2] = x + width; 
      xCoords[3] = x;
      
      yCoords[0] = y;
      yCoords[1] = y;
      yCoords[2] = y + width; 
      yCoords[3] = y + width;
      
      
      //sets each parameter in the Square object
      this.width = width;
      this.x = x;
      this.y = y;
      this.filled = filled;
      if (filled == false){
            this.color = "none";
        }
        else{
            this.color = color;
        }
   }

   
   //Default Constructor if no parameters are entered
   public Square() {
      this(DEFAULT_WIDTH, DEFAULT_POSITION, DEFAULT_POSITION, DEFAULT_FILLED, DEFAULT_COLOR);
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
        if (! (other instanceof Square)) {
            return false;

        } 

        //returns the sharable things between 
        else {
            Square New = (Square) other;
            return (this.width == New.width);
        }

    }



   
}