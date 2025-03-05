package lessons;

public class StringComparisons {

	public static void main(String[] args) {
		
		// When comparing Strings, we use the String method ".equals()"
		// EXAMPLE:
		String string1 = "foo";
		String string2 = "bar";
		String string3 = "foo";
		
		if (string1.equals(string2))  {
			
			System.out.println("Strings are the same.");
		}
		
		else  {
			System.out.println("Strings are different.");
		}
		

	}

}
