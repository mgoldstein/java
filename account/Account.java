// Fig. 3.13 Account.java

public class Account
{
	private double balance; // instance variable that stores the balance
	
	// constructor
	public Account(double initialBalance)
	{
		/* validate that initialBalance is greater than zero. If not, balance is initialized 
		to its default value, which is 0.0 for data type double. */
		if (initialBalance > 0.0)
		{
			balance = initialBalance;
		} // end if
	} // end constructor
	
	// credit an amount to the account
	public void credit(double amount)
	{
		balance = balance + amount; // add amount to balance
	} // end method credit
	
	// return the account balance
	public double getBalance()
	{
		return balance; // sends value of balance to calling method
	} // end method getBalance
	
} // end class Account