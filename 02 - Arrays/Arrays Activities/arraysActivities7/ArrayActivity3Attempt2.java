package arraysActivities7;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ArrayActivity3Attempt2
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner (System.in);
		final int DIVS = 6;
		final int QTRS = 4;
		double totalSales =0;
		double [][] sales= new double [DIVS][QTRS];
		
		double divSale = 0;
		//*******************************************
			boolean error = true;
		//*******************************************

		
		System.out.println("Please enter the quarterly sales figures for all six");
		System.out.println("divisions of the company");
		
		for (int div = 0; div < sales.length; div++)
		{
			for (int qtr = 0; qtr < sales[div].length; qtr++)
			{
				do
				{
					
					try
					{
						
						System.out.println("Division " + (div+1) + " Quarter " + (qtr +1) + " : $" );
						sales[div][qtr] = k.nextDouble();
						while(sales[div][qtr] <0)
						{
							System.out.println("That is not a valid input. Please try again");
							System.out.println("Division " + (div+1) + " Quarter " + (qtr +1) + " : $" );
							sales[div][qtr] = k.nextDouble();
						}
						error =false;
					}
					catch(InputMismatchException e)
					{
						System.out.println("That is not a valid input. please enter integers only.");
						k.nextLine();
					}
				
				}while(error);
				
			}
			System.out.println();
		}// for loop end
		
		for (int i = 0; i < sales.length; i++)
		{
			for (int j = 0; j < sales[i].length; j++)
			{
				divSale += sales[i][j];
				if(j==3 || j==7 || j==11||j== 15|| j==19|| j==23)
				{
				System.out.print("\nThe total Sales for Div " + (i+1) + " is ");
				System.out.printf(" %.2f",divSale);
				divSale =0;
				}
			}
		}// for loop
		
		System.out.println("\n\n" + "The profit/loss for each division from the previous quarter (first quarter not displayed): ");
		System.out.println("       Quarter 2        Quarter 3        Quarter 4        ");
		System.out.println("----------------------------------------------------------------------");
		
		for (int i = 0; i < sales.length; i++)
		{
			System.out.println();
			for (int j = 1; j < sales[i].length; j++)
			{
				System.out.printf("       $%.2f",(sales [i][j] - sales [i] [(j-1)]));	
			}
		}
		
		System.out.println("\n\n" +"The total sales for each quarter is:");
		System.out.println("       Quarter 1     Quarter 2     Quarter 3     Quarter 4");
		System.out.println("----------------------------------------------------------------------");
		
		double totals [] = {0,0,0,0};//****************************************************************************
		for (int i= 0; i < 4; i++)
		{
			double quartSales =0;
			for (int j = 0; j <=5 ; j++)
			{
				quartSales+= sales[j][i];   // Flipped sequential search type thing
											// Instead of having the second subscript change rapidly, the first one does
				if(j==5)
				{
					System.out.printf("    $  %.2f", quartSales);
					totals[i] = quartSales;//********************************************************************
					quartSales=0;
				}
			}
			
		}
		
		//System.out.println("\n\n");
		//System.out.printf("%.2f   %.2f   %.2f   %.2f   ", totals[0],totals[1],totals[2], totals[3]);
		
		System.out.println("\n\n" + "The profit/loss from the previous quarter (1st quarter is not displayed)");
		System.out.println("       Quarter 2        Quarter 3        Quarter 4");
		System.out.println("----------------------------------------------------------------------");
		
		//*************************************************************************************************************************
		System.out.printf("      $%.2f     $ %.2f      $%.2f         ", (totals[1] - totals[0]),(totals[2] - totals[1]),(totals[3] - totals[2]));
		
		
		System.out.println("\n\n" + " The average sales for all divisions in each quarter is: ");
		System.out.println("       Quarter 1        Quarter 2        Quarter 3        Quarter 4");
		System.out.println("----------------------------------------------------------------------");
		
		for (int qtr = 0; qtr < 4; qtr++)
		{
			double QSA = 0;
			for (int i = 0; i < 6; i++)
			{
				QSA += sales[i][qtr];
			}
			System.out.printf("    $    %.2f",(QSA/6));
		}
		


		System.out.println("\n\n" + " The Division with the highest sale for each quarter is:");
		System.out.println();
		
		
		for (int qtr = 0; qtr < 4; qtr++)
		{
			double highest =0;
			int div=0;
			for (int j = 0; j < 6; j++)
			{
				if(sales [j][qtr] > highest)
				{
					highest = sales[j][qtr];
					div =j+1;
				}
				
				if(j==5)
				{
					System.out.print("Division " + div + " =   $     ");
					System.out.printf("%.2f",highest);
					System.out.println();
				}
			}
		}
		
		
	}//class

}//main
