/*
 * Homework #2
 * Countdown.java
 * Course: CS112 Java Programming
 * Instructor: Bhattacharyya
 * Name: Marc Goldstein
 * Student ID: 800-28-3313
 */

import java.util.Scanner; // import class Scanner for user input

/*
class Countdown creates a method to display a pattern as follows:
              1
            2 1
          3 2 1
n n-1 ... 3 2 1

Should work for any input value of n
*/
public class Countdown
{
	// per assignment, method header must be "public static void DisplayPattern(int n)"
  public static void DisplayPattern(int n)
  {
		/* 
		 * Used nested loops to create the number pattern.
		 * The outer loop tracks the number of lines to write and which line is currently being written.
		 * The inner loop writes each line of the countdown.
		 */
  	System.out.print("\n"); // line break above pattern
  	for (int j = 1; j <= n; j++) // outer loop counts upward to the maximum number of lines to write
		{
			for (int i = n; i > 0; i--) // inner loop counts downward, creating the pattern for each line 
			{
				if (i <= j) // is countdown less than or equal to the line currently being written?
				{
					if (i == 1) // is countdown at 1? 
					{
						System.out.println(" " + i); // If so, print with new line
					} // end nested if 
					else // otherwise, begin printing integers
					{
						System.out.print(" " + i);
					}	 // end nested else 
				} // end if (i <= j)
				else // countdown greater than loop iterations, print blank spaces
				{
					/* if statement used to adjust number of blank spaces to match double or
					 * single digit numbers. I chose not to add provisions for triple or larger
					 * digit numbers, because monitor size restrictions would cause the lines to
					 * wrap anyway and break the pattern...
					 */
					if (i > 9) // the blank placeholder for double-digit numbers is three spaces
					{
						System.out.print("   ");
					}
					else // the blank placeholder for single-digit numbers is two spaces
					{
						System.out.print("  ");
					}
				} // end else
			} // end inner for loop

		} // end outer for loop

	} // end method DisplayPattern

	// main method
	public static void main(String[] args)
	{
		// initialize variables
		int max = 0;

		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);

		// prompt for input
		System.out.print("Enter number of lines in pattern: ");
		max = input.nextInt();
						
		// pass user input integer in method call via parameter max
		DisplayPattern(max);
	
	} // end main method

} // end class Countdown