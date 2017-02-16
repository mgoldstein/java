// Fig. 3.14 AccountTest.java

import java.util.Scanner;

public class AccountTest
{
	// main method
	public static void main(String args[])
	{
		Account account1 = new Account(50.00);
		Account account2 = new Account(-7.53);
		
		// display initial balance of each object
		System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n", account2.getBalance() );
		
		// create scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		double depositAmount; // deposit amount read from user
		
		System.out.print("Enter deposit amount for account1: ");
		depositAmount = input.nextDouble();
		System.out.printf("\nadding %.2f to account1 balance\n\n", depositAmount);
		account1.credit(depositAmount);
		
		// display balances
		System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("\nadding %.2f to account2 balance\n\n", depositAmount);
		account2.credit(depositAmount);
		
		// display new balances
		System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n", account2.getBalance() );
		
	} // end main method
	
} // end class AccountTest
