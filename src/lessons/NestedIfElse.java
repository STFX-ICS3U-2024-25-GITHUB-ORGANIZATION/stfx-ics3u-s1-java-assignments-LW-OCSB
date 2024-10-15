package lessons;
import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String foodOption = "";
		String meatOption = "";
		String vegetarianOption = "";
		
		// determine dietary preference
		// we assume that only "M" or "V" can be entered
		System.out.println("Meat or Vegetarian (M/V)?");
		foodOption = sc.nextLine();
		
		
		// user is a Meat eater
		if (foodOption.equals("M"))  {
			
			// determine which meat dish to serve
			System.out.println("You're a meat eater.");
			System.out.println("Steak or Chicken (S/C)?");
			meatOption = sc.nextLine();
			
			if (meatOption.equals("S"))  {
				
				System.out.println("Steak will be ready soon!");
			}
			
			else  {
				
				System.out.println("Chicken will be ready soon!");
			}
			
		}

		// user is vegetarian
		else  {
			
			// determine which vegetarian options to serve
			System.out.println("You're a vegetarian.");
			System.out.println("Tofu or Stir Fry (T/S)?");
			vegetarianOption = sc.next();
			
			if(vegetarianOption.equals("T"))  {
				
				System.out.println("Tofu will be chewy!");
			}
			
			else  {
				
				System.out.println("Stir fry will have no meat.");
			}
			
		}
		
	}

}
