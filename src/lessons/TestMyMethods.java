package lessons;
import java.lang.Math;
import lessons.MyMethods;

public class TestMyMethods {

	public static void main(String[] args) {
		
		// variables
		double myMoney = 67.9873;
		MyMethods foo = new MyMethods();
		
		myMoney = foo.roundCurrency(myMoney);
		System.out.println(myMoney);
		


	}

}
