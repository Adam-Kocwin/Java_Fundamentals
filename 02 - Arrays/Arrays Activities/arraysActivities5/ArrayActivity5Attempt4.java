package arraysActivities5;
import java.util.Scanner;
import java.util.Arrays;


public class ArrayActivity5Attempt4
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner (System.in);
		int[] array = new int [10];
		System.out.println("Enter ten numbers:");
		for (int i = 0; i < array.length; i++)
		{
			System.out.print("Number " + (i+1) + ": ");
			array[i] = k.nextInt();
		}
		
		System.out.println(Arrays.toString(array));
		
	}

}
