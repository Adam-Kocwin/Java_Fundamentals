import java.util.Scanner;

public class NestedLoopsChallengeHomework3
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		int years;
		int months;
		double rainfall;
		double totalRainfall = 0;
		double averageRainfall= 0;
		int count = 1;
		
		System.out.print("Please enter the number of years");
		years = input.nextInt();
		
		if (years < 1)
		{
			System.out.print("Please enter a number larger than 1");
			years = input.nextInt();
		}
		if (years > 1)
		{
			while (count <=years)
			{
				for (int counter = 1; counter<=12; counter++)
				{
					System.out.println("Enter the rainfall for month " + counter);
					rainfall = input.nextDouble();
					while ( rainfall < 0)
					{
						System.out.print("please enter a number larger than 0");
						rainfall = input.nextDouble();
					}
					
					totalRainfall +=rainfall;
				}//end of for 1
				
				count++;
			}// end of while 1
			averageRainfall = totalRainfall/count;
		}// end of IF 1
		
		System.out.println("The total number of months is " + count );
		System.out.println("The total inches of rainfall is " + totalRainfall);
		System.out.println("The average rainfall is  " + averageRainfall );
		
		
		
		

	}// end of main

}// end of clsa
