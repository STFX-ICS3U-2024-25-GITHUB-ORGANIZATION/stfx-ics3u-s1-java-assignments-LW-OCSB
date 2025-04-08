package lessons;
import java.lang.String;	// optional, it's auto-imported

public class StringClass {

	public static void main(String[] args) {

		String myString = "fubar";
		
		// print result
		System.out.println(myString.charAt(2));

		// assign result to a variable
		char myChar = myString.charAt(4);
		System.out.println(myChar);
		
		// use in a "calculation" or "process"
		String myUnfinishedWord = "yo";
		myUnfinishedWord = myUnfinishedWord + myString.charAt(1);
		System.out.println(myUnfinishedWord);
		
	}

}
