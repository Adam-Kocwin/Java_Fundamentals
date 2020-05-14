package activities;
import java.io.*;
import java.util.Scanner;

public class Activity2
{

	public static void main(String[] args)throws IOException //****************FileNotFoundException
	{
		PrintWriter outputFileA = new PrintWriter("Numberlist.txt");
		
		for (int i = 1; i <= 100; i++)
		{
			outputFileA.println(i);
		}
		outputFileA.close();
		// (Object) -----connect road -------- (file) // opens the file
		// object is connected to the file

		File myFile = new File("Numberlist.txt");  // Makes a connection to the file and opens the file
		Scanner k = new Scanner (myFile);
		// (myFile) Scanner is given permission to read the file
		// File makes the road
		// Scanner is the bus that allows you to go from object to file
		
		while(k.hasNext())
		{
			String lineOut = k.nextLine();
			System.out.println(lineOut);
		}
		
	}

}
