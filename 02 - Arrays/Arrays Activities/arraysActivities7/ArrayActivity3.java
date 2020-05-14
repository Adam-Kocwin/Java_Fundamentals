package arraysActivities7;
import java.util.Scanner;

public class ArrayActivity3
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner (System.in);
		final int DIVS = 6;
		final int QTRS = 4;
		double totalSales =0;
		double [][] sales= new double [DIVS][QTRS];
		
		double divSale = 0;
		double divSale1 =0;
		double divSale2 =0;
		double divSale3 =0;
		double divSale4 =0;
		double divSale5 =0;
		double divSale6 =0;
		
		System.out.println("Please enter the quarterly sales figures for all six");
		System.out.println("divisions of the company");
		
		for (int div = 0; div < sales.length; div++)
		{
			for (int qtr = 0; qtr < sales[div].length; qtr++)
			{
				System.out.printf("Division %d, Quarter %d: $", (div+1), (qtr+1));
				sales[div][qtr] = k.nextDouble();
			}
			System.out.println();
		}// for loop end
		
		int count =1;
		do
		{
			for (int j = 1; j <6;  j++)
			{
				//-------------------------------------
			
			for (int counter = 1; counter < 5; counter++)
			{
				divSale =  divSale + sales[0][counter];
				
				
			}//inner for
				//-------------------------------------
			if (j==1)
			{
				divSale1 = divSale;
			}
			if (j==2)
			{
				divSale2 = divSale;
			}
			if (j==3)
			{
				divSale3 = divSale;
			}
			if (j==4)
			{
				divSale4 = divSale;
			}
			if (j==5)
			{
				divSale5 = divSale;
			}
			if (j==6)
			{
				divSale6 = divSale;
			}
				
			}// outer for
			count++;
		}while (count <=6);
		
		System.out.println(divSale1);
		System.out.println(divSale2);
		System.out.println(divSale3);
		System.out.println(divSale4);
		System.out.println(divSale5);
		System.out.println(divSale6);
	}

}
