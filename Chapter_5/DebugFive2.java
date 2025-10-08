// DebugFive2.java
// Decides if two numbers are evenly divisible
import java.util.Scanner;

public class DebugFive2 {
   public static void main(String args[]) {
      int num;
      int num2;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number ");
      num = input.nextInt(); // the ()
      System.out.print("Enter another number ");
      num2 = input.nextInt(); //
      
      if ((num % num2 == 0) || (num2 % num == 0)) { // && to || 
         System.out.println("One of these numbers are"); // changed is to are
         System.out.println(" evenly divisible into the other");
      } else {
         System.out.println("Neither of these numbers are"); // changed is to are srry
         System.out.println(" evenly divisible into the other");
      }
   }
}
