import java.util.Scanner;

public class UserSquares {

	public static void main(String[] args) 
	{
		int number;
		int maxValue;
		
		System.out.println("i will display a table of numbers and their squares.");
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("How high should i go?");
		maxValue = keyboard.nextInt();
		
		System.out.println("number          Number squared");
		System.out.println("-------------------------------");
		
		for (number = 1; number<=maxValue; number++)
		{
			System.out.println(number + "\t\t" + number*number);
		}
		
		
	
		
		
		

	}

}
