/* Project 3
 * 
 * File: roundTester.java
 * test everythign in assignment including exceptions
 * 
 * a tru catch nblock
 * try, catch, print (sucessul caught!
 * 
 * 
 * 
 * 
 */

import java.util.Arrays;
import java.util.Random;

public class ShapeTester {

    
   // Generates a random boolean value for filled
   public static boolean randbool() {
         return Math.random() < 0.5;
   }
   
   //Generates a random int for color index 0 to 4
   public static int randint() {
         return (int)(Math.random() * ((4 - 0) + 1)) + 0;
   }
   
   //Generates a random int for width and height
   public static int randintwidth() {
         return (int)(Math.random() * ((2000 - 500) + 1)) + 500;
   }
   
   






   public static void main (String [] args){
      
//Tests out OVAL
Oval oval1 = new Oval(3, 6, 4,5, true, "PURPLE");

//tests out OVAL toString        
        System.out.println(oval1.toString());

//tests out all the OVAL get methods
        System.out.println("Oval Get Methods");        
        System.out.println("the radius of the oval: " + oval1.getRadius());
        System.out.println("the position of the radius: (" + oval1.getX() + "," + oval1.getY() + ")");
        System.out.println("the second radius of the oval: " + oval1.getRadius2());
        System.out.println("filled: " + oval1.getFilled());
        System.out.println("the color of the oval: " + oval1.getColor());
        
        System.out.println("");


//tests out the OVAL default constructor
        System.out.println("");
        System.out.println("Default Oval");
        Oval oval2 = new Oval();

        System.out.println(oval2.toString());

/*
// tests out all the OVAL constructors 
       System.out.println("");
        System.out.println("Oval Options");
        Oval oval3 = new Oval(8);
        System.out.println(oval3.toString());

        System.out.println("Should raise error");
        Oval oval4 = new Oval(8,8);
        System.out.println("");

        System.out.println(oval4.toString());
        Oval oval5 = new Oval(8,10);
        System.out.println(oval5.toString());
        Oval oval6 = new Oval(8,10,9,9);
        System.out.println(oval6.toString());
        Oval oval7 = new Oval(8,10,9,9, false);
        System.out.println(oval7.toString());
*/






//Tests out Circle
Circle circle2 = new Circle(3,4,5, true, "WHITE");

//tests out toString        
        System.out.println(circle2.toString());

//tests out all the get methods
        System.out.println("Circle Get Methods");        
        System.out.println("the radius of the circle: " + circle2.getRadius());
        System.out.println("the position of the radius: (" + circle2.getX() + "," + circle2.getY() + ")");
        System.out.println("filled: " + circle2.getFilled());
        System.out.println("the color of the circle: " + circle2.getColor());
        System.out.println("");


//tests out the default constructor
        System.out.println("");
        System.out.println("Default Circle");
        Circle circle1 = new Circle();

        System.out.println(circle1.toString());

/*
// tests out all the constructors of Circle 
        System.out.println("");
        System.out.println("Circle Options");
        Circle circle3 = new Circle(9);
        System.out.println(circle3.toString());
        Circle circle4 = new Circle(8,9,9);
        System.out.println(circle4.toString());
        Circle circle5 = new Circle(8,9,9, false);
        System.out.println(circle5.toString());
*/


//Tests out Octagon
//Generates 5 Octagons with random length, height, boolean for fill, and color
     /* Octagon[] octagons = new Octagon[5];

      for (int i = 0; i < 5; i++) {
         octagons[i] = new Octagon(randintwidth(), randintwidth(), 3, 7, randbool(),
                                 EdgesAbstract.ALLOWED_COLORS[randint()]);
      }
      
      for (Octagon o : octagons) {
         System.out.println(o);
      }
*/
//creating individual
      Octagon octagon1 = new Octagon(3,9,4,5, true,"White");

//tests out toString        
        System.out.println(octagon1.toString());

//tests out all the get methods
        System.out.println("Octagon Get Methods");        
        System.out.println("the width of the octagon: " + octagon1.getWidth());
        System.out.println("the height of the octagon: " + octagon1.getHeight());
        System.out.println("the initial position of the octagon: (" + octagon1.getX() + "," + octagon1.getY() + ")");
        System.out.println("filled: " + octagon1.getFilled());
        System.out.println("the color of the octagon: " + octagon1.getColor());
        System.out.println("the perimeter of the octagon: " + octagon1.getperimeter());
        System.out.println("");


//tests out the default constructor
        System.out.println("");
        System.out.println("Default Octagon");
        Octagon octagon2 = new Octagon();

        System.out.println(octagon2.toString());

      

//Tests out Rectangle      
//Generates 5 rectangles with random length, height, boolean for fill, and color
     /* Rectangle[] rectangles = new Rectangle[5];

      for (int i = 0; i < 5; i++) {
         rectangles[i] = new Rectangle(randintwidth(), randintwidth(), 3, 7, randbool(),
                                 EdgesAbstract.ALLOWED_COLORS[randint()]);
      }
      
      for (Rectangle r : rectangles) {
         System.out.println(r);
      }
      */
//creating individual
      Rectangle rectangle1 = new Rectangle(9,4,4,5, true, "White");

//tests out toString        
        System.out.println(rectangle1.toString());

//tests out all the get methods
        System.out.println("Rectangle Get Methods");        
        System.out.println("the width of the rectangle: " + rectangle1.getWidth());
        System.out.println("the height of the rectangle: " + rectangle1.getHeight());
        System.out.println("the initial position of the rectangle: (" + rectangle1.getX() + "," + octagon1.getY() + ")");
        System.out.println("filled: " + rectangle1.getFilled());
        System.out.println("the color of the rectangle: " + rectangle1.getColor());
        System.out.println("the perimeter of the rectangle: " + rectangle1.getperimeter());
        System.out.println("");


//tests out the default constructor
        System.out.println("");
        System.out.println("Default Rectangle");
        Rectangle rectangle2 = new Rectangle();

        System.out.println(rectangle2.toString());


//Tests out Square
//Generates 5 Squares with random width, boolean for fill, and color
      /*Square[] squares = new Square[5];

      for (int i = 0; i < 5; i++) {
         squares[i] = new Square(randintwidth(), 3, 7, randbool(),
                                 EdgesAbstract.ALLOWED_COLORS[randint()]);
      }
      
      for (Square s : squares) {
         System.out.println(s);
      }
      */
//creating individual
      Square square1 = new Square(9,4,5, true, "White");

//tests out toString        
        System.out.println(square1.toString());

//tests out all the get methods
        System.out.println("Square Get Methods");        
        System.out.println("the width of the rectangle: " + square1.getWidth());
        System.out.println("the height of the rectangle: " + square1.getHeight());
        System.out.println("the initial position of the rectangle: (" + square1.getX() + "," + octagon1.getY() + ")");
        System.out.println("filled: " + square1.getFilled());
        System.out.println("the color of the rectangle: " + square1.getColor());
        System.out.println("the perimeter of the rectangle: " + square1.getperimeter());
        System.out.println("");


//tests out the default constructor
        System.out.println("");
        System.out.println("Default Square");
        Square square2 = new Square();

        System.out.println(square2.toString());



//Tests out Triangle
      Triangle triangle1 = new Triangle(2,9,5,1, true, "WHITE");

//tests out toString        
        System.out.println(triangle1.toString());

/*
//tests out all the get methods
        System.out.println("Triangle Get Methods");        
        System.out.println("the height of the triangle: " + triangle1.getHeight());
        System.out.println("the width of the triangle: " + triangle1.getWidth());
        System.out.println("filled: " + triangle1.getFilled());
        System.out.println("the color of the triangle: " + triangle1.getColor());
        System.out.println("the position: (" + triangle1.getX() + "," + triangle1.getY() + ")");
        System.out.println("");
*/

//tests out the default constructor
        System.out.println("");
        System.out.println("Default Triangle");
        Triangle triangle2 = new Triangle();

        System.out.println(triangle2.toString());

/*
// tests out all the constructors of Circle 
        System.out.println("");
        System.out.println("Triangle Options");
        Triangle triangle3 = new Triangle(9);
        System.out.println(triangle3.toString());
        Triangle triangle4 = new Triangle(8,9,9);
        System.out.println(triangle4.toString());
        Triangle triangle5 = new Triangle(8,9,9,10, false);
        System.out.println(triangle5.toString());

*/



//testing equals()

      Circle circleA = new Circle(3,4,5, true, "WHITE");
      Circle circleB = new Circle(3,4,5, true, "WHITE");
      Circle circleC = new Circle(5,9,2, true, "BLUE");

      //System.out.println("expect true:");
      //System.out.println(circleA.equals(circleB));
      //System.out.println("expect false:");
      //System.out.println(circleA.equals(circleC));

      Oval ovalA = new Oval(3,2,4,5, true, "WHITE");
      Oval ovalB = new Oval(3,4,6,5, true, "BLACK");
      Oval ovalC = new Oval(3,2,4,5, true, "WHITE");

      //System.out.println("expect false:");
      //System.out.println(ovalA.equals(ovalB));
      //System.out.println("expect true:");
      //System.out.println(ovalA.equals(ovalC));
      //System.out.println("expect false:");
      //System.out.println(circleA.equals(ovalA));

      Octagon octagonA = new Octagon(7,9,4,4, true, "WHITE");
      Octagon octagonB = new Octagon(7,9,4,4, true, "WHITE");
      Octagon octagonC = new Octagon(7,1,4,4, true, "WHITE");

      //System.out.println("expect true:");
      //System.out.println(octagonA.equals(octagonB));
      //System.out.println("expect false:");
      //System.out.println(octagonA.equals(octagonC));
      //System.out.println("expect false:");
      //System.out.println(circleA.equals(octagonA));


      Rectangle rectangleA = new Rectangle(3,2,4,5, true, "WHITE");
      Rectangle rectangleB = new Rectangle(3,2,4,5, true, "WHITE");
      Rectangle rectangleC = new Rectangle(2,2,9,5, false, "WHITE");

      //System.out.println("expect true:");
      //System.out.println(rectangleA.equals(rectangleB));
      //System.out.println("expect false:");
      //System.out.println(rectangleA.equals(rectangleC));
      //System.out.println("expect false:");
      //System.out.println(octagonA.equals(rectangleA));


      Square squareA = new Square(2,4,5, true, "WHITE");
      Square squareB = new Square(2,4,5, true, "WHITE");
      Square squareC = new Square(2,0,5, true, "WHITE");


      //System.out.println("expect true:");
      //System.out.println(squareA.equals(squareB));
      //System.out.println("expect false:");

// something is wrong here
      //System.out.println(squareA.equals(squareC));
      //System.out.println("expect false:");
      //System.out.println(octagonA.equals(squareA));


      Triangle triangleA = new Triangle(3,2,4,5, true, "WHITE");
      Triangle triangleB = new Triangle(3,2,4,5, true, "WHITE");
      Triangle triangleC = new Triangle(3,2,0,5, true, "WHITE");

      System.out.println("expect true:");
      System.out.println(triangleA.equals(triangleB));

// something is wrong here
      System.out.println("expect false:");
      System.out.println(triangleA.equals(triangleC));
      System.out.println("expect false:");
      System.out.println(octagonA.equals(triangleA));
      





   }
  
}