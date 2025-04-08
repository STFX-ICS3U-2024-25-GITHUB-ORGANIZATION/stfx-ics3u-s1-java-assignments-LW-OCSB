package lessons;
import java.util.Scanner;
import java.lang.Math;  // optional, it's auto-imported

public class MathMethods {

	public static void main(String[] args) {

		// Math methods are pre-defined
		// (already exists in Java libraries)
		
		// print result
		System.out.println(Math.max(2, 3));
		
		// put result in a variable
		int myResult = Math.max(13, 7);
		System.out.println(myResult);
		
		// use result in a calculation
		int answer = 2 + Math.max(13, 7);
		System.out.println(answer);		
		
	}

}
