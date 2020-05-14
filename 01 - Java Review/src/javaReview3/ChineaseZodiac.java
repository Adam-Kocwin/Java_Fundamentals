package javaReview3;
import java.util.Scanner;

public class ChineaseZodiac
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		
		/* Switch statement is ideal to use if you are only evaluating only 1 variable
		 *
		 *think of it like " if year %12 is equal to 1,2,3,4,...... then it will run the code in the case
		 *the break is needed or else it would run through all the cases
		 */
		
		switch (year%12)
		{
		case 0:
			System.out.print("Monkey");
			break;
			
		case 1:
			System.out.println("rooster");
			break;
		
		case 2:
			System.out.println("dog");
			break;
		
		case 3:
			System.out.println("pig");
			break;	
		
		case 4:
			System.out.println("rat");
			break;	
			
		case 5:
			System.out.println("ox");
			break;	
			
		case 6:
			System.out.println("tiger");
			break;	
			
		case 7:
			System.out.println("rabbit");
			break;	
		
		case 8:
			System.out.println("dragon");
			break;	
			
		case 9:
			System.out.println("snake");
			break;
			
		case 10:
			System.out.println("horse");
			break;
			
		case 11:
			System.out.println("sheep");
			break;
		
		}// end of switch

		
	}//end of class

}
