package lessons;

public class Arrays {

	public static void main(String[] args) {

		// Single identifier (variable) with index
		// starting at 0.  Holds ELEMENTS of any 
		// SINGLE TYPE. Not dynamic (fixed upon creation).

		// Examples
		int[] myIntArray = new int[3];
		double[] myDoubleArray = new double[5];
		boolean[] myBooleanArray = new boolean[7];
		char[] myCharArray = new char[11];
		String[] myStringArray = new String[13];
		
		// assigning values to array
		myIntArray[0] = 72;
		myIntArray[1] = 87;
		myIntArray[2] = 56;
		
		// accessing array elements
	//	System.out.println(myIntArray[0]);
	//	System.out.println(myIntArray[1]);
	//	System.out.println(myIntArray[2]);

		// exceeding the size of the array will result in a
		// Java out of bounds exception error (crash)
	//	System.out.println(myIntArray[3]);
		
		// defining and initializing array upon creation
		int[] myInitializedArray = {13, 4, 5, 6, 8, 5, 6, 4, 3, 2, 7,
				4, 5, 3, 7, 8, 9, 4, 2, 2, 55, 32, 21, 14};
		
		// determining size of array
	//	System.out.println(myInitializedArray.length);
		
		
		// print contents of array
		for(int i=0; i<myInitializedArray.length; i++)  {
		
			System.out.println(myInitializedArray[i]);
		}
		
	}

}
