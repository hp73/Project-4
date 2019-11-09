/*
 * This is a Canvas class that tracks shapes and prints them on a canvas
 * @author Laurie Jones
 * @version 1.0 Project 4
 * 
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JPanel;
import java.awt.event.*;
import shapes.*;

//import java.awt.Oval;

//from the mouse stuff
public class Canvas extends JPanel implements MouseListener, MouseMotionListener {
   
   //Variables
   //updates the mouse things and "what we want it to be"
   private Point posStart;
   private Point posEnd;   
   private Rectangle drawRect;
   private String shape;


   // Final variables
   //the outline of the rectangle
   //abstract draw method
   final private Color colorSelect = new Color(0, 200, 200);
   
   // Constructors and setup methods
   public Canvas(ShapeHolder bucket) {
      super();
      this.setOpaque(true);
      this.setBackground(Color.WHITE);
      this.shapes = bucket;
      
      // No selection rectangle to draw
      drawRect = null;
      
      // Listen for mouse movement or input
      //mouse clicks
      addMouseListener(this);    
      //mouse movements
      addMouseMotionListener(this);
      
   }
   
   // Listeners
   @Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      // Draw any shapes in the shape holder here
      // Draw drag rectangle if it is there

/*
      for (GeometricAbstract k : ShapeHolder){
         shapes.addShape(shape);

      }
*/


      
   }

   public static void draw(Graphics g, GeometricAbstract s){
      g.drawOval(100,100,100,100);

         if (s instanceof Circle){
            g.setColor(colorSelect);

            g.drawOval((int)drawOval.getX(), (int)drawOval.getX(), 
            (int)drawOval.getWidth(), (int)drawOval.getHeight());
         }
         else if (s instanceof Oval){
            g.setColor(colorSelect);

            g.drawOval((int)drawOval.getX(), (int)drawOval.getY(), 
            (int)drawOval.getWidth(), (int)drawOval.getHeight());
         }
         else if(shape == "Octagon"){
            g.setColor(colorSelect);
            g.drawRect(100,200,400,500);
      
      
            g.drawOval((int)drawRect.getX(), (int)drawRect.getX(), 
            (int)drawRect.getWidth(), (int)drawRect.getHeight());
         }
         else if (drawRect != null) {
            g.setColor(colorSelect);
      
            g.drawRect((int)drawRect.getX(), (int)drawRect.getY(), 
            (int)drawRect.getWidth(), (int)drawRect.getHeight());
            
         }

      

   }
   

   //make a draw method wehere you can just 
   //inherit everything and jut put in which oen you like

      
   
   // Needed for mouse listeners
   @Override
   public void mouseEntered(MouseEvent e) {
   }

   @Override
   public void mouseExited(MouseEvent e) {
   }
   
   @Override
   public void mouseMoved(MouseEvent e) {
      
      
   }
   
   //where we click so where we start drawing out trectable, 
   //button1 is left

   @Override
   public void mousePressed(MouseEvent e) {
      if (e.getButton() == MouseEvent.BUTTON1) {
         posStart = new Point(e.getX(), e.getY());
         posEnd = new Point(e.getX(), e.getY());
      }
      
         updateRectangle(); 
        
   }

   @Override
   public void mouseReleased(MouseEvent e) {
      if (e.getButton() == MouseEvent.BUTTON1) {
         posEnd.setLocation(e.getX(), e.getY());
         updateRectangle();
         
         

         drawRect = null;
         posStart = null;
         posEnd = null;
         
      }
      
   }
   
   @Override
   public void mouseDragged(MouseEvent e) {
      if (drawRect != null) {
         posEnd.setLocation(e.getX(), e.getY());
         updateRectangle();
      }

   }



   // Needed for mouse listeners
   @Override
   public void mouseClicked(MouseEvent e) {
        
   }
   

   public void setShape(String shape){
      this.shape = shape;
   }


   //Changing Rectangle
   public void updateRectangle() {
      
      if (drawRect == null) {

         drawRect = new Rectangle(0, 0, 0, 0);
      }

      int width = (int)Math.abs(posEnd.getX() - posStart.getX());
      int height = (int)Math.abs(posEnd.getY() - posStart.getY());
      int left = (int)Math.min(posStart.getX(), posEnd.getX());
      int top = (int)Math.min(posStart.getY(), posEnd.getY());
      
      drawRect.setLocation(left, top);
      
      drawRect.setSize(width, height);
      

      repaint();
   }



   
}