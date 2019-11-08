
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
   private JCheckBox filledButton;
   private JButton redButton;
   private JButton blueButton;
   private JButton greenButton;
   private JButton pinkButton;
   private JButton yellowButton;
   private JButton purpleButton;
   
   
   public ShapeDrawGUI() {
      
      // Use a GridBagLayout
      setLayout(new GridBagLayout());
      GridBagConstraints positionConst = new GridBagConstraints();
      positionConst.insets = new Insets(10, 10, 10, 10);

      // Set up the window
      setSize(1100,800);        
      setTitle("Draw Shapes");        
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
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
      
      
      // Adding buttons and checkboxes 

      
      // Create "Triangle" Button
      triangleButton = new JButton("Triangle");
      //triangleButton.addActionListener(this);
      
      positionConst.gridx = 0;
      positionConst.gridy = 1;
      positionConst.insets = new Insets(5, 5, 5, 5);
      add(triangleButton, positionConst);
      
      
      //Create "Circle" Button
      circleButton = new JButton("Circle");
      
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 1;
      positionConst.gridy = 1;
      positionConst.insets = new Insets(5, 5, 5, 5);
      add(circleButton, positionConst);
      
      
      // Create "Square" Button
      squareButton = new JButton("Square");
      
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 2;
      positionConst.gridy = 1;
      positionConst.insets = new Insets(5, 5, 5, 5);
      add(squareButton, positionConst);
      
      
      // Create "Rectangle" Button
      rectangleButton = new JButton("Rectangle");
   
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 3;
      positionConst.gridy = 1;
      positionConst.insets = new Insets(5, 5, 5, 5);
      add(rectangleButton, positionConst);
      
      
      //Create "Oval" Button
      ovalButton = new JButton("Oval");
   
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 4;
      positionConst.gridy = 1;
      positionConst.insets = new Insets(5, 5, 5, 5);
      add(ovalButton, positionConst);
      
      
      //Create "Octagon" Button
      octagonButton = new JButton("Octagon");
      
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 5;
      positionConst.gridy = 1;
      add(octagonButton, positionConst);
      
      
      //Create "filled" check Box Button
      filledButton = new JCheckBox("filled");
      
      positionConst.gridx = 6;
      positionConst.gridy = 1;
      add(filledButton, positionConst);
      
      //Create "Red" Button
      redButton = new JButton("Red");
      
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 0;
      positionConst.gridy = 2;
      add(redButton, positionConst);
      
      
      //Create "Blue" Button
      blueButton = new JButton("Blue");
      
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 1;
      positionConst.gridy = 2;
      add(blueButton, positionConst);
      
      
      //Create "Green" Button
      greenButton = new JButton("Red");
      
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 2;
      positionConst.gridy = 2;
      add(greenButton, positionConst);
      
      //Create "Pink" Button
      pinkButton = new JButton("Pink");
      
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 3;
      positionConst.gridy = 2;
      add(pinkButton, positionConst);
      
      //Create "Yellow" Button
      yellowButton = new JButton("Yellow");
      
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 4;
      positionConst.gridy = 2;
      add(yellowButton, positionConst);
      
      //Create "Purple" Button
      purpleButton = new JButton("Purple");
      
      positionConst.insets = new Insets(10, 10, 10, 10);
      positionConst.gridx = 5;
      positionConst.gridy = 2;
      add(purpleButton, positionConst);
      
      
   }

   //this is what main will look like
   public static void main(String[] args) {
       
      // Main frame
      ShapeDrawGUI appFrame = new ShapeDrawGUI();                
      
      // Show window
      appFrame.setVisible(true);
       
       
   }
}