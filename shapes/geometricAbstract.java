/*
 * Abstract Class for shapes with edges
 * @author Laurie Jones
 * @version 1.0 
*/

public class geometricAbstract {
 // Default variables
    public static final String DEFAULT_COLOR = "Black";
    public static final boolean DEFAULT_FILLED = true;
    public static final int DEFAULT_X = 0;
    public static final int DEFAULT_Y = 0;


// Instance variables
    public String color;
    public boolean filled;
    public int x;
    public int y;


    /**
*Getter that returns the initial x position of a shape.
*@return an int representing the x position
*/
  
  public int getX(){
        return x;
  }


    /**
   *Getter that returns the initial y position of a shape.
   *@return an int representing the y position.
   */
  
  public int getY(){
        return y;
  }
  
  /**
   *Getter that returns the filled value of a shape.
   *@return a boolean true or false representing whether or not a shape is filled.
   */
  
  public boolean getFilled (){
        return filled;
  }

  /**
   *Getter that returns the color of a shape.
   *@return a string representing the color of the shape.
   */
  
  public String getColor(){
        return color;
    }


  /**
   *Compares two shapes and determines if they are the same.
   *@param other - the object to compare the shape to.
   *@return a boolean value true if the shapes are the same object or false if
   *they are different.
   */

    public boolean equals(Object other ) {

        Class cType = this.getClass();

        //tests to see if its the exact same circle/oval
        if (this == other) {
            return true;
        } 

        //tests to see if its the same shape
        else if (! (other.getClass() == cType)) {
            return false;

        } 

        //returns the sharable things between 
        else {
            geometricAbstract New = (geometricAbstract) other;
            return (this.x  == New.x && 
                    this.y == New.y && 
                    this.filled == New.filled && 
                    this.color == New.color );
            //use and if it more than one thing returning
        }
    }




}


