package lessons;
import java.util.Scanner;

public class WhileLoopMenu {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int menuChoice = 0;
		
		while (menuChoice != 3)  {
			
			System.out.println("Menu");
			System.out.println("1. Nice comment.");
			System.out.println("2. Scary fact.");
			System.out.println("3. Exit");
			
			// get user choice
			menuChoice = sc.nextInt();
			
			if (menuChoice == 1)  {
				
				System.out.println("Days are getting longer.");
			}
			
			else if (menuChoice == 2)  {
				
				System.out.println("Dec.22nd, 2032");
			}
		}
		
		System.out.println("Exiting program.");

	}

}
