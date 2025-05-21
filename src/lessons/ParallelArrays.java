package lessons;

public class ParallelArrays {

	public static void main(String[] args) {

		// parallel arrays used to create a data structure or database
		
		// Three arrays are related, order matters
		String[] names = {"Tanner", "Pyna", "Abid", "Jeremy", "Yuyen"};
		int[] debt = {50, 22, 16, 100, 13};
		String[] loanReason = {"lunch", "bet", "borrowed", "for shoes", "for dinner"};
		
		// output information from "database"
		for(int i=0; i<names.length; i++)  {
			
			System.out.println(names[i] + " " + debt[i] + " " + loanReason[i]);
		}
		

	}

}
