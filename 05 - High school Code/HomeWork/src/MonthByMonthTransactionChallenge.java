import java.util.Scanner;

public class MonthByMonthTransactionChallenge
{

	public static void main(String[] args)
	{
		double balance;
		int interestRateY;
		double change;
		double interestValue;
		double interestBalanceChange;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter your account balance");
		balance = input.nextDouble();
		
		System.out.print("Enter the yearly interest rate");
		interestRateY = input.nextInt();
		
		double interestRateM = (interestRateY/12.00)/100;
		
		for(int month=1;month<=12;month++)
		{
			System.out.println("Make a deposit or withdrawal for month " +month);
			change = input.nextDouble();
			
			interestBalanceChange = (balance + change)*interestRateM;
			balance = (balance + change) + interestBalanceChange;
			System.out.printf("your balance is now $%.2f with interest\n ",balance);
			
			
		}
		

	}//end of main

}//end of class
