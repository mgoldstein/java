/*
 * ConvertTemperature.java
 *
 * Created on December 5, 2007, 11:37 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package temperatureApplet;

import javax.swing.JApplet;
import java.awt.Graphics;
import javax.swing.*;
     
public class ConvertTemperature extends javax.swing.JApplet {
    
    /** Creates a new instance of ConvertTemperature */
    public ConvertTemperature() {
       	double c = Double.parseDouble(getParameter("Celsius"));
    	double f = Double.parseDouble(getParameter("Fahrenheit"));
        
        // c/5 = (f-32)/9;
    }
    
    public void init() 
    {
        add(new JLabel("Welcome to Java", JLabel.CENTER));
    }

}
