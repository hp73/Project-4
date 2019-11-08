/*
 * Abstract Class for shapes with edges
 * @author Harry Pinkerton
 * @version 1.0 Project 3
*/

public class EdgesAbstract extends GeometricAbstract {
    
   // Class variables
   public static final int DEFAULT_WIDTH = 10;
   public static final int DEFAULT_HEIGHT = 10;
   public static final int DEFAULT_POSITION = 0;
   public static final String[] ALLOWED_COLORS = {"Black", "White", "Pink", "Blue", "Green"};
   
   // Instance variables
   public int width;
   public int height;
   public int[] xCoords;
   public int[] yCoords;
   public double[] sides;
   
   
   /**
   *Getter that returns a paired coordinate for a shape
   *@param position - the index position of the desired coordinate in the array.
   *@return a pair of ints, representing a corner of the square.
   */

  public String getcoords(int position){
      return ("(" + xCoords[position] + "," + yCoords[position] + ")") ;
  }
  
  /**
   *Getter that returns the perimeter of a given shape object
   *@return a double representing the perimeter of the object.
   */
  
  public double getperimeter(){ 
    double sum = 0; // initialize sum 
    int i; 
        
      // Iterate through all the sides and add them to sum 
      for (i = 0; i < sides.length; i++){ 
            sum +=  sides[i]; 
      }
         
    return sum;
  }
  
  /**
   *Getter that returns the height of a shape.
   *@return an int representing the height of the shape.
   */
  
  public int getHeight(){
        return height;
    }

  /**
   *Getter that returns the width of a shape.
   *@return an int representing the width of the shape.
   */  
    
  public int getWidth(){
        return width;
  }

    
  /**
    *Displays all of the information for a shape in string format
    *@returns a string representation of a given shape object.
  */  

  public String toString() {
    
    /*Determines which shape is being printed and filters out innapropriate print
     *statements.
    */
    String shape;
    Class cool = this.getClass();
     
    if (cool == Octagon.class){
      shape = "Octagon";
    }
     
    else if (cool == Triangle.class){
      shape = "Triangle";
    }
     
    else if (cool == Square.class){
      shape = "Square";
    }
     
    else{
      shape = "Rectangle";
    }
     
      String str = "==" + shape + "==" + "\n";
      str += "Width: " + width + "\n";
      if (cool != Square.class){
      str += "Height: " + height + "\n";
      }
      str += "Coordinates:" + "" ;
      for (int i = 0; i < xCoords.length; i++)
      {
         str+= getcoords(i) + " ";
      }
      str += "\n";
      str += "Position: " + x + "," + y + "\n";
      str += "Filled: " + filled + "\n";
      str += "Color: " + color + "\n";
      str += "\n";
      for (int i = 0; i < sides.length; i++)
      {
         str+= "Side " + (i+1) + ": " + sides[i] + "\n";
      }
      str += "Perimeter: " + getperimeter() + "\n";
      str += "===";
      str += "\n";
      
      return str;
   } 
}