package arraysActivities2;
import java.util.Scanner;
import java.util.Random;

public class ArrayActivity2
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner(System.in);
		Random r = new Random();
		int num;
		final int MAX = 10;
		
		int [] array = new int [MAX];
		
		System.out.print("Random numbers generated in the array: ");
		for (int i = 0; i < array.length; i++)
		{
			num = r.nextInt(100)+1;
			array[i] = num;
			if (i == 9)
			{
			System.out.print(array[i]);
			}
			else
			{
				System.out.print(array[i] + ", ");
			}
		}
		
		System.out.println("\n\nEvery element at an even index: ");
		for (int i = 0; i < array.length; i++)
		{
			if((i+1)%2 ==0 )
			{
				if(i == 9)
				{
					System.out.print(array[i]);
				}
				else
				{
					System.out.print(array[i] + ", ");
				}
			}
		}// for 
		
		System.out.println("\n\nEvery even element: ");
		int commaCount =0;
		for (int i = 0; i < array.length; i++)
		{
				if(array[i]%2 ==0)
			{
				if(commaCount == 0)
				{
					System.out.print(array[i]);
					commaCount++;
				}
				else
				{
					System.out.print(", " + array[i]);
				}

			}
		}//for
		
		
		System.out.println("\n\nEvery Element in reverse order");
		for (int i = (array.length) -1; i >= 0; i--)
		{
			if(i == 0)
			{
				System.out.print(array[i]);
			}
			else
			{
				System.out.print(array[i] + ", ");
			}
		}
		
		System.out.println("\n\nFirst and last elements");
		System.out.println(array[0] + ", " + array[9]);

	}

}
