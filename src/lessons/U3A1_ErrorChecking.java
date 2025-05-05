package lessons;
import java.util.Scanner;

public class U3A1_ErrorChecking {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String userInput = "";
		boolean stagePassed = false;
		
		// Stage 1 - The user must enter a String that is greater than 6 characters long.
		while (stagePassed == false)  {
			
			System.out.println("Enter String greater than 6 characters:");
			userInput = sc.next();
			
			stagePassed = stageOneMethod(userInput);
			
		}
		
		// Stage 2
		System.out.println("Beginning Stage 2.");
		
		// Stage 3
		System.out.println("Beginning Stage 3.");
		
		// Stage 4
		System.out.println("Beginning Stage 4.");
		
		// Stage 5
		System.out.println("Beginning Stage 5.");
		
		// Stage 6
		System.out.println("Beginning Stage 6.");

	}
	
	// DESCRIPTION - Returns true if String greater than 6 characters.
	// PARAMETERS - String s
	// RETURN - boolean
	public static boolean stageOneMethod(String s)  {
		
		if(s.length() > 6)
			return true;
		
		return false;
	}


}
