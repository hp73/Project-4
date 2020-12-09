/*
 * This is a Rectangle class for generating a rectangle.
 * @author Harry Pinkerton
 * @version 1.0
*/
package shapes;

public class Rectangle extends EdgesAbstract{
   
   /*
    * Constructor to create a Rectangle given the following:
    * width, height, color, position x, position y, and filled.
    * @param width - int width for the side of the rectangle.
    * @param height - int height for the side of the rectangle.
    * @param filled - boolean true or false if the color is filled.
    * @param color - A string representing the color of the rectangle.
    * @param x - the x-coordinate of the shape.
    * @param y - the y-coordinate of the shape.
    * @throws IllegalArgumentException if width or height is <= 0
    *
    */
  
   public Rectangle(int width, int height, int x, int y, boolean filled, String color) {
      if (width <= 0) {
         throw new IllegalArgumentException("Width must be positive.");
      }
      
      if (height <= 0) {
         throw new IllegalArgumentException("Height must be positive.");
      }

      // Creates array to store lengths of each side
      sides = new double[4];
      
      sides[0] = width;
      sides[1] = height;
      sides[2] = width;
      sides[3] = height;
      
      //Creates 2 arrays to store xcoords and ycoords paired by index position
      xCoords = new int[4]; 
      yCoords = new int[4];
      
      xCoords[0] = x;
      xCoords[1] = x + width;
      xCoords[2] = x + width; 
      xCoords[3] = x;
      
      yCoords[0] = y;
      yCoords[1] = y;
      yCoords[2] = y + height; 
      yCoords[3] = y + height;
      
      
      //sets each parameter in the Rectangle object
      this.width = width;
      this.height = height;
      this.x = x;
      this.y = y;
      this.filled = filled;
   }

   //Default Constructor if no parameters are entered
   public Rectangle() {
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
        if (! (other instanceof Rectangle)) {
            return false;

        } 
        else {
            Rectangle New = (Rectangle) other;
            return (this.width == New.width &&
                     this.height == New.height );
        }

    }

   
}
