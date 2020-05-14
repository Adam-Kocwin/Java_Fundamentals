package arraysLessons2;
import java.util.Scanner;

public class PartiallyFilledArrays
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner (System.in);
		
		final int LENGTH = 100;
		double [] values = new double [LENGTH];
		int currentSize = 0;
		double userInput;
		
		System.out.print("Enter a number or 0 to stop: ");
		userInput = k.nextDouble();
		
		while(userInput != 0 && currentSize < values.length)
		{
			values[currentSize] = userInput;
			System.out.print("Enter a number or 0 to stop: ");
			userInput = k.nextDouble();
			currentSize++;
		}
		
		System.out.println("The elements in the array are: ");
		for (int i = 0; i < currentSize; i++)
		{
			System.out.println(values[i]);
		}

	}

}
