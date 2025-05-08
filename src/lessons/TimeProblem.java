package lessons;
import java.util.Scanner;

public class TimeProblem {

	public static void main(String[] args) {

		// variables
		int totalSeconds = 0;
		int hours = 0;
		int remainingSeconds = 0;
		int minutes = 0;
		int seconds = 0;
		Scanner sc = new Scanner(System.in);
		
		// Get the total number of seconds from the user.
		System.out.println("Enter total number of seconds: ");
		
		try {
			totalSeconds = sc.nextInt();
		}
		
		catch(Exception e)  {
			
			System.out.println("Invalid input.  Exiting.");
		}
		
		// Calculate number of hours:
		// total number of seconds / 3600 (keep integer answer)
		hours = totalSeconds / 3600;

		// Calculate remaining seconds:
		// total number of seconds % 3600
		remainingSeconds = totalSeconds % 3600;
		
		// Calculate number of minutes.
		// remaining seconds / 60
		minutes = remainingSeconds / 60;
		
		// Calculate number of seconds.
		// remaining seconds % 60
		seconds = remainingSeconds % 60;
		
		// Output hours, minutes and seconds
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Seconds: " + seconds);
		
		
	}

}

