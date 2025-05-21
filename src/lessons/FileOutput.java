package lessons;
import java.io.*;

public class FileOutput {

	public static void main(String[] args) {
		
		// array of furry animals
		String[] animals = {"Snowshoe Hare", "Lynx", "Wolf", "Snowy Owl"};
		
		try  {
			
			// create new file (it will over-write existing file, if it exists)
			FileOutputStream fout = new FileOutputStream("furryAnimals.txt");
			
			// put contents of file into memory
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			// create file writer
			OutputStreamWriter out = new OutputStreamWriter(null);
			
			// write to file
			for(int i=0; i<animals.length; i++)  {
				
				out.write(animals[i]);
			}
			
			// clear memory
			out.close();
			
		}
		
		catch (Exception e)  {
			
			System.out.println("Error writing to file.");
		}

	}

}
