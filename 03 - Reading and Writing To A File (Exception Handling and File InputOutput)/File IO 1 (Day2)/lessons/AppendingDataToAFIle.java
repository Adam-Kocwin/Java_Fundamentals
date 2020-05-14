package lessons;
import java.io.*;// WILD CARD
import java.util.Scanner;

public class AppendingDataToAFIle
{

	public static void main(String[] args) throws IOException
	{
		int contactNumber;
		Scanner k = new Scanner (System.in);
		FileWriter fWriter = new FileWriter("friendList",true);//
		PrintWriter outputFile = new PrintWriter(fWriter);// creating a printwriter object to be used for writing 
		
		System.out.println("How many contact names would you like to enter:");
		contactNumber = k.nextInt();
		k.nextLine();
		for (int i = 1; i <= contactNumber; i++)
		{
			System.out.println("Enter the name of contact number " + i + ":");
			outputFile.println(k.nextLine());
		}
		outputFile.close();
		System.out.println("Data was written");

	}

}
