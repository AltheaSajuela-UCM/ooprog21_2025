import javax.swing.JOptionPane;

public class JOptionPaneDialog {
   public static void main (String[] args) {
 
   
   while (true) {
        String name = JOptionPane.showInputDialog(null, "Enter your name");
     if (name == null) {
     JOptionPane.showMessageDialog(null, "You cancelled input. Exiting program");
     System.exit(0);
     }
     int confirm = JOptionPane.showConfirmDialog(null, "Do you want your name to be shown?", "Confirm",
     JOptionPane.YES_NO_CANCEL_OPTION);
     
     if (confirm == JOptionPane.YES_OPTION) {
         JOptionPane.showMessageDialog(null, "Your name is " + name);
            break;
     } else if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
            continue;
     } else {
            break;
     }
     
      }      
         
   }
}
//Jgrasp refuses to save it as JOptionPane.java. it would always result into an error :(