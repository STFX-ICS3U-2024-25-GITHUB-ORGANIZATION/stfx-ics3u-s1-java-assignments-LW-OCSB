package lessons;

public class Methods {
	
	public static void main(String[] args) {
		
		System.out.println(biggerOfTwoIntegers(3.0, 4));
		printSomething();
		
	}
	
	
	// NOTE - The 3 lines below are called method "header",
	//	      which are comments which defines the method.
	
	// DESCRIPTION - Returns greater of two integers.
	// PARAMETERS - int a, int b
	// RETURN - int
	public static int biggerOfTwoIntegers(int a, int b)  {   // this entire line is called the "method signature"
		
		System.out.println("First method used.");
		
		if (a>b)
			return a;
		
		else 
			return b;
	}

	
	// NOTE - The method below is "overloaded" since it has the exact
	//		  same method name, but different return type and/or parameters.
	//		  In other words, the method signatures are unique.
	
	// DESCRIPTION - Returns greater of two integers.
	// PARAMETERS - int a, int b
	// RETURN - int
	public static double biggerOfTwoIntegers(double a, double b)  {
		
		System.out.println("Second method used.");
		
		if (a>b)
			return a;
		
		else 
			return b;
	}
	
	
	// NOTE - void methods do not return anything.  You can perform
	// 		  any task inside a void method, but he keyword "return" cannot 
	//	      exist in a void method.  void methods are useful for printing.
	
	// DESCRIPTION - Prints a String.
	// PARAMETERS - na
	// RETURN - void 
	public static void printSomething()  {
		
		System.out.println("Hello World!");
	}
	
}

