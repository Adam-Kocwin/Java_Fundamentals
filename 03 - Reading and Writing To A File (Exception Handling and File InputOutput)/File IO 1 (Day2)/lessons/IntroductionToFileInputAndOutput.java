package lessons;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter; // opens a file for writing and allows you to write in them

public class IntroductionToFileInputAndOutput
{

	public static void main(String[] args) throws IOException
	{
		PrintWriter outputFileA = new PrintWriter("StudentData.txt");// we opened and used the printwriter
		
		outputFileA.println("Jim");
		outputFileA.println(95);
		outputFileA.println("Karen");
		outputFileA.println(98);
		outputFileA.println("Bob");
		outputFileA.println(62);
		
		outputFileA.close();// after we used it we close it
		
		outputFileA = new PrintWriter("Test.txt");
		outputFileA.close();
		
		// Example 2: Writing to a file using the print method
		String name = "Derek Lebreaux";
		String phone = "555-7864";
		int idNumber = 47895;
		
		
		PrintWriter outputFileB = new PrintWriter("PersonalData.txt");
		outputFileB.print(name + " ");
		outputFileB.print(phone + " ");
		outputFileB.println(idNumber);
		outputFileB.close();
		
		System.out.println("All data written to files.");
		

	}

}
