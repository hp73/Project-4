
//JFrame is in here
import javax.swing.*;
import java.awt.*;

//import com.apple.eawt.ApplicationEvent;
//import com.apple.eawt.ApplicationListener;




public class ShapeDrawGUI extends JFrame {
    
   // Class Variables  
   private Canvas canvas;
   private JButton triangleButton;
   private JButton circleButton;
   private JButton squareButton;
   private JButton rectangleButton;
   private JButton ovalButton;
   private JButton octagonButton;


   
   public ShapeDrawGUI() {
      
      // Use a GridBagLayout
      setLayout(new GridBagLayout());
      GridBagConstraints positionConst = new GridBagConstraints();
      positionConst.insets = new Insets(10, 10, 10, 10);


      
      // Set up the window
      setSize(1100,800);        
      setTitle("Draw Shapes");        
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



      
      //making and adding buttons, check boxes an dsuch
      //DON"T CHANGE THIS
      // Add the canvas
      positionConst.gridx = 0;
      positionConst.gridy = 0;
      positionConst.fill = GridBagConstraints.BOTH;
      positionConst.gridwidth = GridBagConstraints.REMAINDER;
      positionConst.weightx = 1;
      positionConst.weighty = 1;



      //the canvas is doing anything that is drawn
      canvas = new Canvas();        
      add(canvas, positionConst);
      
      positionConst.fill = GridBagConstraints.HORIZONTAL;
      positionConst.gridwidth = 1;
      positionConst.gridy = 1;
      positionConst.weighty = 0;
      
      // Add buttons and checkboxes below the canvas here
      // need command pattern

      // Create "Triangle" Button
      triangleButton = new JButton("Triangle");
      //triangleButton.addActionListener(this);
      
      positionConst.gridx = 1;
      positionConst.gridy = 2;
      positionConst.insets = new Insets(5, 5, 5, 5);
      add(triangleButton, positionConst);
      
      
      //Create "Circle" Button
      circleButton = new JButton("Circle");
     
      
      positionConst.gridx = 2;
      positionConst.gridy = 2;
      positionConst.insets = new Insets(5, 5, 5, 5);
      add(circleButton, positionConst);
      
      
      // Create "Square" Button
      squareButton = new JButton("Square");
      
      
      positionConst.gridx = 3;
      positionConst.gridy = 2;
      positionConst.insets = new Insets(5, 5, 5, 5);
      add(squareButton, positionConst);
      
      
      // Create "Rectangle" Button
      rectangleButton = new JButton("Rectangle");
      
      
      positionConst.gridx = 1;
      positionConst.gridy = 3;
      positionConst.insets = new Insets(5, 5, 5, 5);
      add(rectangleButton, positionConst);
      
      
      //Create "Oval" Button
      ovalButton = new JButton("Oval");
      
      
      positionConst.gridx = 2;
      positionConst.gridy = 3;
      positionConst.insets = new Insets(5, 5, 5, 5);
      add(ovalButton, positionConst);
      
      
      //Create "Octagon" Button
      octagonButton = new JButton("Octagon");
      
      
      positionConst.gridx =3;
      positionConst.gridy = 3;
      positionConst.insets = new Insets(5, 5, 5, 5);
      add(octagonButton, positionConst);
   
   
    //create filled checkbox
    JCheckBox checkbox = new JCheckBox("filled", false);
 
    positionConst.gridx =4;
    positionConst.gridy = 2;
    positionConst.insets = new Insets(5, 5, 5, 5);
    add(checkbox, positionConst);
      
   }










   //this is what main will look like
   public static void main(String[] args) {
       
      // Main frame
      ShapeDrawGUI appFrame = new ShapeDrawGUI();                
      
      // Show window
      appFrame.setVisible(true);
       
       
   }
}