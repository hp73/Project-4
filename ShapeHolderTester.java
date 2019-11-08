import shapes.*;

public class ShapeHolderTester {
   
   
   public static void main(String[] args) {
      ShapeHolder sh = ShapeHolder.getInstance();
      
      sh.addShape(new Square());
      sh.addShape(new Circle());
      //sh.addShape(new Octagon());
      
      for (GeometricShape shp : sh) {
         System.out.println(shp);
      }
   }
}