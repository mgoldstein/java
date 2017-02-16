import javax.swing.JOptionPane;
public class CS112Ex1b
{
   public static void main(String[] args) 
   {
	// Rectangle length
     	double length = 40.34;
	// Rectangle width 
        int width = 23;
        double area = length * width;
      JOptionPane.showMessageDialog(null, "Area of 40.34x23 rectangle = " + area,
       "Display Message", JOptionPane.INFORMATION_MESSAGE);
   }
}