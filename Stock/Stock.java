/*
 * Homework #3
 * Stock.java
 * Course: CS112 Java Programming
 * Instructor: Bhattacharyya
 * Name: Marc Goldstein
 * Student ID: 800283313
 */

/*
Design a class named Stock that contains:
    * A string data field named symbol for the stock's symbol.    
    * A string data field named name for the stock's name.
    * A double data field named previousClosingPrice that stores the stock price for the previous day.
    * A double data field named currentPrice that stores the stock price for the current time.
    * A constructor that creates a stock with specified symbol and name.
    * The accessor methods for all data fields.
    * The mutator methods for previousClosingPrice and currentPrice.
    * A method named ChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.
*/

import java.util.Scanner; // import Scanner to capture user input for stock values

// this class creates Stock objects
public class Stock
{
	// string data field named symbol for the stock's symbol
	private String symbol;
	// string data field named name for the stock's name
	private String name;
	// double data field named previousClosingPrice, 
	// stores the stock price for the previous day
	private double previousClosingPrice;
	// double data field named currentPrice, 
	// stores the current stock price
	private double currentPrice; 
	
	// constructor initializes stock object with symbol and name
	public Stock(String stockName, String stockSymbol)
	{
		name = stockName; // initializes instance variable name
		symbol = stockSymbol; // initializes instance variable symbol
	} // end constructor
	
	// accessor method for stock symbol
	public String getStockSymbol()
	{
		return symbol;
	} // end getStockSymbol
	
	// accessor method for stock name
	public String getStockName()
	{
		return name;
	} // end getStockName
	
	// accessor method for previousClosingPrice
	public double getPreviousClosingPrice()
	{
		return previousClosingPrice;
	} // end getPreviousClosingPrice
	
	// accessor method for currentPrice
	public double getCurrentPrice()
	{
		return currentPrice;
	} // end getCurrentPrice
	
	// mutator method for currentPrice
	public void setCurrentPrice(double stockPrice)
	{
		currentPrice = stockPrice;
	} // end setCurrentPrice
	
	// mutator method for previousClosingPrice
	public void setClosingPrice(double stockClose)
	{
		previousClosingPrice = stockClose;
	} // end setCurrentPrice

	// method ChangePercent() returns the percentage change from previousClosingPrice to currentPrice
	public void ChangePercent() 
	{
		// calculate percentage change
		double percentChange = 0.0; // variable stores percentage change
		
		// if current price equals closing price then percentage change equals zero
		if (currentPrice != previousClosingPrice) {
			// calculate percentage difference between prices
			// formula (newValue - oldValue)/oldValue * 100
			percentChange = (currentPrice - previousClosingPrice)/previousClosingPrice * 100;
		} // end if
		
		// write percentChange results to command line
		System.out.printf("Percentage change from previous closing price: %.2f%s\n", percentChange, "%");
	} // end ChangePercent

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

} // end class Stock