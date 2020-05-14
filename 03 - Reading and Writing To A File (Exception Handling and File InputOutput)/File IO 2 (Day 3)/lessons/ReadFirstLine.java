package lessons;
import java.io.*;
import java.util.*;

public class ReadFirstLine
{

	public static void main(String[] args) throws IOException
	{
		Scanner k = new Scanner(System.in);
		System.out.print("Enter the name of a file: ");
		String fileName = k.nextLine();
		
		File file = new File (fileName);
		Scanner inputFile = new Scanner(file);
		
		String line = inputFile.nextLine();
		
		System.out.println("The first line in the file is: ");
		System.out.println(line);
		inputFile.close();

	}

}
