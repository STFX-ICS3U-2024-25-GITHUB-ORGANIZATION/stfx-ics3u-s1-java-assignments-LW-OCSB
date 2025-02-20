package lessons;

public class TryCatch {

	public static void main(String[] args) {

		int myInteger;
		String myString = "13.3";
		
		
		try {
			
			myInteger = Integer.parseInt(myString);
		}
		
		catch(Exception e)  {
			
			System.out.println("Hello World!");
		}
		
		System.out.println("Program can continue on ...");
		
		

	}

}
