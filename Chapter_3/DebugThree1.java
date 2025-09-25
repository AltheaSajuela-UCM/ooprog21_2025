// This class calculates a waitperson's tip
// as 15% of the bill
import java.util.Scanner;

public class DebugThree1 {
   public static void main(String args[]) {
      double check1;
      double check2;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the amount of your check >> ");
      check1 = input.nextDouble(); //was declared as int and not double
      System.out.print("Enter the amount of your friend's check >> ");
      check2 = input.nextDouble(); //was declared as int and not double + typo
      calcTip(check1);
      calcTip(check2);
   }

   public static void calcTip(double bill) { //missing paramaters for some reason??
      final double RATE = 0.15; //typo 
      double tip;
      tip = bill * RATE; //changed it to * 
      System.out.println("The tip should be at least $" + tip);
   }
}
// a few errors but it works :D