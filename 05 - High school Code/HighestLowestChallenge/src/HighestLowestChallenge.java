import java.util.Scanner;

public class HighestLowestChallenge
{

	public static void main(String[] args)
	{
		int high=0;
		int low = 99;
		int user;
		
		Scanner keyboard = new Scanner (System.in);
		
		for (int count =1; count <=100; count++)
		{
			System.out.print("Enter a number");
			user = keyboard.nextInt();
		if (user ==-99)
		{
			break;
		}
				
		
		while (user <= 0)
		{
			System.out.println("please enter a number above 0");
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
