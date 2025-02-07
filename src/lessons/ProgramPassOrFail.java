package lessons;
import java.util.Scanner;

public class ProgramPassOrFail {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		final int PASSING_GRADE = 50;
		
		// prompt user for grade
		System.out.println("Please enter your grade: ");
		userInput = sc.nextInt();
		
		System.out.println("You entered grade: " + userInput);
		
		// determine if fail
		if (userInput < PASSING_GRADE)  {
			
			System.out.println("You failed");
		}
		
		// determine if pass
		if (userInput >= PASSING_GRADE)  {
					
			System.out.println("You passed");
		}

	}

}
