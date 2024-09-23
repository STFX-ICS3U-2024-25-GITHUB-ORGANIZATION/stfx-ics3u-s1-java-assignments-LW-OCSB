package lessons;

public class Casting {

	public static void main(String[] args) {

		// Casting means changing one variable type to another
		
		// int to String
		String myString1 = "";
		int myInteger1 = 13;
		myString1 = Integer.toString(myInteger1);
		System.out.println(myString1);
		
		// String to int
		String myString2 = "18";
		int myInteger2 = 0; 
		myInteger2 = Integer.parseInt(myString2);
		System.out.println(myInteger2);
		
		// double to String
		String myString3 = "";
		double myDouble1 = 13.3;
		myString3 = Double.toString(myDouble1);
		System.out.println(myString3);
		
		// String to double
		String myString4 = "6.8";
		double myDouble2 = 0.0;
		myDouble2 = Double.parseDouble(myString4);
		System.out.println(myDouble2);
		
		// int to double
		int myInteger3 = 42;
		double myDouble3 = 0.0;
		myDouble3 = myInteger3;  
		// automatic change, no need to explicitly cast
		// "promoted" to double
		// no data lost
		System.out.println(myDouble3);
		
		// double to int
		double myDouble4 = 15.9;
		int myInteger4 = 0;
		myInteger4 = (int)myDouble4;  // truncates (doesn't round)
		System.out.println(myInteger4);		

	}

}
