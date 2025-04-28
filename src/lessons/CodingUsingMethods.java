package lessons;
import java.util.Scanner;

public class CodingUsingMethods {

	// PROGRAM DESCRIPTION:
	// Program will ask user for 6 best marks, calculate average, then will
	// determine if user meets minimum requirements for a given program
	public static void main(String[] args) {

		// variables
		final int NUM_GRADES = 6;
		final int OTTAWAU_CUT_OFF = 75;
		int[] grades = new int[NUM_GRADES];
		int average = 0;
		boolean accepted = false;
		
		// get grades
		grades = getGrades(NUM_GRADES);

		// calculate average
	//	average = calculateAverage(grades);
		
		// determine acceptance to UofO
	//	accepted = determineAcceptance(average);
		
		// output results
	//	outputResults(accepted);
		
	}
	
	// DESCRIPTION - Obtains 6 grades from user.
	// PARAMETERS - int n
	// RETURN - int[]
	public static int[] getGrades(int n)  {
		
		int[] marks = new int[n];
		Scanner sc = new Scanner(System.in);
		
		// get grades
		for(int i=0; i<n; i++)  {
			
			System.out.println("Enter grade " + (i+1) + ": ");
			marks[i] = sc.nextInt();
		}
		
		return marks;
	}
	

}
