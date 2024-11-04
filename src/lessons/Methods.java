package lessons;

public class Methods {
	
	public static void main(String[] args) {
		
		// System.out.println(Math.max(2, 7));
		System.out.println(max(7, 7));
		
		String myCombinedString = "";
		String string1 = "foo";
		String string2 = "bar";
		myCombinedString = combinStrings(string1, string2);
		System.out.println(myCombinedString);
		
		displayMenu();
	}
	
	
	// DESCRIPTION - Displays menu for program.
	// PARAMETERS - none
	// RETURN TYPE - void
	public static void displayMenu()  {
		
		System.out.println("Welcome to my program.");
		System.out.println("Choice 1 ...");
		System.out.println("Choice 2 ...");
	}
	

	// DESCRIPTION - Returns the combination of two Strings.
	// PARAMETERS - String a, String b
	// RETURN TYPE - String
	public static String combinStrings(String a, String b)  {
		
		return a + b;
	}
	
	
	// DESCRIPTION - Returns the greater of two int values.
	// PARAMETERS - int a, int b
	// RETURN TYPE - int
	public static int max(int a, int b)  {
			
		if (a > b)
			return a;
			
		else
			return b;
	}	
	
}
