package javaReview5;
import java.util.Scanner;

public class InvestmentTable
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner(System.in);
		System.out.print("What is the yearly rate?");
		double rate =k.nextDouble();
		
		System.out.print("What is the initial balance of your investment?");
		double balance = k.nextDouble();
		
		System.out.print("Enter number of years:");
		int nYears = k.nextInt();
		
		for (int year = 1; year <= nYears  ; year++)   // enter for then hold control+enter
		{
			double interest = balance*(rate/100);
			balance = balance +interest;
			System.out.printf("Year %2d %10.2f \n", year, balance);
		}
		

	}

}
