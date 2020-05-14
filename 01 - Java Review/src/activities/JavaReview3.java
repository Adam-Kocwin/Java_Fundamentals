package activities;
import java.util.Scanner;

public class JavaReview3
{

	public static void main(String[] args)
	{
		Scanner key = new Scanner (System.in);
		
		System.out.println("Enter a month from 1 to 12");
		int month = key.nextInt();
		System.out.println("Enter a year");
		int year = key.nextInt();
		
		int yearLeap = year%4;
		
		int febDays = 28;
		if (yearLeap == 0)
		{
			febDays = febDays + 1;
			
		}// end of febrary if
		
		switch 	(month)
		{
		case 1:
		System.out.println("January had 31 days in year " + year);
		break;
		
		case 2:
		System.out.println("Febrary had " + febDays + " days in " + year);
		break;
		
		case 3:
		System.out.println("March had 31 days in " + year);
		break;
		
		case 4:
			System.out.println("April had 30 days in " + year);
			break;
			
		case 5:
			System.out.println("May had 31 days in " + year);
			break;
			
		case 6:
			System.out.println("June had 30 days in " + year);
			break;
			
		case 7:
			System.out.println("July had 31 days in " + year);
			break;
			
		case 8:
			System.out.println("August had 31 days in " + year);
			break;
			
		case 9:
			System.out.println("September had 30 days in " + year);
			break;
			
		case 10:
			System.out.println("October had 31 days in " + year);
			break;
			
		case 11:
			System.out.println("November had 30 days in " + year);
			break;
			
		case 12:
			System.out.println("December had 31 days in " + year);
			break;
			
			default:
				System.out.println("Please restart the program and enter a month and year");
		
		
		
		
		
	
		
		}// end of switch
		
		
	}// end of class
	

}
