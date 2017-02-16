/*
 * Homework #3
 * StockTest.java
 * Course: CS112 Java Programming
 * Instructor: Bhattacharyya
 * Name: Marc Goldstein
 * Student ID: 800-28-3313
 */

/*
From the main method, instantiate an object of type Stock for "Google" with symbol "GOOG". 
Initialize previousClosingPrice as 510 and currentPrice as 524. 
Now call the ChangePercent() to print the percentage change on the command line
*/

/* 
StockTest is a client of class Stock. I set up StockTest to accept user input
values for the stock prices as a convenience for me to test that class Stock's
results worked with different stock values.
*/
import java.util.Scanner; // import Scanner to capture user input for stock values

public class StockTest
{
	// main method
	public static void main(String[] args)
	{
		// Create new Stock object by invoking constructor of class Stock
		// I could have set this up to accept user input as well, but I
		// didn't want to go too far beyond the scope of the assignment.
		Stock googleShare = new Stock( "Google", "GOOG" );

		// create Scanner object to obtain input from command line
		Scanner input = new Scanner(System.in);

		// variables for capturing user input
		double newPrice;
		double newClose;
		
		// prompt user to enter current stock price
		System.out.print("Enter current stock price: "); // prompt
		newPrice = input.nextDouble(); // obtain user input
		googleShare.setCurrentPrice(newPrice); // set current stock price
		System.out.printf( "\nSetting current price for %s stock to $%.2f\n\n", 
		googleShare.getStockName(), googleShare.getCurrentPrice() );

		// prompt user to enter closing stock price
		System.out.print("Enter yesterday's closing price: "); // prompt
		newClose = input.nextDouble(); // obtain user input
		googleShare.setClosingPrice(newClose); // set previous closing price
		System.out.printf( "\nSetting yesterday's closing price for %s stock to $%.2f\n\n", 
		googleShare.getStockName(), googleShare.getPreviousClosingPrice() );
		
		// Original statements to initialize stock prices with values
		// specified in assignment instructions
		// googleShare.setClosingPrice(510);
		// googleShare.setCurrentPrice(524);
		
		// calculate percentage change and display result
		googleShare.ChangePercent();
	} // end main method

} // end StockTest