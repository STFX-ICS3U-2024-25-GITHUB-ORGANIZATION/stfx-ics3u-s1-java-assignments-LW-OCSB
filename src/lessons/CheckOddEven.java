package lessons;
import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int remainder = 0;
		
		// processing
		System.out.println("Enter number: ");
		
		try {
			number = sc.nextInt();
		}
		
		catch(Exception e)  {
			
			System.out.println("Please enter integer.  Exiting.");
			System.exit(0);
		}
		
		// processing
		remainder = number % 2;

		
		// decision
		if (remainder == 0)  {
			
			System.out.println("Number is even.");
		}
		
		else
			System.out.println("Number is odd.");

	}

}
