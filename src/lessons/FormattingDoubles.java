package lessons;

public class FormattingDoubles {

	public static void main(String[] args) {
		
		// variables
		double myDouble = 13.7456738;
		String formattedNumber = "";
		
		// processing (format to 2 decimal places)
		formattedNumber = String.format("%.2f", myDouble);
		
		// output
		System.out.println(formattedNumber);
	}

}
