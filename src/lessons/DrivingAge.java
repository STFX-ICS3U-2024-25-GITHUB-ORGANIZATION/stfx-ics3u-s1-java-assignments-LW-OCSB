package lessons;

import java.util.Scanner;

public class DrivingAge {

	public static void main(String[] args) {

		// variables
		int age = 0;
		Scanner sc = new Scanner(System.in);
		
		// processing
		System.out.println("Welcome to driving age calculator.");
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		
		// output

		if (age >= 16)  {

			System.out.println("You're old enough to drive!");
		}

		else  {
			
			System.out.println("You're not old enough to drive!");
		}
	}

}
