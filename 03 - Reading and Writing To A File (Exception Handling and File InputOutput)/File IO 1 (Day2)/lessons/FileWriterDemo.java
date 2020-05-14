package lessons;
import java.util.Scanner;
import java.io.*; //Wildcard: imports all things from the java.io class thing

public class FileWriterDemo
{

	public static void main(String[] args) throws IOException
	{
		String fileName;
		String friendName;
		int numFriends;
		
		Scanner k = new Scanner (System.in);
		
		System.out.print("How many friends do you hve?");
		numFriends = k.nextInt();
		k.nextLine();
		System.out.println("Enter a file name: ");// DONT PUT/NEED TO PUT 
		fileName =k.nextLine();
		
		PrintWriter outputFile = new PrintWriter (fileName);
		for (int i = 1; i <= numFriends; i++)
		{
			System.out.print("Enter the name of friend number " + i + ":" );
			friendName=k.nextLine();
			outputFile.println(friendName);
		}
		
		outputFile.close();
		System.out.println("Data written to file.");

	}

}
