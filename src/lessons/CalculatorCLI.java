package lessons;
import java.util.Scanner;

public class CalculatorCLI {

	public static void main(String[] args) {
	
		// variables
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		System.out.println("Add Calculator.");
		System.out.println("\nEnter first number: ");

		try {
			
			num1 = sc.nextInt();
		}
		
		catch (Exception e)  {
			
			System.out.println("Invalid entry.  Exiting.");
			System.exit(0);
		}
		
		System.out.println("This should not print if we exit.");
		
		


	}

}
