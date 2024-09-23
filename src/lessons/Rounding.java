package lessons;

public class Rounding {

	public static void main(String[] args) {
		
		double price = 13.678;
		
		price = price * 100;
		price = Math.round(price);
		price = price / 100;
		
		// output
		System.out.println(price);
	}

}
