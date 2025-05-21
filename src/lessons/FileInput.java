package lessons;

import java.io.*;  // NEED TO IMPORT IO PACKAGE

public class FileInput {

	public static void main(String[] args) {

		// create 3 parallel arrays
		String[] product = new String[5];
		int[] quantity = new int[5];
		double[] price = new double[5];
		
		try  {
			
			// READ FILE - be sure to test that it's read properly!
			FileReader file  = new FileReader("inventory.txt");
			
			// put contents of file into memory
			BufferedReader buffer = new BufferedReader(file);
			
			// read/parse buffer into arrays
			for(int i=0; i<product.length; i++) {
				
				product[i] = buffer.readLine();
				quantity[i] = Integer.parseInt(buffer.readLine());
				price[i] = Double.parseDouble(buffer.readLine());
			}
			
			buffer.close();
		}
		
		catch (Exception e)  {
			
			System.out.println("Error reading file.");
		}
		
		for (int i=0; i<product.length; i++)  {
			
			System.out.println("PRODUCT: " + product[i] + ", QUANTITY: " + quantity[i]
					+ ", PRICE: " + price[i]);
		}

	}

}
