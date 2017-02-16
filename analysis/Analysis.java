// Fig. 4.12 Analysis.java

import java.util.Scanner;

public class Analysis
{
	public void processExamResults()
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// initialize variables in declarations
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		int result; // one exam result (obtains result from user)
		
		// process 10 students using counter-controlled loop
		while (studentCounter <= 10)
		{
			// prompt user for input and obtain value from user
			System.out.print("Enter result for student #" + studentCounter + " (1 = pass, 2 = fail): ");
			result = input.nextInt();
			
			// if... else nested in while
			if (result == 1) // if result 1...
			{
				passes = passes +1 ; // ... then increment passes
			}
			else // else result is not one, so...
			{
				failures = failures + 1; // ...increment failures
			}
			
			// increment studentCounter so loop eventually terminates
			studentCounter = studentCounter + 1;
		} // end while
		
		// termination phase; prepare and display results
		System.out.printf("Passed: %d\nFailed: %d\n", passes, failures);
		
		// determine whether more than 8 students passed
		if (passes > 8)
		{
			System.out.println("Raise Tuition");
		} // end if
		
	} // end method processExamResults

} // end class Analysis