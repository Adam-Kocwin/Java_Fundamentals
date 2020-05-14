package javaReview7;
import java.util.Scanner;

public class GreatestCommonDivisor
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner(System.in);
		
		System.out.print("Enter first integer:");
		int num1 = k.nextInt();
		System.out.print("Enter second integer:");
		int num2 = k.nextInt();
		//gcd(num1,num2);
		System.out.println("The greatest common divisor for "+ num1 + " and " + num2 + " is " +gcd(num1,num2) );

	}
	
	public static int gcd (int num1, int num2)
	{
		int k =1;
		int gcd =1;
		
		while (k <= num1 && k <= num2)
		{
			if(num1%k ==0 && num2%k ==0)
			{
				gcd =k;
			}
			k++;
			
		}// end while
		
		return gcd;
		
	}// end public static int gcd

}
