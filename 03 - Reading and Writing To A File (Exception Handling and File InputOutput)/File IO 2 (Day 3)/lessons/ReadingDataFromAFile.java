package lessons;
import java.util.Scanner;

import java.io.*;

public class ReadingDataFromAFile
{

	public static void main(String[] args) throws FileNotFoundException
	{
		File myFile = new File("C:/Users/adamkocwin/Desktop/ICS4UNew/customers.txt");
		Scanner inputFile = new Scanner(myFile);
		inputFile.close();
		
	}

}
