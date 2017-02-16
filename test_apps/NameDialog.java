// Fig. 3.18 NameDialog.java

import javax.swing.JOptionPane;

public class NameDialog
{
	public static void main(String args[])
	{
		// prompt user to enter name
		String name = JOptionPane.showInputDialog("What is your name?");
		
		// create the message
		String message = String.format("Hi %s, welcome to Java programming!", name);
		
		// display the message to welcome user by name
		JOptionPane.showMessageDialog(null, message);
	} // end main method
} // end class