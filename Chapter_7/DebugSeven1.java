// Makes String comparisons
import java.util.Scanner;
public class DebugSeven1 {
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      String name1, name2, name3;
      System.out.println("Enter three names.");
      System.out.println("They can be the same or different.");
      System.out.print("First name >> ");
         name1 = kb.nextLine(); //missing () applied to the others
      System.out.print("Second name >> ");
         name2 = kb.nextLine();
      System.out.print("Third name >> ");
         name3 = kb.nextLine();
      compareNames(name1, name2);
      compareNames(name1, name3);
      compareNames(name2, name3);
}

public static void compareNames(String name1, String name2) { //missing identifier and misspelling
      System.out.print(name1 + " and " + name2); //changed n1 to name1
         if(name1 == name2) // changed equals to == 
            System.out.println(" are the same");
               else
                  System.out.println(" are different");
}
}
