

import javax.swing.*;
import java.awt.*;



public class ShapeDrawGUI extends JFrame {
    
   // Class Variables  
   private Canvas canvas;
      
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
      
      canvas = new Canvas();        
      add(canvas, positionConst);
      
      positionConst.fill = GridBagConstraints.HORIZONTAL;
      positionConst.gridwidth = 1;
      positionConst.gridy = 1;
      positionConst.weighty = 0;
      
      // Add buttons and checkboxes below the canvas here
      JButton button1 = new JButton("Square");
      JButton button2 = new JButton("Triangle");
      JButton button3 = new JButton("Octagon");
      JButton button4 = new JButton("Circle");
      JButton button5 = new JButton("Red");
      JButton button6 = new JButton("Blue");
      JButton button7 = new JButton("Green");
      JButton button8 = new JButton("Orange");
      JButton button9 = new JButton("Pink");
      JButton button10 = new JButton("Yellow");   

      JPanel panel1 = new JPanel();
      panel1.add(button1);
      this.getContentPane().add(panel1);
      setVisible(true);
      
      JPanel panel2 = new JPanel();
      panel2.add(button2);
      this.getContentPane().add(panel2);
      setVisible(true);
      
      JPanel panel3 = new JPanel();
      panel2.add(button3);
      this.getContentPane().add(panel3);
      setVisible(true);
      
      JPanel panel4 = new JPanel();
      panel2.add(button4);
      this.getContentPane().add(panel4);
      setVisible(true);
      
      JPanel panel5 = new JPanel();
      panel2.add(button5);
      this.getContentPane().add(panel5);
      setVisible(true);
      
      JPanel panel6 = new JPanel();
      panel2.add(button6);
      this.getContentPane().add(panel6);
      setVisible(true);
      
      JPanel panel7 = new JPanel();
      panel2.add(button7);
      this.getContentPane().add(panel7);
      setVisible(true);
      
      JPanel panel8 = new JPanel();
      panel2.add(button8);
      this.getContentPane().add(panel8);
      setVisible(true);
      
      JPanel panel9 = new JPanel();
      panel2.add(button9);
      this.getContentPane().add(panel9);
      setVisible(true);
      
      JPanel panel10 = new JPanel();
      panel2.add(button10);
      this.getContentPane().add(panel10);
      setVisible(true);
   }
   
   public static void main(String[] args) {
       
      // Main frame
      ShapeDrawGUI appFrame = new ShapeDrawGUI();                
      
      // Show window
      appFrame.setVisible(true);
       
       
   }
}