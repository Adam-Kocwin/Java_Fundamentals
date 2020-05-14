package arraysActivities1;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayActivity1B
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner(System.in);
		int [] array = new int [9999]; // ITS OVER 9000!!!
		int j = 1;
		int counter = 0;
	
		System.out.print("Enter a number between 1 and 100. \n");
		
		
		while(j!=0)
		{
			array[counter] = j;
			counter++;
			System.out.print("Enter a number: ");
			j = k.nextInt();
		}
		
		Arrays.sort(array); //sorts the array from lowest to highest values
		int index =0; // used to find the numbers
		int count =0; // used to find how many times it pops in the arrays
		
		//Program is gonna have a ton of zeros, so i better make the program disregard them or its gonna get messy.
		for (int i = 0; i <= array.length; i++)
		{
	
			while(array[index] ==0 ||  array[index]==array[index -1])// makes sure to not run if 0 or if equal to prior value
			{
				index++;
			}
			
			if(array[index] == array[i])
			{
				count++; // storing how many times i is found in array[index]
			}
			
			if(i == array.length - 1)
			{
				if(count ==1)
				{
					System.out.println(array[index] + " occurs " + count + " time.");
					i =0;
					count =0;
					index++;
				}
				else if(count >1)
				{
					System.out.println(array[index] + " occurs " + count + " times.");
					i =0;
					count =0;
					index++;
					
				}
				
			}
			
			if(index == array.length)
			{
				break;
			}
		}

	}

}
