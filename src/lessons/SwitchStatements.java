package lessons;

public class SwitchStatements {

	public static void main(String[] args) {

		// variables
		int myInteger = 2;
		
		// Example 1
		switch(myInteger)  {
		
			case 1:
				System.out.println("You entered 1!");
				break;
		
			case 2:
				System.out.println("You entered 2!");
				break;
				
			case 3:
				System.out.println("You entered 3!");
				break;
				
			default:
				System.out.println("You didn't enter 1-3!");
		}
		
		// Example 2
		
		// variables
		String myString = "foo";
		
		switch(myString)  {
		
			case "foo":
				System.out.println("You entered \"foo\"!");
		
		}

	}

}
