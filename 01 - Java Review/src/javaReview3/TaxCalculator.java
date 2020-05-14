package javaReview3;
import java.util.Scanner;

public class TaxCalculator
{

	public static void main(String[] args)
	{
		final double RATE1 = 0.10;
		final double RATE2 = 0.25;
		final double RATE1_SINGLE_LIMIT = 32_000; // can use an _ as a , when dealing /w/ large numbers
												   // still valid and won't mess /w/ anything
		final double RATE2_MARRIED_LIMIT = 64_000;
		double tax1 = 0;
		double tax2 = 0;
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Please enter your income: ");
		double income = keyboard.nextDouble();
		keyboard.nextLine();        // ----      can read spaces              // if you go from next int to (next line or next double) 
		//or try "keyboard.next();" ---  can't read spaces                  //then the curser will glitch and get stuck
		
		System.out.print("Please enter s for \"single\", m for \"married\": ");
		String maritalStatus = keyboard.nextLine();
		
		if (maritalStatus.equalsIgnoreCase("s"))
		{
			if (income <= RATE1_SINGLE_LIMIT)
			{
				tax1 = RATE1*income;
			}
			else
			{
				tax1 = RATE1 *RATE1_SINGLE_LIMIT;
				tax2 = RATE2* (income - RATE1_SINGLE_LIMIT);
			}
			
		}// end of Single if
		
		else 
		{
			if (income <= RATE2_MARRIED_LIMIT)
			{
				tax1 = RATE1*income;
			}
			else
			{
				tax1 = RATE1 *income;
				tax2 = RATE2 * (income - RATE2_MARRIED_LIMIT);
			}
		
		}// end of married else
		
		double totalTax = tax1 + tax2;
		System.out.println("The tax is $" + totalTax);
		
	}

}
