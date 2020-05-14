package activities;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Activity1
{

	public static void main(String[] args)throws IOException
	{
		PrintWriter outputFileA = new PrintWriter("Numberlist.txt");
		
		for (int i = 1; i <= 100; i++)
		{
			outputFileA.println(i);
		}
		outputFileA.close();
		
		

	}

}
