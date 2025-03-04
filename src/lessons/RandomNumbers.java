package lessons;

public class RandomNumbers {

	public static void main(String[] args) {

		int n = 2;
		
		// Math.random() generates double > 0 && < 1
		//System.out.println(Math.random());
		
		// To generate a random number > 0, multiply by n
		//System.out.println(Math.random() * n);
	
		// EXAMPLE 1
		// casting double answer to int will truncate decimal
		// This generates random number 0 to n-1
		//System.out.println(  (int) ( Math.random() * n ) );

		// EXAMPLE 2
		// Adding 1 to n, will increase the upper-limit by 1,
		// but does not change the lower limit of 0
		// This generates random number 0 to n
		//System.out.println(  (int) ( Math.random() * (n+1) ) );
		
		// EXAMPLE 3
		// Adding 1 to EXAMPLE 1 will generate a random number
		// between 1-n
		System.out.println(  (int) ( Math.random() * n ) + 1);

		
		
		
	}

}
