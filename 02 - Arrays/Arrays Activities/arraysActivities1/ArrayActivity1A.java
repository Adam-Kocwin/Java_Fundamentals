package arraysActivities1;
import java.util.Scanner;

public class ArrayActivity1A
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner (System.in);
		int [] array = new int [10];
		for (int i = 0; i < array.length; i++)
		{
			System.out.print("Please enter number " +(i+1)+ ":");
			array[i] = k.nextInt();
			
		}
		
		for (int i = (array.length-1); i >=0 ; i--)
		{
			System.out.print(array[i] + " ");
		}

	}

}
