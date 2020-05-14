package arraysLessons7;
import java.util.Scanner;

public class CorpSales
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner (System.in);
		final int DIVS = 3;
		final int QTRS = 4;
		double totalSales =0;
		double [][] sales= new double [DIVS][QTRS];
		
		System.out.println("This program will calculate the total sales of");
		System.out.println("all the company's divisions. enter the folowing data:");
		
		for (int div = 0; div < sales.length; div++)
		{
			for (int qtr = 0; qtr < sales[div].length; qtr++)
			{
				System.out.printf("Division %d, Quarter %d: $", (div+1), (qtr+1));
				sales[div][qtr] = k.nextDouble();
			}
			System.out.println();
		}
		
		for (int div = 0; div < DIVS; div++)
		{
			for (int qtr = 0; qtr < QTRS; qtr++)
			{
				totalSales+= sales[div][qtr];
			}
			System.out.println();
		}
		System.out.printf("Total company sales:$%,.2f", totalSales);

	}

}
