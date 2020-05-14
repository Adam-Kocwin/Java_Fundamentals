package activities;
import java.util.Scanner;

public class JavaReviewActivity6
{

	public static void main(String[] args)
	{
		
		// CONSIDER 1 AS PRIME
	
		Scanner k = new Scanner (System.in);
		System.out.println("Enter a number:");
		int num = k.nextInt();
		int i =1;
		int counter =0;
		
		if (num ==0)
		{
			System.out.println(num + " is neither prime nor composite");
			System.exit(num);
		}
	
		
		for (int j = 1; j <=num; j++)
		{
			if (num%j == 0)
			{
				counter++;
			}
			else if (num%j != 0)
			{
				
			}
		}
		
		if (counter <= 2 && counter >0)
		{
			System.out.println(num + " is prime");
		}
		else if (counter >= 2)
		{
			System.out.println(num + " is not prime");
		}
		
		
	}// end class

	
	}
// end main

