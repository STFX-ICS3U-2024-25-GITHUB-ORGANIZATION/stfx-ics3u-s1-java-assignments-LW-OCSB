package lessons;

public class ForLoops {

	public static void main(String[] args) {

		// for-loops used when you want to repeat a
		// block of code for a known number of times
		for(int i=0; i<3; i++) {
				
			System.out.println("Loop Number: " + (i+1));
			
			// nested for-loop must be indented
			for(int j=3; j>0; j--)  {
				System.out.println(j);
			}
		}		
	}
}
