package lessons;

public class MyMethods {

	// DESCRIPTION - Returns currency rounded to nearest cent.
	// PARAMETERS - double c
	// RETURN - double
	public static double roundCurrency(double c)  {
		
		c = c * 100;
		c = Math.round(c);
		c = c / 100;
		
		return c;
	}
	
}
