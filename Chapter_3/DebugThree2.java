// This application displays some math facts
import java.util.Scanner;

public class DebugThree2 {
   public static void main(String args[]) {
      int a, b, c;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer >> ");
      a = input.nextInt();
      System.out.print("Enter a second integer >> ");
      b = input.nextInt(); //initialized b
      System.out.print("Enter a third integer >> ");
      c = input.nextInt(); //initilized c
      add(a, b);
      add(b, c);
      add(a, c);
      subtract(a, b); //fixed typo
      subtract(b, c); //fixed typo
      subtract(a, c); //fixed typo
   }

   public static void add(int a, int b) {
      System.out.println("The sum of " + a +
                         " and " + b + " is " + (a + b)); //fixed typo
   }

   public static void subtract(int a, int b) {
      System.out.println("The difference between " +
                         a + " and " + b + " is " + (a - b)); //fixed typo
   }
}
//fixed many typos but it works :D