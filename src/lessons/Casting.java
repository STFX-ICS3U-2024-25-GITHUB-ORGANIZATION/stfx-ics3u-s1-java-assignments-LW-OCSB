package lessons;

public class Casting {

	public static void main(String[] args) {

		// Casting means changing one variable type to another
		
		// int to String
		int myInteger1 = 13;
		String myString1 = Integer.toString(myInteger1);
		
		// String to int
		String myString2 = "18";
		int myInteger2 = Integer.parseInt(myString2);
		
		// double to String
		double myDouble3 = 13.3;
		String myString3 = Double.toString(myDouble3);
		
		// String to double
		String myString4 = "6.8";
		double myDouble4 = Double.parseDouble(myString4);
		
		// int to double
		int myInteger5 = 42;
		double myDouble5 = myInteger5;  // no need to cast, "auto promoted"
		
		// double to int
		double myDouble6 = 15.9;
		int myInteger6 = (int)myDouble6;  // "demoted" to int, *truncates* (doesn't round)
		System.out.println(myInteger6);
	}

}
