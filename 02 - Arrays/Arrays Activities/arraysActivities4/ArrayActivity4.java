package arraysActivities4;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayActivity4
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner (System.in);
		int [] array = new int [10];
		
		for (int i = 0; i < 10; i++)
		{
			System.out.print("Enter number " + (i+1) + ": ");
			array[i] = k.nextInt();
		}
		
		System.out.println(Arrays.toString(array));
		reverse(array);
		System.out.println(Arrays.toString(array));

	}
	
	public static int[] reverse (int [] array)
	{
		for (int i = 0, j = 9; i < array.length/2; i++,j--)
		{
			int store1 = array[i];
			int store2 = array [j];
			
			array[i] = store2;
			array[j] = store1;
		}
		return array;
	}

}
