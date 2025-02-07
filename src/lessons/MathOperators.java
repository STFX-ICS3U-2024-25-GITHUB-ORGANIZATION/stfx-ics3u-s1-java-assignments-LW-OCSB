package lessons;

public class MathOperators {

	public static void main(String[] args) {

		// variables
		int myInteger1 = 13;
		int myInteger2 = 7;
		int sum = 0;
		int difference = 0;
		int product = 0;
		int quotient = 0;
		int modulus = 0;
		
		// processing
		// +, -, *, /, %
		sum = myInteger1 + myInteger2;
		System.out.println("The sum is: " + sum);
		
		difference = myInteger1 - myInteger2;
		System.out.println("The difference is: " + difference);
		
		product = myInteger1 * myInteger2;
		System.out.println("The product is: " + product);
		
		quotient = myInteger1 / myInteger2;
		System.out.println("The quotient is: " + quotient);
		// int / int will result in a truncated int
		
		// NOTE:
		// if one or more of the numbers are a double, 
		// division will result in a double answer
		System.out.println(4.2 / 2);  // results in double answer
		
		// Modulus computes the REMAINDER of a division operation
		modulus = myInteger1 % myInteger2;
		System.out.println("The modulus is: " + modulus);
		

	}

}
