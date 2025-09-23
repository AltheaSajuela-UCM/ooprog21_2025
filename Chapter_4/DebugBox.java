public class DebugBox {
   private int width;
   private int length;
   private int height;
   
public DebugBox() {
   length = 1;
   width = 1;
   height = 1;
   }
   
public DebugBox(int width, int length, int height) {
   this.width = width;
   this.length = width;
   this.height = width;
      }
      
public void showData() {
   System.out.println("Width: " + width + " Length: " +
   length + " Height: " + height);
 }
 
public double getVolume() { //changed the type
   double vol = length * width * height;
   return vol;
   }
   
 /*
   // Main method to test the class
    public static void main(String[] args)
    {
        // Using default constructor
        DebugBox box1 = new DebugBox();
        box1.showData();
        System.out.println("Volume: " + box1.getVolume());

        System.out.println();

        // Using parameterized constructor
        DebugBox box2 = new DebugBox(3, 4, 5);
        box2.showData();
        System.out.println("Volume: " + box2.getVolume());
    }
*/
}

// debugged the code (there were only a few changes) and commented a main method to test it 
// so far it works :D