package javaReview1;
import java.util.Scanner;

public class ComputeLoan {

	public static void main(String[] args) 
	{
		// type "main" the hit control+SPACE to bring up a new public static void
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter yearly interest rate, for example 8.25: ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = (annualInterestRate /100) / 12;
		System.out.print("Enter # of years as an integer, for example 5: ");
		int numberOfYears = input.nextInt();
		System.out.print("enter loan amount, for example 120000.95: ");
		double loanAmount = input.nextDouble();
		
		double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1/Math.pow(1 + monthlyInterestRate, numberOfYears*12)));
		
		
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.printf("/nThe monthly payment is %.2f",monthlyPayment);  // (/n) tabs/ enters so it starts on the next line

		System.out.printf("/nThe total payment is %.2f", totalPayment);
	}

}
