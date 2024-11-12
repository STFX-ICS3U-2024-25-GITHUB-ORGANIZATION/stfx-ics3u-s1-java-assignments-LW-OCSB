package sandbox;

public class PassByValue {

	public static void main(String[] args) {


		int[] a = new int[1];
		myMethod(a);
		
		a[0] = 13;

		System.out.println(a[0]);
	}

	public static int[] myMethod(int[] a)  {
		
		a[0] = 7;
		return a;
	}
}
