/*
 * NumbersTxt.java
 *
 * Created on November 14, 2007, 9:08 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package numberstxt;

import java.io.*;

public class NumbersTxt 
{
    PrintWriter outputNumbers = null;
    
    /** Creates a new instance of NumbersTxt */
    public NumbersTxt(String $name) throws IOException 
    {
        try 
        {
            outputNumbers = new PrintWriter(new FileWriter($name));

            for (int i = 1; i < 101; ++i)
            {
                outputNumbers.println(i);
            }
        }
        finally 
        {
            if (outputNumbers != null) 
            {
                outputNumbers.close();
            }
        }
    }
    
    public int addNumbers(String $name) throws IOException 
    {
        BufferedReader inputNumbers = null;
        int numberSum = 0;

        try
        {
            inputNumbers = new BufferedReader(new FileReader($name));
            
            String currentLine;

            while ((currentLine = inputNumbers.readLine()) != null) 
            {
                numberSum += Integer.parseInt(currentLine);
            }
        }
        finally 
        {
            if (inputNumbers != null) 
            {
                inputNumbers.close();
            }
        }
        return numberSum;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        NumbersTxt file = new NumbersTxt("Numbers.txt");
        System.out.println("Total sum of all integers in Numbers.txt = "
            + file.addNumbers("Numbers.txt") );
    }
}
