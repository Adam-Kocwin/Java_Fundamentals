package activities;
import java.util.Scanner;


public class JavaReviewActivity4
{

	public static void main(String[] args)
	{
		Scanner k = new Scanner (System.in);
		
		int positive = 0;
		int negative =0;
		int totalNum =0;
		int number = -1;
		int sum =0;
		
		System.out.println("Enter an integer. The program will stop if 0 is inputted");
		while (number != 0)
		{
			number = k.nextInt();
			
			if(number > 0)
			{
				positive++;
			}
			
			if (number < 0)
			{
				negative++;
			}
			
			if (number == 0)
			{
				double average = (double) sum / totalNum;
				System.out.println("The number of positives is " + positive);
				System.out.println("The number of negatives is " + negative);
				System.out.println("The total is " + sum);
				System.out.printf("The average is %.2f", average);
			}
			totalNum ++;
			sum += number;
			
		}
	
		
		
	}

}
