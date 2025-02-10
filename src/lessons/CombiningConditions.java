package lessons;

public class CombiningConditions {

	public static void main(String[] args) {

		// We can have more than 1 condition per if statement
		// We can use the keywords "&&" and "||"
		
		// "&&" means "and"
		// both conditions must be true in order to be true
		if ( (2>0) && (2>1) )  {
			
			System.out.println("And condition is true.");
		}
		
		// "||" means "or"
		// one or both conditions must be true in order to be true
		if ( (2>10) || (2>1) )  {
			
			System.out.println("Or condition is true.");
		}	
		
		

	}

}
