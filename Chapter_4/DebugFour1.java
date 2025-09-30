// This class uses a DebugCircle class
// to instantiate a Circle object
import java.util.Scanner;
public class DebugFour1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int radius;
        System.out.print("Enter a radius for a circle >> ");
        radius = input.nextInt();
        DebugCircle c = new DebugCircle(radius); //fixed this
        System.out.println("The radius is " + c.getRadius()); //fixed this bc it getRadius in the DebugCircle 
        System.out.println("The diameter is " + c.getDiameter()); //applied here too
        System.out.println("The area is " + c.getArea()); // and here too
    }
}