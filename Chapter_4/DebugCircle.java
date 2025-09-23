public class DebugCircle {
   private static int radius;
   private static int diameter;
   private static final double PI = 3.14159;
   private static double area;
   
      public DebugCircle(int r) {
   radius = r;
   diameter = 2 * r;
   area = PI * r * r;
   }
public int getRadius(){
   return radius;
   }
public int getDiameter() {
   return diameter;
   }
public double getArea() {
   return area;
   }
/*  
   //main method to print out
   public static void main (String[] args) {
      DebugCircle circle = new DebugCircle(10); // <-- you can type any number
      
      System.out.println("Radius: " + circle.getRadius());
      System.out.println("Diameter: " + circle.getDiameter());
      System.out.println("Area: " + circle.getArea());

   }
*/

}

// debugged the code, so i commented a main method to test it out :D