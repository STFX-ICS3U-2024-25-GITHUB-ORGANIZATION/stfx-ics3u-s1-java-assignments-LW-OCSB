package lessons;

public class Arrays {

	public static void main(String[] args) {

		// Java arrays use a single identifier (variable name)
		// Uses indexes (starting at 0)
		// Holds ELEMENTS of any SINGLE TYPE
		// Arrays are NOT dynamic (can't grow or shrink after creation)
		
		// SYNTAX:
		// dataType[] arrayIdentifier = new dataType[arraySize];

		// EXAMPLES:
		int[] myIntArray = new int[3];
		double[] myDoubleArray = new double[5];
		boolean[] myBooleanArray = new boolean[7];
		char[] myCharArray = new char[13];
		String[] myStringArray = new String[17];
		
		// We can initialize arrays with data upon creation.
		// EXAMPLE:
		int[] myClassRoomNumbers = {140, 216, 2011, 1013};
		System.out.println(myClassRoomNumbers[0]);
		System.out.println(myClassRoomNumbers[1]);
		System.out.println(myClassRoomNumbers[2]);
		System.out.println(myClassRoomNumbers[3]);
		
		// EXAMPLE:

		// variables
		double payForYear = 0;
		double[] myPayCheques = new double[5];

		// input
		myPayCheques[0] = 276.19;
		myPayCheques[1] = 176.89;
		myPayCheques[2] = 256.29;
		myPayCheques[3] = 376.39;
		myPayCheques[4] = 876.49;
		
		// process (add all pays)
//		payForYear = myPayCheques[0] + myPayCheques[1]
//				+ myPayCheques[2] + myPayCheques[3] 
//				+ myPayCheques[4];
		
		// let's add the pay using a for-loop instead
		for(int i=0; i<myPayCheques.length; i++)  {
			
			payForYear = payForYear + myPayCheques[i];
		}
		
		System.out.println("Annual Pay: $" + payForYear);
		
		// to determine length of an array
		System.out.println("Number of Paycheques: " + myPayCheques.length);
		
		
		// Attempting to access elements outside of Array bounds will
		// generate Exception error
		
		
		
		
		
	}

}
