import java.util.Scanner;

public class TotalSales
{

	public static void main(String[] args)
	{
		int days;
		double sales;
		double totalSales;
		
		Scanner userInput = new Scanner ( System.in);
		
		System.out.println("For how many days do you want sales figures?");
		days = userInput.nextInt();
		
		totalSales = 0.0;
		
		for(int count=1;count<=days;count++)
		{
			System.out.println("enter the sales for day " + count + ":");
			sales = userInput.nextDouble();
			totalSales +=sales;// same as totalSales = totalSales +sales
		}
		
		System.out.printf("the total sales are:$%.2f ",totalSales);
		
		
		

	}

}
