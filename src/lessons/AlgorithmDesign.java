/*

	DETAILED PSEUDO CODE (no human judgment)

	Get number of seconds from user.

	Calculate number of hours.
	- total number of seconds / 3600 (or 60 x 60)

	Calculate number of seconds remaining:
	- total number of seconds % 3600

	Calculate number of minutes.
	- number of seconds remaining / 60

	Calculate number of seconds.
	- number of seconds remaining % 60

	Display hours, minutes and seconds.
	*/


package lessons;
import java.util.Scanner;

public class AlgorithmDesign {

	public static void main(String[] args) {
	
		// variables
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int hours = 0;
		int secondsRemaining = 0;
		int minutes = 0;
		int seconds = 0;

		// get seconds from user
		System.out.println("Enter number of seconds: ");
		
		try {
			input = sc.nextInt();
		}
		
		catch(Exception e) {
			System.out.println("Enter integers.");
		}

		// calculate hours
		hours = input / 3600;
		
		// calculate seconds remaining
		secondsRemaining = input % 3600;
		
		// calculate number of minutes
		minutes = secondsRemaining / 60;
		
		// calculate number of seconds
		seconds = secondsRemaining % 60;
		
		// output hours, minutes and seconds
		System.out.println("Hours: " + hours);
		System.out.println("Mintues: " + minutes);
		System.out.println("Seconds: " + seconds);
		
	}
	
}
