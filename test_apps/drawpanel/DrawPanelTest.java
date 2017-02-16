// Fig. 4.20 DrawPanelTest.java

import javax.swing.JFrame;

public class DrawPanelTest
{
	public static void main(String args[])
	{
		// create panel that contains our drawing
		DrawPanel Panel = new DrawPanel();
		
		// create a new frame to hold the panel
		JFrame application = new JFrame();
		
		// set the frame to exit when it is closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(Panel); // add the panel to the frame
		application.setSize(250, 250); // set the size of the frame
		application.setVisible(true); // make the frame visible
	} // end method main

} // end class DrawPanelTest