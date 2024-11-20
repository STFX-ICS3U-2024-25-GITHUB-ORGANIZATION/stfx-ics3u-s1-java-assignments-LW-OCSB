package assignments;
import java.util.Scanner;

public class U3A1_ErrorChecking {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		boolean stageChecked = false;
		String userInput = "";
		
		// stage 1
		while (stageChecked == false)  {
			
			System.out.println("Enter String greater than 6 chars: ");
			userInput = sc.next();
			stageChecked = stageOne(userInput);
		}
		
		// stage 2
		while (stageChecked == false)  {
					
			// see Stage 1
		}

	}

	// DESCRIPTION - Method checks if user enters String greater than 6 chars
	// PARAMETETRS - String s
	// RETURN TYPE - boolean
	public static boolean stageOne(String s)  {
		
		if (s.length() > 6)
			return true;
		
		return false;
	}
	
	// DESCRIPTION - Stage 2 Method ...
	// PARAMETETRS - 
	// RETURN TYPE - 
	
	
}
