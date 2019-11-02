/*
 * This is an Octagon class for generating an octagon.
 * @author Harry Pinkerton
 * @version 1.0
*/

public class Octagon extends EdgesAbstract{
   
   /*
    * Constructors to create an Octagon given the following:
    * width, height, color, position x, position y, and filled.
    * @param width - double length for the side of the octagon.
    * @param height - int height for the side of the octagon.
    * @param filled - boolean true or false if the color is filled.
    * @param color - A string representing the color of the octagon.
    * @param x - the x-coordinate of the shape.
    * @param y - the y-coordinate of the shape.
    * @throws IllegalArgumentException if width or height is <= 0.
    *
    */
  
   public Octagon(int width, int height, int x, int y, boolean filled, String color) {
      if (width <= 0) {
         throw new IllegalArgumentException("Width must be positive.");
      }
      if (height <= 0) {
         throw new IllegalArgumentException("Height must be positive.");
      }
      
      
      /* Calculates the length of the diagonal side of the Octagon given height
       * and width
       */
      
      double a = height/3.0;
      double b = width/3.0;
      double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
      
      // Creates array to store lengths of each side
      
      sides = new double[8];
      
      sides[0] = b;
      sides[1] = c;
      sides[2] = a;
      sides[3] = c;
      sides[4] = b;
      sides[5] = c;
      sides[6] = a;
      sides[7] = c;
      
      //Creates 2 arrays to store xcoords and ycoords paired by index position
      xCoords = new int[8]; 
      yCoords = new int[8];
      
      xCoords[0] = x + (width/3);
      xCoords[1] = x + (2* width/3);
      xCoords[2] = x + width;
      xCoords[3] = x + width;
      xCoords[4] = x + (2* width/3);
      xCoords[5] = x + (width/3);
      xCoords[6] = x;
      xCoords[7] = x;
      
      yCoords[0] = y;
      yCoords[1] = y;
      yCoords[2] = y + (height/3);
      yCoords[3] = y + (2* height/3);
      yCoords[4] = y + height;
      yCoords[5] = y + height;
      yCoords[6] = y + (2* height/3);
      yCoords[7] = y + (height/3);
      
      //sets each parameter in the Octagon object
      this.width = width;
      this.height = height;
      this.x = x;
      this.y = y;
      this.filled = filled;
   }

   //Default Constructor if no parameters are entered
   public Octagon() {
      this(DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_POSITION, DEFAULT_POSITION, DEFAULT_FILLED, DEFAULT_COLOR);
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
        if (! (other instanceof Octagon)) {
            return false;

        } 

        //returns the sharable things between 
        else {
            Octagon New = (Octagon) other;
            return (this.width == New.width &&
                     this.height == New.height);
        }

    }


}