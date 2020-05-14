package lessons;
import java.io.*;
import java.util.*;

public class FileReadDemo
{

	public static void main(String[] args)throws IOException
	{
		
		// Lesson was to find a directory
		
		// "C:/Users... is for if you have a c drive, Mac has  no C drive
		File file = new File("/Users/adamkocwin/Desktop/ISC4UNew/customers.txt"); 

		Scanner inputFile = new Scanner (file);
		
		while (inputFile.hasNextLine())
		{
			String friendName = inputFile.nextLine();
			System.out.println(friendName);
		}
		
		inputFile.close();
		

	}

}
