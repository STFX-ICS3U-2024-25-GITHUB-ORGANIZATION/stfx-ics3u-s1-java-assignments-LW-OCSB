package lessons;
import java.util.Scanner;

public class UnitSummativeP1 {

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
		average = calculateAverage(grades);
		
		// determine acceptance to Ottawa U
		accepted = determineAcceptance(average, OTTAWAU_CUT_OFF);
		
		// output result
		outputResult(accepted);
	}

	
	// DESCRIPTION - Obtains n grades from user.  
	// PARAMETERS - int n
	// RETURN TYPE - int[]
	public static int[] getGrades(int n)  {

		// variables
		int[] marks = new int[n];
		Scanner sc = new Scanner(System.in);
		
		// get grades
		for (int i=0; i<n; i++)  {
			
			System.out.println("Enter grade " + (i+1) + " : ");
			marks[i] = sc.nextInt();
		}
		
		return marks;
	}
	
	
	// DESCRIPTION - Calculates average of int[]
	// PARAMETERS - int[] a
	// RETURN TYPE - int
	public static int calculateAverage(int[] a)  {
		
		// variables
		int sum = 0;
		int average = 0;
		
		for (int i=0; i<a.length; i++)  {
			
			sum = sum + a[i];
		}
		
		average = sum / a.length;
	
		return average;
	}
	
	
	// DESCRIPTION - Determines if user meets minimum requirements.
	// PARAMETERS - int average, int cutOff
	// RETURN TYPE - boolean
	public static boolean determineAcceptance(int average, int cutOff)  {
		
		// variables
		boolean valid = false;
		
		if (average >= cutOff)  {
			valid = true;
		}
	
		return valid;
	}
	
	
	// DESCRIPTION - Displays result of acceptance to user.
	// PARAMETERS - boolean b
	// RETURN TYPE - void
	public static void outputResult(boolean b)  {
		
		if (b == true)
			System.out.println("Accepted!");
		
		else
			System.out.println("Not accepted!");
	}
	
	
	
}
