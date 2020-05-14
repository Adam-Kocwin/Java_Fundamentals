package javaReview7;
import java.util.Scanner;

public class AlgorithmicEfficiency
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner(System.in);
		long num;
		
		boolean primeCheck =true;
		long currentTime;
		
		
		System.out.print("Check if prime: ");
		num = k.nextLong();
		
		currentTime = System.currentTimeMillis();
		
		for (long divisor = 2; divisor < num/2; divisor++)
		{
			if (num%divisor == 0)
			{
				primeCheck =false;
				break;
			}
		}// end of for
		
		currentTime = System.currentTimeMillis() - currentTime;
		
		if (primeCheck)
		{
			System.out.println(num + " is a prime number");
		}
		else
		{
			System.out.println(num + " is not a prime number");
			
		}
		
		System.out.println("The algorithm was processed in " + ((double)currentTime/1000) + " seconds");

	}

}
