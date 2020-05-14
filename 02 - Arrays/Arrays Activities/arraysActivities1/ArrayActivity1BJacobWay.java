package arraysActivities1;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayActivity1BJacobWay
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner (System.in);
		int [] array = new int [9999]; // ITS OVER 9000!!!
		int j = 1;
		int counter = 0;
	
		System.out.print("Enter a number between 1 and 100: ");
		j = k.nextInt();
		
		while(j!=0)
		{
			array[counter] = j;
			counter++;
			System.out.print("Enter a number: ");
			j = k.nextInt();
		}
		
		Arrays.sort(array);
		int subcount = 0; // location in array
		int anotherCounter = 0; // how many times the number is seen
		for (int i = 0; i <= array.length; i++)
		{
			while(array[subcount] == 0 || array[subcount] == array[subcount-1]) // checks and finds all the 0's in the code and passes by them all
			{
				subcount++;
			}
			
			if(array[subcount] == array[i])	
			{
				anotherCounter++;
			}
			if(i == array.length - 1)
			{
				System.out.println(array[subcount] + " occurs " + anotherCounter + " times");
				i = 0;
				subcount++;
				anotherCounter = 0;
				
			}
			if(subcount == array.length) // gone through the whole array end breaks when it reaches the end
			{
				break;
			}
			
		}// for end

	}

}
