import java.util.Scanner;

public class NestLoopHmwk3
{

	public static void main(String[] args)
	{
		//Still need to make year input validation
		//Also calculate average rainfall
		//then display the results  
		
		double averageRainfall = 0, inchesOfRainfall, totalRainFall = 0;
		int years, month = 12, MonthsTotal;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("This program will calculate the average rainfall over a period of years");
		System.out.print("How many years would you like to enter:");
		years = keyboard.nextInt();
		
		while (years <= 0)
		{
			System.out.println("Please enter 1 or higher: ");
			System.out.println("How many years would you like to enter:");
			years = keyboard.nextInt();
		}
		
		for (int x = 1; x <= years; x++)
		{
			for(int y = 1; y <= month; y++)
			{
				System.out.print("Please enter the amount of rainfall for year " + x + ", " + "month " + y + ": ");
				inchesOfRainfall = keyboard.nextDouble();
				while(inchesOfRainfall < 0)
				{
					System.out.println("Please enter 0 or higher: ");
					System.out.print("Please enter the amount of rainfall for month " + y + ": ");
					inchesOfRainfall = keyboard.nextDouble();
					
				}
				totalRainFall += inchesOfRainfall;
				averageRainfall = totalRainFall/(month*years);
			}
			
			
			
			
			
		}
		
		System.out.printf("The total rain is %.2f inches.", totalRainFall);
		System.out.printf("The Average rainfall is %.2f inches per month.",averageRainfall);

	}

}
