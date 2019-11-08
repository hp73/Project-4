import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JPanel;
import java.awt.event.*;
import shapes.*;

//from the mouse stuff
public class Canvas extends JPanel implements MouseListener, MouseMotionListener{
   
   //Variables
   //updates the mouse things and "what we want it to be"
   private Point posStart;
   private Point posEnd;   
   private Rectangle drawRect;
   private String shape;
   //private Octagon drawPoly;
   //private Circle drawRound; 


   
   
   // Final variables
   //the outline of the rectangle
   //abstract draw method
   final private Color colorSelect = new Color(0, 200, 200);
   
   // Constructors and setup methods
   public Canvas() {
      super();
      this.setOpaque(true);
      this.setBackground(Color.WHITE);
      
      // No selection rectangle to draw
      drawRect = null;

      ////
      //drawPoly = null;
      
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
      g.drawOval(getX(), getY(), getWidth(), getHeight());
      g.drawRect(getX(), getY(), getWidth(), getHeight());
      
      //g.drawOctagon(0, 0, getWidth(), getHeight());
      ///g.drawCircle(0, 0, getWidth(), getHeight());
   
      
      // Draw drag rectangle if it is there

      if (drawRect != null) {
         g.setColor(colorSelect);

      //a method and instance varible called drawRect, watch out!!!
      //if method is there you have clicked
      // the method draws the rectangle
         g.drawRect((int)drawRect.getX(), (int)drawRect.getY(), 
         (int)drawRect.getWidth(), (int)drawRect.getHeight());
         
         // Draw the current shape here

         //g.drawPoly((int)drawPoly.getX(), (int)drawPoly.getY(), (int)drawPoly.getWidth(), (int)drawPoly.getHeight());
         
      }
      
   }
   
   @Override
   public void actionPerformed(ActionEvent event){
      
      JButton sourceEvent = (JButton) event.getSource();
      
      if (sourceEvent == orangeButton){
         this.setBackground(Color.ORANGE);
      }
      
      else if (sourceEvent == yellowButton){
         this.setBackground(Color.YELLOW);
      }
      
      else if (sourceEvent == pinkButton){
         this.setBackground(Color.PINK);
      }
      
      else if (sourceEvent == redButton){
         this.setBackground(Color.RED);
      }
      
      else if (sourceEvent == blueButton){
         this.setBackground(Color.BLUE);
      }
      
      else if (sourceEvent == greenButton){
         this.setBackground(Color.GREEN);
      }
      
   }

   //make a draw method wheere you can just 
   //inherit everything and just put in which one you like
   /*
   public void draw(Class shape){

      if (shape == Circle ){
         int x = posEnd.getX();
         int x2 = posStart.getX();
         int y = posEnd.getY();
         int y2 = posStart.getY();

         int width = (int)Math.abs(posEnd.getX() - posStart.getX());
         int height = (int)Math.abs(posEnd.getX()- posStart.getX());
         int left = (int)Math.min(posStart.getX(), posEnd.getX());
         int top = (int)Math.min(posStart.getY(), posEnd.getY());         
         drawRect.setLocation(left, top);
         drawRect.setSize(width, height);

      }
      

   } */
   
   // Highly recommended to create this method for assisting in the paintComponent method
   /*private void drawGenericShape(Graphics g, GeometricAbstract s) {


      // Draw any sort of shape to the canvas

      // a bunch of if else statements
      //geometricAbstract rect- draw ret
      if (drawRect != null) {
         g.setColor(colorSelect);

      else if (drawPoly != null) {
         g.setColor(colorSelect);

      else if (drawRound != null) {
         g.setColor(colorSelect);
      //octogon, draw poly
      //circle, stationary oval
      // there is a method that will drww a polygon for you in graphics g
      //if xvoordinates in is array list it needs to be in an array but there should be a conversion
      
      
   }*/
   
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
         
         // Create new shape here
         
         updateRectangle(); 
        
      }

      /*if (e.getButton() == MouseEvent.circleButton) {
         posStart = new Point(e.getX(), e.getY());
         posEnd = new Point(e.getX(), e.getY());         
         updateCircle(); 
        
      }*/
   }

   @Override
   public void mouseReleased(MouseEvent e) {
      if (e.getButton() == MouseEvent.BUTTON1) {
         posEnd.setLocation(e.getX(), e.getY());
         updateRectangle();
         
         // Add the shape to the shapeholder here        
         // Add the shape to the shapeholder here        
         // first get the click and drag shape to show, and then goign away before you ge tthem to stay
         //circel and square always stay circles and squares
         // the tealoutline will always be there
         // Free up the draw variables
         // Free up the draw variables
         drawRect = null;
         posStart = null;
         posEnd = null;
         
      }

      /*if (e.getButton() == MouseEvent.circleButton) {
         posEnd.setLocation(e.getX(), e.getY());
         updateCircle();

         drawRound = null;
         posStart = null;
         posEnd = null;
         
      }*/
      
   }
   
   @Override
   public void mouseDragged(MouseEvent e) {
      if (drawRect != null) {
         posEnd.setLocation(e.getX(), e.getY());
         updateRectangle();
      }
      /*if (drawRound != null) {
         posEnd.setLocation(e.getX(), e.getY());
         updateCircle();
      }*/

   }



   // Needed for mouse listeners
   @Override
   public void mouseClicked(MouseEvent e) {
      
      
   }
   
   

   public void setShape(String shape){
      this.shape = shape;
   }

   // Updates the selection rectangle based on the first and current mouse positions

   //Changing Rectangle
   public void updateRectangle() {
      
      if (drawRect == null) {
         //make sure that there is a rectangle
         //x, y, eidth, height
         drawRect = new Rectangle(0, 0, 0, 0);
      }

 //get width and height base off of the start and end
      int width = (int)Math.abs(posEnd.getX() - posStart.getX());
      int height = (int)Math.abs(posEnd.getY() - posStart.getY());
//the smallest of the x and y is the top left
      int left = (int)Math.min(posStart.getX(), posEnd.getX());
      int top = (int)Math.min(posStart.getY(), posEnd.getY());
      
      // Set up rectangle to the correct four corners      
      drawRect.setLocation(left, top);
      
      drawRect.setSize(width, height);
      
      // Let paintComponent handle this later
      //otherwise nothign will showup
      //everytime you want to change the image call this
      repaint();
   }


   //Changing Circle
   /*public void updateCircle(){

      if (drawRound == null) {
         drawRound = new Circle(0, 0, 0, 0);
      }



   }*/
   
   
   
}