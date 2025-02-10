package lessons;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int mark = 0;
		
		// prompt user for grade
		System.out.println("Please enter your final mark: ");
		
		// get user input
		mark = sc.nextInt();
		
		// check if grade is level R (less than 50)
		if (mark < 50)  {
			
			System.out.println("You are level R.");
		}
		
		// check if grade is level 1 (50-59)
		else if (mark < 60)  {
			
			System.out.println("You are level 1.");
		}
		
		// check if grade is level 2 (60-69)
		else if (mark < 70)  {
					
			System.out.println("You are level 2.");
		}
		
		// check if grade is level 3 (70-79)
		else if (mark < 80)  {
					
			System.out.println("You are level 3.");
		}
		
		// check if grade is level 4 (80-100)
		else {	// else is executed by default if all other checks fail
			
			System.out.println("You are level 4.");
		}
		
	}

}
