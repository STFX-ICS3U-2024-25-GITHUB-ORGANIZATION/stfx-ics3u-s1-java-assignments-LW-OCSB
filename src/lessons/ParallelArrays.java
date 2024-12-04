package lessons;

public class ParallelArrays {

	public static void main(String[] args) {

		// Create 2 arrays which are related
		
		String[] names = {"Tanner", "Pyna", "Abid", "Jeremy", "Yuyen"};
		int[] debt = {10, 14, 22, 16, 40};
		String[] reason = {"ice cream", "black jack", "gas money", "hot pot", "more gas money"};
		
		
		//System.out.println(names[2] + " owes me $" + debt[2] + " because of " + reason[2]);

		for(int i=0; i< names.length; i++)  {
			
			System.out.println(names[i] + " owes me $" + debt[i] + " because of " + reason[i]);
		}
		

	}

}
