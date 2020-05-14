package arraysLessons5;
import java.util.Arrays;

public class LinearSearchAlgorithm
{

	public static void main(String[] args)
	{
		int [] numbers = new int [50];
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*50 +1);
		}
		
		System.out.println(Arrays.toString(numbers));
		
		int found = linearSearch(numbers,10);
		
		if(found == -1)
		{
			System.out.println("The number was not found in the array");
		}
		else
		{
			System.out.println("Your number was found at index " + found);
		}
	}
	
	public static int linearSearch(int [] list, int key)
	{
		for (int i = 0; i < list.length; i++)
		{
			if(key == list[i])
			{
				return i;
			}
		}
		return -1;
	}

}
