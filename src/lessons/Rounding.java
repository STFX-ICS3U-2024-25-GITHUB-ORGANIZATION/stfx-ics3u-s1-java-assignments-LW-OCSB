package lessons;

public class Rounding {

	public static void main(String[] args) {

		double price = 13.579;
		
		// move decimal to number you want to round to
		// in this case, it's the pennies
		price = price * 100;
		
		// round double
		price = Math.round(price);
		
		// move decmial back to correct spot
		price = price / 100;
		
		// output
		System.out.println(price);
		
		String answer = "";
		answer = answer + "$";
		answer = answer + price;
		// numbers are changed to Strings automatically
		// when you perform String concatenation
		System.out.println(answer);
	}

}
