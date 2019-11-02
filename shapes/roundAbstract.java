/*
 * Laurie Jones
 * Project 3
 * 
 * File: roundAbstract.java
 * 
 * 
 */

 /**
 * @author Laurie Jones
 * 
 */

public class roundAbstract extends geometricAbstract{

    // Create a private string and integer array for the name and scores 
    public int radius;
    public int radius2;

    //default values
    public static final int DEFAULT_RADIUS = 4;
    public static final int DEFAULT_RADIUS_TWO = 9;
;
    
    //get methods

     public int getRadius (){
        return radius;
    }

    public int getRadius2 (){
        return radius2;
    }
 




    public String toString(){

        String shape;
        Class cool = this.getClass();

        if (cool == Circle.class){
            shape = "Circle";

        }
        else{
            shape = "Oval";
        }

        String str = "==" + shape + "==" + "\n";
        str += "Radius: " + radius + "\n";
        
        if (shape == "Oval"){
            str += "Radius2: " + radius2 + "\n"; 
        }
        
        str += "Position: " + x +  "," + y + "\n"; 
        str += "Filled: " + filled + "\n";
        str += "Color: " + color + "\n";
    
    return str;
                 
    }
}


