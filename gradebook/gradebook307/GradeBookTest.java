// GradeBookTest.java

import java.util.Scanner;

public class GradeBookTest
{
	// main method
	public static void main(String args[])
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// create GradeBook object and assign it to variable myGradeBook
		GradeBook myGradeBook = new GradeBook();
		
		// display initial value of courseName
		System.out.printf( "Initial course name is: %s\n\n", myGradeBook.getCourseName() );
		
		// prompt for and read course name
		System.out.println( "Please enter the course name:" );
		String theName = input.nextLine(); // read a line of text
		myGradeBook.setCourseName(theName); // set the course name
		System.out.println(); // blank line
		
		// display welcome message after specifying course name
		myGradeBook.displayMessage();
	} // end main method
} // end class GradeBookTest