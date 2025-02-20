package lessons;

public class Rounding {

	public static void main(String[] args) {

		// Rounding to hundredth position example:
		double myDouble = 16.7693;
		
		// STEP 1 - move decimal to the right of hundredth position
		myDouble = myDouble * 100;
		
		// STEP 2 - Use integer rounding command (Math.round())
		myDouble = Math.round(myDouble);
		
		// STEP 3 - move decimal back to original position
		myDouble = myDouble / 100;
		
		System.out.println(myDouble);
		
		String output = "$" + myDouble;

		System.out.println(output);
		
		
		
		

	}

}
