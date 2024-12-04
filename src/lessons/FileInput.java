package lessons;

import java.io.*;

public class FileInput {

	public static void main(String[] args) {

		String[] product = new String[5];
		int[] quantity = new int[5];
		double[] price = new double[5];
		
		try  {
			
			// can specify anywhere file is located, using full path
			//FileReader file = new FileReader("C:/Users/e28166/Desktop/inventory.txt");
			
			// for this to work, file must be located in Java Project folder
			FileReader file = new FileReader("inventory.txt");
			
			// put contents of file into memory
			BufferedReader buffer = new BufferedReader(file);
		
			for (int i=0; i<product.length; i++)  {
				
				product[i] = buffer.readLine();
				quantity[i] = Integer.parseInt(buffer.readLine());
				price[i] = Double.parseDouble(buffer.readLine());
			}
			
			// clear memory
			buffer.close();
		}

		catch (Exception e)  {
			
			System.out.println("Error reading file.");
		}
		
		
		for(int i=0; i<product.length; i++) {
			
			System.out.println(quantity[i] + " " + product[i] + " $" + price[i]);
		}
		
		
		
		
		
		

	}

}
