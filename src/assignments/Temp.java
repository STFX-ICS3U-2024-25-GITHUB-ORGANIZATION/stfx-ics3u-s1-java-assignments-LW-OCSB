package assignments;
import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		boolean stageChecked = false;
		String userInput = "";
		
		// stage 1
		while (stageChecked == false)  {
			
			System.out.println("Stage 1, enter String greater than 6 chars: ");
			userInput = sc.next();
			stageChecked = stageOne(userInput);
			
		}
		
		stageChecked = false;
		
		// stage 2
		while (stageChecked == false)  {
					
					
		}
		

	}

	// DESCRIPTION - Stage 1, user must enter a string that is greater than 6 chars.
    // PARAMETERS - String s
	// RETURN - boolean
	public static boolean stageOne(String s)  {
		  
		if (s.length() > 6) 
			return true;
		
		else
			return false;
	}
	
}
