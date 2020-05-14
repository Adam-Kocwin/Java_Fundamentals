package javaReview2;
import java.util.Scanner;


public class TestBoolean 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = keyboard.nextInt();
		
		if (num %2 ==0 && num%3 ==0)
		{
			System.out.println(num + " is divisible by 2 and 3");
		}
		
		else if (num%2==0 ^ num %3 ==0)// exclusive or : one or two, NOT both ^ --- if both are true, then it is false
		{
			System.out.println( num + " is divisible by 2 or 3 but not both");
		}
		else
		{
			System.out.println(num + " is not divisible by 2 or 3");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if (num%2 == 0 || num %3==0)
//		{
//			if (num%2 == 0 && num %3 ==0)
//			{
//				System.out.println (num + " is divisible by 2 and 3");
//			}//if number 2
//			else
//			{
//				System.out.println(num + " is divisible by 2 or 3, but not both");
//			}
//			
//		}//if number 1
//		
//		else
//		{
//			System.out.println(num + " is not divisible by 2 or 3");
//		}
//		

	}// end of 

}
