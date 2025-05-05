package lessons;

public class Debugging {

	public static void main(String[] args) {

		int x = 1;
		int y = 2;
		
		int answer = add(x, y);
		
		System.out.println(answer);

	}

	public static int add(int x, int y)  {
		
		int temp1 = x;
		int temp2 = y;
		int sum = x + y;
		
		return sum;
	}
	
	
}
