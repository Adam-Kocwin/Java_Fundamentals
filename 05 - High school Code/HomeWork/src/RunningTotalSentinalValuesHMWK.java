import java.util.Scanner;

public class RunningTotalSentinalValuesHMWK
{

	public static void main(String[] args)
	{
		//question 1
		int num;
		int totalNum = 0;
		int count;
		Scanner userInput = new Scanner ( System.in);
		
		
		for (count=1;count<=7;count++)
		{
			System.out.println("enter the value for number " + count +":");
			num = userInput.nextInt();
			totalNum = totalNum + num;
		}
		
		System.out.println("the sum of the numbers entered is " + totalNum);
		
		
		// question 2 
		// X is the loop control variable
		// Y is the accumulator
		
		// question3
		// you should be careful when choosing a sentinel value because
		//it has to be something that you wouldn't enter in the program
		

		
	}

}
