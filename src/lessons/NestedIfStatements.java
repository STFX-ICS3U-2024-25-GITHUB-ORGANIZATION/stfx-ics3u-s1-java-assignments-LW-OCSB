package lessons;
import java.util.Scanner;


public class NestedIfStatements {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String menuChoice = "";
		String meatChoice = "";
		String vegChoice = "";
		
		System.out.println("Do you eat Meat (M) or Vegetables (V)?");
		menuChoice = sc.next();
		
		// determine menu preference
		if (menuChoice.equals("M"))  {
			
			System.out.println("Meatballs (M) or Steak (S)?");
			meatChoice = sc.next();
			
			if (meatChoice.equals("M"))  {
				
				System.out.println("Be careful, they're spicy!");
			}
			
			else if (meatChoice.equals("S"))  {
				
				System.out.println("Good choice.");
			}
			
		}
		
		else if (menuChoice.equals("V"))  {
			
			System.out.println("Tofu (T) or Salad (S)");
			vegChoice = sc.next();
			
			if(vegChoice.equals("T"))  {
				
				System.out.println("Tofu is salty.");
			}
			
			else if (vegChoice.equals("S"))  {
				
				System.out.println("Salad is crispy.");
			}
			
		}
		
		// sc.next()   vs    sc.nextLine()
		// sc.next() - will take entries, up to "space"
		// sc.nextLine() - will take entries, up to <CR> (carriage return)

		
		
		// test print
		
		
		
	}

}
