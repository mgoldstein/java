// Fig. 3.11 GradeBookTest.java

public class GradeBookTest
{
	// main method
	public static void main(String arts[])
	{
		// create GradeBook objects
		GradeBook gradeBook1 = new GradeBook("CS101 Introduction to Java Programming");
		GradeBook gradeBook2 = new GradeBook("CS102 Data Structures in Java");
		
		// display initial value of courseName for each GradeBook
		System.out.printf( "gradeBook1 course name is: %s\n", gradeBook1.getCourseName() );
		System.out.printf( "gradeBook2 course name is: %s\n", gradeBook2.getCourseName() );
	} // end method main
} // end class GradeBookTest