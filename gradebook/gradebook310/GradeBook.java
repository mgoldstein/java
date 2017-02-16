// Fig. 3.10 GradeBook.java

public class GradeBook
{
	private String courseName; // course name for this GradeBook
	
	// constructor initializes courseName with String supplied as argument
	public GradeBook(String name)
	{
		courseName = name;
	} // end constructor
	
	// method to set courseName
	public void setCourseName(String name)
	{
		courseName = name;
	} // end method setCourseName
	
	// method to retrieve the course name
	public String getCourseName()
	{
		return courseName;
	} // end method getCourseName
	
	// display a welcome message to the GradeBook user
	public void displayMessage()
	{
		/* this statement calls getCourseName to get the name of the course
		that this GradeBook records */
		System.out.printf( "Welcome to the grade book for\n%s!\n", getCourseName() );
	} // end method displayMessage

} // end class GradeBook