package lessons;

public class SwitchStatements {

	public static void main(String[] args) {

		// Switch is an alternative to if-else statements
		// Makes code more organized, easier to read and maintain
		// can evaluate based on a number, character or word
		
		// EXAMPLE 1
		
		int number = 1;
		
		switch(number)  {
		
		case 1:
			System.out.println("You entered 1");
			System.out.println("Good job.");
			break;		// required to prevent "Switch Fall-through"
		
		case 2:
			System.out.println("You entered 2");
			System.out.println("Good job again.");
			break;
			
		case 3:
			System.out.println("You entered 3");
			System.out.println("Good job again, again.");
			break;
			
		default:
			System.out.println("Invalid entry.");
		}
	
	
		System.out.println("Exiting program.");
		
	}

}
