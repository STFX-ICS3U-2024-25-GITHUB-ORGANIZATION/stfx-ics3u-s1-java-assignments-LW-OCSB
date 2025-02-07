package lessons;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		String userInput2 = "";
		
		// prompt user to enter a number
		System.out.println("Please enter an integer: ");
		
		// use Scanner to get input and place into variable
		userInput = sc.nextInt();
		
		// print contents of userInput
		System.out.println("You entered: " + userInput);

		// prompt user to enter a phrase
		System.out.println("Please enter a phrase: ");
		
		// use Scanner to get input and place into variable
		userInput2 = sc.nextLine();
		
		// print contents of userInput2
		System.out.println("You entered: " + userInput2);
	
	}

}
