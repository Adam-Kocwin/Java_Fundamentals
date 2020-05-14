import java.util.Scanner;

public class HighLowChallenge
{

	public static void main(String[] args)
	{
		int high=0;
		int low = 99;
		int user;
		
		Scanner keyboard = new Scanner (System.in);
		
		for (int count =1; count <=7; count++)
		{
			System.out.print("enter a number");
			user = keyboard.nextInt();
			
		while (user<-99 || user >99)
		{
			System.out.println("enter a number between -99 and 99");
			user = keyboard.nextInt();
		}
		
		if(low > user)
		{
			low = user;
		}
		if (user > high)
		{
			high = user;
		}
		

		}//for loop
		
		System.out.print("The highest number is " + high + " and the lowest number is " + low);

	}//main

}//class
